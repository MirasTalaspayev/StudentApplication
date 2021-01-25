package com.example.studentapplication.rv_example

data class Student(val Name: String, val Surname: String) {
    override fun equals(other: Any?): Boolean {
        if (this.toString().equals(other.toString())) {
            return true
        }
        return false
    }

    override fun hashCode(): Int {
        return this.toString().hashCode()
    }

    override fun toString(): String {
        return "$Name $Surname"
    }
}
