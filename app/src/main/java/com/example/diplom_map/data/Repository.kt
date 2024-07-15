package com.example.diplom_map.data

import com.example.diplom_map.domain.Region
import com.yandex.mapkit.geometry.Point
import javax.inject.Inject

class Repository @Inject constructor() {
    fun getPoints(): List<Pair<String, List<Point>>> {
        return listOf(
            "Академический район" to Akademicheskiy_r,
            "Алексеевский район" to Alekseevskiy_r,
            "Алтуфьевский район" to Altufevskiy_r,
            "Бабушкинский район" to Babushkinskiy_r,
            "Басманный район" to Basmanniy_r,
            "Бескудниковский район" to Beskudnikovskiy_r,
            "Бутырский район" to Butirskiy_r,
            "Войковский район" to Voikovskiy_r,
            "Гагаринский район" to Gagarinskiy_r,
            "Головинский район" to Golovinskiy_r,
            "Даниловский район" to Danilovskiy_r,
            "Дмитровский район" to Dmitrovskiy_r,
            "Донской район" to Donskoy_r,
            "Красносельский район" to Krasnoselskiy_r,
            "Ломоносовский район" to Lomonosovskiy_r,
            "Лосиноостровский район" to Losinoostrovskiy_r,
            "Мещанский район" to Meshanskiy_r,
            "Можайский район" to Mozhaiskiy_r,
            "Молжаниновский район" to Molzhaninovskiy_r,
            "Нагорный район" to Nagorniy_r,
            "Нижегородский район" to Nizhegorodskiy_r,
            "Обручевский район" to Obruchevskiy_r,
            "Останкинский район" to Ostankinskiy_r,
            "Пресненский район" to Presnenskiy_r,
            "Рязанский район" to Ryazanskiy_r,
            "Савёловский район" to Savelovskiy_r,
            "Таганский район" to Taganskiy_r,
            "Тверской район" to Tverskoy_r,
            "Тимирязевский район" to Timiryazevskiy_r,
            "Хорошёвский район" to Horoshovskiy_r,
            "Южнопортовый район" to Yuzhnoportoviy_r,
            "Ярославский район" to Yaroslavskiy_r,
            "поселение Внуковское" to Vnukovo_p,
            "поселение Десеновское" to Desenovskoe_p,
            "поселение Киевский" to Kievskiy_p,
            "поселение Кокошкино" to Kokoshkino_p,
            "поселение Краснопахорское" to Krasnopahorskoe_p,
            "поселение Марушкинское" to Marushkinskoe_p,
            "поселение Михайлово-Ярцевское" to Mihaylovo_Yarcevskoe_p,
            "поселение Московский" to Moskovskiy_p,
            "поселение Мосрентген" to Mosrentgen_p,
            "поселение Новофедоровское" to Novofedorovskoe_p,
            "поселение Первомайское" to Pervomayskoe_p,
            "поселение Рязановское" to Ryazanskoe_p,
            "поселение Сосенское" to Sosenskoe_p,
            "поселение Троицк" to Troick_p,
            "поселение Щаповское" to Shapovskoe_p,
            "поселение Щербинка" to Sherbinka_p,
            "район Арбат" to Arbat_r,
            "район Аэропорт" to Aeroport_r,
            "район Беговой" to Begovoy_r,
            "район Бибирево" to Bibirevo_r,
            "район Бирюлёво Восточное" to Biruylevo_Vostochnoe_r,
            "район Бирюлёво Западное" to Biruylevo_Zapadnoe_r,
            "район Богородское" to Bogorodskoe_r,
            "район Братеево" to Brateevo_r,
            "район Вешняки" to Veshnyaki_r,
            "район Внуково" to Vnukovo_r,
            "район Восточное Дегунино" to Vostochnoe_Degunino_r,
            "район Восточное Измайлово" to Vostochnoe_Izmaylovo_r,
            "район Выхино-Жулебино" to Vihino_Zhulebino_r,
            "район Гольяново" to Golyanovo_r,
            "район Дорогомилово" to Dorogomilovo_r,
            "район Замоскворечье" to Zamoskvorechie_r,
            "район Западное Дегунино" to Zapadnoe_Degunino_r,
            "район Зюзино" to Zyuzino_r,
            "район Зябликово" to Zyablikovo_r,
            "район Ивановское" to Ivanovskoe_r,
            "район Измайлово" to Izmailovo_r,
            "район Капотня" to Kapotnya_r,
            "район Коньково" to Konkovo_r,
            "район Коптево" to Koptevo_r,
            "район Косино-Ухтомский" to Kosino_Uhtomskyi_r,
            "район Котловка" to Kotlovka_r,
            "район Крылатское" to Krilatskoe_r,
            "район Крюково" to Kryukovo_r,
            "район Кузьминки" to Kuzminki_r,
            "район Кунцево" to Kuncevo_r,
            "район Куркино" to Kurkino_r,
            "район Левобережный" to Levoberezhnyi_r,
            "район Лефортово" to Lefortovo_r,
            "район Лианозово" to Lianozovo_r,
            "район Люблино" to Lyublino_r,
            "район Марфино" to Marfino_r,
            "район Марьина Роща" to Maryina_Rosha_r,
            "район Марьино" to Maryino_r,
            "район Метрогородок" to Metrogorodok_r,
            "район Митино" to Mitino_r,
            "район Москворечье-Сабурово" to Moskvorechye_Saburovo_r,
            "район Нагатино-Садовники" to Nagatino_Sadovniki_r,
            "район Нагатинский Затон" to Nagatinskyi_Zaton_r,
            "район Некрасовка" to Nekrasovka_r,
            "район Ново-Переделкино" to Novo_Peredelkino_r,
            "район Новогиреево" to Novogireevo_r,
            "район Новокосино" to Novokosino_r,
            "район Орехово-Борисово Северное" to Orehovo_Borisovo_Severnoe_r,
            "район Орехово-Борисово Южное" to Orehovo_Borisovo_Yuzhnoe_r,
            "район Отрадное" to Otradnoe_r,
            "район Очаково-Матвеевское" to Ochakovo_Matveevskoe_r,
            "район Перово" to Perovo_r,
            "район Печатники" to Pechatniki_r,
            "район Покровское-Стрешнево" to Pokrovskoe_Streshnevo_r,
            "район Преображенское" to Preobrazhenskoe_r,
            "район Проспект Вернадского" to Prospekt_Vernandskogo_r,
            "район Раменки" to Ramenki_r,
            "район Ростокино" to Rostokino_r,
            "район Савёлки" to Savelki_r,
            "район Свиблово" to Sviblovo_r,
            "район Северное Бутово" to Severnoe_Butovo_r,
            "район Северное Измайлово" to Severnoe_Izmailovo_r,
            "район Северное Медведково" to Severnoe_Medvedkovo_r,
            "район Северное Тушино" to Severnoe_Tushino_r,
            "район Северный" to Severnyi_r,
            "район Сокол" to Sokol_r,
            "район Соколиная Гора" to Sokolinaya_Gora_r,
            "район Сокольники" to Sokolniki_r,
            "район Солнцево" to Solncevo_r,
            "район Старое Крюково" to Staroe_Kryukovo_r,
            "район Строгино" to Strogino_r,
            "район Текстильщики" to Tekstilshiki_r,
            "район Тропарёво-Никулино" to Tropareva_Nikulino_r,
            "район Тёплый Стан" to Teplyi_Stan_r,
            "район Фили-Давыдково" to Fili_Davidkovo_r,
            "район Филёвский Парк" to Filevskiy_Park_r,
            "район Хамовники" to Hamovniki_r,
            "район Ховрино" to Hovrino_r,
            "район Хорошёво-Мнёвники" to Horoshovo_Mnevniki_r,
            "район Царицыно" to Caricino_r,
            "район Чертаново Северное" to Chertanovo_Severnoe_r,
            "район Чертаново Центральное" to Chertanovo_Centralnoe_r,
            "район Чертаново Южное" to Chertanovo_Yuzhnoe_r,
            "район Черёмушки" to Cheremushki_r,
            "район Щукино" to Shukino_r,
            "район Южное Бутово" to Yuzhnoe_Butovo_r,
            "район Южное Медведково" to Yuzhnoe_Medvedkovo_r,
            "район Южное Тушино" to Yuzhnoe_Tushino_r,
            "район Якиманка" to Yakimanka_r,
            "район Ясенево" to Yasenevo_r,
        )
    }

    fun getQuietPoints(): List<Pair<String, List<Point>>> {
        return listOf(
            "Академический район" to Akademicheskiy,
            "Алексеевский район" to Alekseevskiy,
            "Алтуфьевский район" to Altufevskiy,
            "Бабушкинский район" to Babushkinskiy,
            "Басманный район" to Basmanniy,
            "Бескудниковский район" to Beskudnikovskiy,
            "Бутырский район" to Butirskiy,
            "Войковский район" to Voikovskiy,
            "Гагаринский район" to Gagarinskiy,
            "Головинский район" to Golovinskiy,
            "Даниловский район" to Danilovskiy,
            "Дмитровский район" to Dmitrovskiy,
            "Донской район" to Donskoy,
            "Красносельский район" to Krasnoselskiy,
            "Ломоносовский район" to Lomonosovskiy,
            "Лосиноостровский район" to Losinoostrovskiy,
            "Мещанский район" to Meshanskiy,
            "Можайский район" to Mozhaiskiy,
            "Молжаниновский район" to Molzhaninovskiy,
            "Нагорный район" to Nagorniy,
            "Нижегородский район" to Nizhegorodskiy,
            "Обручевский район" to Obruchevskiy,
            "Останкинский район" to Ostankinskiy,
            "Пресненский район" to Presnenskiy,
            "Рязанский район" to Ryazanskiy,
            "Савёловский район" to Savelovskiy,
            "Таганский район" to Taganskiy,
            "Тверской район" to Tverskoy,
            "Тимирязевский район" to Timiryazevskiy,
            "Хорошёвский район" to Horoshovskiy,
            "Южнопортовый район" to Yuzhnoportoviy,
            "Ярославский район" to Yaroslavskiy,
            "поселение Внуковское" to p_Vnukovo,
            "поселение Десеновское" to Desenovskoe,
            "поселение Киевский" to Kievskiy,
            "поселение Кокошкино" to Kokoshkino,
            "поселение Краснопахорское" to Krasnopahorskoe,
            "поселение Марушкинское" to Marushkinskoe,
            "поселение Михайлово-Ярцевское" to Mihaylovo_Yarcevskoe,
            "поселение Московский" to Moskovskiy,
            "поселение Мосрентген" to Mosrentgen,
            "поселение Новофедоровское" to Novofedorovskoe,
            "поселение Первомайское" to Pervomayskoe,
            "поселение Рязановское" to Ryazanskoe,
            "поселение Сосенское" to Sosenskoe,
            "поселение Троицк" to Troick,
            "поселение Щаповское" to Shapovskoe,
            "поселение Щербинка" to Sherbinka,
            "район Арбат" to Arbat,
            "район Аэропорт" to Aeroport,
            "район Беговой" to Begovoy,
            "район Бибирево" to Bibirevo,
            "район Бирюлёво Восточное" to Biruylevo_Vostochnoe,
            "район Бирюлёво Западное" to Biruylevo_Zapadnoe,
            "район Богородское" to Bogorodskoe,
            "район Братеево" to Brateevo,
            "район Вешняки" to Veshnyaki,
            "район Внуково" to Vnukovo,
            "район Восточное Дегунино" to Vostochnoe_Degunino,
            "район Восточное Измайлово" to Vostochnoe_Izmaylovo,
            "район Выхино-Жулебино" to Vihino_Zhulebino,
            "район Гольяново" to Golyanovo,
            "район Дорогомилово" to Dorogomilovo,
            "район Замоскворечье" to Zamoskvorechie,
            "район Западное Дегунино" to Zapadnoe_Degunino,
            "район Зюзино" to Zyuzino,
            "район Зябликово" to Zyablikovo,
            "район Ивановское" to Ivanovskoe,
            "район Измайлово" to Izmailovo,
            "район Капотня" to Kapotnya,
            "район Коньково" to Konkovo,
            "район Коптево" to Koptevo,
            "район Косино-Ухтомский" to Kosino_Uhtomskyi,
            "район Котловка" to Kotlovka,
            "район Крылатское" to Krilatskoe,
            "район Крюково" to Kryukovo,
            "район Кузьминки" to Kuzminki,
            "район Кунцево" to Kuncevo,
            "район Куркино" to Kurkino,
            "район Левобережный" to Levoberezhnyi,
            "район Лефортово" to Lefortovo,
            "район Лианозово" to Lianozovo,
            "район Люблино" to Lyublino,
            "район Марфино" to Marfino,
            "район Марьина Роща" to Maryina_Rosha,
            "район Марьино" to Maryino,
            "район Метрогородок" to Metrogorodok,
            "район Митино" to Mitino,
            "район Москворечье-Сабурово" to Moskvorechye_Saburovo,
            "район Нагатино-Садовники" to Nagatino_Sadovnikz,
            "район Нагатинский Затон" to Nagatinskyi_Zaton,
            "район Некрасовка" to Nekrasovka,
            "район Ново-Переделкино" to Novo_Peredelkino,
            "район Новогиреево" to Novogireevo,
            "район Новокосино" to Novokosino,
            "район Орехово-Борисово Северное" to Orehovo_Borisovo_Severnoe,
            "район Орехово-Борисово Южное" to Orehovo_Borisovo_Yuzhnoe,
            "район Отрадное" to Otradnoe,
            "район Очаково-Матвеевское" to Ochakovo_Matveevskoe,
            "район Перово" to Perovo,
            "район Печатники" to Pechatniki,
            "район Покровское-Стрешнево" to Pokrovskoe_Streshnevo,
            "район Преображенское" to Preobrazhenskoe,
            "район Проспект Вернадского" to Prospekt_Vernandskogo,
            "район Раменки" to Ramenki,
            "район Ростокино" to Rostokino,
            "район Савёлки" to Savelki,
            "район Свиблово" to Sviblovo,
            "район Северное Бутово" to Severnoe_Butovo,
            "район Северное Измайлово" to Severnoe_Izmailovo,
            "район Северное Медведково" to Severnoe_Medvedkovo,
            "район Северное Тушино" to Severnoe_Tushino,
            "район Северный" to Severnyi,
            "район Сокол" to Sokol,
            "район Соколиная Гора" to Sokolinaya_Gora,
            "район Сокольники" to Sokolniki,
            "район Солнцево" to Solncevo,
            "район Старое Крюково" to Staroe_Kryukovo,
            "район Строгино" to Strogino,
            "район Текстильщики" to Tekstilshiki,
            "район Тропарёво-Никулино" to Tropareva_Nikulino,
            "район Тёплый Стан" to Teplyi_Stan,
            "район Фили-Давыдково" to Fili_Davidkovo,
            "район Филёвский Парк" to Filevskiy_Park,
            "район Хамовники" to Hamovniki,
            "район Ховрино" to Hovrino,
            "район Хорошёво-Мнёвники" to Horoshovo_Mnevniki,
            "район Царицыно" to Caricino,
            "район Чертаново Северное" to Chertanovo_Severnoe,
            "район Чертаново Центральное" to Chertanovo_Centralnoe,
            "район Чертаново Южное" to Chertanovo_Yuzhnoe,
            "район Черёмушки" to Cheremushki,
            "район Щукино" to Shukino,
            "район Южное Бутово" to Yuzhnoe_Butovo,
            "район Южное Медведково" to Yuzhnoe_Medvedkovo,
            "район Южное Тушино" to Yuzhnoe_Tushino,
            "район Якиманка" to Yakimanka,
            "район Ясенево" to Yasenevo,
        )
    }

    fun getRegions(): List<Region> {
        return listOf(
            Region(
                name = "Восточный административный округ",
                size = getSizeRegion("Восточный административный округ"),
                point = Point(55.787715, 37.775631)
            ),
            Region(
                name = "Западный административный округ",
                size = getSizeRegion("Западный административный округ"),
                point = Point(55.728003, 37.443533)
            ),
            Region(
                name = "Зеленоградский административный округ",
                size = getSizeRegion("Зеленоградский административный округ"),
                point = Point(55.987583, 37.194250)
            ),
            Region(
                name = "Новомосковский административный округ",
                size = getSizeRegion("Новомосковский административный округ"),
                point = Point(55.558127, 37.370724)
            ),
            Region(
                name = "Северный административный округ",
                size = getSizeRegion("Северный административный округ"),
                point = Point(55.838390, 37.525774)
            ),
            Region(
                name = "Северо-Восточный административный округ",
                size = getSizeRegion("Северо-Восточный административный округ"),
                point = Point(55.854875, 37.632565)
            ),
            Region(
                name = "Северо-Западный административный округ",
                size = getSizeRegion("Северо-Западный административный округ"),
                point = Point(55.829370, 37.451555)
            ),
            Region(
                name = "Троицкий административный округ",
                size = getSizeRegion("Троицкий административный округ"),
                point = Point(55.355802, 37.146999)
            ),
            Region(
                name = "Центральный административный округ",
                size = getSizeRegion("Центральный административный округ"),
                point = Point(55.753600, 37.621184)
            ),
            Region(
                name = "Юго-Восточный административный округ",
                size = getSizeRegion("Юго-Восточный административный округ"),
                point = Point(55.692019, 37.754592)
            ),
            Region(
                name = "Юго-Западный административный округ",
                size = getSizeRegion("Юго-Западный административный округ"),
                point = Point(55.662735, 37.576187)
            ),
            Region(
                name = "Южный административный округ",
                size = getSizeRegion("Южный административный округ"),
                point = Point(55.622014, 37.678065)
            ),
        )
    }

    fun getRegionQuiet(): List<Region> {
        return listOf(
            Region(
                name = "Восточный административный округ",
                size = getSizeRegionQuiet("Восточный административный округ"),
                point = Point(55.787715, 37.775631)
            ),
            Region(
                name = "Западный административный округ",
                size = getSizeRegionQuiet("Западный административный округ"),
                point = Point(55.728003, 37.443533)
            ),
            Region(
                name = "Зеленоградский административный округ",
                size = getSizeRegionQuiet("Зеленоградский административный округ"),
                point = Point(55.987583, 37.194250)
            ),
            Region(
                name = "Новомосковский административный округ",
                size = getSizeRegionQuiet("Новомосковский административный округ"),
                point = Point(55.558127, 37.370724)
            ),
            Region(
                name = "Северный административный округ",
                size = getSizeRegionQuiet("Северный административный округ"),
                point = Point(55.838390, 37.525774)
            ),
            Region(
                name = "Северо-Восточный административный округ",
                size = getSizeRegionQuiet("Северо-Восточный административный округ"),
                point = Point(55.854875, 37.632565)
            ),
            Region(
                name = "Северо-Западный административный округ",
                size = getSizeRegionQuiet("Северо-Западный административный округ"),
                point = Point(55.829370, 37.451555)
            ),
            Region(
                name = "Троицкий административный округ",
                size = getSizeRegionQuiet("Троицкий административный округ"),
                point = Point(55.355802, 37.146999)
            ),
            Region(
                name = "Центральный административный округ",
                size = getSizeRegionQuiet("Центральный административный округ"),
                point = Point(55.753600, 37.621184)
            ),
            Region(
                name = "Юго-Восточный административный округ",
                size = getSizeRegionQuiet("Юго-Восточный административный округ"),
                point = Point(55.692019, 37.754592)
            ),
            Region(
                name = "Юго-Западный административный округ",
                size = getSizeRegionQuiet("Юго-Западный административный округ"),
                point = Point(55.662735, 37.576187)
            ),
            Region(
                name = "Южный административный округ",
                size = getSizeRegionQuiet("Южный административный округ"),
                point = Point(55.622014, 37.678065)
            ),
        )
    }

    fun getStatisticsPointRoom(): List<Pair<String, Any>> {
        return listOf(
            "Академический район" to 23,
            "Алексеевский район" to 21,
            "Алтуфьевский район" to 2,
            "Бабушкинский район" to 20,
            "Басманный район" to 42,
            "Бескудниковский район" to 12,
            "Бутырский район" to 11,
            "Войковский район" to 22,
            "Гагаринский район" to 19,
            "Головинский район" to 15,
            "Даниловский район" to 18,
            "Дмитровский район" to 14,
            "Донской район" to 14,
            "Красносельский район" to 16,
            "Ломоносовский район" to 14,
            "Лосиноостровский район" to 12,
            "Мещанский район" to 24,
            "Можайский район" to 18,
            "Молжаниновский район" to 1,
            "Нагорный район" to 13,
            "Нижегородский район" to 13,
            "Обручевский район" to 11,
            "Останкинский район" to 10,
            "Пресненский район" to 53,
            "Рязанский район" to 18,
            "Савёловский район" to 17,
            "Таганский район" to 34,
            "Тверской район" to 34,
            "Тимирязевский район" to 16,
            "Хорошёвский район" to 26,
            "Южнопортовый район" to 13,
            "Ярославский район" to 12,
            "поселение Внуковское" to 7,
            "поселение Десеновское" to 6,
            "поселение Киевский" to 1,
            "поселение Кокошкино" to 1,
            "поселение Краснопахорское" to 3,
            "поселение Марушкинское" to 2,
            "поселение Михайлово-Ярцевское" to 1,
            "поселение Московский" to 6,
            "поселение Мосрентген" to 5,
            "поселение Новофедоровское" to 1,
            "поселение Первомайское" to 2,
            "поселение Рязановское" to 2,
            "поселение Сосенское" to 16,
            "поселение Троицк" to 7,
            "поселение Щаповское" to 1,
            "поселение Щербинка" to 4,
            "район Арбат" to 15,
            "район Аэропорт" to 15,
            "район Беговой" to 21,
            "район Бибирево" to 16,
            "район Бирюлёво Восточное" to 20,
            "район Бирюлёво Западное" to 9,
            "район Богородское" to 24,
            "район Братеево" to 11,
            "район Вешняки" to 9,
            "район Внуково" to 3,
            "район Восточное Дегунино" to 8,
            "район Восточное Измайлово" to 11,
            "район Выхино-Жулебино" to 18,
            "район Гольяново" to 22,
            "район Дорогомилово" to 19,
            "район Замоскворечье" to 19,
            "район Западное Дегунино" to 17,
            "район Зюзино" to 10,
            "район Зябликово" to 10,
            "район Ивановское" to 11,
            "район Измайлово" to 24,
            "район Капотня" to 1,
            "район Коньково" to 16,
            "район Коптево" to 16,
            "район Косино-Ухтомский" to 4,
            "район Котловка" to 12,
            "район Крылатское" to 12,
            "район Крюково" to 3,
            "район Кузьминки" to 17,
            "район Кунцево" to 16,
            "район Куркино" to 6,
            "район Левобережный" to 17,
            "район Лефортово" to 32,
            "район Лианозово" to 8,
            "район Люблино" to 20,
            "район Марфино" to 8,
            "район Марьина Роща" to 19,
            "район Марьино" to 13,
            "район Метрогородок" to 2,
            "район Митино" to 24,
            "район Москворечье-Сабурово" to 10,
            "район Нагатино-Садовники" to 27,
            "район Нагатинский Затон" to 15,
            "район Некрасовка" to 7,
            "район Ново-Переделкино" to 5,
            "район Новогиреево" to 15,
            "район Новокосино" to 1,
            "район Орехово-Борисово Северное" to 15,
            "район Орехово-Борисово Южное" to 10,
            "район Отрадное" to 12,
            "район Очаково-Матвеевское" to 20,
            "район Перово" to 23,
            "район Печатники" to 6,
            "район Покровское-Стрешнево" to 15,
            "район Преображенское" to 19,
            "район Проспект Вернадского" to 5,
            "район Раменки" to 34,
            "район Ростокино" to 10,
            "район Савёлки" to 2,
            "район Свиблово" to 13,
            "район Северное Бутово" to 8,
            "район Северное Измайлово" to 9,
            "район Северное Медведково" to 16,
            "район Северное Тушино" to 24,
            "район Северный" to 5,
            "район Сокол" to 24,
            "район Соколиная Гора" to 13,
            "район Сокольники" to 18,
            "район Солнцево" to 17,
            "район Старое Крюково" to 2,
            "район Строгино" to 18,
            "район Текстильщики" to 9,
            "район Тропарёво-Никулино" to 12,
            "район Тёплый Стан" to 22,
            "район Фили-Давыдково" to 20,
            "район Филёвский Парк" to 18,
            "район Хамовники" to 39,
            "район Ховрино" to 13,
            "район Хорошёво-Мнёвники" to 28,
            "район Царицыно" to 14,
            "район Чертаново Северное" to 11,
            "район Чертаново Центральное" to 10,
            "район Чертаново Южное" to 14,
            "район Черёмушки" to 12,
            "район Щукино" to 24,
            "район Южное Бутово" to 33,
            "район Южное Медведково" to 17,
            "район Южное Тушино" to 21,
            "район Якиманка" to 8,
            "район Ясенево" to 17,
        )
    }

