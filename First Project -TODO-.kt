package com.example.twaiqandroid1

import java.util.ArrayList

fun main() {

    var task1 = Task(1,"Aljawhara", "new",false)
    var task2 = Task(2,"Deema", "old",false)
    var task3 = Task(1,"Nouf", "new",false)
    val Todo = Todo()
    Todo.Addtask(task1)
    Todo.Addtask(task2)
    Todo.Addtask(task3)
    Todo.ShowallTasks()
    Todo.RemoveTask(task3)
    Todo.ShowallTasks()
    Todo.changeTask(task1)
    Todo.ShowallTasks()
    Todo.PrintaSpecificTask(task1.id)
}
data class Task (
    val id : Int,
    val name : String,
    val note : String,
    var isCompleted :Boolean = false
)

class Todo () {
    var tasks = arrayListOf<Task>()
        private set

    fun ShowallTasks() {
        for (task in tasks) {
            println("the tasks is : $task")
        }
    }

    fun Addtask(task: Task) {
        tasks.add(task)
    }

    fun RemoveTask(task: Task) {
        if (tasks.remove(task))
            println("the task has been removed")
        else println("there is no task to remove")
    }

    fun PrintaSpecificTask(id:Int) {
        for (task in tasks) {
            if (id == task.id) {
                println(task)
                return
            }
        }
        println("not found")}


        fun changeTask(task: Task) {
            task.isCompleted = !task.isCompleted
            println("the case isCompleted has been changed")}
        }




