package com.tjsquad.utsppb1

object UnitData {
    private val unitNames = arrayOf(
        "DCobra M416",
        "DCobra SIG 556",
        "DCobra Tec-9 M306",
        "DCobra Tec-9 M206",
        "DCobra KAC PDW M301",
        "DCobra P788",
        "DCobra M96",
        "DCobra AK47",
        "Double Eagle M47",
        "CYMA M4A1",
        "CYMA Mk47",
        "CYMA MP5",
        "CYMA G36",
        "CYMA AK47",
        "JG P90",
        "Krytac Kriss Vector",
        "Lancer Tactical M4A1",
        "WE Glock 18 GBB",
        "Tokyo Marui 1911 GBB",
        "WE M4A1 GBBR",
    )
    private val unitType = arrayOf(
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = Spring",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = AEG",
        "Jenis = GBB",
        "Jenis = GBB",
        "Jenis = GBBR",
    )
    private val unitFPS = arrayOf(
        "FPS = 220",
        "FPS = 220",
        "FPS = 150",
        "FPS = 120",
        "FPS = 280",
        "FPS = 120",
        "FPS = 120",
        "FPS = 220",
        "FPS = 270",
        "FPS = 360",
        "FPS = 400",
        "FPS = 350",
        "FPS = 360",
        "FPS = 360",
        "FPS = 360",
        "FPS = 360",
        "FPS = 360",
        "FPS = 330",
        "FPS = 330",
        "FPS = 400",
    )
    private val unitPrice = arrayOf(
        "Harga = Rp 90.000",
        "Harga = Rp 85.000",
        "Harga = Rp 35.000",
        "Harga = Rp 25.000",
        "Harga = Rp 350.000",
        "Harga = Rp 70.000",
        "Harga = Rp 70.000",
        "Harga = Rp 100.000",
        "Harga = Rp 70.000",
        "Harga = Rp 1.600.000",
        "Harga = Rp 8.000.000",
        "Harga = Rp 11.000.000",
        "Harga = Rp 8.000.000",
        "Harga = Rp 8.000.000",
        "Harga = Rp 8.000.000",
        "Harga = Rp 7.500.000",
        "Harga = Rp 8.000.000",
        "Harga = Rp 7.500.000",
        "Harga = Rp 4.000.000",
        "Harga = Rp 3.800.000",
        "Harga = Rp 18.000.000"
    )
    private val unitPhoto = intArrayOf(
        R.drawable.g1,
        R.drawable.g2,
        R.drawable.g3,
        R.drawable.g4,
        R.drawable.g5,
        R.drawable.g6,
        R.drawable.g7,
        R.drawable.g8,
        R.drawable.g9,
        R.drawable.g10,
        R.drawable.g11,
        R.drawable.g12,
        R.drawable.g13,
        R.drawable.g14,
        R.drawable.g15,
        R.drawable.g16,
        R.drawable.g17,
        R.drawable.g18,
        R.drawable.g19,
        R.drawable.g20,
    )
    val listData:ArrayList<Unit>
        get() {
            val list = arrayListOf<Unit>()
            for (position in unitNames.indices){
                val unit = Unit()
                unit.name = unitNames[position]
                unit.type = unitType[position]
                unit.fps = unitFPS[position]
                unit.price = unitPrice[position]
                unit.photo = unitPhoto[position]
                list.add((unit))
            }
            return list
        }
}