    fun getRegionByName(name: String): Point? {
        val regions = mapOf(
            "Академический район" to Point(55.689314, 37.573124),
            "Алексеевский район" to Point(55.812954, 37.650172),
            "Алтуфьевский район" to Point(55.879854, 37.582278),
            "Бабушкинский район" to Point(55.867086, 37.665821),
            "Басманный район" to Point(55.766572, 37.671238),
            "Бескудниковский район" to Point(55.866627, 37.554717),
            "Бутырский район" to Point(55.814128, 37.589213),
            "Войковский район" to Point(55.827247, 37.497342),
            "Гагаринский район" to Point(55.610372, 34.986739),
            "Головинский район" to Point(55.846765, 37.510610),
            "Даниловский район" to Point(55.710631, 37.622989),
            "Дмитровский район" to Point(55.891032, 37.528639),
            "Донской район" to Point(55.714100, 37.598070),
            "Красносельский район" to Point(57.581732, 41.331684),
            "Ломоносовский район" to Point(59.827415, 29.398607),
            "Лосиноостровский район" to Point(55.881273, 37.694199),
            "Мещанский район" to Point(55.780071, 37.628801),
            "Можайский район" to Point(55.717639, 37.422764),
            "Молжаниновский район" to Point(55.936812, 37.380237),
            "Нагорный район" to Point(55.664665, 37.615470),
            "Нижегородский район" to Point(55.728429, 37.723816),
            "Обручевский район" to Point(55.660917, 37.518479),
            "Останкинский район" to Point(55.819080, 37.621714),
            "Пресненский район" to Point(55.763437, 37.562389),
            "Рязанский район" to Point(55.724718, 37.767600),
            "Савёловский район" to Point(55.799699, 37.570923),
            "Таганский район" to Point(55.740010, 37.666971),
            "Тверской район" to Point(55.762566, 37.613171),
            "Тимирязевский район" to Point(55.822003, 37.555274),
            "Хорошёвский район" to Point(55.782294, 37.528208),
            "Южнопортовый район" to Point(55.717340, 37.671211),
            "Ярославский район" to Point(57.603636, 39.532978),
            "поселение Внуковское" to Point(55.633506, 37.290307),
            "поселение Десеновское" to Point(55.499571, 37.366619),
            "поселение Киевский" to Point(55.394883, 36.883460),
            "поселение Кокошкино" to Point(55.600170, 37.169843),
            "поселение Краснопахорское" to Point(55.421501, 37.270670),
            "поселение Марушкинское" to Point(55.595160, 37.208273),
            "поселение Михайлово-Ярцевское" to Point(55.397582, 37.139705),
            "поселение Московский" to Point(55.608409, 37.368910),
            "поселение Мосрентген" to Point(55.620743, 37.466314),
            "поселение Новофедоровское" to Point(55.425670, 36.931888),
            "поселение Первомайское" to Point(55.519728, 37.218343),
            "поселение Рязановское" to Point(55.482378, 37.495716),
            "поселение Сосенское" to Point(55.578330, 37.465892),
            "поселение Троицк" to Point(55.481546, 37.295023),
            "поселение Щаповское" to Point(55.391636, 37.380857),
            "поселение Щербинка" to Point(55.507525, 37.567653),
            "район Арбат" to Point(55.751143, 37.590003),
            "район Аэропорт" to Point(55.801076, 37.543749),
            "район Беговой" to Point(55.782871, 37.566306),
            "район Бибирево" to Point(55.894495, 37.607673),
            "район Бирюлёво Восточное" to Point(55.594591, 37.678649),
            "район Бирюлёво Западное" to Point(55.587926, 37.637111),
            "район Богородское" to Point(55.814087, 37.712282),
            "район Братеево" to Point(55.633434, 37.765067),
            "район Вешняки" to Point(55.730776, 37.815193),
            "район Внуково" to Point(55.610845, 37.296685),
            "район Восточное Дегунино" to Point(55.884282, 37.558841),
            "район Восточное Измайлово" to Point(55.795818, 37.821804),
            "район Выхино-Жулебино" to Point(55.696362, 37.824553),
            "район Гольяново" to Point(55.816819, 37.798242),
            "район Дорогомилово" to Point(55.741617, 37.551277),
            "район Замоскворечье" to Point(55.734162, 37.634290),
            "район Западное Дегунино" to Point(55.872157, 37.518937),
            "район Зюзино" to Point(55.654066, 37.589608),
            "район Зябликово" to Point(55.620113, 37.748484),
            "район Ивановское" to Point(55.767372, 37.832701),
            "район Измайлово" to Point(55.795373, 37.785494),
            "район Капотня" to Point(55.637840, 37.799724),
            "район Коньково" to Point(55.644348, 37.529654),
            "район Коптево" to Point(55.831216, 37.526286),
            "район Косино-Ухтомский" to Point(55.713892, 37.876413),
            "район Котловка" to Point(55.676215, 37.597199),
            "район Крылатское" to Point(55.759461, 37.407726),
            "район Крюково" to Point(55.969330, 37.176131),
            "район Кузьминки" to Point(55.698645, 37.773556),
            "район Кунцево" to Point(55.739341, 37.403378),
            "район Куркино" to Point(55.891209, 37.387379),
            "район Левобережный" to Point(55.865424, 37.465946),
            "район Лефортово" to Point(55.753635, 37.704826),
            "район Лианозово" to Point(55.898487, 37.570016),
            "район Люблино" to Point(55.676301, 37.763081),
            "район Марфино" to Point(55.830007, 37.588745),
            "район Марьина Роща" to Point(55.796936, 37.614383),
            "район Марьино" to Point(55.652669, 37.744774),
            "район Метрогородок" to Point(55.823616, 37.755841),
            "район Митино" to Point(55.845375, 37.365837),
            "район Москворечье-Сабурово" to Point(55.642697, 37.671148),
            "район Нагатино-Садовники" to Point(55.671422, 37.641719),
            "район Нагатинский Затон" to Point(55.622014, 37.678065),
            "район Некрасовка" to Point(55.698158, 37.940094),
            "район Ново-Переделкино" to Point(55.646086, 37.357169),
            "район Новогиреево" to Point(55.748154, 37.804117),
            "район Новокосино" to Point(55.742205, 37.865804),
            "район Орехово-Борисово Северное" to Point(55.618278, 37.704817),
            "район Орехово-Борисово Южное" to Point(55.604071, 37.738584),
            "район Отрадное" to Point(55.862060, 37.600262),
            "район Очаково-Матвеевское" to Point(55.689654, 37.448563),
            "район Перово" to Point(55.751999, 37.767456),
            "район Печатники" to Point(55.685158, 37.723807),
            "район Покровское-Стрешнево" to Point(55.822680, 37.442590),
            "район Преображенское" to Point(55.797736, 37.725173),
            "район Проспект Вернадского" to Point(55.678407, 37.498635),
            "район Раменки" to Point(55.704839, 37.513988),
            "район Ростокино" to Point(55.837717, 37.651547),
            "район Савёлки" to Point(55.987820, 37.242400),
            "район Свиблово" to Point(55.851091, 37.649615),
            "район Северное Бутово" to Point(55.568919, 37.570528),
            "район Северное Измайлово" to Point(55.806849, 37.805230),
            "район Северное Медведково" to Point(55.888336, 37.655634),
            "район Северное Тушино" to Point(55.861479, 37.428118),
            "район Северный" to Point(55.450486, 37.744414),
            "район Сокол" to Point(57.587068, 39.904944),
            "район Соколиная Гора" to Point(55.772780, 37.730625),
            "район Сокольники" to Point(55.799947, 37.677167),
            "район Солнцево" to Point(55.645918, 37.401680),
            "район Старое Крюково" to Point(55.980895, 37.199056),
            "район Строгино" to Point(55.803788, 37.402695),
            "район Текстильщики" to Point(55.708810, 37.737444),
            "район Тропарёво-Никулино" to Point(55.660323, 37.468497),
            "район Тёплый Стан" to Point(55.631427, 37.489886),
            "район Фили-Давыдково" to Point(55.727136, 37.469359),
            "район Филёвский Парк" to Point(55.749805, 37.494593),
            "район Хамовники" to Point(55.729199, 37.574534),
            "район Ховрино" to Point(55.869046, 37.489491),
            "район Хорошёво-Мнёвники" to Point(55.778011, 37.473995),
            "район Царицыно" to Point(55.629155, 37.662650),
            "район Чертаново Северное" to Point(55.636412, 37.594926),
            "район Чертаново Центральное" to Point(55.613880, 37.604098),
            "район Чертаново Южное" to Point(55.591889, 37.600370),
            "район Черёмушки" to Point(55.664649, 37.561347),
            "район Щукино" to Point(55.800595, 37.473519),
            "район Южное Бутово" to Point(55.542625, 37.529573),
            "район Южное Медведково" to Point(55.871248, 37.637398),
            "район Южное Тушино" to Point(55.843434, 37.431432),
            "район Якиманка" to Point(55.730831, 37.607574),
            "район Ясенево" to Point(55.607519, 37.534577),
        )
        return regions[name]
    }
}

private fun getSizeRegion(region: String): Int {
    return when (region) {
        "Восточный административный округ" -> {
            Bogorodskoe_r.size +
            Veshnyaki_r.size +
            Vostochnoe_Izmaylovo_r.size +
            Golyanovo_r.size +
            Ivanovskoe_r.size +
            Izmailovo_r.size +
            Kosino_Uhtomskyi_r.size +
            Metrogorodok_r.size +
            Novogireevo_r.size +
            Novokosino_r.size +
            Perovo_r.size +
            Preobrazhenskoe_r.size +
            Severnoe_Izmailovo_r.size +
            Sokolinaya_Gora_r.size +
            Sokolniki_r.size
        }

        "Западный административный округ" -> {
            Mozhaiskiy_r.size +
            Vnukovo_p.size +
            Dorogomilovo_r.size +
            Krilatskoe_r.size +
            Kuncevo_r.size +
            Novo_Peredelkino_r.size +
            Ochakovo_Matveevskoe_r.size +
            Prospekt_Vernandskogo_r.size +
            Ramenki_r.size +
            Solncevo_r.size +
            Tropareva_Nikulino_r.size +
            Filevskiy_Park_r.size +
            Fili_Davidkovo_r.size

        }

        "Зеленоградский административный округ" -> {
            Kryukovo_r.size +
            Savelki_r.size +
            Staroe_Kryukovo_r.size
        }

        "Новомосковский административный округ" -> {
            Mosrentgen_p.size +
            Vnukovo_p.size +
            Desenovskoe_p.size +
            Kokoshkino_p.size +
            Marushkinskoe_p.size +
            Moskovskiy_p.size +
            Ryazanskoe_p.size +
            Sosenskoe_p.size +
            Sherbinka_p.size
        }

        "Северный административный округ" -> {
            Beskudnikovskiy_r.size +
            Voikovskiy_r.size +
            Golovinskiy_r.size +
            Dmitrovskiy_r.size +
            Molzhaninovskiy_r.size +
            Aeroport_r.size +
            Begovoy_r.size +
            Vostochnoe_Degunino_r.size +
            Zapadnoe_Degunino_r.size +
            Koptevo_r.size +
            Levoberezhnyi_r.size +
            Sokol_r.size +
            Hovrino_r.size +
            Savelovskiy_r.size +
            Timiryazevskiy_r.size +
            Horoshovskiy_r.size
        }

        "Северо-Восточный административный округ" -> {
            Alekseevskiy_r.size +
            Altufevskiy_r.size +
            Babushkinskiy_r.size +
            Butirskiy_r.size +
            Losinoostrovskiy_r.size +
            Ostankinskiy_r.size +
            Bibirevo_r.size +
            Lianozovo_r.size +
            Marfino_r.size +
            Maryina_Rosha_r.size +
            Otradnoe_r.size +
            Rostokino_r.size +
            Sviblovo_r.size +
            Severnoe_Medvedkovo_r.size +
            Severnyi_r.size +
            Yuzhnoe_Medvedkovo_r.size +
            Yaroslavskiy_r.size
        }

        "Северо-Западный административный округ" -> {
            Kurkino_r.size +
            Mitino_r.size +
            Pokrovskoe_Streshnevo_r.size +
            Severnoe_Tushino_r.size +
            Strogino_r.size +
            Horoshovo_Mnevniki_r.size +
            Shukino_r.size +
            Yuzhnoe_Tushino_r.size
        }

        "Троицкий административный округ" -> {
            Kievskiy_p.size +
            Krasnopahorskoe_p.size +
            Mihaylovo_Yarcevskoe_p.size +
            Novofedorovskoe_p.size +
            Pervomayskoe_p.size +
            Troick_p.size +
            Shapovskoe_p.size
        }

        "Центральный административный округ" -> {
            Basmanniy_r.size +
            Krasnoselskiy_r.size +
            Meshanskiy_r.size +
            Presnenskiy_r.size +
            Arbat_r.size +
            Zamoskvorechie_r.size +
            Hamovniki_r.size +
            Yakimanka_r.size +
            Taganskiy_r.size +
            Tverskoy_r.size
        }

        "Юго-Восточный административный округ" -> {
            Nizhegorodskiy_r.size +
            Vihino_Zhulebino_r.size +
            Kapotnya_r.size +
            Kuzminki_r.size +
            Lefortovo_r.size +
            Lyublino_r.size +
            Maryino_r.size +
            Nekrasovka_r.size +
            Pechatniki_r.size +
            Tekstilshiki_r.size +
            Ryazanskiy_r.size +
            Yuzhnoportoviy_r.size
        }

        "Юго-Западный административный округ" -> {
            Akademicheskiy_r.size +
            Gagarinskiy_r.size +
            Lomonosovskiy_r.size +
            Obruchevskiy_r.size +
            Zyuzino_r.size +
            Konkovo_r.size +
            Kotlovka_r.size +
            Severnoe_Butovo_r.size +
            Teplyi_Stan_r.size +
            Cheremushki_r.size +
            Yuzhnoe_Butovo_r.size +
            Yasenevo_r.size
        }

        "Южный административный округ" -> {
            Danilovskiy_r.size +
            Donskoy_r.size +
            Nagorniy_r.size +
            Biruylevo_Vostochnoe_r.size +
            Biruylevo_Zapadnoe_r.size +
            Brateevo_r.size +
            Zyablikovo_r.size +
            Moskvorechye_Saburovo_r.size +
            Nagatino_Sadovniki_r.size +
            Nagatinskyi_Zaton_r.size +
            Orehovo_Borisovo_Severnoe_r.size +
            Orehovo_Borisovo_Yuzhnoe_r.size +
            Caricino_r.size +
            Chertanovo_Severnoe_r.size +
            Chertanovo_Centralnoe_r.size +
            Chertanovo_Yuzhnoe_r.size
        }
        else -> 0
    }
}

private fun getSizeRegionQuiet(region: String): Int {
    return when (region) {
        "Восточный административный округ" -> {
            Bogorodskoe.size +
                    Veshnyaki.size +
                    Vostochnoe_Izmaylovo.size +
                    Golyanovo.size +
                    Ivanovskoe.size +
                    Izmailovo.size +
                    Kosino_Uhtomskyi.size +
                    Metrogorodok.size +
                    Novogireevo.size +
                    Novokosino.size +
                    Perovo.size +
                    Preobrazhenskoe.size +
                    Severnoe_Izmailovo.size +
                    Sokolinaya_Gora.size +
                    Sokolniki.size
        }

        "Западный административный округ" -> {
            Mozhaiskiy.size +
                    Vnukovo.size +
                    Dorogomilovo.size +
                    Krilatskoe.size +
                    Kuncevo.size +
                    Novo_Peredelkino.size +
                    Ochakovo_Matveevskoe.size +
                    Prospekt_Vernandskogo.size +
                    Ramenki.size +
                    Solncevo.size +
                    Tropareva_Nikulino.size +
                    Filevskiy_Park.size +
                    Fili_Davidkovo.size

        }

        "Зеленоградский административный округ" -> {
            Kryukovo.size +
                    Savelki.size +
                    Staroe_Kryukovo.size
        }

        "Новомосковский административный округ" -> {
            Mosrentgen.size +
                    Vnukovo.size +
                    Desenovskoe.size +
                    Kokoshkino.size +
                    Marushkinskoe.size +
                    Moskovskiy.size +
                    Ryazanskoe.size +
                    Sosenskoe.size +
                    Sherbinka.size
        }

        "Северный административный округ" -> {
            Beskudnikovskiy.size +
                    Voikovskiy.size +
                    Golovinskiy.size +
                    Dmitrovskiy.size +
                    Molzhaninovskiy.size +
                    Aeroport.size +
                    Begovoy.size +
                    Vostochnoe_Degunino.size +
                    Zapadnoe_Degunino.size +
                    Koptevo.size +
                    Levoberezhnyi.size +
                    Sokol.size +
                    Hovrino.size +
                    Savelovskiy.size +
                    Timiryazevskiy.size +
                    Horoshovskiy.size
        }

        "Северо-Восточный административный округ" -> {
            Alekseevskiy.size +
                    Altufevskiy.size +
                    Babushkinskiy.size +
                    Butirskiy.size +
                    Losinoostrovskiy.size +
                    Ostankinskiy.size +
                    Bibirevo.size +
                    Lianozovo.size +
                    Marfino.size +
                    Maryina_Rosha.size +
                    Otradnoe.size +
                    Rostokino.size +
                    Sviblovo.size +
                    Severnoe_Medvedkovo.size +
                    Severnyi.size +
                    Yuzhnoe_Medvedkovo.size +
                    Yaroslavskiy.size +
                    Alekseevskiy.size +
                    Altufevskiy.size +
                    Babushkinskiy.size +
                    Butirskiy.size +
                    Losinoostrovskiy.size +
                    Ostankinskiy.size +
                    Bibirevo.size +
                    Lianozovo.size +
                    Marfino.size +
                    Maryina_Rosha.size +
                    Otradnoe.size +
                    Rostokino.size +
                    Sviblovo.size +
                    Severnoe_Medvedkovo.size +
                    Severnyi.size +
                    Yuzhnoe_Medvedkovo.size +
                    Yaroslavskiy.size
        }

        "Северо-Западный административный округ" -> {
            Kurkino.size +
                    Mitino.size +
                    Pokrovskoe_Streshnevo.size +
                    Severnoe_Tushino.size +
                    Strogino.size +
                    Horoshovo_Mnevniki.size +
                    Shukino.size +
                    Yuzhnoe_Tushino.size
        }

        "Троицкий административный округ" -> {
            Kievskiy.size +
                    Krasnopahorskoe.size +
                    Mihaylovo_Yarcevskoe.size +
                    Novofedorovskoe.size +
                    Pervomayskoe.size +
                    Troick.size +
                    Shapovskoe.size
        }

        "Центральный административный округ" -> {
            Basmanniy.size +
                    Krasnoselskiy.size +
                    Meshanskiy.size +
                    Presnenskiy.size +
                    Arbat.size +
                    Zamoskvorechie.size +
                    Hamovniki.size +
                    Yakimanka.size +
                    Taganskiy.size +
                    Tverskoy.size
        }

        "Юго-Восточный административный округ" -> {
            Nizhegorodskiy.size +
                    Vihino_Zhulebino.size +
                    Kapotnya.size +
                    Kuzminki.size +
                    Lefortovo.size +
                    Lyublino.size +
                    Maryino.size +
                    Nekrasovka.size +
                    Pechatniki.size +
                    Tekstilshiki.size +
                    Ryazanskiy.size +
                    Yuzhnoportoviy.size
        }

        "Юго-Западный административный округ" -> {
            Akademicheskiy.size +
                    Gagarinskiy.size +
                    Lomonosovskiy.size +
                    Obruchevskiy.size +
                    Zyuzino.size +
                    Konkovo.size +
                    Kotlovka.size +
                    Severnoe_Butovo.size +
                    Teplyi_Stan.size +
                    Cheremushki.size +
                    Yuzhnoe_Butovo.size +
                    Yasenevo.size
        }

        "Южный административный округ" -> {
            Danilovskiy.size +
                    Donskoy.size +
                    Nagorniy.size +
                    Biruylevo_Vostochnoe.size +
                    Biruylevo_Zapadnoe.size +
                    Brateevo.size +
                    Zyablikovo.size +
                    Moskvorechye_Saburovo.size +
                    Nagatinskyi_Zaton.size +
                    Orehovo_Borisovo_Severnoe.size +
                    Orehovo_Borisovo_Yuzhnoe.size +
                    Caricino.size +
                    Chertanovo_Severnoe.size +
                    Chertanovo_Centralnoe.size +
                    Chertanovo_Yuzhnoe.size
        }
        else -> 0
    }
}

val Akademicheskiy = listOf(
    Point(55.6921, 37.5702),
    Point(55.6905, 37.5698),
    Point(55.6918, 37.5714),
    Point(55.6899, 37.5707),
    Point(55.6930, 37.5721),
    Point(55.6881, 37.5693),
    Point(55.6903, 37.5722),
    Point(55.6925, 37.5695),
    Point(55.6897, 37.5719),
    Point(55.6889, 37.5704),
    Point(55.6911, 37.5697),
    Point(55.6933, 37.5710),
    Point(55.6885, 37.5724),
    Point(55.6907, 37.5696),
    Point(55.6929, 37.5718),
    Point(55.6880, 37.5701),
    Point(55.6902, 37.5725),
    Point(55.6924, 37.5694),
    Point(55.6896, 37.5717),
    Point(55.6888, 37.5703),
    Point(55.6910, 37.5699)
)

