object Even_Odd extends App {

    def main (args: Array[String])
    {
       find_Even_Odd (12)
       find_Even_Odd  (7)
    }

    def find_Even_Odd  (n:Int): Unit = {
        if(n==0) println("even")
        else if(n==1) println("odd")
        else find_Even_Odd  (n-2)
    }

}