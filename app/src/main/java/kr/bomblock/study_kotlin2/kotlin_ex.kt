package kr.bomblock.study_kotlin2

fun main (){

    var name : String ="Denis"
    //name =null -> cmpilation ERROR
    //todo : null 값을 미리 지정해두면 컴파일시 휴대폰으로 출력하지 않고 미리 결과값을 정할 수 있다.
    var nullableName : String? = "Denis"
    //String 값에 ? 물음표를 넣어 nullableName 값에 null울 적용할 수 있게되었다.
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    nullableName?. let { println(it.length) }

//    if(nullableName != null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }
    val name = nullableName ?: "Guest"

    println(nullableName!!.toLowerCase())

    val wifesAge
}