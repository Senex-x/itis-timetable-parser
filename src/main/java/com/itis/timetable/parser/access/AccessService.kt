package com.itis.timetable.parser.access

import com.google.api.services.sheets.v4.Sheets
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AccessService {
    @Autowired
    lateinit var service: Sheets

    @Suppress("UNCHECKED_CAST")
    fun execute(range: String) = service.spreadsheets().values()
        .get(COPY_SHEET_ID, range)
        .execute().getValues() as List<List<String>>

    companion object {
        private const val COPY_SHEET_ID = "1yTnYYWuRpmt4pQbQybY5CFm7UZXepkMIfeyHxE0yPxA"
    }
}