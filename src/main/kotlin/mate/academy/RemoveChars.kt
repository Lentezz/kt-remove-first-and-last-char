package mate.academy

fun removeChars(str: String): String {
    // Implement this function
    if (str.length < 3) return ""
    return str.replaceRange(0, 1, "")
        .replaceRange(str.length - 2, str.length - 1, "")
}
