package ru.provir.testappleapollo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}