val Alekseevskiy = listOf(
    Point(55.8152, 37.6458),
    Point(55.8174, 37.6499),
    Point(55.8136, 37.6520),
    Point(55.8198, 37.6477),
    Point(55.8110, 37.6508),
    Point(55.8162, 37.6449),
    Point(55.8184, 37.6480),
    Point(55.8146, 37.6511),
    Point(55.8108, 37.6542),
    Point(55.8170, 37.6463),
    Point(55.8132, 37.6494),
    Point(55.8194, 37.6435),
    Point(55.8156, 37.6466),
    Point(55.8118, 37.6497),
    Point(55.8180, 37.6528),
    Point(55.8142, 37.6459),
    Point(55.8104, 37.6490),
    Point(55.8166, 37.6521),
    Point(55.8128, 37.6452),
    Point(55.8190, 37.6483),
    Point(55.8152, 37.6514)
)

val Altufevskiy = listOf(
    Point(55.878245, 37.588401),
    Point(55.882976, 37.591302)
)

val Babushkinskiy = listOf(
    Point(55.869245, 37.669401),
    Point(55.852976, 37.658302),
    Point(55.847315, 37.671991),
    Point(55.860214, 37.684402),
    Point(55.865123, 37.660310),
    Point(55.871992, 37.675501),
    Point(55.848762, 37.662300),
    Point(55.853789, 37.678901),
    Point(55.866701, 37.669802),
    Point(55.862345, 37.657201),
    Point(55.850123, 37.672991),
    Point(55.868214, 37.664402),
    Point(55.864123, 37.660310),
    Point(55.872992, 37.675501),
    Point(55.849762, 37.662300),
    Point(55.854789, 37.678901),
    Point(55.867701, 37.669802),
    Point(55.863345, 37.657201),
    Point(55.851123, 37.672991),
    Point(55.869214, 37.664402)
)

val Basmanniy = listOf(
    Point(55.7711, 37.6902),
    Point(55.7692, 37.6853),
    Point(55.7673, 37.6804),
    Point(55.7654, 37.6755),
    Point(55.7635, 37.6706),
    Point(55.7616, 37.6657),
    Point(55.7597, 37.6608),
    Point(55.7578, 37.6559),
    Point(55.7559, 37.6510),
    Point(55.7540, 37.6461),
    Point(55.7722, 37.6912),
    Point(55.7703, 37.6863),
    Point(55.7684, 37.6814),
    Point(55.7665, 37.6765),
    Point(55.7646, 37.6716),
    Point(55.7627, 37.6667),
    Point(55.7608, 37.6618),
    Point(55.7589, 37.6569),
    Point(55.7570, 37.6520),
    Point(55.7551, 37.6471),
    Point(55.7532, 37.6422),
    Point(55.7513, 37.6373),
    Point(55.7494, 37.6324),
    Point(55.7475, 37.6275),
    Point(55.7456, 37.6226),
    Point(55.7437, 37.6177),
    Point(55.7418, 37.6128),
    Point(55.7399, 37.6079),
    Point(55.7380, 37.6030),
    Point(55.7361, 37.5981),
    Point(55.7342, 37.5932),
    Point(55.7323, 37.5883),
    Point(55.7304, 37.5834),
    Point(55.7285, 37.5785),
    Point(55.7266, 37.5736),
    Point(55.7247, 37.5687),
    Point(55.7228, 37.5638),
    Point(55.7209, 37.5589),
    Point(55.7190, 37.5540),
    Point(55.7171, 37.5491),
    Point(55.7152, 37.5442),
    Point(55.7133, 37.5393)
)

val Beskudnikovskiy = listOf(
    Point(55.872345, 37.558401),
    Point(55.874976, 37.561302),
    Point(55.876315, 37.569991),
    Point(55.878214, 37.574402),
    Point(55.879123, 37.560310),
    Point(55.880992, 37.575501),
    Point(55.881762, 37.562300),
    Point(55.883789, 37.578901),
    Point(55.884701, 37.569802),
    Point(55.885345, 37.557201),
    Point(55.886123, 37.572991),
    Point(55.887214, 37.564402)
)

val Butirskiy = listOf(
    Point(55.813245, 37.592401),
    Point(55.814976, 37.594302),
    Point(55.816315, 37.596991),
    Point(55.818214, 37.598402),
    Point(55.819123, 37.590310),
    Point(55.820992, 37.599501),
    Point(55.821762, 37.592300),
    Point(55.823789, 37.598901),
    Point(55.824701, 37.596802),
    Point(55.825345, 37.592201),
    Point(55.826123, 37.597991)
)

val Voikovskiy = listOf(
    Point(55.817245, 37.498401),
    Point(55.818976, 37.499302),
    Point(55.819315, 37.500991),
    Point(55.820214, 37.501402),
    Point(55.821123, 37.502310),
    Point(55.822992, 37.503501),
    Point(55.823762, 37.504300),
    Point(55.824789, 37.505901),
    Point(55.825701, 37.506802),
    Point(55.826345, 37.507201),
    Point(55.827123, 37.508991),
    Point(55.828214, 37.509402),
    Point(55.829245, 37.510401),
    Point(55.830976, 37.511302),
    Point(55.831315, 37.512991),
    Point(55.832214, 37.513402),
    Point(55.833123, 37.514310),
    Point(55.834992, 37.515501),
    Point(55.835762, 37.516300),
    Point(55.836789, 37.517901),
    Point(55.837701, 37.518802),
    Point(55.838345, 37.519201)
)

val Gagarinskiy = listOf(
    Point(55.697245, 37.533401),
    Point(55.698976, 37.534302),
    Point(55.699315, 37.535991),
    Point(55.700214, 37.536402),
    Point(55.701123, 37.537310),
    Point(55.702992, 37.538501),
    Point(55.703762, 37.539300),
    Point(55.704789, 37.540901),
    Point(55.705701, 37.541802),
    Point(55.706345, 37.542201),
    Point(55.707123, 37.543991),
    Point(55.708214, 37.544402),
    Point(55.709245, 37.545401),
    Point(55.710976, 37.546302),
    Point(55.711315, 37.547991),
    Point(55.712214, 37.548402),
    Point(55.713123, 37.549310),
    Point(55.714992, 37.550501),
    Point(55.715762, 37.551300)
)

val Golovinskiy = listOf(
    Point(55.847245, 37.487401),
    Point(55.848976, 37.488302),
    Point(55.849315, 37.489991),
    Point(55.850214, 37.490402),
    Point(55.851123, 37.491310),
    Point(55.852992, 37.492501),
    Point(55.853762, 37.493300),
    Point(55.854789, 37.494901),
    Point(55.855701, 37.495802),
    Point(55.856345, 37.496201),
    Point(55.857123, 37.497991),
    Point(55.858214, 37.498402),
    Point(55.859245, 37.499401),
    Point(55.860976, 37.500302),
    Point(55.861315, 37.501991)
)

val Danilovskiy = listOf(
    Point(55.727245, 37.617401),
    Point(55.728976, 37.618302),
    Point(55.729315, 37.619991),
    Point(55.730214, 37.620402),
    Point(55.731123, 37.621310),
    Point(55.732992, 37.622501),
    Point(55.733762, 37.623300),
    Point(55.734789, 37.624901),
    Point(55.735701, 37.625802),
    Point(55.736345, 37.626201),
    Point(55.737123, 37.627991),
    Point(55.738214, 37.628402),
    Point(55.739245, 37.629401),
    Point(55.740976, 37.630302),
    Point(55.741315, 37.631991),
    Point(55.742214, 37.632402),
    Point(55.743123, 37.633310),
    Point(55.744992, 37.634501)
)

val Dmitrovskiy = listOf(
    Point(55.912345, 37.516401),
    Point(55.913976, 37.517302),
    Point(55.914315, 37.518991),
    Point(55.915214, 37.519402),
    Point(55.916123, 37.520310),
    Point(55.917992, 37.521501),
    Point(55.918762, 37.522300),
    Point(55.919789, 37.523901),
    Point(55.920701, 37.524802),
    Point(55.921345, 37.525201),
    Point(55.922123, 37.526991),
    Point(55.923214, 37.527402),
    Point(55.924245, 37.528401),
    Point(55.925976, 37.529302)
)

val Donskoy = listOf(
    Point(55.708345, 37.622401),
    Point(55.709976, 37.623302),
    Point(55.710315, 37.624991),
    Point(55.711214, 37.625402),
    Point(55.712123, 37.626310),
    Point(55.713992, 37.627501),
    Point(55.714762, 37.628300),
    Point(55.715789, 37.629901),
    Point(55.716701, 37.630802),
    Point(55.717345, 37.631201),
    Point(55.718123, 37.632991),
    Point(55.719214, 37.633402),
    Point(55.720245, 37.634401),
    Point(55.721976, 37.635302)
)

val Krasnoselskiy = listOf(
    Point(55.782345, 37.652401),
    Point(55.783976, 37.653302),
    Point(55.784315, 37.654991),
    Point(55.785214, 37.655402),
    Point(55.786123, 37.656310),
    Point(55.787992, 37.657501),
    Point(55.788762, 37.658300),
    Point(55.789789, 37.659901),
    Point(55.790701, 37.660802),
    Point(55.791345, 37.661201),
    Point(55.792123, 37.662991),
    Point(55.793214, 37.663402),
    Point(55.794245, 37.664401),
    Point(55.795976, 37.665302),
    Point(55.796701, 37.666201),
    Point(55.797345, 37.667991)
)

val Lomonosovskiy = listOf(
    Point(55.690345, 37.532401),
    Point(55.691976, 37.533302),
    Point(55.692315, 37.534991),
    Point(55.693214, 37.535402),
    Point(55.694123, 37.536310),
    Point(55.695992, 37.537501),
    Point(55.696762, 37.538300),
    Point(55.697789, 37.539901),
    Point(55.698701, 37.540802),
    Point(55.699345, 37.541201),
    Point(55.700123, 37.542991),
    Point(55.701214, 37.543402),
    Point(55.702245, 37.544401),
    Point(55.703976, 37.545302)
)

val Losinoostrovskiy = listOf(
    Point(55.853345, 37.700401),
    Point(55.854976, 37.701302),
    Point(55.855315, 37.702991),
    Point(55.856214, 37.703402),
    Point(55.857123, 37.704310),
    Point(55.858992, 37.705501),
    Point(55.859762, 37.706300),
    Point(55.860789, 37.707901),
    Point(55.861701, 37.708802),
    Point(55.862345, 37.709201),
    Point(55.863123, 37.710991),
    Point(55.864214, 37.711402)
)

val Meshanskiy = listOf(
    Point(55.767345, 37.632401),
    Point(55.768976, 37.633302),
    Point(55.769315, 37.634991),
    Point(55.770214, 37.635402),
    Point(55.771123, 37.636310),
    Point(55.772992, 37.637501),
    Point(55.773762, 37.638300),
    Point(55.774789, 37.639901),
    Point(55.775701, 37.640802),
    Point(55.776345, 37.641201),
    Point(55.777123, 37.642991),
    Point(55.778214, 37.643402),
    Point(55.779245, 37.644401),
    Point(55.780976, 37.645302),
    Point(55.781345, 37.646401),
    Point(55.782976, 37.647302),
    Point(55.783315, 37.648991),
    Point(55.784214, 37.649402),
    Point(55.785123, 37.650310),
    Point(55.786992, 37.651501),
    Point(55.787762, 37.652300),
    Point(55.788789, 37.653901),
    Point(55.789701, 37.654802),
    Point(55.790345, 37.655201)
)

val Mozhaiskiy = listOf(
    Point(55.727345, 37.417401),
    Point(55.728976, 37.418302),
    Point(55.729315, 37.419991),
    Point(55.730214, 37.420402),
    Point(55.731123, 37.421310),
    Point(55.732992, 37.422501),
    Point(55.733762, 37.423300),
    Point(55.734789, 37.424901),
    Point(55.735701, 37.425802),
    Point(55.736345, 37.426201),
    Point(55.737123, 37.427991),
    Point(55.738214, 37.428402),
    Point(55.739245, 37.429401),
    Point(55.740976, 37.430302),
    Point(55.741345, 37.431401),
    Point(55.742976, 37.432302),
    Point(55.743315, 37.433991),
    Point(55.744214, 37.434402)
)

val Molzhaninovskiy = listOf(
    Point(55.846215, 37.492040)
)

val Nagorniy = listOf(
    Point(55.681240, 37.605350),
    Point(55.682365, 37.606420),
    Point(55.683470, 37.607510),
    Point(55.684585, 37.608600),
    Point(55.685690, 37.609690),
    Point(55.686795, 37.610780),
    Point(55.687900, 37.611870),
    Point(55.689005, 37.612960),
    Point(55.690110, 37.614050),
    Point(55.691215, 37.615140),
    Point(55.692320, 37.616230),
    Point(55.693425, 37.617320),
    Point(55.694530, 37.618410)
)

val Nizhegorodskiy = listOf(
    Point(55.732340, 37.728050),
    Point(55.733445, 37.729140),
    Point(55.734550, 37.730230),
    Point(55.735655, 37.731320),
    Point(55.736760, 37.732410),
    Point(55.737865, 37.733500),
    Point(55.738970, 37.734590),
    Point(55.740075, 37.735680),
    Point(55.741180, 37.736770),
    Point(55.742285, 37.737860),
    Point(55.743390, 37.738950),
    Point(55.744495, 37.740040),
    Point(55.745600, 37.741130)
)

val Obruchevskiy = listOf(
    Point(55.682, 37.520),
    Point(55.679, 37.512),
    Point(55.684, 37.518),
    Point(55.680, 37.522),
    Point(55.681, 37.510),
    Point(55.685, 37.526),
    Point(55.677, 37.514),
    Point(55.686, 37.520),
    Point(55.678, 37.528),
    Point(55.687, 37.508),
    Point(55.683, 37.516),
)

val Ostankinskiy = listOf(
    Point(55.821, 37.613),
    Point(55.825, 37.605),
    Point(55.819, 37.620),
    Point(55.823, 37.610),
    Point(55.817, 37.615),
    Point(55.822, 37.607),
    Point(55.818, 37.622),
    Point(55.826, 37.609),
    Point(55.820, 37.617),
    Point(55.824, 37.612),
)

val Presnenskiy = listOf(
    Point(55.752, 37.572),
    Point(55.758, 37.564),
    Point(55.749, 37.580),
    Point(55.753, 37.570),
    Point(55.755, 37.575),
    Point(55.750, 37.565),
    Point(55.759, 37.577),
    Point(55.751, 37.573),
    Point(55.756, 37.561),
    Point(55.754, 37.579),
    Point(55.757, 37.568),
    Point(55.748, 37.576),
    Point(55.752, 37.562),
    Point(55.758, 37.574),
    Point(55.749, 37.560),
    Point(55.753, 37.578),
    Point(55.755, 37.569),
    Point(55.750, 37.571),
    Point(55.759, 37.563),
    Point(55.751, 37.580),
    Point(55.756, 37.566),
    Point(55.754, 37.572),
    Point(55.757, 37.575),
    Point(55.748, 37.567),
    Point(55.752, 37.579),
    Point(55.758, 37.570),
    Point(55.749, 37.574),
    Point(55.753, 37.561),
    Point(55.755, 37.573),
    Point(55.750, 37.577),
    Point(55.759, 37.568),
    Point(55.751, 37.564),
    Point(55.756, 37.580),
    Point(55.754, 37.565),
    Point(55.757, 37.569),
    Point(55.748, 37.571),
    Point(55.752, 37.576),
    Point(55.758, 37.562),
    Point(55.749, 37.575),
    Point(55.753, 37.563),
    Point(55.755, 37.560),
    Point(55.750, 37.578),
    Point(55.759, 37.566),
    Point(55.751, 37.579),
    Point(55.756, 37.570),
    Point(55.754, 37.574),
    Point(55.757, 37.561),
    Point(55.748, 37.573),
    Point(55.752, 37.577),
    Point(55.758, 37.569),
    Point(55.749, 37.572),
    Point(55.753, 37.567),
    Point(55.755, 37.568),
)

val Ryazanskiy = listOf(
    Point(55.716, 37.793),
    Point(55.718, 37.789),
    Point(55.714, 37.796),
    Point(55.719, 37.790),
    Point(55.717, 37.794),
    Point(55.715, 37.792),
    Point(55.720, 37.788),
    Point(55.713, 37.797),
    Point(55.721, 37.791),
    Point(55.712, 37.795),
    Point(55.722, 37.789),
    Point(55.711, 37.798),
    Point(55.723, 37.790),
    Point(55.710, 37.796),
    Point(55.724, 37.787),
    Point(55.709, 37.799),
    Point(55.725, 37.788),
    Point(55.708, 37.797)
)

val Savelovskiy = listOf(
    Point(55.794, 37.588),
    Point(55.796, 37.590),
    Point(55.792, 37.584),
    Point(55.797, 37.589),
    Point(55.795, 37.587),
    Point(55.793, 37.585),
    Point(55.798, 37.591),
    Point(55.791, 37.583),
    Point(55.799, 37.592),
    Point(55.790, 37.582),
    Point(55.800, 37.593),
    Point(55.789, 37.581),
    Point(55.801, 37.594),
    Point(55.788, 37.580),
    Point(55.802, 37.595),
    Point(55.787, 37.579),
    Point(55.803, 37.596)
)

val Taganskiy = listOf(
    Point(55.738, 37.665),
    Point(55.739, 37.666),
    Point(55.737, 37.664),
    Point(55.740, 37.667),
    Point(55.736, 37.663),
    Point(55.741, 37.668),
    Point(55.735, 37.662),
    Point(55.742, 37.669),
    Point(55.734, 37.661),
    Point(55.743, 37.670),
    Point(55.733, 37.660),
    Point(55.744, 37.671),
    Point(55.732, 37.659),
    Point(55.745, 37.672),
    Point(55.731, 37.658),
    Point(55.746, 37.673),
    Point(55.730, 37.657),
    Point(55.747, 37.674),
    Point(55.729, 37.656),
    Point(55.748, 37.675),
    Point(55.728, 37.655),
    Point(55.749, 37.676),
    Point(55.727, 37.654),
    Point(55.750, 37.677),
    Point(55.726, 37.653),
    Point(55.751, 37.678),
    Point(55.725, 37.652),
    Point(55.752, 37.679),
    Point(55.724, 37.651),
    Point(55.753, 37.680),
    Point(55.723, 37.650),
    Point(55.754, 37.681),
    Point(55.722, 37.649),
    Point(55.755, 37.682)
)

val Tverskoy = listOf(
    Point(55.765, 37.605),
    Point(55.766, 37.606),
    Point(55.764, 37.604),
    Point(55.767, 37.607),
    Point(55.763, 37.603),
    Point(55.768, 37.608),
    Point(55.762, 37.602),
    Point(55.769, 37.609),
    Point(55.761, 37.601),
    Point(55.770, 37.610),
    Point(55.760, 37.600),
    Point(55.771, 37.611),
    Point(55.759, 37.599),
    Point(55.772, 37.612),
    Point(55.758, 37.598),
    Point(55.773, 37.613),
    Point(55.757, 37.597),
    Point(55.774, 37.614),
    Point(55.756, 37.596),
    Point(55.775, 37.615),
    Point(55.755, 37.595),
    Point(55.776, 37.616),
    Point(55.754, 37.594),
    Point(55.777, 37.617),
    Point(55.753, 37.593),
    Point(55.778, 37.618),
    Point(55.752, 37.592),
    Point(55.779, 37.619),
    Point(55.751, 37.591),
    Point(55.780, 37.620),
    Point(55.750, 37.590),
    Point(55.781, 37.621),
    Point(55.749, 37.589),
    Point(55.782, 37.622)
)

val Timiryazevskiy = listOf(
    Point(55.822, 37.555),
    Point(55.823, 37.556),
    Point(55.821, 37.554),
    Point(55.824, 37.557),
    Point(55.820, 37.553),
    Point(55.825, 37.558),
    Point(55.819, 37.552),
    Point(55.826, 37.559),
    Point(55.818, 37.551),
    Point(55.827, 37.560),
    Point(55.817, 37.550),
    Point(55.828, 37.561),
    Point(55.816, 37.549),
    Point(55.829, 37.562),
    Point(55.815, 37.548),
    Point(55.830, 37.563)
)

val Horoshovskiy = listOf(
    Point(55.785, 37.530),
    Point(55.786, 37.531),
    Point(55.784, 37.529),
    Point(55.787, 37.532),
    Point(55.783, 37.528),
    Point(55.788, 37.533),
    Point(55.782, 37.527),
    Point(55.789, 37.534),
    Point(55.781, 37.526),
    Point(55.790, 37.535),
    Point(55.780, 37.525),
    Point(55.791, 37.536),
    Point(55.779, 37.524),
    Point(55.792, 37.537),
    Point(55.778, 37.523),
    Point(55.793, 37.538),
    Point(55.777, 37.522),
    Point(55.794, 37.539),
    Point(55.776, 37.521),
    Point(55.795, 37.540),
    Point(55.775, 37.520),
    Point(55.796, 37.541),
    Point(55.774, 37.519),
    Point(55.797, 37.542),
    Point(55.773, 37.518),
    Point(55.798, 37.543)
)

val Yuzhnoportoviy = listOf(
    Point(55.708, 37.655),
    Point(55.709, 37.656),
    Point(55.707, 37.654),
    Point(55.710, 37.657),
    Point(55.706, 37.653),
    Point(55.711, 37.658),
    Point(55.705, 37.652),
    Point(55.712, 37.659),
    Point(55.704, 37.651),
    Point(55.713, 37.660),
    Point(55.703, 37.650),
    Point(55.714, 37.661),
    Point(55.702, 37.649)
)

val Yaroslavskiy = listOf(
    Point(55.822, 37.832),
    Point(55.823, 37.833),
    Point(55.821, 37.831),
    Point(55.824, 37.834),
    Point(55.820, 37.830),
    Point(55.825, 37.835),
    Point(55.819, 37.829),
    Point(55.826, 37.836),
    Point(55.818, 37.828),
    Point(55.827, 37.837),
    Point(55.817, 37.827),
    Point(55.828, 37.838),
)

val p_Vnukovo = listOf(
    Point(55.740, 37.370),
    Point(55.741, 37.371),
    Point(55.739, 37.369),
    Point(55.742, 37.372),
    Point(55.738, 37.368),
    Point(55.743, 37.373),
    Point(55.737, 37.367)
)

val Desenovskoe = listOf(
    Point(55.510, 37.210),
    Point(55.511, 37.211),
    Point(55.509, 37.209),
    Point(55.512, 37.212),
    Point(55.508, 37.208),
    Point(55.513, 37.213)
)

