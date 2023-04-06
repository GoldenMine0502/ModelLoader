package kr.goldenmine.assetscreator

import kr.goldenmine.inumodelloader.inumodelloader.sign.SignSet
import java.awt.Color
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File
import java.util.stream.Collectors
import javax.imageio.ImageIO

fun main() {
    createSignModels()
    createNormalModels()
}

fun createNormalModels() {
    val folder = File("src/main/resources/assets/inumodelloader")
    val list = ArrayList<String>(
        listOf(
            "b.m.j.lab1", "b.m.j.lab2", "b.m.j.lab3", "bsy_locker", "bsy_reagent1",
            "bsy_reagent2", "chair_noback_1", "chair_noback_2", "eunha_electronicshelves1",
            "eunha_electronicshelves2", "iis_printer", "j.s.y_desk", "k.j.h_home", "k.j.h_home2",
            "k.j.h_smoke", "k.j.h_trash", "leejunyong_oven1", "leejunyong_oven2",
            "leejunyong_oven3", "leejunyong_sink1", "leejunyong_sink2", "lins_bookshelf",
            "ohyejin_bucket", "ohyejin_chair", "ohyejin_desk1", "ohyejin_desk2", "ohyejin_desk3",
            "ohyejin_desk4", "ohyejin_desk5", "ohyejin_desk6", "ohyejin_desk7", "ohyejin_desk8",
            "ohyejin_flowerpot", "ohyejin_locker", "ohyejin_sink", "ohyejin_sinksj", "prop_box",
            "prop_camcoder", "prop_storage_box", "prop_tissue_box", "jsy_stair_desk",
            "kimmiseung_green_chair_2", "kimmiseung_blue_chair_2", "ohyejin_bookshelf2_bt1",
            "ohyejin_bookshelf2_bt2", "ohyejin_bookshelf2_bt3",
            "ohyejin_bookshelf2_top1","ohyejin_bookshelf2_top2","ohyejin_bookshelf2_top3",
            "ohyejin_laboratory_equipment_1", "ohyejin_laboratory_equipment_2",
            "ohyejin_laboratory_equipment_3", "ohyejin_laboratory_equipment_4",
            "gohyunseo_annealing", "sonicator", "yewon_sink2", "ohyejin_toilet",
            "k.j.h_gas", "k.j.h_gas2", "k.j.h_gassup", "k.j.h_gassup2", "sink1plus",
            "leesejin_tv2", "leesejin_chair5", "leesejin_desk3", "leejunyong_picnic_chair", "circle_chair",
            "kms_572chair", "kms_572table", "leeinseong_sofa", "leeinseong_electronicboard", "kdh_refrigerator",
            "leesejin_578cabinet", "ljy_580desk", "ljy_580refrigerator", "bsy_partition",
            "bsy_partition2", "bsy_partition3", "bsy_chair", "ohyejin_aircleaner470",
            "ohyejin_desk1_470", "ohyejin_desk2_470", "ohyejin_desk3_470", "ohyejin_refrigerator_470",
            "ohyejin_sopum1_470", "k.j.h_eedeskv1", "k.j.h_eedeskv2", "k.j.h_panel"
        )
    )

    list.forEach { nameFolderAndFile ->
        val split = nameFolderAndFile.split("/")
        val nameFolder = if(split.size >= 2) split[0] + "/" else ""
        val nameFile = split.last()

        val blockStateString = """
            {
                "variants": {
                    "facing=north": { "model": "inumodelloader:block/$nameFolder$nameFile" },
                    "facing=south": { "model": "inumodelloader:block/$nameFolder$nameFile", "y":  180},
                    "facing=west": { "model": "inumodelloader:block/$nameFolder$nameFile", "y":  270},
                    "facing=east": { "model": "inumodelloader:block/$nameFolder$nameFile", "y":  90}
                }
            }
        """.trimIndent()


//        val modelString = """
//            {
//                "textures": {
//                    "particle": "inumodelloader:block/inu_wood_planks"
//                }
//            }
//        """.trimIndent()


        val itemString = """
            {
                "parent": "minecraft:item/generated",
                "textures": {
                    "layer0": "inumodelloader:item/$nameFolder$nameFile"
                }
            }
        """.trimIndent()

        val blockStateFile = File(folder, "blockstates/$nameFolder$nameFile.json")
//        val modelFile = File(folder, "models/block/$it.json")
        val itemFile = File(folder, "models/item/$nameFolder$nameFile.json")

        blockStateFile.parentFile.mkdirs()
        itemFile.parentFile.mkdirs()

        if(!blockStateFile.exists()) blockStateFile.createNewFile()
//        if(!modelFile.exists()) blockStateFile.createNewFile()
        if(!itemFile.exists()) blockStateFile.createNewFile()

        blockStateFile.writeText(blockStateString)
//        modelFile.writeText(modelString)
        itemFile.writeText(itemString)
    }
}

