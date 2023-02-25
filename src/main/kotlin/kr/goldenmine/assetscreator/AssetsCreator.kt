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
            "bmj/b.m.j.lab1", "bmj/b.m.j.lab2", "bmj/b.m.j.lab3", "bsy/bsy_locker", "bsy/bsy_reagent1",
            "bsy/bsy_reagent2", "chair_noback_1", "chair_noback_2", "peh/eunha_electronicshelves1",
            "peh/eunha_electronicshelves2", "lis/iis_printer", "jsy/j.s.y_desk", "kjh/k.j.h_home", "kjh/k.j.h_home2",
            "kjh/k.j.h_smoke", "kjh/k.j.h_trash", "ljy/leejunyong_oven1", "ljy/leejunyong_oven2",
            "ljy/leejunyong_oven3", "ljy/leejunyong_sink1", "ljy/leejunyong_sink2", "lis/lins_bookshelf",
            "oyj/ohyejin_bucket", "oyj/ohyejin_chair", "oyj/ohyejin_desk1", "oyj/ohyejin_desk2", "oyj/ohyejin_desk3",
            "oyj/ohyejin_desk4", "oyj/ohyejin_desk5", "oyj/ohyejin_desk6", "oyj/ohyejin_desk7", "oyj/ohyejin_desk8",
            "oyj/ohyejin_flowerpot", "oyj/ohyejin_locker", "oyj/ohyejin_sink", "oyj/ohyejin_sinksj", "lis/prop_box",
            "lis/prop_camcoder", "lis/prop_storage_box", "lis/prop_tissue_box", "jsy/jsy_stair_desk",
            "kms/kimmiseung_green_chair_2", "kms/kimmiseung_blue_chair_2", "oyj/ohyejin_bookshelf2_bt1",
            "oyj/ohyejin_bookshelf2_bt2", "oyj/ohyejin_bookshelf2_bt3",
            "oyj/ohyejin_bookshelf2_top1","oyj/ohyejin_bookshelf2_top2","oyj/ohyejin_bookshelf2_top3",
            "oyj/ohyejin_laboratory_equipment_1", "oyj/ohyejin_laboratory_equipment_2",
            "oyj/ohyejin_laboratory_equipment_3", "oyj/ohyejin_laboratory_equipment_4",
            "ghs/gohyunseo_annealing", "sonicator", "syw/yewon_sink2", "oyj/ohyejin_toilet",
            "kjh/k.j.h_gas", "kjh/k.j.h_gas2", "kjh/k.j.h_gassup", "kjh/k.j.h_gassup2", "sink1plus",
            "lsj/leesejin_tv2", "lsj/leesejin_chair5", "lsj/leesejin_desk3", "ljy/leejunyong_picnic_chair", "circle_chair",
            "kms/kms_572chair", "kms/kms_572table", "lis/leeinseong_sofa", "lis/leeinseong_electronicboard", "kdh/kdh_refrigerator"
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
        val signText = "signs"

        val blockStateString = """
            {
                "variants": {
                    "": {
                    "model": "inumodelloader:block/$signText/inu_sign_$signType"
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
                    "layer0": "inumodelloader:item/$signText/inu_sign_$signType"
                }
            }
        """.trimIndent()

        val image = createItemImage(signType)

        val blockStateFile = File(folder, "blockstates/$signText/inu_sign_$signType.json")
        val blockStateWallFile = File(folder, "blockstates/$signText/inu_wall_sign_$signType.json")
        val modelFile = File(folder, "models/block/$signText/inu_sign_$signType.json")
        val itemFile = File(folder, "models/item/$signText/inu_sign_$signType.json")
        val imageFile = File(folder, "textures/item/$signText/inu_sign_$signType.png")

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