val Kievskiy = listOf(
    Point(55.450, 37.150)
)

val Kokoshkino = listOf(
    Point(55.420, 37.130)
)

val Krasnopahorskoe = listOf(
    Point(55.306, 37.183),
    Point(55.299, 37.179),
    Point(55.303, 37.185)
)

val Marushkinskoe = listOf(
    Point(55.590, 37.160),
    Point(55.584, 37.152)
)

val Mihaylovo_Yarcevskoe = listOf(
    Point(55.642, 37.216)
)

val Moskovskiy = listOf(
    Point(55.601, 37.348),
    Point(55.607, 37.355),
    Point(55.614, 37.342),
    Point(55.620, 37.330),
    Point(55.632, 37.360),
    Point(55.640, 37.370)
)

val Mosrentgen = listOf(
    Point(55.662, 37.464),
    Point(55.658, 37.456),
    Point(55.654, 37.442),
    Point(55.649, 37.435),
    Point(55.643, 37.429)
)

val Novofedorovskoe = listOf(
    Point(55.230, 36.777)
)

val Pervomayskoe = listOf(
    Point(55.425, 36.774),
    Point(55.417, 36.789)
)

val Ryazanskoe = listOf(
    Point(55.612, 37.484),
    Point(55.605, 37.492)
)

val Sosenskoe = listOf(
    Point(55.5501, 37.3701),
    Point(55.5502, 37.3702),
    Point(55.5503, 37.3703),
    Point(55.5504, 37.3704),
    Point(55.5505, 37.3705),
    Point(55.5506, 37.3706),
    Point(55.5507, 37.3707),
    Point(55.5508, 37.3708),
    Point(55.5509, 37.3709),
    Point(55.5510, 37.3710),
    Point(55.5511, 37.3711),
    Point(55.5512, 37.3712),
    Point(55.5513, 37.3713),
    Point(55.5514, 37.3714),
    Point(55.5515, 37.3715),
    Point(55.5516, 37.3716)
)

val Troick = listOf(
    Point(55.5501, 37.3701),
    Point(55.5502, 37.3702),
    Point(55.5503, 37.3703),
    Point(55.5504, 37.3704),
    Point(55.5505, 37.3705),
    Point(55.5506, 37.3706),
    Point(55.5507, 37.3707),
    Point(55.5508, 37.3708),
    Point(55.5509, 37.3709),
    Point(55.5510, 37.3710),
    Point(55.5511, 37.3711),
    Point(55.5512, 37.3712),
    Point(55.5513, 37.3713),
    Point(55.5514, 37.3714),
    Point(55.5515, 37.3715),
    Point(55.5516, 37.3716)
)

val Shapovskoe = listOf(
    Point(55.4081, 37.2081)
)

val Sherbinka = listOf(
    Point(55.4090, 37.2105),
    Point(55.4123, 37.2041),
    Point(55.4017, 37.2152),
    Point(55.4058, 37.2098)
)

val Arbat = listOf(
    Point(55.7517, 37.5898),
    Point(55.7522, 37.5903),
    Point(55.7502, 37.5878),
    Point(55.7497, 37.5863),
    Point(55.7532, 37.5888),
    Point(55.7527, 37.5853),
    Point(55.7512, 37.5848),
    Point(55.7507, 37.5833),
    Point(55.7492, 37.5828),
    Point(55.7487, 37.5813),
    Point(55.7472, 37.5808),
    Point(55.7467, 37.5793),
    Point(55.7452, 37.5788),
    Point(55.7447, 37.5773),
    Point(55.7432, 37.5768)
)

val Aeroport = listOf(
    Point(55.8001, 37.5332),
    Point(55.8026, 37.5297),
    Point(55.7996, 37.5347),
    Point(55.7981, 37.5362),
    Point(55.8011, 37.5312),
    Point(55.8036, 37.5277),
    Point(55.8006, 37.5327),
    Point(55.7991, 37.5342),
    Point(55.8021, 37.5292),
    Point(55.8046, 37.5257),
    Point(55.8016, 37.5307),
    Point(55.8001, 37.5322),
    Point(55.8031, 37.5272),
    Point(55.8056, 37.5237),
    Point(55.8026, 37.5287)
)

val Begovoy = listOf(
    Point(55.7811, 37.5561),
    Point(55.7826, 37.5586),
    Point(55.7801, 37.5536),
    Point(55.7831, 37.5611),
    Point(55.7846, 37.5636),
    Point(55.7821, 37.5581),
    Point(55.7796, 37.5531),
    Point(55.7816, 37.5566),
    Point(55.7836, 37.5591),
    Point(55.7851, 37.5616),
    Point(55.7826, 37.5566),
    Point(55.7801, 37.5516),
    Point(55.7821, 37.5541),
    Point(55.7841, 37.5566),
    Point(55.7856, 37.5591),
    Point(55.7831, 37.5541),
    Point(55.7806, 37.5491),
    Point(55.7826, 37.5516),
    Point(55.7846, 37.5541),
    Point(55.7861, 37.5566),
    Point(55.7836, 37.5516)
)

val Bibirevo = listOf(
    Point(55.8821, 37.6661),
    Point(55.8836, 37.6686),
    Point(55.8811, 37.6636),
    Point(55.8841, 37.6711),
    Point(55.8856, 37.6736),
    Point(55.8831, 37.6681),
    Point(55.8806, 37.6631),
    Point(55.8826, 37.6666),
    Point(55.8846, 37.6691),
    Point(55.8861, 37.6716),
    Point(55.8836, 37.6666),
    Point(55.8811, 37.6616),
    Point(55.8831, 37.6641),
    Point(55.8851, 37.6666),
    Point(55.8866, 37.6691),
    Point(55.8841, 37.6641)
)

val Biruylevo_Vostochnoe = listOf(
    Point(55.5871, 37.6691),
    Point(55.5886, 37.6716),
    Point(55.5861, 37.6666),
    Point(55.5891, 37.6741),
    Point(55.5906, 37.6766),
    Point(55.5881, 37.6711),
    Point(55.5856, 37.6661),
    Point(55.5876, 37.6696),
    Point(55.5896, 37.6721),
    Point(55.5911, 37.6746),
    Point(55.5886, 37.6696),
    Point(55.5861, 37.6646),
    Point(55.5881, 37.6671),
    Point(55.5901, 37.6696),
    Point(55.5916, 37.6721),
    Point(55.5891, 37.6671),
    Point(55.5866, 37.6621),
    Point(55.5886, 37.6646),
    Point(55.5906, 37.6671),
    Point(55.5921, 37.6696)
)

val Biruylevo_Zapadnoe = listOf(
    Point(55.5991, 37.6841),
    Point(55.6006, 37.6866),
    Point(55.5981, 37.6816),
    Point(55.6011, 37.6891),
    Point(55.6026, 37.6916),
    Point(55.6001, 37.6861),
    Point(55.5976, 37.6811),
    Point(55.5996, 37.6846),
    Point(55.6016, 37.6871),
)

val Bogorodskoe = listOf(
    Point(55.8135, 37.7132),
    Point(55.8150, 37.7157),
    Point(55.8125, 37.7107),
    Point(55.8145, 37.7132),
    Point(55.8160, 37.7157),
    Point(55.8135, 37.7107),
    Point(55.8110, 37.7057),
    Point(55.8130, 37.7082),
    Point(55.8150, 37.7107),
    Point(55.8165, 37.7132),
    Point(55.8140, 37.7082),
    Point(55.8115, 37.7032),
    Point(55.8135, 37.7057),
    Point(55.8155, 37.7082),
    Point(55.8170, 37.7107),
    Point(55.8145, 37.7057),
    Point(55.8120, 37.7007),
    Point(55.8140, 37.7032),
    Point(55.8160, 37.7057),
    Point(55.8175, 37.7082),
    Point(55.8150, 37.7032),
    Point(55.8125, 37.6982),
    Point(55.8145, 37.7007),
    Point(55.8165, 37.7032)
)

val Brateevo = listOf(
    Point(55.6372, 37.6583),
    Point(55.6387, 37.6608),
    Point(55.6362, 37.6558),
    Point(55.6382, 37.6583),
    Point(55.6397, 37.6608),
    Point(55.6372, 37.6558),
    Point(55.6347, 37.6508),
    Point(55.6367, 37.6533),
    Point(55.6387, 37.6558),
    Point(55.6402, 37.6583),
    Point(55.6377, 37.6533),
)

val Veshnyaki = listOf(
    Point(55.7251, 37.8192),
    Point(55.7266, 37.8217),
    Point(55.7241, 37.8167),
    Point(55.7261, 37.8192),
    Point(55.7276, 37.8217),
    Point(55.7251, 37.8167),
    Point(55.7226, 37.8117),
    Point(55.7246, 37.8142),
    Point(55.7266, 37.8167)
)

val Vnukovo = listOf(
    Point(55.6039, 37.2921),
    Point(55.6054, 37.2946),
    Point(55.6029, 37.2896),
)

val Vostochnoe_Degunino = listOf(
    Point(55.8792, 37.5581),
    Point(55.8807, 37.5606),
    Point(55.8782, 37.5556),
    Point(55.8802, 37.5581),
    Point(55.8817, 37.5606),
    Point(55.8792, 37.5556),
    Point(55.8767, 37.5506),
    Point(55.8787, 37.5531)
)

val Vostochnoe_Izmaylovo = listOf(
    Point(55.7931, 37.8132),
    Point(55.7946, 37.8157),
    Point(55.7921, 37.8107),
    Point(55.7941, 37.8132),
    Point(55.7956, 37.8157),
    Point(55.7931, 37.8107),
    Point(55.7906, 37.8057),
    Point(55.7926, 37.8082),
    Point(55.7946, 37.8107),
    Point(55.7961, 37.8132),
    Point(55.7936, 37.8082)
)

val Vihino_Zhulebino = listOf(
    Point(55.7021, 37.8562),
    Point(55.7036, 37.8587),
    Point(55.7011, 37.8537),
    Point(55.7031, 37.8562),
    Point(55.7046, 37.8587),
    Point(55.7021, 37.8537),
    Point(55.6996, 37.8487),
    Point(55.7016, 37.8512),
    Point(55.7036, 37.8537),
    Point(55.7051, 37.8562),
    Point(55.7026, 37.8512),
    Point(55.7001, 37.8462),
    Point(55.7021, 37.8487),
    Point(55.7041, 37.8512),
    Point(55.7056, 37.8537),
    Point(55.7031, 37.8487),
    Point(55.7006, 37.8437),
    Point(55.7026, 37.8462)
)

val Golyanovo = listOf(
    Point(55.8221, 37.8162),
    Point(55.8236, 37.8187),
    Point(55.8211, 37.8137),
    Point(55.8231, 37.8162),
    Point(55.8246, 37.8187),
    Point(55.8221, 37.8137),
    Point(55.8196, 37.8087),
    Point(55.8216, 37.8112),
    Point(55.8236, 37.8137),
    Point(55.8251, 37.8162),
    Point(55.8226, 37.8112),
    Point(55.8201, 37.8062),
    Point(55.8221, 37.8087),
    Point(55.8241, 37.8112),
    Point(55.8256, 37.8137),
    Point(55.8231, 37.8087),
    Point(55.8206, 37.8037),
    Point(55.8226, 37.8062),
    Point(55.8201, 37.8012),
    Point(55.8221, 37.8037),
    Point(55.8241, 37.8062),
    Point(55.8256, 37.8087)
)

val Dorogomilovo = listOf(
    Point(55.7421, 37.5612),
    Point(55.7436, 37.5637),
    Point(55.7411, 37.5587),
    Point(55.7431, 37.5612),
    Point(55.7446, 37.5637),
    Point(55.7421, 37.5587),
    Point(55.7396, 37.5537),
    Point(55.7416, 37.5562),
    Point(55.7436, 37.5587),
    Point(55.7451, 37.5612),
    Point(55.7426, 37.5562),
    Point(55.7401, 37.5512),
    Point(55.7421, 37.5537),
    Point(55.7441, 37.5562),
    Point(55.7456, 37.5587),
    Point(55.7431, 37.5537),
    Point(55.7406, 37.5487),
    Point(55.7426, 37.5512),
    Point(55.7401, 37.5462)
)

val Zamoskvorechie = listOf(
    Point(55.7321, 37.6312),
    Point(55.7336, 37.6337),
    Point(55.7311, 37.6287),
    Point(55.7331, 37.6312),
    Point(55.7346, 37.6337),
    Point(55.7321, 37.6287),
    Point(55.7296, 37.6237),
    Point(55.7316, 37.6262),
    Point(55.7336, 37.6287),
    Point(55.7351, 37.6312),
    Point(55.7326, 37.6262),
    Point(55.7301, 37.6212),
    Point(55.7321, 37.6237),
    Point(55.7341, 37.6262),
    Point(55.7356, 37.6287),
    Point(55.7331, 37.6237),
    Point(55.7306, 37.6187),
    Point(55.7326, 37.6212),
    Point(55.7301, 37.6162)
)

val Zapadnoe_Degunino = listOf(
    Point(55.8721, 37.5012),
    Point(55.8736, 37.5037),
    Point(55.8711, 37.4987),
    Point(55.8731, 37.5012),
    Point(55.8746, 37.5037),
    Point(55.8721, 37.4987),
    Point(55.8696, 37.4937),
    Point(55.8716, 37.4962),
    Point(55.8736, 37.4987),
    Point(55.8751, 37.5012),
    Point(55.8726, 37.4962),
    Point(55.8701, 37.4912),
    Point(55.8721, 37.4937),
    Point(55.8741, 37.4962),
    Point(55.8756, 37.4987),
    Point(55.8731, 37.4937),
    Point(55.8706, 37.4887)
)

val Zyuzino = listOf(
    Point(55.6561, 37.5762),
    Point(55.6576, 37.5787),
    Point(55.6551, 37.5737),
    Point(55.6571, 37.5762),
    Point(55.6586, 37.5787),
    Point(55.6561, 37.5737),
    Point(55.6536, 37.5687),
    Point(55.6556, 37.5712),
    Point(55.6576, 37.5737),
    Point(55.6591, 37.5762)
)

val Zyablikovo = listOf(
    Point(55.5991, 37.7432),
    Point(55.6006, 37.7457),
    Point(55.5981, 37.7407),
    Point(55.6001, 37.7432),
    Point(55.6016, 37.7457),
    Point(55.5991, 37.7407),
    Point(55.5966, 37.7357),
    Point(55.5986, 37.7382),
    Point(55.6006, 37.7407),
    Point(55.6021, 37.7432)
)

val Ivanovskoe = listOf(
    Point(55.7851, 37.8182),
    Point(55.7866, 37.8207),
    Point(55.7841, 37.8157),
    Point(55.7861, 37.8182),
    Point(55.7876, 37.8207),
    Point(55.7851, 37.8157),
    Point(55.7826, 37.8107),
    Point(55.7846, 37.8132),
    Point(55.7866, 37.8157),
    Point(55.7881, 37.8182),
    Point(55.7896, 37.8207)
)

val Izmailovo = listOf(
    Point(55.7921, 37.7752),
    Point(55.7936, 37.7777),
    Point(55.7911, 37.7727),
    Point(55.7931, 37.7752),
    Point(55.7946, 37.7777),
    Point(55.7921, 37.7727),
    Point(55.7896, 37.7677),
    Point(55.7916, 37.7702),
    Point(55.7936, 37.7727),
    Point(55.7951, 37.7752),
    Point(55.7966, 37.7777),
    Point(55.7941, 37.7727),
    Point(55.7961, 37.7752),
    Point(55.7976, 37.7777),
    Point(55.7951, 37.7727),
    Point(55.7926, 37.7677),
    Point(55.7946, 37.7702),
    Point(55.7966, 37.7727),
    Point(55.7981, 37.7752),
    Point(55.7996, 37.7777),
    Point(55.7971, 37.7727),
    Point(55.7991, 37.7752),
    Point(55.8006, 37.7777),
    Point(55.7981, 37.7727)
)

val Kapotnya = listOf(
    Point(55.6421, 37.8422)
)

val Konkovo = listOf(
    Point(55.6331, 37.5199),
    Point(55.6346, 37.5224),
    Point(55.6361, 37.5249),
    Point(55.6376, 37.5274),
    Point(55.6391, 37.5299),
    Point(55.6406, 37.5324),
    Point(55.6421, 37.5349),
    Point(55.6436, 37.5374),
    Point(55.6451, 37.5399),
    Point(55.6466, 37.5424),
    Point(55.6481, 37.5449),
    Point(55.6496, 37.5474),
    Point(55.6511, 37.5499),
    Point(55.6526, 37.5524),
    Point(55.6541, 37.5549),
    Point(55.6556, 37.5574)
)

val Koptevo = listOf(
    Point(55.8381, 37.5260),
    Point(55.8392, 37.5291),
    Point(55.8403, 37.5222),
    Point(55.8414, 37.5253),
    Point(55.8425, 37.5284),
    Point(55.8436, 37.5315),
    Point(55.8447, 37.5346),
    Point(55.8458, 37.5377),
    Point(55.8469, 37.5408),
    Point(55.8480, 37.5439),
    Point(55.8491, 37.5470),
    Point(55.8502, 37.5501),
    Point(55.8513, 37.5532),
    Point(55.8524, 37.5563),
    Point(55.8535, 37.5594),
    Point(55.8546, 37.5625)
)

val Kosino_Uhtomskyi = listOf(
    Point(55.7102, 37.8601),
    Point(55.7118, 37.8529),
    Point(55.7156, 37.8653),
    Point(55.7189, 37.8587)
)

val Kotlovka = listOf(
    Point(55.6861, 37.6182),
    Point(55.6872, 37.6213),
    Point(55.6883, 37.6244),
    Point(55.6894, 37.6275),
    Point(55.6905, 37.6306),
    Point(55.6916, 37.6337),
    Point(55.6927, 37.6368),
    Point(55.6938, 37.6399),
    Point(55.6949, 37.6430),
    Point(55.6960, 37.6461),
    Point(55.6971, 37.6492),
    Point(55.6982, 37.6523)
)

val Krilatskoe = listOf(
    Point(55.7561, 37.4082),
    Point(55.7572, 37.4113),
    Point(55.7583, 37.4144),
    Point(55.7594, 37.4175),
    Point(55.7605, 37.4206),
    Point(55.7616, 37.4237),
    Point(55.7627, 37.4268),
    Point(55.7638, 37.4299),
    Point(55.7649, 37.4330),
    Point(55.7660, 37.4361),
    Point(55.7671, 37.4392),
    Point(55.7682, 37.4423)
)

val Kryukovo = listOf(
    Point(55.8483, 37.1750),
    Point(55.8494, 37.1781),
    Point(55.8505, 37.1812)
)

val Kuzminki = listOf(
    Point(55.6901, 37.7742),
    Point(55.6912, 37.7773),
    Point(55.6923, 37.7804),
    Point(55.6934, 37.7835),
    Point(55.6945, 37.7866),
    Point(55.6956, 37.7897),
    Point(55.6967, 37.7928),
    Point(55.6978, 37.7959),
    Point(55.6989, 37.7990),
    Point(55.7000, 37.8021),
    Point(55.7011, 37.8052),
    Point(55.7022, 37.8083),
    Point(55.7033, 37.8114),
    Point(55.7044, 37.8145),
    Point(55.7055, 37.8176),
    Point(55.7066, 37.8207),
    Point(55.7077, 37.8238)
)

val Kuncevo = listOf(
    Point(55.7301, 37.4042),
    Point(55.7312, 37.4073),
    Point(55.7323, 37.4104),
    Point(55.7334, 37.4135),
    Point(55.7345, 37.4166),
    Point(55.7356, 37.4197),
    Point(55.7367, 37.4228),
    Point(55.7378, 37.4259),
    Point(55.7389, 37.4290),
    Point(55.7400, 37.4321),
    Point(55.7411, 37.4352),
    Point(55.7422, 37.4383),
    Point(55.7433, 37.4414),
    Point(55.7444, 37.4445),
    Point(55.7455, 37.4476),
    Point(55.7466, 37.4507)
)

val Kurkino = listOf(
    Point(55.8901, 37.3842),
    Point(55.8912, 37.3873),
    Point(55.8923, 37.3904),
    Point(55.8934, 37.3935),
    Point(55.8945, 37.3966),
    Point(55.8956, 37.3997)
)

val Levoberezhnyi = listOf(
    Point(55.8501, 37.4742),
    Point(55.8512, 37.4773),
    Point(55.8523, 37.4804),
    Point(55.8534, 37.4835),
    Point(55.8545, 37.4866),
    Point(55.8556, 37.4897),
    Point(55.8567, 37.4928),
    Point(55.8578, 37.4959),
    Point(55.8589, 37.4990),
    Point(55.8600, 37.5021),
    Point(55.8611, 37.5052),
    Point(55.8622, 37.5083),
    Point(55.8633, 37.5114),
    Point(55.8644, 37.5145),
    Point(55.8655, 37.5176),
    Point(55.8666, 37.5207),
    Point(55.8677, 37.5238)
)

val Lefortovo = listOf(
    Point(55.7601, 37.6842),
    Point(55.7612, 37.6873),
    Point(55.7623, 37.6904),
    Point(55.7634, 37.6935),
    Point(55.7645, 37.6966),
    Point(55.7656, 37.6997),
    Point(55.7667, 37.7028),
    Point(55.7678, 37.7059),
    Point(55.7689, 37.7090),
    Point(55.7700, 37.7121),
    Point(55.7711, 37.7152),
    Point(55.7722, 37.7183),
    Point(55.7733, 37.7214),
    Point(55.7744, 37.7245),
    Point(55.7755, 37.7276),
    Point(55.7766, 37.7307),
    Point(55.7777, 37.7338),
    Point(55.7788, 37.7369),
    Point(55.7799, 37.7400),
    Point(55.7810, 37.7431),
    Point(55.7821, 37.7462),
    Point(55.7832, 37.7493),
    Point(55.7843, 37.7524),
    Point(55.7854, 37.7555),
    Point(55.7865, 37.7586),
    Point(55.7876, 37.7617),
    Point(55.7887, 37.7648),
    Point(55.7898, 37.7679),
    Point(55.7909, 37.7710),
    Point(55.7920, 37.7741),
    Point(55.7931, 37.7772),
    Point(55.7942, 37.7803)
)

val Lianozovo = listOf(
    Point(55.9001, 37.5542),
    Point(55.9012, 37.5573),
    Point(55.9023, 37.5604),
    Point(55.9034, 37.5635),
    Point(55.9045, 37.5666),
    Point(55.9056, 37.5697),
    Point(55.9067, 37.5728),
    Point(55.9078, 37.5759)
)

val Lyublino = listOf(
    Point(55.6761, 37.7542),
    Point(55.6772, 37.7573),
    Point(55.6783, 37.7604),
    Point(55.6794, 37.7635),
    Point(55.6805, 37.7666),
    Point(55.6816, 37.7697),
    Point(55.6827, 37.7728),
    Point(55.6838, 37.7759),
    Point(55.6849, 37.7790),
    Point(55.6860, 37.7821),
    Point(55.6871, 37.7852),
    Point(55.6882, 37.7883),
    Point(55.6893, 37.7914),
    Point(55.6904, 37.7945),
    Point(55.6915, 37.7976),
    Point(55.6926, 37.8007),
    Point(55.6937, 37.8038),
    Point(55.6948, 37.8069),
    Point(55.6959, 37.8100),
    Point(55.6970, 37.8131)
)

