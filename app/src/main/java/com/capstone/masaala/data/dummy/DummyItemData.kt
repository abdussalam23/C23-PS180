package com.capstone.masaala.data.dummy

object DummyItemData {
    private val itemNames = arrayOf(
        "Curcuma",
        "Anise",
        "Tamarind",
        "Onion",
        "Leek",
        "Garlic",
        "Red Chilli Pepper",
        "Scallion",
        "Ginger",
        "Cinnamon")

    private val itemDesc = arrayOf(
        "Curcuma zanthorrhiza, known as temulawak, Java ginger, Javanese ginger, or Javanese turmeric is a plant species, belonging to the ginger family. It is known in Javanese as temulawak, in Sundanese as koneng gede and in Madurese as temu labak. The scientific name is sometimes written as Curcuma xanthorrhiza, but this is an orthographical variant.",
        "Anise (/ˈænɪs/; Pimpinella anisum), also called aniseed or rarely anix is a flowering plant in the family Apiaceae native to the eastern Mediterranean region and Southwest Asia.",
        "Tamarind (Tamarindus indica) is a leguminous tree bearing edible fruit that is indigenous to tropical Africa and naturalized in Asia. The genus Tamarindus is monotypic, meaning that it contains only this species. It belongs to the family Fabaceae.",
        "An onion (Allium cepa L., from Latin cepa meaning \"onion\"), also known as the bulb onion or common onion, is a vegetable that is the most widely cultivated species of the genus Allium. The shallot is a botanical variety of the onion which was classified as a separate species until 2011. Its close relatives include garlic, scallion, leek, and chive.",
        "The leek is a vegetable, a cultivar of Allium ampeloprasum, the broadleaf wild leek (syn. Allium porrum). The edible part of the plant is a bundle of leaf sheaths that is sometimes erroneously called a stem or stalk. The genus Allium also contains the onion, garlic, shallot, scallion, chives, and Chinese onion. Three closely related vegetables, elephant garlic, kurrat and Persian leek or tareh, are also cultivars of A. ampeloprasum, although different in their uses as food.",
        "Garlic (Allium sativum) is a species of bulbous flowering plant in the genus Allium. Its close relatives include the onion, shallot, leek, chive, Welsh onion and Chinese onion. It is native to South Asia, Central Asia and northeastern Iran and has long been used as a seasoning worldwide, with a history of several thousand years of human consumption and use. It was known to ancient Egyptians and has been used as both a food flavoring and a traditional medicine. China produces 76% of the world's supply of garlic.",
        "Chili peppers (also chile, chile pepper, chilli pepper, or chilli), from Nahuatl chīlli, are varieties of the berry-fruit of plants from the genus Capsicum, which are members of the nightshade family Solanaceae, cultivated for their pungency. Chili peppers are widely used in many cuisines as a spice to add \"heat\" to dishes. Capsaicin and related compounds known as capsaicinoids are the substances giving chili peppers their intensity when ingested or applied topically. While chili peppers are (to varying degrees) pungent or \"spicy\", there are other varieties of capsicum such as bell peppers, which generally provide additional sweetness and flavor to a meal rather than \"heat\".",
        "Scallions (also known as green onions, and spring onions) are vegetables derived from various species in the genus Allium. Scallions generally have a milder taste than most onions and their close relatives include garlic, shallot, leek, chive, and Chinese onions.",
        "Ginger (Zingiber officinale) is a flowering plant whose rhizome, ginger root or ginger, is widely used as a spice and a folk medicine. It is a herbaceous perennial which grows annual pseudostems (false stems made of the rolled bases of leaves) about one meter tall bearing narrow leaf blades. The inflorescences bear flowers having pale yellow petals with purple edges, and arise directly from the rhizome on separate shoots.",
        "Cinnamon is a spice obtained from the inner bark of several tree species from the genus Cinnamomum. Cinnamon is used mainly as an aromatic condiment and flavouring additive in a wide variety of cuisines, sweet and savoury dishes, breakfast cereals, snack foods, bagels, teas, hot chocolate and traditional foods. The aroma and flavour of cinnamon derive from its essential oil and principal component, cinnamaldehyde, as well as numerous other constituents including eugenol."
    )


    private val itemPicture = arrayOf(
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Temulawak.jpg/1280px-Temulawak.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/3/3b/Koehler1887-PimpinellaAnisum.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/2/2e/Tamarindus_indica_pods.JPG",
        "https://upload.wikimedia.org/wikipedia/commons/a/a2/Mixed_onions.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/9/90/Leeks.JPG",
        "https://upload.wikimedia.org/wikipedia/commons/3/39/Allium_sativum_Woodwill_1793.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Madame_Jeanette_and_other_chillies.jpg/1024px-Madame_Jeanette_and_other_chillies.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/CSA-Red-Spring-Onions.jpg/1280px-CSA-Red-Spring-Onions.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Koeh-146-no_text.jpg/800px-Koeh-146-no_text.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Cinnamomum_verum_spices.jpg/1920px-Cinnamomum_verum_spices.jpg"


    )

    val listData: ArrayList<DummyItem>
        get() {
            val list = arrayListOf<DummyItem>()
            for (position in itemNames.indices) {
                val guns = DummyItem()
                guns.name = itemNames[position]
                guns.desc = itemDesc[position]
                guns.picture = itemPicture[position]
                list.add(guns)
            }
            return list
        }
}