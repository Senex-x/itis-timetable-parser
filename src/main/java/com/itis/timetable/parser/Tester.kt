package com.itis.timetable.parser

fun main() {
    val string =
        "Разработка корпоративных приложений Сидиков М.Р. гр.1 MS Teams, Аршинов М.В. гр.1 в 1307,  Веб-программирование Абрамский М.М.(Атнагулов А.А.) гр1 в 1509, Курносов О.В. в 1302, Кошарский И.Е.в 1508,  Введение в трехмерную графику Костюк Д.И. гр.1 в 1304, Хафизов М.Р. в 1311 ,  Программирование на С++ Закиев А. в ms teams , Чупин М.М. в 1309  Разработка мобильных приложений Шайхразиев Н. в 1308, Ихсанов И.Р. в 1412"
    val str = "Введение в искусственный интеллект Нурутдинова А.Р. (лекция) в 1311 ms teams,  Костюк Д.И (лекция) в 1310 (ms teams)"

    val result = parseVariedSubject(
        str,-1, -1, -1, -1, "", ""
    )
    result.forEach {
       // println(it)
    }
}

    val list = listOf(
        "Разработка корпоративных приложений Сидиков М.Р. гр.1 MS Teams, Аршинов М.В. гр.1 в 1307,  Веб-программирование Абрамский М.М.(Атнагулов А.А.) гр1 в 1509, Курносов О.В. в 1302, Кошарский И.Е.в 1508,  Введение в трехмерную графику Костюк Д.И. гр.1 в 1304, Хафизов М.Р. в 1311 ,  Программирование на С++ Закиев А. в ms teams , Чупин М.М. в 1309  Разработка мобильных приложений Шайхразиев Н. в 1308, Ихсанов И.Р. в 1412",
        "Разработка корпоративных приложений Сидиков М.Р.гр.1 MS Teams,Аршинов М.В.гр.1 в 1307,  Веб-программирование Абрамский М.М. гр.1 в 1509,Курносов О.В. в 1302,Кошарский И.Е.в 1508, Валиуллин К.И. в 1409,    Введение в трехмерную графику Костюк Д.И.гр.1 в 1304, Хафизов М.Р. в  1311,  Программирование на С++ Закиев А. в ms teams,  Чупин М.М. в 1309    Разработка мобильных приложений Шайхразиев Н. в 1308, Ихсанов И.Р. в 1412",
        " Разработка корпоративных приложений Сидиков М.Р. гр2 в 1304,  Веб-программирование Абрамский М.М. (Атнагулов А.А.) гр.2 в 1509,  Введение в трехмерную графику Костюк Д.И.гр.2 в 1405",
        " Разработка корпоративных приложений Сидиков М.Р.гр2 в 1304,  Веб-программирование Абрамский М.М. (Атнагулов А.А.) гр.2 в 1509,  Введение в трехмерную графику Костюк Д.И.гр.2 в 1405",
        "  Математическая логика Сабирзянов Р.Р. в 1409     Введение в искусственный интеллект Якупов А.Ш. (лекция)  в 1508, Хафизов М.Р. гр.1 в н.н., гр. 2 в ч.н.в 1405 MS",
        "   Введение в искусственный интеллект Нурутдинова А.Р. (лекция) в 1311 ms teams,  Костюк Д.И (лекция) в 1310 (ms teams)",
        "  Введение в искусственный интеллект - Таланов М.О.(в ms teams). в 1311, Григорян К.А. гр.1 в н.н., гр.2 в ч.н. в 1306.,  Введение в робототехнику - Лавренов Р.О.гр.1 по н.н., гр.2 по ч.н. в 1404 Введение в машинное обучение - Закиров Л.Л. в 1303",
        "  Дополнительные главы прикладной математики - Лернер Э.Ю. лекция. в 1301,  Введение в искусственный интеллект - Таланов М.О. гр.1 в н.н., а гр.2 в ч.н.в 1409, Хафизов М.Р. гр.3 в н.н в 1405 ,Григорян К.А. гр.3 в 1306. по н.н.  Введение в робототехнику - Лавренов Р.О. (лекция) в 1311,  Введение в машинное обучение - Закиров Л.Л. в 1303 по ч.н.",
        "  ,Введение в искусственный интеллект Якупов А.Ш. в 1508. практика по н.н.",
    )