val Marfino = listOf(
    Point(55.8221, 37.6412),
    Point(55.8232, 37.6443),
    Point(55.8243, 37.6474),
    Point(55.8254, 37.6505),
    Point(55.8265, 37.6536),
    Point(55.8276, 37.6567),
    Point(55.8287, 37.6598),
    Point(55.8298, 37.6629)
)

val Maryina_Rosha = listOf(
    Point(55.7961, 37.6162),
    Point(55.7972, 37.6193),
    Point(55.7983, 37.6224),
    Point(55.7994, 37.6255),
    Point(55.8005, 37.6286),
    Point(55.8016, 37.6317),
    Point(55.8027, 37.6348),
    Point(55.8038, 37.6379),
    Point(55.8049, 37.6410),
    Point(55.8060, 37.6441),
    Point(55.8071, 37.6472),
    Point(55.8082, 37.6503),
    Point(55.8093, 37.6534),
    Point(55.8104, 37.6565),
    Point(55.8115, 37.6596),
    Point(55.8126, 37.6627),
    Point(55.8137, 37.6658),
    Point(55.8148, 37.6689),
    Point(55.8159, 37.6720)
)

val Maryino = listOf(
    Point(55.6501, 37.7482),
    Point(55.6512, 37.7513),
    Point(55.6523, 37.7544),
    Point(55.6534, 37.7575),
    Point(55.6545, 37.7606),
    Point(55.6556, 37.7637),
    Point(55.6567, 37.7668),
    Point(55.6578, 37.7699),
    Point(55.6589, 37.7730),
    Point(55.6600, 37.7761),
    Point(55.6611, 37.7792),
    Point(55.6622, 37.7823),
    Point(55.6633, 37.7854)
)

val Metrogorodok = listOf(
    Point(55.8221, 37.6661),
    Point(55.8242, 37.6692)
)

val Mitino = listOf(
    Point(55.8451, 37.3612),
    Point(55.8452, 37.3623),
    Point(55.8453, 37.3634),
    Point(55.8454, 37.3645),
    Point(55.8455, 37.3656),
    Point(55.8456, 37.3667),
    Point(55.8457, 37.3678),
    Point(55.8458, 37.3689),
    Point(55.8459, 37.3700),
    Point(55.8460, 37.3711),
    Point(55.8461, 37.3722),
    Point(55.8462, 37.3733),
    Point(55.8463, 37.3744),
    Point(55.8464, 37.3755),
    Point(55.8465, 37.3766),
    Point(55.8466, 37.3777),
    Point(55.8467, 37.3788),
    Point(55.8468, 37.3799),
    Point(55.8469, 37.3810),
    Point(55.8470, 37.3821),
    Point(55.8471, 37.3832),
    Point(55.8472, 37.3843),
    Point(55.8473, 37.3854),
    Point(55.8474, 37.3865)
)

val Moskvorechye_Saburovo = listOf(
    Point(55.6471, 37.6512),
    Point(55.6472, 37.6523),
    Point(55.6473, 37.6534),
    Point(55.6474, 37.6545),
    Point(55.6475, 37.6556),
    Point(55.6476, 37.6567),
    Point(55.6477, 37.6578),
    Point(55.6478, 37.6589),
    Point(55.6479, 37.6600),
    Point(55.6480, 37.6611)
)

val Nagatino_Sadovnikz = listOf(
    Point(55.6721, 37.6722),
    Point(55.6723, 37.6724),
    Point(55.6725, 37.6726),
    Point(55.6727, 37.6728),
    Point(55.6729, 37.6730),
    Point(55.6731, 37.6732),
    Point(55.6733, 37.6734),
    Point(55.6735, 37.6736),
    Point(55.6737, 37.6738),
    Point(55.6739, 37.6740),
    Point(55.6741, 37.6742),
    Point(55.6743, 37.6744),
    Point(55.6745, 37.6746),
    Point(55.6747, 37.6748),
    Point(55.6749, 37.6750),
    Point(55.6751, 37.6752),
    Point(55.6753, 37.6754),
    Point(55.6755, 37.6756),
    Point(55.6757, 37.6758),
    Point(55.6759, 37.6760),
    Point(55.6761, 37.6762),
    Point(55.6763, 37.6764),
    Point(55.6765, 37.6766),
    Point(55.6767, 37.6768),
    Point(55.6769, 37.6770),
    Point(55.6771, 37.6772),
    Point(55.6773, 37.6774)
)

val Nagatinskyi_Zaton = listOf(
    Point(55.6821, 37.6822),
    Point(55.6823, 37.6824),
    Point(55.6825, 37.6826),
    Point(55.6827, 37.6828),
    Point(55.6829, 37.6830),
    Point(55.6831, 37.6832),
    Point(55.6833, 37.6834),
    Point(55.6835, 37.6836),
    Point(55.6837, 37.6838),
    Point(55.6839, 37.6840),
    Point(55.6841, 37.6842),
    Point(55.6843, 37.6844),
    Point(55.6845, 37.6846),
    Point(55.6847, 37.6848),
    Point(55.6849, 37.6850)
)

val Nekrasovka = listOf(
    Point(55.7021, 37.9322),
    Point(55.7023, 37.9324),
    Point(55.7025, 37.9326),
    Point(55.7027, 37.9328),
    Point(55.7029, 37.9330),
    Point(55.7031, 37.9332),
    Point(55.7033, 37.9334)
)

val Novo_Peredelkino = listOf(
    Point(55.6410, 37.3541),
    Point(55.6420, 37.3551),
    Point(55.6430, 37.3561),
    Point(55.6440, 37.3571),
    Point(55.6450, 37.3581)
)

val Novogireevo = listOf(
    Point(55.7510, 37.8141),
    Point(55.7512, 37.8143),
    Point(55.7514, 37.8145),
    Point(55.7516, 37.8147),
    Point(55.7518, 37.8149),
    Point(55.7520, 37.8151),
    Point(55.7522, 37.8153),
    Point(55.7524, 37.8155),
    Point(55.7526, 37.8157),
    Point(55.7528, 37.8159),
    Point(55.7530, 37.8161),
    Point(55.7532, 37.8163),
    Point(55.7534, 37.8165),
    Point(55.7536, 37.8167),
    Point(55.7538, 37.8169)
)

val Novokosino = listOf(
    Point(55.7450, 37.8641)
)

val Orehovo_Borisovo_Severnoe = listOf(
    Point(55.6120, 37.6941),
    Point(55.6122, 37.6943),
    Point(55.6124, 37.6945),
    Point(55.6126, 37.6947),
    Point(55.6128, 37.6949),
    Point(55.6130, 37.6951),
    Point(55.6132, 37.6953),
    Point(55.6134, 37.6955),
    Point(55.6136, 37.6957),
    Point(55.6138, 37.6959),
    Point(55.6140, 37.6961),
    Point(55.6142, 37.6963),
    Point(55.6144, 37.6965),
    Point(55.6146, 37.6967),
    Point(55.6148, 37.6969)
)

val Orehovo_Borisovo_Yuzhnoe = listOf(
    Point(55.5801, 37.5961),
    Point(55.5803, 37.5963),
    Point(55.5805, 37.5965),
    Point(55.5807, 37.5967),
    Point(55.5809, 37.5969),
    Point(55.5811, 37.5971),
    Point(55.5813, 37.5973),
    Point(55.5815, 37.5975),
    Point(55.5817, 37.5977),
    Point(55.5819, 37.5979)
)

val Otradnoe = listOf(
    Point(55.8631, 37.6041),
    Point(55.8633, 37.6043),
    Point(55.8635, 37.6045),
    Point(55.8637, 37.6047),
    Point(55.8639, 37.6049),
    Point(55.8641, 37.6051),
    Point(55.8643, 37.6053),
    Point(55.8645, 37.6055),
    Point(55.8647, 37.6057),
    Point(55.8649, 37.6059),
    Point(55.8651, 37.6061),
    Point(55.8653, 37.6063)
)

val Ochakovo_Matveevskoe = listOf(
    Point(55.7101, 37.4161),
    Point(55.7103, 37.4163),
    Point(55.7105, 37.4165),
    Point(55.7107, 37.4167),
    Point(55.7109, 37.4169),
    Point(55.7111, 37.4171),
    Point(55.7113, 37.4173),
    Point(55.7115, 37.4175),
    Point(55.7117, 37.4177),
    Point(55.7119, 37.4179),
    Point(55.7121, 37.4181),
    Point(55.7123, 37.4183),
    Point(55.7125, 37.4185),
    Point(55.7127, 37.4187),
    Point(55.7129, 37.4189),
    Point(55.7131, 37.4191),
    Point(55.7133, 37.4193),
    Point(55.7135, 37.4195),
    Point(55.7137, 37.4197),
    Point(55.7139, 37.4199)
)

val Perovo = listOf(
    Point(55.7511, 37.7861),
    Point(55.7513, 37.7863),
    Point(55.7515, 37.7865),
    Point(55.7517, 37.7867),
    Point(55.7519, 37.7869),
    Point(55.7521, 37.7871),
    Point(55.7523, 37.7873),
    Point(55.7525, 37.7875),
    Point(55.7527, 37.7877),
    Point(55.7529, 37.7879),
    Point(55.7531, 37.7881),
    Point(55.7533, 37.7883),
    Point(55.7535, 37.7885),
    Point(55.7537, 37.7887),
    Point(55.7539, 37.7889),
    Point(55.7541, 37.7891),
    Point(55.7543, 37.7893),
    Point(55.7545, 37.7895),
    Point(55.7547, 37.7897),
    Point(55.7549, 37.7899),
    Point(55.7551, 37.7901),
    Point(55.7553, 37.7903),
    Point(55.7555, 37.7905)
)

val Pechatniki = listOf(
    Point(55.6921, 37.7261),
    Point(55.6923, 37.7263),
    Point(55.6925, 37.7265),
    Point(55.6927, 37.7267),
    Point(55.6929, 37.7269),
    Point(55.6931, 37.7271)
)

val Pokrovskoe_Streshnevo = listOf(
    Point(55.8171, 37.4461),
    Point(55.8173, 37.4463),
    Point(55.8175, 37.4465),
    Point(55.8177, 37.4467),
    Point(55.8179, 37.4469),
    Point(55.8181, 37.4471),
    Point(55.8183, 37.4473),
    Point(55.8185, 37.4475),
    Point(55.8187, 37.4477),
    Point(55.8189, 37.4479),
    Point(55.8191, 37.4481),
    Point(55.8193, 37.4483),
    Point(55.8195, 37.4485),
    Point(55.8197, 37.4487),
    Point(55.8199, 37.4489)
)

val Preobrazhenskoe = listOf(
    Point(55.7961, 37.7061),
    Point(55.7963, 37.7063),
    Point(55.7965, 37.7065),
    Point(55.7967, 37.7067),
    Point(55.7969, 37.7069),
    Point(55.7971, 37.7071),
    Point(55.7973, 37.7073),
    Point(55.7975, 37.7075),
    Point(55.7977, 37.7077),
    Point(55.7979, 37.7079),
    Point(55.7981, 37.7081),
    Point(55.7983, 37.7083),
    Point(55.7985, 37.7085),
    Point(55.7987, 37.7087),
    Point(55.7989, 37.7089),
    Point(55.7991, 37.7091),
    Point(55.7993, 37.7093),
    Point(55.7995, 37.7095),
    Point(55.7997, 37.7097)
)

val Prospekt_Vernandskogo = listOf(
    Point(55.6761, 37.5051),
    Point(55.6763, 37.5053),
    Point(55.6765, 37.5055),
    Point(55.6767, 37.5057),
    Point(55.6769, 37.5059)
)

val Ramenki = listOf(
    Point(55.6901, 37.5001),
    Point(55.6902, 37.5002),
    Point(55.6903, 37.5003),
    Point(55.6904, 37.5004),
    Point(55.6905, 37.5005),
    Point(55.6906, 37.5006),
    Point(55.6907, 37.5007),
    Point(55.6908, 37.5008),
    Point(55.6909, 37.5009),
    Point(55.6910, 37.5010),
    Point(55.6911, 37.5011),
    Point(55.6912, 37.5012),
    Point(55.6913, 37.5013),
    Point(55.6914, 37.5014),
    Point(55.6915, 37.5015),
    Point(55.6916, 37.5016),
    Point(55.6917, 37.5017),
    Point(55.6918, 37.5018),
    Point(55.6919, 37.5019),
    Point(55.6920, 37.5020),
    Point(55.6921, 37.5021),
    Point(55.6922, 37.5022),
    Point(55.6923, 37.5023),
    Point(55.6924, 37.5024),
    Point(55.6925, 37.5025),
    Point(55.6926, 37.5026),
    Point(55.6927, 37.5027),
    Point(55.6928, 37.5028),
    Point(55.6929, 37.5029),
    Point(55.6930, 37.5030),
    Point(55.6931, 37.5031),
    Point(55.6932, 37.5032),
    Point(55.6933, 37.5033),
    Point(55.6934, 37.5034)
)

val Rostokino = listOf(
    Point(55.8221, 37.6661),
    Point(55.8222, 37.6662),
    Point(55.8223, 37.6663),
    Point(55.8224, 37.6664),
    Point(55.8225, 37.6665),
    Point(55.8226, 37.6666),
    Point(55.8227, 37.6667),
    Point(55.8228, 37.6668),
    Point(55.8229, 37.6669),
    Point(55.8230, 37.6670)
)

val Savelki = listOf(
    Point(55.8471, 37.4871),
    Point(55.8472, 37.4872)
)

val Sviblovo = listOf(
    Point(55.8591, 37.6831),
    Point(55.8592, 37.6832),
    Point(55.8593, 37.6833),
    Point(55.8594, 37.6834),
    Point(55.8595, 37.6835),
    Point(55.8596, 37.6836),
    Point(55.8597, 37.6837),
    Point(55.8598, 37.6838),
    Point(55.8599, 37.6839),
    Point(55.8600, 37.6840),
    Point(55.8601, 37.6841),
    Point(55.8602, 37.6842),
    Point(55.8603, 37.6843)
)

val Severnoe_Butovo = listOf(
    Point(55.5371, 37.5411),
    Point(55.5372, 37.5412),
    Point(55.5373, 37.5413),
    Point(55.5374, 37.5414),
    Point(55.5375, 37.5415),
    Point(55.5376, 37.5416),
    Point(55.5377, 37.5417),
    Point(55.5378, 37.5418)
)

val Severnoe_Izmailovo = listOf(
    Point(55.8071, 37.7741),
    Point(55.8072, 37.7742),
    Point(55.8073, 37.7743),
    Point(55.8074, 37.7744),
    Point(55.8075, 37.7745),
    Point(55.8076, 37.7746),
    Point(55.8077, 37.7747),
    Point(55.8078, 37.7748),
    Point(55.8079, 37.7749)
)

val Severnoe_Medvedkovo = listOf(
    Point(55.8781, 37.6321),
    Point(55.8782, 37.6322),
    Point(55.8783, 37.6323),
    Point(55.8784, 37.6324),
    Point(55.8785, 37.6325),
    Point(55.8786, 37.6326),
    Point(55.8787, 37.6327),
    Point(55.8788, 37.6328),
    Point(55.8789, 37.6329),
    Point(55.8790, 37.6330),
    Point(55.8791, 37.6331),
    Point(55.8792, 37.6332),
    Point(55.8793, 37.6333),
    Point(55.8794, 37.6334),
    Point(55.8795, 37.6335),
    Point(55.8796, 37.6336)
)

val Severnoe_Tushino = listOf(
    Point(55.8461, 37.4371),
    Point(55.8462, 37.4372),
    Point(55.8463, 37.4373),
    Point(55.8464, 37.4374),
    Point(55.8465, 37.4375),
    Point(55.8466, 37.4376),
    Point(55.8467, 37.4377),
    Point(55.8468, 37.4378),
    Point(55.8469, 37.4379),
    Point(55.8470, 37.4380),
    Point(55.8471, 37.4381),
    Point(55.8472, 37.4382),
    Point(55.8473, 37.4383),
    Point(55.8474, 37.4384),
    Point(55.8475, 37.4385),
    Point(55.8476, 37.4386),
    Point(55.8477, 37.4387),
    Point(55.8478, 37.4388),
    Point(55.8479, 37.4389),
    Point(55.8480, 37.4390),
    Point(55.8481, 37.4391),
    Point(55.8482, 37.4392),
    Point(55.8483, 37.4393),
    Point(55.8484, 37.4394)
)

val Severnyi = listOf(
    Point(55.8501, 37.4101),
    Point(55.8502, 37.4102),
    Point(55.8503, 37.4103),
    Point(55.8504, 37.4104),
    Point(55.8505, 37.4105)
)

val Sokol = listOf(
    Point(55.8051, 37.5051),
    Point(55.8052, 37.5052),
    Point(55.8053, 37.5053),
    Point(55.8054, 37.5054),
    Point(55.8055, 37.5055),
    Point(55.8056, 37.5056),
    Point(55.8057, 37.5057),
    Point(55.8058, 37.5058),
    Point(55.8059, 37.5059),
    Point(55.8060, 37.5060),
    Point(55.8061, 37.5061),
    Point(55.8062, 37.5062),
    Point(55.8063, 37.5063),
    Point(55.8064, 37.5064),
    Point(55.8065, 37.5065),
    Point(55.8066, 37.5066),
    Point(55.8067, 37.5067),
    Point(55.8068, 37.5068),
    Point(55.8069, 37.5069),
    Point(55.8070, 37.5070),
    Point(55.8071, 37.5071),
    Point(55.8072, 37.5072),
    Point(55.8073, 37.5073),
    Point(55.8074, 37.5074)
)

val Sokolinaya_Gora = listOf(
    Point(55.7801, 37.7301),
    Point(55.7802, 37.7302),
    Point(55.7803, 37.7303),
    Point(55.7804, 37.7304),
    Point(55.7805, 37.7305),
    Point(55.7806, 37.7306),
    Point(55.7807, 37.7307),
    Point(55.7808, 37.7308),
    Point(55.7809, 37.7309),
    Point(55.7810, 37.7310),
    Point(55.7811, 37.7311),
    Point(55.7812, 37.7312),
    Point(55.7813, 37.7313)
)

val Sokolniki = listOf(
    Point(55.7901, 37.6801),
    Point(55.7902, 37.6802),
    Point(55.7903, 37.6803),
    Point(55.7904, 37.6804),
    Point(55.7905, 37.6805),
    Point(55.7906, 37.6806),
    Point(55.7907, 37.6807),
    Point(55.7908, 37.6808),
    Point(55.7909, 37.6809),
    Point(55.7910, 37.6810),
    Point(55.7911, 37.6811),
    Point(55.7912, 37.6812),
    Point(55.7913, 37.6813),
    Point(55.7914, 37.6814),
    Point(55.7915, 37.6815),
    Point(55.7916, 37.6816),
    Point(55.7917, 37.6817),
    Point(55.7918, 37.6818)
)

val Solncevo = listOf(
    Point(55.6501, 37.3901),
    Point(55.6502, 37.3902),
    Point(55.6503, 37.3903),
    Point(55.6504, 37.3904),
    Point(55.6505, 37.3905),
    Point(55.6506, 37.3906),
    Point(55.6507, 37.3907),
    Point(55.6508, 37.3908),
    Point(55.6509, 37.3909),
    Point(55.6510, 37.3910),
    Point(55.6511, 37.3911),
    Point(55.6512, 37.3912),
    Point(55.6513, 37.3913),
    Point(55.6514, 37.3914),
    Point(55.6515, 37.3915),
    Point(55.6516, 37.3916),
    Point(55.6517, 37.3917)
)

val Staroe_Kryukovo = listOf(
    Point(55.9901, 37.1901),
    Point(55.9902, 37.1902)
)

val Strogino = listOf(
    Point(55.8001, 37.4001),
    Point(55.8002, 37.4002),
    Point(55.8003, 37.4003),
    Point(55.8004, 37.4004),
    Point(55.8005, 37.4005),
    Point(55.8006, 37.4006),
    Point(55.8007, 37.4007),
    Point(55.8008, 37.4008),
    Point(55.8009, 37.4009),
    Point(55.8010, 37.4010),
    Point(55.8011, 37.4011),
    Point(55.8012, 37.4012),
    Point(55.8013, 37.4013),
    Point(55.8014, 37.4014),
    Point(55.8015, 37.4015),
    Point(55.8016, 37.4016),
    Point(55.8017, 37.4017),
    Point(55.8018, 37.4018)
)

val Tekstilshiki = listOf(
    Point(55.7081, 37.7331),
    Point(55.7082, 37.7332),
    Point(55.7083, 37.7333),
    Point(55.7084, 37.7334),
    Point(55.7085, 37.7335),
    Point(55.7086, 37.7336),
    Point(55.7087, 37.7337),
    Point(55.7088, 37.7338),
    Point(55.7089, 37.7339)
)

val Tropareva_Nikulino = listOf(
    Point(55.6551, 37.4701),
    Point(55.6552, 37.4702),
    Point(55.6553, 37.4703),
    Point(55.6554, 37.4704),
    Point(55.6555, 37.4705),
    Point(55.6556, 37.4706),
    Point(55.6557, 37.4707),
    Point(55.6558, 37.4708),
    Point(55.6559, 37.4709),
    Point(55.6560, 37.4710),
    Point(55.6561, 37.4711),
    Point(55.6562, 37.4712)
)

val Teplyi_Stan = listOf(
    Point(55.6181, 37.5071),
    Point(55.6182, 37.5072),
    Point(55.6183, 37.5073),
    Point(55.6184, 37.5074),
    Point(55.6185, 37.5075),
    Point(55.6186, 37.5076),
    Point(55.6187, 37.5077),
    Point(55.6188, 37.5078),
    Point(55.6189, 37.5079),
    Point(55.6190, 37.5080),
    Point(55.6191, 37.5081),
    Point(55.6192, 37.5082),
    Point(55.6193, 37.5083),
    Point(55.6194, 37.5084),
    Point(55.6195, 37.5085),
    Point(55.6196, 37.5086),
    Point(55.6197, 37.5087),
    Point(55.6198, 37.5088),
    Point(55.6199, 37.5089),
    Point(55.6200, 37.5090),
    Point(55.6201, 37.5091),
    Point(55.6202, 37.5092)
)

