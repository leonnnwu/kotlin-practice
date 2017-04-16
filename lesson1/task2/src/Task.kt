fun toJSON(collection: Collection<Int>): String {
    val len = collection.size

    return collection.foldIndexed(StringBuilder("["), {
        index, sb, element ->
        sb.append(element)
        if (index < len-1) {
            sb.append(", ")
        }
        sb
    }).append("]").toString()

}



