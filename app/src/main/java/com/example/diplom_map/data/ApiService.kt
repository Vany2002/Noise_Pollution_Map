import com.example.diplom_map.domain.NoisePoint
import com.example.diplom_map.domain.NoisePointServer
import com.example.diplom_map.domain.QuietPoint
import com.example.diplom_map.domain.QuietPointServer
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface NoiseApiService {

    @POST("noise-points")
    suspend fun postNoisePoint(@Body noisePoint: NoisePointServer): retrofit2.Response<NoisePoint>

    @GET("noise-points/sync")
    suspend fun syncData(@Query("lastSyncTime") lastSyncTime: Long): List<NoisePointServer>

    @POST("quiet-points")
    suspend fun postQuietPoint(@Body quietPoint: QuietPointServer): retrofit2.Response<QuietPoint>

    @GET("quiet-points/sync")
    suspend fun syncQuietData(@Query("lastSyncTime") lastSyncTime: Long): List<QuietPointServer>
}

object RetrofitInstance {
    val okHttpClient = OkHttpClient.Builder()
        // Добавьте HttpLoggingInterceptor для логирования запросов и ответов
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    val api: NoiseApiService by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.1.76:8080") // Замените на реальный URL вашего бэкенда
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient) // Передайте сюда экземпляр OkHttpClient
            .build()
            .create(NoiseApiService::class.java)
    }
}