val Fili_Davidkovo = listOf(
    Point(55.7421, 37.4831),
    Point(55.7422, 37.4832),
    Point(55.7423, 37.4833),
    Point(55.7424, 37.4834),
    Point(55.7425, 37.4835),
    Point(55.7426, 37.4836),
    Point(55.7427, 37.4837),
    Point(55.7428, 37.4838),
    Point(55.7429, 37.4839),
    Point(55.7430, 37.4840),
    Point(55.7431, 37.4841),
    Point(55.7432, 37.4842),
    Point(55.7433, 37.4843),
    Point(55.7434, 37.4844),
    Point(55.7435, 37.4845),
    Point(55.7436, 37.4846),
    Point(55.7437, 37.4847),
    Point(55.7438, 37.4848),
    Point(55.7439, 37.4849),
    Point(55.7440, 37.4850)
)

val Filevskiy_Park = listOf(
    Point(55.7391, 37.4831),
    Point(55.7392, 37.4832),
    Point(55.7393, 37.4833),
    Point(55.7394, 37.4834),
    Point(55.7395, 37.4835),
    Point(55.7396, 37.4836),
    Point(55.7397, 37.4837),
    Point(55.7398, 37.4838),
    Point(55.7399, 37.4839),
    Point(55.7400, 37.4840),
    Point(55.7401, 37.4841),
    Point(55.7402, 37.4842),
    Point(55.7403, 37.4843),
    Point(55.7404, 37.4844),
    Point(55.7405, 37.4845),
    Point(55.7406, 37.4846),
    Point(55.7407, 37.4847),
    Point(55.7408, 37.4848)
)

val Hamovniki = listOf(
    Point(55.7301, 37.5851),
    Point(55.7302, 37.5852),
    Point(55.7303, 37.5853),
    Point(55.7304, 37.5854),
    Point(55.7305, 37.5855),
    Point(55.7306, 37.5856),
    Point(55.7307, 37.5857),
    Point(55.7308, 37.5858),
    Point(55.7309, 37.5859),
    Point(55.7310, 37.5860),
    Point(55.7311, 37.5861),
    Point(55.7312, 37.5862),
    Point(55.7313, 37.5863),
    Point(55.7314, 37.5864),
    Point(55.7315, 37.5865),
    Point(55.7316, 37.5866),
    Point(55.7317, 37.5867),
    Point(55.7318, 37.5868),
    Point(55.7319, 37.5869),
    Point(55.7320, 37.5870),
    Point(55.7321, 37.5871),
    Point(55.7322, 37.5872),
    Point(55.7323, 37.5873),
    Point(55.7324, 37.5874),
    Point(55.7325, 37.5875),
    Point(55.7326, 37.5876),
    Point(55.7327, 37.5877),
    Point(55.7328, 37.5878),
    Point(55.7329, 37.5879),
    Point(55.7330, 37.5880),
    Point(55.7331, 37.5881),
    Point(55.7332, 37.5882),
    Point(55.7333, 37.5883),
    Point(55.7334, 37.5884),
    Point(55.7335, 37.5885),
    Point(55.7336, 37.5886),
    Point(55.7337, 37.5887),
    Point(55.7338, 37.5888),
    Point(55.7339, 37.5889)
)

val Hovrino = listOf(
    Point(55.8721, 37.4781),
    Point(55.8722, 37.4782),
    Point(55.8723, 37.4783),
    Point(55.8724, 37.4784),
    Point(55.8725, 37.4785),
    Point(55.8726, 37.4786),
    Point(55.8727, 37.4787),
    Point(55.8728, 37.4788),
    Point(55.8729, 37.4789),
    Point(55.8730, 37.4790),
    Point(55.8731, 37.4791),
    Point(55.8732, 37.4792),
    Point(55.8733, 37.4793)
)

val Horoshovo_Mnevniki = listOf(
    Point(55.7771, 37.5071),
    Point(55.7772, 37.5072),
    Point(55.7773, 37.5073),
    Point(55.7774, 37.5074),
    Point(55.7775, 37.5075),
    Point(55.7776, 37.5076),
    Point(55.7777, 37.5077),
    Point(55.7778, 37.5078),
    Point(55.7779, 37.5079),
    Point(55.7780, 37.5080),
    Point(55.7781, 37.5081),
    Point(55.7782, 37.5082),
    Point(55.7783, 37.5083),
    Point(55.7784, 37.5084),
    Point(55.7785, 37.5085),
    Point(55.7786, 37.5086),
    Point(55.7787, 37.5087),
    Point(55.7788, 37.5088),
    Point(55.7789, 37.5089),
    Point(55.7790, 37.5090),
    Point(55.7791, 37.5091),
    Point(55.7792, 37.5092),
    Point(55.7793, 37.5093),
    Point(55.7794, 37.5094),
    Point(55.7795, 37.5095),
    Point(55.7796, 37.5096),
    Point(55.7797, 37.5097),
    Point(55.7798, 37.5098)
)

val Caricino = listOf(
    Point(55.6211, 37.6691),
    Point(55.6212, 37.6692),
    Point(55.6213, 37.6693),
    Point(55.6214, 37.6694),
    Point(55.6215, 37.6695),
    Point(55.6216, 37.6696),
    Point(55.6217, 37.6697),
    Point(55.6218, 37.6698),
    Point(55.6219, 37.6699),
    Point(55.6220, 37.6700),
    Point(55.6221, 37.6701),
    Point(55.6222, 37.6702),
    Point(55.6223, 37.6703),
    Point(55.6224, 37.6704)
)

val Chertanovo_Severnoe = listOf(
    Point(55.6201, 37.6001),
    Point(55.6202, 37.6002),
    Point(55.6203, 37.6003),
    Point(55.6204, 37.6004),
    Point(55.6205, 37.6005),
    Point(55.6206, 37.6006),
    Point(55.6207, 37.6007),
    Point(55.6208, 37.6008),
    Point(55.6209, 37.6009),
    Point(55.6210, 37.6010),
    Point(55.6211, 37.6011)
)

val Chertanovo_Centralnoe = listOf(
    Point(55.6120, 37.6051),
    Point(55.6121, 37.6052),
    Point(55.6122, 37.6053),
    Point(55.6123, 37.6054),
    Point(55.6124, 37.6055),
    Point(55.6125, 37.6056),
    Point(55.6126, 37.6057),
    Point(55.6127, 37.6058),
    Point(55.6128, 37.6059),
    Point(55.6129, 37.6060)
)

val Chertanovo_Yuzhnoe = listOf(
    Point(55.6030, 37.6101),
    Point(55.6031, 37.6102),
    Point(55.6032, 37.6103),
    Point(55.6033, 37.6104),
    Point(55.6034, 37.6105),
    Point(55.6035, 37.6106),
    Point(55.6036, 37.6107),
    Point(55.6037, 37.6108),
    Point(55.6038, 37.6109),
    Point(55.6039, 37.6110),
    Point(55.6040, 37.6111),
    Point(55.6041, 37.6112),
    Point(55.6042, 37.6113),
    Point(55.6043, 37.6114)
)

val Cheremushki = listOf(
    Point(55.6850, 37.5601),
    Point(55.6851, 37.5602),
    Point(55.6852, 37.5603),
    Point(55.6853, 37.5604),
    Point(55.6854, 37.5605),
    Point(55.6855, 37.5606),
    Point(55.6856, 37.5607),
    Point(55.6857, 37.5608),
    Point(55.6858, 37.5609),
    Point(55.6859, 37.5610),
    Point(55.6860, 37.5611),
    Point(55.6861, 37.5612)
)

val Shukino = listOf(
    Point(55.7980, 37.4741),
    Point(55.7981, 37.4742),
    Point(55.7982, 37.4743),
    Point(55.7983, 37.4744),
    Point(55.7984, 37.4745),
    Point(55.7985, 37.4746),
    Point(55.7986, 37.4747),
    Point(55.7987, 37.4748),
    Point(55.7988, 37.4749),
    Point(55.7989, 37.4750),
    Point(55.7990, 37.4751),
    Point(55.7991, 37.4752),
    Point(55.7992, 37.4753),
    Point(55.7993, 37.4754),
    Point(55.7994, 37.4755),
    Point(55.7995, 37.4756),
    Point(55.7996, 37.4757),
    Point(55.7997, 37.4758),
    Point(55.7998, 37.4759),
    Point(55.7999, 37.4760),
    Point(55.8000, 37.4761),
    Point(55.8001, 37.4762),
    Point(55.8002, 37.4763),
    Point(55.8003, 37.4764)
)

val Yuzhnoe_Butovo = listOf(
    Point(55.5370, 37.5251),
    Point(55.5371, 37.5252),
    Point(55.5372, 37.5253),
    Point(55.5373, 37.5254),
    Point(55.5374, 37.5255),
    Point(55.5375, 37.5256),
    Point(55.5376, 37.5257),
    Point(55.5377, 37.5258),
    Point(55.5378, 37.5259),
    Point(55.5379, 37.5260),
    Point(55.5380, 37.5261),
    Point(55.5381, 37.5262),
    Point(55.5382, 37.5263),
    Point(55.5383, 37.5264),
    Point(55.5384, 37.5265),
    Point(55.5385, 37.5266),
    Point(55.5386, 37.5267),
    Point(55.5387, 37.5268),
    Point(55.5388, 37.5269),
    Point(55.5389, 37.5270),
    Point(55.5390, 37.5271),
    Point(55.5391, 37.5272),
    Point(55.5392, 37.5273),
    Point(55.5393, 37.5274),
    Point(55.5394, 37.5275),
    Point(55.5395, 37.5276),
    Point(55.5396, 37.5277),
    Point(55.5397, 37.5278),
    Point(55.5398, 37.5279),
    Point(55.5399, 37.5280),
    Point(55.5400, 37.5281),
    Point(55.5401, 37.5282),
    Point(55.5402, 37.5283)
)

val Yuzhnoe_Medvedkovo = listOf(
    Point(55.8700, 37.6601),
    Point(55.8701, 37.6602),
    Point(55.8702, 37.6603),
    Point(55.8703, 37.6604),
    Point(55.8704, 37.6605),
    Point(55.8705, 37.6606),
    Point(55.8706, 37.6607),
    Point(55.8707, 37.6608),
    Point(55.8708, 37.6609),
    Point(55.8709, 37.6610),
    Point(55.8710, 37.6611),
    Point(55.8711, 37.6612),
    Point(55.8712, 37.6613),
    Point(55.8713, 37.6614),
    Point(55.8714, 37.6615),
    Point(55.8715, 37.6616),
    Point(55.8716, 37.6617)
)

val Yuzhnoe_Tushino = listOf(
    Point(55.8460, 37.4371),
    Point(55.8461, 37.4372),
    Point(55.8462, 37.4373),
    Point(55.8463, 37.4374),
    Point(55.8464, 37.4375),
    Point(55.8465, 37.4376),
    Point(55.8466, 37.4377),
    Point(55.8467, 37.4378),
    Point(55.8468, 37.4379),
    Point(55.8469, 37.4380),
    Point(55.8470, 37.4381),
    Point(55.8471, 37.4382),
    Point(55.8472, 37.4383),
    Point(55.8473, 37.4384),
    Point(55.8474, 37.4385),
    Point(55.8475, 37.4386),
    Point(55.8476, 37.4387),
    Point(55.8477, 37.4388),
    Point(55.8478, 37.4389),
    Point(55.8479, 37.4390),
    Point(55.8480, 37.4391)
)

val Yakimanka = listOf(
    Point(55.7370, 37.6091),
    Point(55.7371, 37.6092),
    Point(55.7372, 37.6093),
    Point(55.7373, 37.6094),
    Point(55.7374, 37.6095),
    Point(55.7375, 37.6096),
    Point(55.7376, 37.6097),
    Point(55.7377, 37.6098)
)

val Yasenevo = listOf(
    Point(55.6060, 37.5331),
    Point(55.6061, 37.5332),
    Point(55.6062, 37.5333),
    Point(55.6063, 37.5334),
    Point(55.6064, 37.5335),
    Point(55.6065, 37.5336),
    Point(55.6066, 37.5337),
    Point(55.6067, 37.5338),
    Point(55.6068, 37.5339),
    Point(55.6069, 37.5340),
    Point(55.6070, 37.5341),
    Point(55.6071, 37.5342),
    Point(55.6072, 37.5343),
    Point(55.6073, 37.5344),
    Point(55.6074, 37.5345),
    Point(55.6075, 37.5346),
    Point(55.6076, 37.5347)
)

val Akademicheskiy_r = listOf(
    Point(55.693434, 37.571803),
    Point(55.694561, 37.572737),
    Point(55.687178, 37.573645),
    Point(55.692079, 37.573708),
    Point(55.689563, 37.56194),
)

val Alekseevskiy_r = listOf(
    Point(55.812732, 37.649858),
    Point(55.820794, 37.648708),
    Point(55.820566, 37.66238),
    Point(55.822114, 37.655921),
    Point(55.808462, 37.651349),
    Point(55.811761, 37.643219),
    Point(55.828137, 37.650226),
    Point(55.806742, 37.637551),
    Point(55.81909, 37.653703),
)

val Altufevskiy_r = listOf(
    Point(55.880101, 37.579587),
    Point(55.880071, 37.579439),
    Point(55.877566, 37.570806),
)

val Babushkinskiy_r = listOf(
    Point(55.881187, 37.676107),
    Point(55.867288, 37.655257),
    Point(55.85913, 37.662551),
)

val Basmanniy_r = listOf(
    Point(55.777742, 37.706793),
    Point(55.774781, 37.704987),
    Point(55.776598, 37.704439),
    Point(55.779099, 37.708167),
    Point(55.774851, 37.673843),
    Point(55.76956, 37.667501),
    Point(55.778051, 37.704529),
    Point(55.763234, 37.64295),
    Point(55.765797, 37.657008),
    Point(55.780294, 37.705535),
    Point(55.779337, 37.696669),
    Point(55.762541, 37.67272),
    Point(55.755267, 37.657808),
    Point(55.754183, 37.637242),
    Point(55.755895, 37.633383),
    Point(55.760692, 37.68217),
    Point(55.768061, 37.678406),
    Point(55.770097, 37.679862),
    Point(55.775479, 37.698825),
    Point(55.775094, 37.692016),
    Point(55.764577, 37.659317),
    Point(55.767656, 37.65699),
    Point(55.76563, 37.679808),
    Point(55.779104, 37.708176),
    Point(55.768714, 37.683572),
    Point(55.773105, 37.694576),
    Point(55.770259, 37.689168),
    Point(55.773869, 37.69604),
    Point(55.772932, 37.698825),
    Point(55.773302, 37.688512),
    Point(55.766121, 37.678846),
    Point(55.772041, 37.686788),
)

val Beskudnikovskiy_r = listOf(
    Point(55.855057, 37.564176),
    Point(55.866116, 37.559487),
    Point(55.873935, 37.545536),
    Point(55.877137, 37.543794),
    Point(55.873784, 37.539697),
    Point(55.868587, 37.544818),
)

val Butirskiy_r = listOf(
    Point(55.81385, 37.599292),
    Point(55.81827, 37.58146),
    Point(55.82081, 37.58976),
    Point(55.821371, 37.587946),
    Point(55.808058, 37.583068),
    Point(55.813607, 37.596821),
    Point(55.828592, 37.574786),
    Point(55.812322, 37.59533),
    Point(55.830442, 37.578568),
    Point(55.811568, 37.593749),
)

val Voikovskiy_r = listOf(
    Point(55.821628, 37.514904),
    Point(55.826286, 37.493937),
    Point(55.836939, 37.487963),
    Point(55.815873, 37.487784),
    Point(55.822953, 37.508822),
    Point(55.819115, 37.489266),
    Point(55.835503, 37.495725),
    Point(55.822079, 37.502426),
    Point(55.816697, 37.502049),
    Point(55.835791, 37.49524),
    Point(55.837181, 37.497324),
    Point(55.837779, 37.484311),
    Point(55.835508, 37.495734),
)

val Gagarinskiy_r = listOf(
    Point(55.695174, 37.545995),
    Point(55.686061, 37.541243),
    Point(55.68462, 37.541512),
    Point(55.705939, 37.56653),
    Point(55.704108, 37.565021),
    Point(55.685782, 37.543201),
)

val Golovinskiy_r = listOf(
    Point(55.86107, 37.523321),
    Point(55.863808, 37.510556),
    Point(55.859266, 37.518668),
    Point(55.844223, 37.481442),
    Point(55.841084, 37.493713),
    Point(55.853051, 37.499597),
    Point(55.843621, 37.485628),
    Point(55.843449, 37.492033),
    Point(55.840912, 37.495231),
    Point(55.841266, 37.494431),
)

val Danilovskiy_r = listOf(
    Point(55.70877, 37.634479),
    Point(55.704763, 37.65841),
    Point(55.71124, 37.612173),
    Point(55.709277, 37.612605),
    Point(55.720195, 37.626241),
    Point(55.70807, 37.663925),
    Point(55.701262, 37.651583),
    Point(55.717163, 37.658778),
    Point(55.708374, 37.64418),
    Point(55.689461, 37.656631),
    Point(55.719145, 37.659524),
    Point(55.724824, 37.659775),
    Point(55.713207, 37.646714),
    Point(55.689466, 37.656631),
    Point(55.715013, 37.608167),
    Point(55.724109, 37.644558),
    Point(55.718562, 37.647908),
    Point(55.716321, 37.659182),
    Point(55.722649, 37.646022),
)

val Dmitrovskiy_r = listOf(
    Point(55.892844, 37.526124),
    Point(55.885958, 37.525576),
    Point(55.873632, 37.529322),
    Point(55.888351, 37.522279),
    Point(55.886807, 37.540739),
)

val Donskoy_r = listOf(
    Point(55.717599, 37.602975),
    Point(55.692252, 37.618309),
    Point(55.703155, 37.594261),
    Point(55.699943, 37.619683),
    Point(55.70891, 37.58921),
    Point(55.696489, 37.612748),
    Point(55.691273, 37.620186),
    Point(55.691785, 37.619261),
    Point(55.701638, 37.617321),
    Point(55.700669, 37.594477),
    Point(55.718882, 37.603801),
    Point(55.693175, 37.62077),
)

val Krasnoselskiy_r = listOf(
    Point(55.77835, 37.647396),
    Point(55.780654, 37.669998),
    Point(55.78115, 37.667087),
    Point(55.76964, 37.65013),
    Point(55.769423, 37.649292),
    Point(55.770259, 37.632772),
    Point(55.769752, 37.647091),
    Point(55.774046, 37.665677),
    Point(55.782562, 37.676682),
    Point(55.78398, 37.659084),
    Point(55.773915, 37.645519),
    Point(55.773535, 37.650145),
    Point(55.771317, 37.655347),
    Point(55.771864, 37.642267),
    Point(55.77354, 37.650154),
    Point(55.774006, 37.651619),
    Point(55.771484, 37.660215),
    Point(55.780856, 37.671813),
    Point(55.776467, 37.669845),
)

val Lomonosovskiy_r = listOf(
    Point(55.680148, 37.545986),
    Point(55.677935, 37.531631),
    Point(55.683244, 37.539482),
    Point(55.675245, 37.52792),
    Point(55.673976, 37.525872),
)

val Losinoostrovskiy_r = listOf(
    Point(55.86794, 37.687623),
    Point(55.885812, 37.699346),
    Point(55.874152, 37.698825),
)

val Meshanskiy_r = listOf(
    Point(55.780891, 37.620519),
    Point(55.769479, 37.622738),
    Point(55.766972, 37.624885),
    Point(55.773935, 37.626789),
    Point(55.792194, 37.622962),
    Point(55.77038, 37.625801),
    Point(55.772877, 37.624157),
    Point(55.784789, 37.626241),
    Point(55.779423, 37.627966),
    Point(55.774629, 37.627696),
    Point(55.79143, 37.635808),
)

val Mozhaiskiy_r = listOf(
    Point(55.719455, 37.42469),
    Point(55.721447, 37.3879),
    Point(55.71966, 37.42443),
    Point(55.71872, 37.42977),
    Point(55.72125, 37.38606),
    Point(55.718283, 37.404878),
    Point(55.721021, 37.437972),
    Point(55.72595, 37.415541),
    Point(55.722979, 37.419377),
    Point(55.718719, 37.430579),
    Point(55.72347, 37.433184),
    Point(55.722436, 37.397225),
    Point(55.719622, 37.418506),
    Point(55.71372, 37.408103),
    Point(55.713603, 37.40663),
    Point(55.721569, 37.385618),
    Point(55.721006, 37.38613),
    Point(55.714186, 37.433382),
    Point(55.717944, 37.387101),
)

val Molzhaninovskiy_r = listOf(
    Point(55.947428, 37.344898),
    Point(55.945221, 37.357402),
)

val Nagorniy_r = listOf(
    Point(55.647204, 37.618641),
    Point(55.672219, 37.611527),
)

val Nizhegorodskiy_r = listOf(
    Point(55.732813, 37.723861),
    Point(55.729483, 37.719316),
    Point(55.734871, 37.703649),
    Point(55.73329, 37.719154),
    Point(55.732159, 37.760404),
    Point(55.731384, 37.711258),
    Point(55.727425, 37.737686),
    Point(55.73296, 37.717115),
    Point(55.733523, 37.717357),
    Point(55.731637, 37.714545),
    Point(55.726918, 37.737758),
    Point(55.731495, 37.754664),
    Point(55.727425, 37.737695),
    Point(55.734851, 37.74357),
)

val Obruchevskiy_r = listOf(
    Point(55.665639, 37.547567),
    Point(55.661013, 37.522351),
    Point(55.661765, 37.523725),
    Point(55.668356, 37.523294),
    Point(55.662273, 37.532816),
    Point(55.667884, 37.540641),
    Point(55.666487, 37.54383),
    Point(55.668635, 37.518758),
    Point(55.647087, 37.503073),
    Point(55.672905, 37.524318),
    Point(55.649251, 37.484406),
    Point(55.661222, 37.529789),
    Point(55.664096, 37.536526),
    Point(55.660165, 37.52686),
    Point(55.661222, 37.529789),
    Point(55.661222, 37.529789),
    Point(55.661222, 37.529789),
    Point(55.664096, 37.536526),
    Point(55.661222, 37.529789),
    Point(55.661222, 37.529789),
    Point(55.650988, 37.514212),
)

val Ostankinskiy_r = listOf(
    Point(55.808376, 37.620402),
    Point(55.824607, 37.629924),
    Point(55.825285, 37.626987),
    Point(55.802335, 37.631676),
    Point(55.82397, 37.629601),
    Point(55.808098, 37.632152),
    Point(55.807243, 37.633751),
    Point(55.849691, 37.620905),
    Point(55.81018, 37.62934),
    Point(55.825128, 37.628649),
    Point(55.810177, 37.629367),
    Point(55.850909, 37.617527),
    Point(55.815706, 37.629259),
    Point(55.850914, 37.617536),
    Point(55.820602, 37.621543),
    Point(55.814492, 37.633688),
)

