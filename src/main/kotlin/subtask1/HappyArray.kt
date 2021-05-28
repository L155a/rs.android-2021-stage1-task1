package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var index = 0
        val list = sadArray.toMutableList()
        var i = list.size

        while(i > 0) {

            if (index >= 0 && index < list.size) {


                if (index != 0 && index != list.size - 1) {

                    if ((list[index - 1] + list[index + 1]) > list[index]) {
                        index = index + 1
                        i--
                    } else {
                        list.removeAt(index)
                        index = index - 1
                    }

                } else {
                    index++
                    i--
                }
            }


        }


        return list.toIntArray()
    }
}
