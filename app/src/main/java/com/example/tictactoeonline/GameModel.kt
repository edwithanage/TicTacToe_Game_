package com.example.tictactoeonline

import kotlin.random.Random

data class GameModel (
    var gameId : String = "-1",
    var filledPos : MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner : String ="",
    var gameStatus : GameStastus = GameStastus.CREATED,
    var currentPlayer : String = (arrayOf("x","o"))[Random.nextInt(2)]
)


enum class GameStastus{
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}