val Presnenskiy_r = listOf(
    Point(55.759785, 37.593731),
    Point(55.760732, 37.554286),
    Point(55.74903, 37.538575),
    Point(55.755287, 37.520231),
    Point(55.747459, 37.540928),
    Point(55.759755, 37.565829),
    Point(55.758255, 37.560448),
    Point(55.76881, 37.587928),
    Point(55.759659, 37.536104),
    Point(55.761674, 37.538089),
    Point(55.756074, 37.593708),
    Point(55.752254, 37.536334),
    Point(55.753691, 37.545438),
    Point(55.761284, 37.545959),
    Point(55.762763, 37.595276),
    Point(55.752257, 37.536302),
    Point(55.764749, 37.58022),
    Point(55.774087, 37.58067),
    Point(55.769226, 37.574031),
    Point(55.757359, 37.552966),
    Point(55.752035, 37.539527),
    Point(55.774583, 37.583841),
    Point(55.765463, 37.559847),
    Point(55.754243, 37.546911),
    Point(55.774907, 37.582906),
    Point(55.757192, 37.523303),
    Point(55.752414, 37.539733),
    Point(55.751796, 37.524139),
    Point(55.773662, 37.583463),
    Point(55.758564, 37.551223),
    Point(55.756336, 37.552373),
    Point(55.77314, 37.578711),
    Point(55.751903, 37.537443),
    Point(55.754031, 37.546525),
    Point(55.758777, 37.51679),
    Point(55.75133, 37.526887),
    Point(55.764384, 37.548564),
    Point(55.772948, 37.577175),
    Point(55.774472, 37.581613),
    Point(55.754618, 37.524067),
    Point(55.754076, 37.534011),
    Point(55.771666, 37.569935),
    Point(55.756356, 37.552427),
    Point(55.754066, 37.524731),
    Point(55.756584, 37.552103),
)

val Ryazanskiy_r = listOf(
    Point(55.729123, 37.772649),
    Point(55.725184, 37.772891),
    Point(55.732175, 37.764339),
    Point(55.730269, 37.77184),
    Point(55.72056, 37.779296),
    Point(55.724317, 37.778236),
    Point(55.717401, 37.782126),
    Point(55.724738, 37.77193),
    Point(55.725179, 37.777679),
    Point(55.714384, 37.789734),
    Point(55.723886, 37.771005),
    Point(55.724586, 37.777517),
    Point(55.723643, 37.780051),
    Point(55.713501, 37.783464),
    Point(55.714485, 37.79605),
    Point(55.724773, 37.774499),
    Point(55.730765, 37.771032),
    Point(55.727237, 37.759066),
)

val Savelovskiy_r = listOf(
    Point(55.794431, 37.583886),
    Point(55.792377, 37.581065),
    Point(55.792073, 37.575953),
    Point(55.802963, 37.570294),
    Point(55.807542, 37.579529),
    Point(55.800484, 37.583122),
    Point(55.807531, 37.579349),
    Point(55.797549, 37.58323),
    Point(55.806338, 37.573016),
)

val Taganskiy_r = listOf(
    Point(55.742032, 37.664285),
    Point(55.742945, 37.649112),
    Point(55.746507, 37.651753),
    Point(55.737365, 37.678694),
    Point(55.750925, 37.643462),
    Point(55.744906, 37.685278),
    Point(55.745594, 37.677993),
    Point(55.738155, 37.693525),
    Point(55.743755, 37.65638),
    Point(55.754284, 37.659353),
    Point(55.741191, 37.650298),
    Point(55.750479, 37.647738),
    Point(55.72851, 37.669261),
    Point(55.74182, 37.673331),
    Point(55.734035, 37.696516),
    Point(55.738982, 37.649094),
)

val Tverskoy_r = listOf(
    Point(55.773631, 37.60558),
    Point(55.765037, 37.60779),
    Point(55.791172, 37.594854),
    Point(55.77237, 37.606334),
    Point(55.786971, 37.588233),
    Point(55.782284, 37.589428),
    Point(55.771064, 37.596381),
    Point(55.760434, 37.614419),
    Point(55.78932, 37.588853),
    Point(55.788965, 37.591117),
)

val Timiryazevskiy_r = listOf(
    Point(55.841564, 37.567375),
    Point(55.818397, 37.573537),
    Point(55.809823, 37.575711),
    Point(55.841968, 37.56662),
    Point(55.810046, 37.576618),
    Point(55.810744, 37.578496),
    Point(55.828051, 37.571965),
    Point(55.847649, 37.572827),
    Point(55.835113, 37.571534),
    Point(55.833587, 37.571686),
)

val Horoshovskiy_r = listOf(
    Point(55.781985, 37.512416),
    Point(55.777915, 37.52042),
    Point(55.776264, 37.509981),
    Point(55.778892, 37.510817),
    Point(55.792281, 37.540757),
    Point(55.776411, 37.512029),
    Point(55.77515, 37.528648),
    Point(55.785412, 37.510529),
    Point(55.792108, 37.540748),
    Point(55.777899, 37.52792),
    Point(55.780633, 37.527265),
    Point(55.789122, 37.52165),
    Point(55.79388, 37.541018),
    Point(55.787148, 37.542383),
    Point(55.794173, 37.542222),
    Point(55.782329, 37.509757),
)

val Yuzhnoportoviy_r = listOf(
    Point(55.713233, 37.67484),
    Point(55.71378, 37.677122),
    Point(55.721539, 37.672118),
    Point(55.700212, 37.684425),
    Point(55.699705, 37.683374),
    Point(55.705082, 37.683464),
    Point(55.727648, 37.664824),
    Point(55.708308, 37.68067),
    Point(55.702987, 37.676843),
)

val Yaroslavskiy_r = listOf(
    Point(55.865445, 37.694244),
    Point(55.861575, 37.69666),
    Point(55.860145, 37.69401),
    Point(55.851055, 37.681056),
    Point(55.851677, 37.679538),
    Point(55.8558, 37.684668),
    Point(55.852238, 37.682143),
    Point(55.862085, 37.690507),
    Point(55.86209, 37.690516),
    Point(55.88099, 37.716683),
    Point(55.85533, 37.700855),
)

val Vnukovo_p = listOf(
    Point(55.61723, 37.265253),
    Point(55.63528, 37.33055),
    Point(55.634639, 37.328899),
    Point(55.636864, 37.323446),
    Point(55.634237, 37.332169),
    Point(55.633409, 37.321533),
    Point(55.6432, 37.264858),
    Point(55.642083, 37.32739),
    Point(55.644481, 37.328018),
)

val Desenovskoe_p = listOf(
    Point(55.514687, 37.356854),
    Point(55.515558, 37.356953),
    Point(55.514692, 37.356989),
    Point(55.521629, 37.396353),
    Point(55.512164, 37.35309),
)

val Kievskiy_p = listOf(
    Point(55.430998, 36.865036),
)

val Kokoshkino_p = listOf(
    Point(55.596508, 37.16121),
)

val Krasnopahorskoe_p = listOf(
    Point(55.451417, 37.248608),
    Point(55.423597, 37.277958),
    Point(55.437899, 37.283669),
)

val Marushkinskoe_p = listOf(
    Point(55.59486, 37.19859),
    Point(55.590572, 37.218684),
    Point(55.593588, 37.234477),
    Point(55.605866, 37.240981),
    Point(55.584528, 37.126472),
)

val Mihaylovo_Yarcevskoe_p = listOf(
    Point(55.40798, 37.202964),
    Point(55.407233, 37.172807),
)

val Moskovskiy_p = listOf(
    Point(55.619085, 37.427754),
    Point(55.646397, 37.437347),
    Point(55.599474, 37.360591),
    Point(55.599168, 37.364364),
    Point(55.633185, 37.41538),
    Point(55.604753, 37.358426),
    Point(55.633795, 37.416961),
    Point(55.604712, 37.35124),
    Point(55.598065, 37.352201),
)

val Mosrentgen_p = listOf(
    Point(55.622116, 37.475189),
    Point(55.613036, 37.470428),
    Point(55.61991, 37.474776),
)

val Novofedorovskoe_p = listOf(
    Point(55.396501, 36.906634),
    Point(55.464146, 36.943504),
)

val Pervomayskoe_p = listOf(
    Point(55.529833, 37.151733),
    Point(55.513774, 37.128988),
    Point(55.531458, 37.154248),
    Point(55.53746, 37.200727),
)

val Ryazanskoe_p = listOf(
    Point(55.501881, 37.522054),
    Point(55.4755, 37.536086),
    Point(55.472873, 37.536544),
)

val Sosenskoe_p = listOf(
    Point(55.565412, 37.473474),
    Point(55.567494, 37.478711),
    Point(55.565397, 37.470338),
    Point(55.595168, 37.469604),
    Point(55.575877, 37.472854),
    Point(55.566567, 37.485637),
    Point(55.579429, 37.482421),
    Point(55.566949, 37.470833),
    Point(55.56772, 37.48202),
    Point(55.561645, 37.473438),
    Point(55.555031, 37.46732),
    Point(55.573378, 37.468775),
    Point(55.573312, 37.451941),
    Point(55.594107, 37.458166),
    Point(55.543725, 37.483454),
    Point(55.542457, 37.48428),
    Point(55.593802, 37.462334),
    Point(55.540541, 37.484577),
    Point(55.591559, 37.44647),
    Point(55.551227, 37.508491),
    Point(55.551324, 37.446084),
    Point(55.550229, 37.498213),
    Point(55.53988, 37.451887),
    Point(55.554257, 37.465892),
    Point(55.582212, 37.477247),
    Point(55.54921, 37.485906),
    Point(55.548894, 37.487919),
    Point(55.546496, 37.481648),
)

val Troick_p = listOf(
    Point(55.451926, 37.301069),
)

val Shapovskoe_p = listOf(
    Point(55.385832, 37.386624),
)

val Sherbinka_p = listOf(
    Point(55.506439, 37.572082),
    Point(55.500667, 37.570186),
    Point(55.514779, 37.525181),
    Point(55.506954, 37.563269),
    Point(55.491263, 37.555032),
    Point(55.511669, 37.568488),
    Point(55.507978, 37.572675),
)

val Arbat_r = listOf(
    Point(55.751467, 37.593237),
    Point(55.753058, 37.58579),
    Point(55.754618, 37.582682),
    Point(55.748665, 37.57687),
    Point(55.751614, 37.605418),
)

val Aeroport_r = listOf(
    Point(55.803413, 37.53738),
    Point(55.805093, 37.539652),
    Point(55.790504, 37.570923),
    Point(55.805457, 37.531262),
    Point(55.811442, 37.517347),
    Point(55.803231, 37.545743),
    Point(55.791946, 37.56538),
    Point(55.810891, 37.516018),
)

val Begovoy_r = listOf(
    Point(55.777899, 37.552669),
    Point(55.77671, 37.578029),
    Point(55.783615, 37.564302),
    Point(55.780633, 37.558275),
    Point(55.784977, 37.56194),
    Point(55.786455, 37.560475),
    Point(55.78732, 37.559829),
    Point(55.780947, 37.572675),
    Point(55.789897, 37.575855),
    Point(55.77874, 37.582125),
    Point(55.778902, 37.582071),
    Point(55.782314, 37.584856),
)

val Bibirevo_r = listOf(
    Point(55.894838, 37.588871),
    Point(55.895838, 37.603972),
    Point(55.900954, 37.613632),
    Point(55.894702, 37.603379),
    Point(55.896458, 37.635557),
    Point(55.89243, 37.624265),
    Point(55.896665, 37.605472),
    Point(55.901556, 37.611033),
    Point(55.897004, 37.625702),
)

val Biruylevo_Vostochnoe_r = listOf(
    Point(55.607229, 37.655661),
    Point(55.600481, 37.658059),
    Point(55.588663, 37.665362),
    Point(55.59427, 37.657808),
    Point(55.586146, 37.662668),
    Point(55.578136, 37.682359),
    Point(55.598848, 37.660611),
    Point(55.574024, 37.668282),
    Point(55.585189, 37.677409),
    Point(55.583851, 37.696921),
    Point(55.5919, 37.662425),
    Point(55.601279, 37.655526),
    Point(55.580106, 37.68579),
    Point(55.598792, 37.659461),
)

val Biruylevo_Zapadnoe_r = listOf(
    Point(55.593502, 37.649103),
    Point(55.593868, 37.651062),
    Point(55.575251, 37.645546),
    Point(55.575251, 37.649831),
)

val Bogorodskoe_r = listOf(
    Point(55.817299, 37.692959),
    Point(55.817552, 37.710916),
    Point(55.807542, 37.706658),
    Point(55.813066, 37.697576),
    Point(55.809869, 37.705419),
    Point(55.806464, 37.718022),
    Point(55.811508, 37.698915),
    Point(55.812575, 37.704808),
    Point(55.822711, 37.719055),
    Point(55.823833, 37.716055),
    Point(55.818189, 37.71813),
    Point(55.811816, 37.706488),
)

val Brateevo_r = listOf(
    Point(55.636702, 37.750712),
)

val Veshnyaki_r = listOf(
    Point(55.715048, 37.827688),
    Point(55.723095, 37.828075),
    Point(55.718583, 37.815381),
    Point(55.715393, 37.826152),
    Point(55.719272, 37.81274),
    Point(55.715373, 37.826161),
    Point(55.722522, 37.80285),
    Point(55.720956, 37.811016),
    Point(55.718304, 37.817735),
    Point(55.717797, 37.819523),
    Point(55.732529, 37.833438),
    Point(55.722527, 37.80285),
    Point(55.716635, 37.82255),
    Point(55.718218, 37.83183),
    Point(55.715373, 37.82617),
)

val Vnukovo_r = listOf(
    Point(55.613128, 37.291322),
)

val Vostochnoe_Degunino_r = listOf(
    Point(55.883989, 37.564796),
    Point(55.884161, 37.563449),
    Point(55.883989, 37.564796),
    Point(55.867506, 37.570644),
    Point(55.887796, 37.558823),
)

val Vostochnoe_Izmaylovo_r = listOf(
    Point(55.790879, 37.818957),
    Point(55.793379, 37.820142),
    Point(55.793753, 37.816379),
)

val Vihino_Zhulebino_r = listOf(
    Point(55.701141, 37.840238),
    Point(55.695342, 37.813953),
    Point(55.703748, 37.82053),
    Point(55.681372, 37.848781),
    Point(55.703961, 37.84481),
    Point(55.702378, 37.848314),
    Point(55.682539, 37.84578),
    Point(55.709424, 37.817735),
    Point(55.707116, 37.816926),
    Point(55.684138, 37.840732),
    Point(55.696504, 37.825523),
    Point(55.69038, 37.850308),
    Point(55.696732, 37.816846),
    Point(55.7039, 37.843023),
    Point(55.694662, 37.816962),
    Point(55.694698, 37.817034),
)

val Golyanovo_r = listOf(
    Point(55.81652, 37.831767),
    Point(55.816819, 37.808725),
    Point(55.812069, 37.816468),
    Point(55.818882, 37.827706),
    Point(55.811756, 37.80099),
    Point(55.822857, 37.832378),
    Point(55.819656, 37.832872),
    Point(55.815807, 37.795547),
    Point(55.805604, 37.759021),
    Point(55.807977, 37.758823),
    Point(55.811245, 37.775766),
    Point(55.807739, 37.757853),
    Point(55.805022, 37.754107),
)

val Dorogomilovo_r = listOf(
    Point(55.739093, 37.545105),
    Point(55.740456, 37.567348),
    Point(55.744799, 37.555193),
    Point(55.741014, 37.552265),
    Point(55.73963, 37.549157),
    Point(55.740517, 37.514769),
    Point(55.747855, 37.555598),
    Point(5.750727, 37.562272),
    Point(55.741465, 37.540784),
    Point(55.743598, 37.561338),
    Point(55.735809, 37.525028),
    Point(55.750732, 37.562272),
    Point(55.738049, 37.543731),
    Point(55.733776, 37.518785),
    Point(55.74148, 37.535835),
    Point(55.735946, 37.527453),
    Point(55.741769, 37.520357),

    )

val Zamoskvorechie_r = listOf(
    Point(55.724168, 37.617205),
    Point(55.730862, 37.641629),
    Point(55.730786, 37.631424),
    Point(55.735282, 37.639383),
    Point(55.739428, 37.638314),
    Point(55.730644, 37.642393),
    Point(55.730897, 37.641539),
    Point(55.722142, 37.618569),
    Point(55.731622, 37.640973),
    Point(55.727506, 37.634721),
    Point(55.729265, 37.628262),
    Point(55.742402, 37.638674),

    )

val Zapadnoe_Degunino_r = listOf(
    Point(55.871925, 37.517204),
    Point(55.86321, 37.54109),
    Point(55.879329, 37.507906),
    Point(55.863363, 37.541296),
    Point(55.88511, 37.492733),
    Point(55.874329, 37.523501),
    Point(55.864374, 37.537074),
    Point(55.862525, 37.537452),
    Point(55.880722, 37.495734),
    Point(55.880243, 37.496165),
    Point(55.860299, 37.540875),
    Point(55.862378, 37.542689),
    Point(55.860666, 37.545294),
    Point(55.868152, 37.536984),
    Point(55.878571, 37.506819),
    Point(55.879324, 37.507834),

    )

val Zyuzino_r = listOf(
    Point(55.656098, 37.604592),
    Point(55.651201, 37.591153),
    Point(55.651206, 37.587802),
    Point(55.653797, 37.599103),
    Point(55.655646, 37.603693),
    Point(55.656423, 37.573285),
    Point(55.664187, 37.591692),
)

val Zyablikovo_r = listOf(
    Point(55.629181, 37.740363),
    Point(55.626401, 37.74551),
    Point(55.614836, 37.749643),
)

val Ivanovskoe_r = listOf(
    Point(55.773125, 37.8237),
    Point(55.76606, 37.814419),
    Point(55.779034, 37.836447),
    Point(55.773636, 37.82599),
    Point(55.782349, 37.835944),
)

val Izmailovo_r = listOf(
    Point(55.788864, 37.788082),
    Point(55.800651, 37.775469),
    Point(55.79685, 37.768112),
    Point(55.792372, 37.782844),
    Point(55.801035, 37.766998),
    Point(55.79769, 37.768085),
)

val Kapotnya_r = listOf(
    Point(55.641051, 37.796858),
    Point(55.641915, 37.789411),
    Point(55.631915, 37.801305),
)

val Konkovo_r = listOf(
    Point(55.651201, 37.528711),
    Point(55.636356, 37.519899),
    Point(55.655564, 37.521704),
    Point(55.653726, 37.529834),
)

val Koptevo_r = listOf(
    Point(55.843758, 37.539383),
    Point(55.820688, 37.525872),
    Point(55.821558, 37.526798),
    Point(55.845425, 37.557502),
)

val Kosino_Uhtomskyi_r = listOf(
    Point(55.712868, 37.880105),
    Point(55.710022, 37.883007),
    Point(55.711929, 37.863765),
    Point(55.717011, 37.859084),
    Point(55.707187, 37.869819),
    Point(55.709911, 37.854377),
    Point(55.709612, 37.895745),
    Point(55.709363, 37.893535),
)

val Kotlovka_r = listOf(
    Point(55.672174, 37.595016),
    Point(55.68148, 37.59326),
    Point(55.681945, 37.595141),
    Point(55.678499, 37.595644),
    Point(55.678138, 37.594953),
    Point(55.677453, 37.59471),
)

val Krilatskoe_r = listOf(
    Point(55.770659, 37.375234),
)

val Kryukovo_r = listOf(
    Point(55.970806, 37.170427),
    Point(55.976216, 37.176365),
)

val Kuzminki_r = listOf(
    Point(55.703677, 37.766684),
    Point(55.706269, 37.754961),
    Point(55.709145, 37.769756),
    Point(55.703576, 37.786159),
    Point(55.703951, 37.783231),
    Point(55.703398, 37.763099),
    Point(55.699406, 37.784884),
    Point(55.712431, 37.758563),
    Point(55.702272, 37.762507),
)

val Kuncevo_r = listOf(
    Point(55.728413, 37.41449),
    Point(55.73071, 37.40471),
    Point(55.729341, 37.434675),
    Point(55.728089, 37.421488),
    Point(55.728079, 37.433058),
    Point(55.786237, 37.354267),
    Point(55.742387, 37.415739),
    Point(55.744328, 37.417724),
    Point(55.735393, 37.402552),
    Point(55.743512, 37.422099),
    Point(55.730426, 37.404833),
    Point(55.729199, 37.407133),
    Point(55.728819, 37.409451),
    Point(55.7494, 37.408283),
    Point(55.728418, 37.41449),
    Point(55.747905, 37.406298),
    Point(55.743193, 37.427848),
    Point(55.743466, 37.418434),
)

val Kurkino_r = listOf(
    Point(55.883833, 37.395302),
    Point(55.895247, 37.399722),
)

val Levoberezhnyi_r = listOf(
    Point(55.856189, 37.476303),
    Point(55.856351, 37.471354),
    Point(55.857897, 37.476016),
)

val Lefortovo_r = listOf(
    Point(55.755616, 37.68067),
    Point(55.751057, 37.68041),
    Point(55.751123, 37.717507),
    Point(55.75094, 37.719378),
    Point(55.75246, 37.710225),
    Point(55.750792, 37.698345),
    Point(55.752612, 37.710629),
    Point(55.751979, 37.697846),
    Point(55.75086, 37.698958),
    Point(55.762961, 37.698079),
    Point(55.747723, 37.688315),
    Point(55.752632, 37.705023),
    Point(55.750069, 37.677176),
    Point(55.750808, 37.698609),
    Point(55.751898, 37.702086),
    Point(55.748078, 37.690462),
    Point(55.748027, 37.68712),
)

val Lianozovo_r = listOf(
    Point(55.906971, 37.576151),
    Point(55.891083, 37.568524),
    Point(55.897079, 37.566755),
)

val Lyublino_r = listOf(
    Point(55.687259, 37.751071),
    Point(55.677336, 37.765399),
    Point(55.673849, 37.759237),
    Point(55.670392, 37.763504),
    Point(55.681275, 37.763602),
    Point(55.669549, 37.764636),
    Point(55.672448, 37.761599),
    Point(55.681224, 37.762893),
    Point(55.6621, 37.730679),
    Point(55.675676, 37.74021),
    Point(55.672331, 37.794388),
    Point(55.662222, 37.732665),
    Point(55.669925, 37.752589),
    Point(55.679544, 37.762264),
    Point(55.668148, 37.779062),
    Point(55.680661, 37.761141),
)

val Marfino_r = listOf(
    Point(55.825153, 37.595887),
    Point(55.846118, 37.578828),
    Point(55.822245, 37.597693),
    Point(55.846593, 37.57943),
    Point(55.832904, 37.591566),
    Point(55.82221, 37.60169),
)

val Maryina_Rosha_r = listOf(
    Point(55.792984, 37.601358),
    Point(55.794846, 37.608014),
    Point(55.796304, 37.607853),
    Point(55.798207, 37.620097),
    Point(55.797792, 37.619396),
    Point(55.792609, 37.590659),
    Point(55.80403, 37.597109),
    Point(55.801612, 37.611006),
    Point(55.799229, 37.614276),
)

val Maryino_r = listOf(
    Point(55.659119, 37.755086),
    Point(55.648006, 37.724023),
    Point(55.648738, 37.763818),
    Point(55.643343, 37.722702),
)