fun createSignModels() {
    val list = File("src/main/resources/data/signtext.csv").bufferedReader().lines().collect(Collectors.toList())
    SignSet.loadCsvAll(list)

    val removeMode = false

    SignSet.getSignInfoMap().forEach { (signType, signInfo) ->
        val folder = File("src/main/resources/assets/inumodelloader")
        val signFolder = ""

        val blockStateString = """
            {
                "variants": {
                    "": {
                    "model": "inumodelloader:block/${signFolder}inu_sign_$signType"
                    }
                }
            }
        """.trimIndent()

        val modelString = """
            {
                "textures": {
                    "particle": "inumodelloader:block/inu_wood_planks"
                }
            }
        """.trimIndent()

        val itemString = """
            {
                "parent": "minecraft:item/generated",
                "textures": {
                    "layer0": "inumodelloader:item/${signFolder}inu_sign_$signType"
                }
            }
        """.trimIndent()

        val image = createItemImage(signType)

        val blockStateFile = File(folder, "blockstates/${signFolder}inu_sign_$signType.json")
        val blockStateWallFile = File(folder, "blockstates/${signFolder}inu_wall_sign_$signType.json")
        val modelFile = File(folder, "models/block/${signFolder}inu_sign_$signType.json")
        val itemFile = File(folder, "models/item/${signFolder}inu_sign_$signType.json")
        val imageFile = File(folder, "textures/item/${signFolder}inu_sign_$signType.png")

        if(!removeMode) {
            blockStateFile.parentFile.mkdirs()
            modelFile.parentFile.mkdirs()
            itemFile.parentFile.mkdirs()
            imageFile.parentFile.mkdirs()

            if (!blockStateFile.exists()) blockStateFile.createNewFile()
            if (!blockStateWallFile.exists()) blockStateWallFile.createNewFile()
            if (!modelFile.exists()) modelFile.createNewFile()
            if (!itemFile.exists()) itemFile.createNewFile()
            if (!imageFile.exists()) imageFile.createNewFile()

            blockStateFile.writeText(blockStateString)
            blockStateWallFile.writeText(blockStateString)
            modelFile.writeText(modelString)
            itemFile.writeText(itemString)
            ImageIO.write(image, "png", imageFile)

            image.flush()
//            println("{")
            println("SignSet.signInfoMap.put(\"$signType\", new SignInfo(\"$signType\", \"${signInfo.signTextureType}\", \"$${signInfo.texts}\")));")
//            println("}")
        } else {
            blockStateFile.delete()
            blockStateWallFile.delete()
            modelFile.delete()
            itemFile.delete()
            imageFile.delete()
        }
    }
}

fun createItemImage(type: String): BufferedImage {
    val image = BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB)
    val graphics = image.graphics as Graphics2D

    // 하얀색으로 배경 채우기
    graphics.color = Color(255, 255, 255, 128)
    graphics.fillRect(0, 0, 64, 64)

    // 검은색으로 글씨 쓰기
    graphics.color = Color.BLACK
    graphics.font = graphics.font.deriveFont(28F)

    if (type.length < 3) {
        graphics.drawString(type, 0, 28)
    } else {
        graphics.drawString(type.substring(0, 3), 0, 28)
        graphics.font = graphics.font.deriveFont(24F)
        graphics.drawString(type.substring(3), 0, 52)
    }
    return image
}