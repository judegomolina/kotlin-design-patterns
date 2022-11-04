package structural.composite

import structural.composite.teamMembers.Player
import structural.composite.teamMembers.TechnicalMember
import java.math.BigDecimal

fun main() {
    val cristianoRonaldo = Player("Cristiano Ronaldo", skillLevel = 98, yearlySalary = BigDecimal(100000000))
    val sergioRamos = Player("Sergio Ramos", skillLevel = 88, yearlySalary = BigDecimal(50000000))

    val castillaPlayer = Player("Juan Molina", skillLevel = 52, yearlySalary = BigDecimal(200000))

    val ancelotti = TechnicalMember(workingHoursPerMonth = 200, hourlySalary = BigDecimal(300))
    val castillaCoach = TechnicalMember(workingHoursPerMonth = 160, hourlySalary = BigDecimal(100))

    val realMadridCastilla = Team(castillaPlayer, castillaCoach)
    val realMadrid = Team(cristianoRonaldo, sergioRamos, ancelotti, realMadridCastilla)

    println("Total monthly cost of Real Madrid is ${realMadrid.calculateCost()}")
}
