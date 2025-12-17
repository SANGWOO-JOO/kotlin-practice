package lec08


fun main(){
    println(max(2, 3))
    repeat("Hello",4 , useNewLine = false)
}

private fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str : String,
    num : Int = 3,
    useNewLine : Boolean = true
){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            println(str)
        }
    }
}