package com.rifqipadisiliwangi.beritabindingnavigation

import java.io.Serializable

data class Berita(
    var image: Int,
    var title: String,
    var writer: String,
    var date: String,
    var content: String
) : Serializable