val Metrogorodok_r = listOf(
    Point(55.823105, 37.763764),
    Point(55.82, 37.751332),
    Point(55.824961, 37.764896),
    Point(55.826893, 37.769621),
    Point(55.826898, 37.76963),
    Point(55.818103, 37.752868),
    Point(55.816611, 37.753191),
)

val Mitino_r = listOf(
    Point(55.844763, 37.345419),
    Point(55.842524, 37.387765),
    Point(55.847705, 37.370581),
    Point(55.840866, 37.383894),
    Point(55.841508, 37.351518),
    Point(55.831347, 37.34876),
)

val Moskvorechye_Saburovo_r = listOf(
    Point(55.651562, 37.648708),
    Point(55.639425, 37.695205),
    Point(55.639517, 37.69109),
    Point(55.647828, 37.649373),
    Point(55.640878, 37.692429),
    Point(55.642819, 37.677382),
    Point(55.646447, 37.651511),
    Point(55.64253, 37.670151),
    Point(55.639425, 37.659119),
    Point(55.639908, 37.691055),
    Point(55.652227, 37.628954),
    Point(55.640548, 37.681604),
)

val Nagatino_Sadovniki_r = listOf(
    Point(55.662187, 37.630499),
    Point(55.681529, 37.652625),
    Point(55.677641, 37.661239),
    Point(55.67659, 37.657332),
    Point(55.668275, 37.625774),
    Point(55.669513, 37.628873),
    Point(55.677874, 37.653218),
    Point(55.677879, 37.653226),
    Point(55.682493, 37.634173),
    Point(55.681529, 37.652634),
    Point(55.677539, 37.634398),
    Point(55.679915, 37.641845),
    Point(55.677585, 37.630706),
    Point(55.681534, 37.652616),
    Point(55.668579, 37.659676),
    Point(55.67659, 37.634092),
    Point(55.678961, 37.626645),

    )

val Nagatinskyi_Zaton_r = listOf(
    Point(55.687705, 37.680014),
    Point(55.687687, 37.680017),
    Point(55.683848, 37.666351),
    Point(55.690187, 37.690237),
    Point(55.678702, 37.668076),
    Point(55.683483, 37.704511),
    Point(55.684396, 37.695519),
)

val Nekrasovka_r = listOf(
    Point(55.708658, 37.927329),
    Point(55.706974, 37.91778),
    Point(55.702323, 37.928174),
)

val Novo_Peredelkino_r = listOf(
    Point(55.644999, 37.36723),
    Point(55.639756, 37.341592),
    Point(55.652502, 37.347233),
    Point(55.642108, 37.356217),
    Point(55.640386, 37.371847),
    Point(55.643795, 37.371299),
    Point(55.647204, 37.371587),
    Point(55.634496, 37.343362),
)

val Novogireevo_r = listOf(
    Point(55.743654, 37.790372),
    Point(55.755581, 37.819217),
    Point(55.74033, 37.78216),
    Point(55.75555, 37.819217),
    Point(55.74033, 37.782162),
    Point(55.739407, 37.777419),
)

val Novokosino_r = listOf(
    Point(55.731323, 37.858689),
)

val Orehovo_Borisovo_Severnoe_r = listOf(
    Point(55.620784, 37.717941),
    Point(55.62091, 37.71775),
    Point(55.621673, 37.713827),
)

val Orehovo_Borisovo_Yuzhnoe_r = listOf(
    Point(55.599606, 37.721876),
    Point(55.598924, 37.722352),
    Point(55.603786, 37.726852),
    Point(55.609675, 37.723601),
    Point(55.606497, 37.751592),
    Point(55.603242, 37.727329),
    Point(55.595944, 37.722765),
    Point(55.604071, 37.732665),
    Point(55.597464, 37.716288),
    Point(55.600318, 37.742905),
    Point(55.598858, 37.725271),
    Point(55.610158, 37.747927),
    Point(55.603634, 37.744962),
    Point(55.609278, 37.759632),
    Point(55.600323, 37.742914),
)

val Otradnoe_r = listOf(
    Point(55.874496, 37.591431),
    Point(55.871587, 37.587182),
    Point(55.852455, 37.617644),
    Point(55.874496, 37.591431),
    Point(55.850808, 37.575352),
    Point(55.856548, 37.613),
    Point(55.860494, 37.602948),
    Point(55.849292, 37.57987),
)

val Ochakovo_Matveevskoe_r = listOf(
    Point(55.703454, 37.468021),
    Point(55.693546, 37.455579),
    Point(55.679372, 37.448267),
    Point(55.70844, 37.45981),
    Point(55.693348, 37.45416),
    Point(55.705387, 37.47995),
    Point(55.711519, 37.489158),
    Point(55.68803, 37.460924),
    Point(55.701734, 37.46591),
    Point(55.689695, 37.467482),
    Point(55.689695, 37.467491),
    Point(55.690765, 37.469153),
    Point(55.699046, 37.457717),
    Point(55.702323, 37.463035),
    Point(55.704108, 37.472764),
    Point(55.709505, 37.488215),
    Point(55.681823, 37.45124),
    Point(55.706934, 37.453836),
    Point(55.692749, 37.453414),
    Point(55.709495, 37.488242),
    Point(55.688461, 37.469413),
    Point(55.689065, 37.471381),
    Point(55.700106, 37.468039),
)

val Perovo_r = listOf(
    Point(55.757977, 37.775308),
    Point(55.74444, 37.754036),
    Point(55.758002, 37.758662),
    Point(55.739144, 37.768175),
    Point(55.74415, 37.75428),
    Point(55.74904, 37.785018),
    Point(55.753276, 37.795933),
    Point(55.759111, 37.794217),
    Point(55.764136, 37.790615),
    Point(55.76446, 37.790543),
    Point(55.755312, 37.795313),
    Point(55.759674, 37.796301),
)

val Pechatniki_r = listOf(
    Point(55.675636, 37.725406),
    Point(55.69177, 37.727185),
    Point(55.69146, 37.729359),
    Point(55.68057, 37.730194),
    Point(55.652618, 37.70108),
    Point(55.694002, 37.721885),
    Point(55.692805, 37.725235),
    Point(55.687863, 37.731281),
    Point(55.690471, 37.730868),
    Point(55.691465, 37.729368),
    Point(55.693145, 37.718804),
    Point(55.692506, 37.726475),
    Point(55.691785, 37.72882),
)

val Pokrovskoe_Streshnevo_r = listOf(
    Point(55.825831, 37.431522),
    Point(55.824754, 37.434936),
    Point(55.825709, 37.430615),
    Point(55.826205, 37.428558),
    Point(55.82420, 37.450764),
    Point(55.812393, 37.463646),
    Point(55.814138, 37.468614),
    Point(55.812949, 37.452462),
    Point(55.816404, 37.459837),
    Point(55.815767, 37.459119),
    Point(55.834674, 37.420195),
)

val Preobrazhenskoe_r = listOf(
    Point(55.808118, 37.727445),
    Point(55.797918, 37.730401),
    Point(55.796091, 37.725065),
    Point(55.791582, 37.714159),
    Point(55.793465, 37.714276),
    Point(55.79891, 37.738063),
    Point(55.799775, 37.710898),
)

val Prospekt_Vernandskogo_r = listOf(
    Point(55.678824, 37.501546),
    Point(55.665624, 37.507295),
    Point(55.678854, 37.501516),
    Point(55.669366, 37.516215),
    Point(55.674514, 37.506082),
    Point(55.678148, 37.503441),
    Point(55.670483, 37.49753),
    Point(55.672935, 37.517608),
    Point(55.66993, 37.510251),
    Point(55.665269, 37.508804),
    Point(55.674174, 37.509792),
    Point(55.675682, 37.500396),
)

val Ramenki_r = listOf(
    Point(55.733505, 37.53885),
    Point(55.697463, 37.500207),
    Point(55.717721, 37.533822),
    Point(55.696387, 37.494827),
    Point(55.70351, 37.51115),
    Point(55.72288, 37.51455),
    Point(55.69391, 37.528481),
    Point(55.689826, 37.488475),
    Point(55.702906, 37.511508),
    Point(55.694449, 37.470581),
    Point(55.704935, 37.492105),
    Point(55.73183, 37.531631),
    Point(55.730466, 37.530903),
    Point(55.699147, 37.491853),
    Point(55.692008, 37.530939),
    Point(55.705062, 37.495518),
    Point(55.71697, 37.500818),
    Point(55.692851, 37.487595),
    Point(55.695088, 37.49215),
    Point(55.718872, 37.499893),
    Point(55.687264, 37.48331),
    Point(55.708323, 37.511023),
    Point(55.687426, 37.48455),
    Point(55.699903, 37.500764),
    Point(55.705067, 37.495518),
    Point(55.686761, 37.485215),
    Point(55.695854, 37.510116),
    Point(55.732742, 37.539554),
)

val Rostokino_r = listOf(
    Point(55.835473, 37.644944),
    Point(55.835796, 37.659146),
    Point(55.836266, 37.642528),
    Point(55.839638, 37.651133),
    Point(55.832834, 37.662066),
    Point(55.833572, 37.655769),
    Point(55.845016, 37.639249),
)

val Savelki_r = listOf(
    Point(55.990403, 37.256566),
    Point(55.992165, 37.219511),
    Point(55.991873, 37.25751),
    Point(55.993791, 37.253207),
)

val Sviblovo_r = listOf(
    Point(55.861312, 37.645447),
    Point(55.847245, 37.635566),
    Point(55.84724, 37.630975),
    Point(55.847295, 37.635602),
    Point(55.848554, 37.655014),
    Point(55.8473, 37.637578),
    Point(55.860605, 37.645564),
)

val Severnoe_Butovo_r = listOf(
    Point(55.577907, 37.576843),
    Point(55.570166, 37.575693),
    Point(55.573317, 37.590623),
    Point(55.577068, 37.580346),
    Point(55.578533, 37.57386),
    Point(55.568512, 37.577669),
)

val Severnoe_Izmailovo_r = listOf(
    Point(55.81131, 37.824302),
    Point(55.809317, 37.783123),
    Point(55.808295, 37.804413),
    Point(55.803459, 37.798215),
    Point(55.808068, 37.775478),
    Point(55.804041, 37.805707),
    Point(55.809353, 37.805419),
)

val Severnoe_Medvedkovo_r = listOf(
    Point(55.886196, 37.658895),
    Point(55.884504, 37.669486),
    Point(55.889346, 37.646462),
    Point(55.879854, 37.638243),
    Point(55.881303, 37.639671),
    Point(55.893955, 37.657502),
    Point(55.883131, 37.662362),
    Point(55.892647, 37.647639),
    Point(55.88351, 37.664141),
    Point(55.884181, 37.66768),
)

val Severnoe_Tushino_r = listOf(
    Point(55.85678, 37.421722),
    Point(55.856437, 37.406325),
    Point(55.857422, 37.407438),
    Point(55.856492, 37.406307),
    Point(55.863358, 37.433508),
)

val Severnyi_r = listOf(
    Point(55.934795, 37.55443),
    Point(55.919533, 37.554924),
    Point(55.930453, 37.54506),
    Point(55.925712, 37.544378),
    Point(55.92319, 37.54816),
    Point(55.925571, 37.54241),
    Point(55.921687, 37.540461),
)

val Sokol_r = listOf(
    Point(55.798859, 37.501214),
    Point(55.808776, 37.493228),
    Point(55.793035, 37.514446),
    Point(55.802528, 37.506289),
    Point(55.813288, 37.497692),
    Point(55.799467, 37.499758),
    Point(55.808306, 37.5008),
    Point(55.793627, 37.517707),
    Point(55.80698, 37.502579),
    Point(55.813293, 37.497701),
)

val Sokolinaya_Gora_r = listOf(
    Point(55.766344, 37.726754),
    Point(55.754198, 37.726286),
    Point(55.786232, 37.739123),
    Point(55.787609, 37.74172),
    Point(55.79226, 37.742573),
    Point(55.754517, 37.719172),
    Point(55.780562, 37.735512),
    Point(55.773991, 37.737102),
    Point(55.78202, 37.726655),
    Point(55.780522, 37.735422),
    Point(55.76527, 37.744073),
    Point(55.791825, 37.742941),
)

val Sokolniki_r = listOf(
    Point(55.784334, 37.685251),
    Point(55.790423, 37.680499),
    Point(55.785073, 37.69737),
    Point(55.789922, 37.677885),
    Point(55.788576, 37.678685),
    Point(55.790443, 37.680365),
    Point(55.789816, 37.673466),
    Point(55.790453, 37.657736),
    Point(55.79303, 37.656065),
    Point(55.78322, 37.695402),
    Point(55.785488, 37.686922),
    Point(55.79262, 37.658068),
    Point(55.790458, 37.657745),
    Point(55.791167, 37.670807),
    Point(55.784091, 37.69074),
    Point(55.784795, 37.684632),
)

val Solncevo_r = listOf(
    Point(55.654665, 37.396766),
    Point(55.635894, 37.383965),
    Point(55.657845, 37.410861),
    Point(55.646833, 37.392553),
    Point(55.664157, 37.420698),
    Point(55.665127, 37.427857),
    Point(55.643998, 37.403576),
    Point(55.641092, 37.39709),
    Point(55.64286, 37.409819),
    Point(55.645095, 37.404456),
    Point(55.673976, 37.421749),
    Point(55.665792, 37.423914),
)

val Staroe_Kryukovo_r = listOf(
    Point(55.981112, 37.176922),
    Point(55.982346, 37.184989),
    Point(55.979042, 37.189588),
)

val Strogino_r = listOf(
    Point(55.817345, 37.401177),
    Point(55.806044, 37.395455),
    Point(55.799446, 37.39214),
    Point(55.807881, 37.391781),
    Point(55.811973, 37.393092),
    Point(55.803776, 37.439546),
)

val Tekstilshiki_r = listOf(
    Point(55.705239, 37.737426),
    Point(55.707278, 37.744253),
    Point(55.693216, 37.738593),
    Point(55.709956, 37.735377),
    Point(55.715256, 37.729484),
    Point(55.693723, 37.735243),
    Point(55.723197, 37.734919),
    Point(55.709946, 37.734425),
    Point(55.71945, 37.724894),
)

val Tropareva_Nikulino_r = listOf(
    Point(55.671387, 37.477992),
    Point(55.656077, 37.49179),
    Point(55.661471, 37.487254),
    Point(55.667493, 37.493147),
    Point(55.659348, 37.472989),
    Point(55.656428, 37.481576),
    Point(55.661328, 37.468308),
    Point(55.666335, 37.466009),
    Point(55.66997, 37.450486),
    Point(55.669239, 37.448249),
    Point(55.671392, 37.478001),
    Point(55.669107, 37.448033),
)

val Teplyi_Stan_r = listOf(
    Point(55.642164, 37.484137),
    Point(55.631519, 37.516368),
    Point(55.646899, 37.479699),
    Point(55.627341, 37.478657),
    Point(55.645893, 37.477022),
    Point(55.63284, 37.471138),
    Point(55.638441, 37.503051),
    Point(55.622761, 37.483571),
    Point(55.634034, 37.488574),
    Point(55.615532, 37.491143),
    Point(55.619803, 37.486562),
    Point(55.632042, 37.472),
    Point(55.619208, 37.495869),
    Point(55.624037, 37.485134),
    Point(55.632586, 37.476752),
    Point(55.632591, 37.476761),
    Point(55.627163, 37.485691),
)

val Fili_Davidkovo_r = listOf(
    Point(55.726304, 37.467715),
    Point(55.7245, 37.455346),
    Point(55.73778, 37.470195),
    Point(55.736432, 37.464158),
    Point(55.72564, 37.450791),
    Point(55.724155, 37.454052),
    Point(55.742372, 37.479007),
    Point(55.730994, 37.469359),
    Point(55.733361, 37.486302),
    Point(55.713943, 37.453908),
    Point(55.713943, 37.453918),
    Point(55.730836, 37.460762),
    Point(55.731247, 37.471336),
    Point(55.731693, 37.45389),
    Point(55.712807, 37.458723),
    Point(55.730289, 37.464796),
    Point(55.738292, 37.464904),
    Point(55.729752, 37.449381),
    Point(55.726948, 37.476366),
    Point(55.737056, 37.481406),
    Point(55.730289, 37.464805),
    Point(55.736615, 37.466009),
    Point(55.732322, 37.479663),
    Point(55.711747, 37.454932),
    Point(55.737507, 37.484361),
)

val Filevskiy_Park_r = listOf(
    Point(55.740309, 37.49144),
    Point(55.739443, 37.496488),
    Point(55.756386, 37.50884),
    Point(55.7559, 37.506675),
    Point(55.745549, 37.511832),
    Point(55.749192, 37.514949),
    Point(55.74484, 37.498833),
    Point(55.744617, 37.512119),
    Point(55.753686, 37.513143),
    Point(55.745488, 37.500154),
    Point(55.734871, 37.493677),
    Point(55.764648, 37.494449),
    Point(55.749674, 37.502292),
    Point(55.73962, 37.503352),
    Point(55.738551, 37.50531),
    Point(55.757379, 37.508867),
    Point(55.733984, 37.489877),
    Point(55.742625, 37.510242),
)

val Hamovniki_r = listOf(
    Point(55.717994, 37.572369),
    Point(55.745199, 37.578352),
    Point(55.748199, 37.604403),
    Point(55.71802, 37.573753),
    Point(55.728062, 37.560307),
    Point(55.730112, 37.590156),
    Point(55.725214, 37.578496),
    Point(55.740532, 37.605607),
    Point(55.721894, 37.563476),
    Point(55.738916, 37.584649),
    Point(55.737208, 37.585637),
    Point(55.740806, 37.588494),
    Point(55.735581, 37.570105),
    Point(55.739894, 37.604189),
    Point(55.736878, 37.56936),
    Point(55.739189, 37.583957),
    Point(55.732088, 37.581433),
    Point(55.736432, 37.582466),
    Point(55.721006, 37.584326),
)

val Hovrino_r = listOf(
    Point(55.870531, 37.486005),
    Point(55.868435, 37.485843),
    Point(55.875996, 37.491108),
    Point(55.866718, 37.500603),
    Point(55.870582, 37.478001),
    Point(55.86847, 37.499794),
)

val Horoshovo_Mnevniki_r = listOf(
    Point(55.774629, 37.466134),
    Point(55.776558, 37.462164),
    Point(55.77772, 37.48694),
    Point(55.769393, 37.475243),
    Point(55.784784, 37.477327),
    Point(55.776041, 37.487649),
    Point(55.76916, 37.472593),
    Point(55.787973, 37.461292),
    Point(55.773272, 37.483678),
    Point(55.772801, 37.49921),
    Point(55.7691, 37.472674),
    Point(55.786986, 37.481271),
    Point(55.775965, 37.482942),
    Point(55.762789, 37.508984),
    Point(55.775894, 37.466593),
    Point(55.776613, 37.474022),
    Point(55.77801, 37.465083),
    Point(55.760444, 37.518461),
    Point(55.771297, 37.490353),
    Point(55.775555, 37.466763),
    Point(55.781585, 37.479708),
    Point(55.784516, 37.460529),
    Point(55.7696, 37.489464),
    Point(55.774624, 37.481639),
    Point(55.763057, 37.508894),
    Point(55.776821, 37.471875),
    Point(55.771869, 37.492689),
    Point(55.763265, 37.514994),
)

val Caricino_r = listOf(
    Point(55.637535, 37.650981),
    Point(55.620662, 37.664941),
    Point(55.62852, 37.663818),
    Point(55.627493, 37.651241),
    Point(55.616671, 37.645797),
    Point(55.627417, 37.652984),
    Point(55.627432, 37.651187),
    Point(55.63313, 37.67033),
    Point(55.63754, 37.650981),
    Point(55.632012, 37.682988),

    )

val Chertanovo_Severnoe_r = listOf(
    Point(55.63101, 37.612084),
)

val Chertanovo_Centralnoe_r = listOf(
    Point(55.607351, 37.572845),
    Point(55.60445, 37.604278),
    Point(55.607834, 37.579394),
)

val Chertanovo_Yuzhnoe_r = listOf(
    Point(55.589274, 37.612641),
    Point(55.590536, 37.605377),
    Point(55.592378, 37.604232),
    Point(55.579307, 37.602822),
    Point(55.59424, 37.603325),
    Point(55.593441, 37.599355),
    Point(55.602108, 37.62263),
    Point(55.588415, 37.601798),
    Point(55.582925, 37.581164),
    Point(55.589274, 37.61265),
    Point(55.579694, 37.601043),
    Point(55.583871, 37.595662),
)

val Cheremushki_r = listOf(
    Point(55.665817, 37.568129),
    Point(55.650861, 37.558894),
    Point(55.664929, 37.550351),
    Point(55.674006, 37.562667),
    Point(55.663217, 37.569962),
    Point(55.657956, 37.565677),
    Point(55.663156, 37.553648),
)

val Shukino_r = listOf(
    Point(55.801183, 37.494653),
    Point(55.798333, 37.491063),
    Point(55.802588, 37.48711),
    Point(55.793667, 37.45646),
    Point(55.810003, 37.456968),
    Point(55.794821, 37.501016),
    Point(55.791653, 37.491242),
    Point(55.791881, 37.457232),
    Point(55.807587, 37.457546),
    Point(55.789598, 37.475737),
    Point(55.81, 37.456639),
    Point(55.810005, 37.456648),
    Point(55.790909, 37.475423),
)

val Yuzhnoe_Butovo_r = listOf(
    Point(55.546083, 37.549184),
    Point(55.504899, 37.594567),
    Point(55.557948, 37.557268),
    Point(55.552408, 37.552157),
    Point(55.552581, 37.558364),
    Point(55.508565, 37.587191),
    Point(55.557765, 37.555023),
    Point(55.550213, 37.571363),
    Point(55.539732, 37.581271),
    Point(55.547153, 37.522351),
    Point(55.545783, 37.516997),
)

val Yuzhnoe_Medvedkovo_r = listOf(
    Point(55.876486, 37.621857),
    Point(55.878329, 37.62943),
    Point(55.873582, 37.652166),
    Point(55.878349, 37.629385),
)

val Yuzhnoe_Tushino_r = listOf(
    Point(55.849448, 37.443173),
    Point(55.849423, 37.438987),
    Point(55.840674, 37.419575),
    Point(55.849241, 37.43092),
    Point(55.846234, 37.453199),
)

val Yakimanka_r = listOf(
    Point(55.737193, 37.623573),
    Point(55.736012, 37.618659),
    Point(55.730639, 37.610898),
    Point(55.739727, 37.618516),
    Point(55.738946, 37.619198),

    )

val Yasenevo_r = listOf(
    Point(55.602349, 37.52247),
    Point(55.602298, 37.554439),
    Point(55.60678, 37.526609),
    Point(55.601813, 37.509191),
    Point(55.609746, 37.516781),
    Point(55.612253, 37.529259),
    Point(55.591213, 37.53888),
    Point(55.61117, 37.527938),
    Point(55.617098, 37.539751),
    Point(55.590139, 37.547495),
    Point(55.610178, 37.533041),
)