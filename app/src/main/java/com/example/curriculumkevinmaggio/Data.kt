package com.example.curriculumkevinmaggio

class Data {
    val listaFotos= listOf<String>("https://i.ibb.co/k6P5m1W/IMG-20170302-WA0001.jpg",
    "https://i.ibb.co/37cMhd3/603876-575810265782568-412259773-n.jpg",
    "https://i.ibb.co/4mkmQm6/20170420-160428.jpg",
    "https://i.ibb.co/gM1L4Yf/IMG-20170714-205741-449.jpg",
    "https://i.ibb.co/jMJSzPs/IMG-20201214-155220-808.jpg",
    "https://i.ibb.co/Kq1TsK8/IMG-20170709-WA0038.jpg",
    "https://i.ibb.co/1QNvXVr/IMG-20180715-WA0006.jpg")

    fun getLista(): List<String> {
        return listaFotos
    }
}