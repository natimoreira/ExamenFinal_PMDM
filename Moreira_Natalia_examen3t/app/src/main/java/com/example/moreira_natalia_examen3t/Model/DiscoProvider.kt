package com.example.moreira_natalia_examen3t.Model

import android.content.res.Resources
import com.example.moreira_natalia_examen3t.R

/* Clase que contiene la información de los discos */
class DiscoProvider(resources: Resources) {
    companion object{
        @Volatile
        private var INSTANCE: DiscoProvider? = null

        fun getDataSource(resources: Resources): DiscoProvider {
            return synchronized(DiscoProvider::class) {
                val newInstance = INSTANCE ?: DiscoProvider(resources)
                INSTANCE = newInstance
                newInstance
            }
        }

        val listaDisco : MutableList<DiscoModel> = mutableListOf(
            DiscoModel(
                foto = R.drawable.abbeyroad,
                titulo = "Abbey Road",
                artista = "The Beatles",
                desc = R.string.abbeyroad,
                id = 0
            ), DiscoModel(
                foto = R.drawable.exileonmainst,
                titulo = "Exile on Main Street",
                artista = "The Rolling Stones",
                desc = R.string.exilesonmainstreet,
                id = 1
            ),
            DiscoModel(
                foto = R.drawable.velvetunderground,
                titulo = "The Velvet Underground",
                artista = "The Velvet Underground and Nico",
                desc = R.string.velvetunderground,
                id = 2
            ),
            DiscoModel(
                foto = R.drawable.areyouexperienced,
                titulo = "Are You Experienced",
                artista = "Jimi Hendrix",
                desc = R.string.areyouexperienced,
                id = 3
            ),
            DiscoModel(
                foto = R.drawable.backinblack,
                titulo = "Back in Black",
                artista = "AC/DC",
                desc = R.string.backinblack,
                id = 4
            ), DiscoModel(
                foto = R.drawable.appetitefordestruction,
                titulo = "Appetite for Destruction",
                artista = "TGuns N’ Roses",
                desc = R.string.appetitefordestruction,
                id = 5
            ),
            DiscoModel(
                foto = R.drawable.ledzeppeliniv,
                titulo = "Led Zeppelin IV",
                artista = "Led Zeppelin",
                desc = R.string.ledzeppeliniv,
                id = 6
            ),
            DiscoModel(
                foto = R.drawable.ladysoul,
                titulo = "Lady Soul",
                artista = "Aretha Franklin",
                desc = R.string.ladysoul,
                id = 7
            ),
            DiscoModel(
                foto = R.drawable.neverloved,
                titulo = "I Never Loved a Man the Way I Love You",
                artista = "Aretha Franklin",
                desc = R.string.ineverloveda,
                id = 8
            ),
            DiscoModel(
                foto = R.drawable.whatsgoingon,
                titulo = "What's Going On",
                artista = "Marvin Gaye",
                desc = R.string.whatsgoingon,
                id = 9
            ),
            DiscoModel(
                foto = R.drawable.kindofblue,
                titulo = "Kind of Blue",
                artista = "Miles Davis",
                desc = R.string.kindofblue,
                id = 10
            ),
            DiscoModel(
                foto = R.drawable.bitchesbrew,
                titulo = "Bitches Brew",
                artista = "Miles Davis",
                desc = R.string.bitchesbrew,
                id = 11
            ),
            DiscoModel(
                foto = R.drawable.alovesupreme,
                titulo = "A Love Supreme",
                artista = "John Coltrane",
                desc = R.string.alovesupreme,
                id = 12
            )
        )

    }

    //fun getDiscoFromId(id: Long) = listaDisco.firstOrNull { it.id == id }
}