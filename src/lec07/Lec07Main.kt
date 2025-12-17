package lec07


//스트링을 받아서 인트를 반환
fun parseIntThrow(str: String): Int {

    try {
        return str.toInt()
    }catch (e : NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrow2(str: String): Int? {
   return try {
        str.toInt()
    }catch(e: NumberFormatException) {
        null
    }
}