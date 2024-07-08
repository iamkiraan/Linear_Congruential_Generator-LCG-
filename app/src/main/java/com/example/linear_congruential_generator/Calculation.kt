package com.example.linear_congruential_generator

import java.util.Scanner

class Calculation {

    private fun test() {
        //defining the formula for LCG
        /*we have formula Z = (aZ0+c)%m
    where
    Z0= any initial value between 0 t0 m-1
    a = multiplicative factor
    c = Incremental factor
    m = modulus value which is given by maximum capacity of random number generator
     Random number on U(0,1) is given by Ui = Zi/m
    */

        val scanner = Scanner(System.`in`)
        println("enter the value of a")
        val a = scanner.nextInt()

        println("enter the value of c")
        val c = scanner.nextInt()

        println("enter the value of m")
        val m = scanner.nextInt()

        println("enter the initial value")
        var Z0 = scanner.nextInt()
        var z = Z0
        var Ui = z.toFloat()/m.toFloat()
        val reset = "\u001B[0m"
        val red = "\u001B[31m"
        val blue = "\u001B[34m"
        var cort = Z0
        var count = 0

        println("${red}Z${reset}\t\t\t\t\t\t${blue}Ui${reset}")

        for (i in 0..m) {
           //if we print the value more than m-1 then the value will be repeated
            println("$z\t\t\t\t\t\t$Ui")
            z = (a * Z0 + c) % m
            Ui = (((z.toFloat())/(m.toFloat())))

            if(cort == z){
                count ++
            }
            Z0 =z
        }
        println("*********************")
        println("count :$count")
        if(count>1){
            println("not a full period")
        }
        else{
            println("full period")
        }




    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculation = Calculation()
            calculation.test()
        }
    }

}