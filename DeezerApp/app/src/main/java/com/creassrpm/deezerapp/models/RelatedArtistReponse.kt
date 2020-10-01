package com.creassrpm.deezerapp.models

import java.io.Serializable

data class RelatedArtistResponse(
    val data: List<RelatedArtistsModel>,
    val total: Int
) : Serializable

data class RelatedArtistsModel(
    val id: String,
    val link: String,
    val name: String,
    val nb_album: Int,
    val nb_fan: Int,
    val picture: String,
    val picture_big: String,
    val picture_medium: String,
    val picture_small: String,
    val picture_xl: String,
    val radio: Boolean,
    val tracklist: String,
    val type: String
) : Serializable