abstract class Employee(val name: String, val id: Int) {
    abstract fun work()
    abstract fun showDetails()
}


class TemporaryStaff(name: String, id: Int, val hourlyRate: Double) : Employee(name, id) {
    fun calculateWage(hoursWorked: Int): Double {
        return hoursWorked * hourlyRate
    }

    override fun work() {
        println("$name is working temporarily.")
    }

    override fun showDetails() {
        println("Temporary Staff: Name = $name, ID = $id, Hourly Rate = $$hourlyRate")
    }
}


class PermanentStaff(name: String, id: Int, val annualSalary: Double) : Employee(name, id) {
    fun applyLeave(days: Int) {
        println("$name applied for $days day(s) of leave.")
    }

    override fun work() {
        println("$name is working as a permanent staff member.")
    }

    override fun showDetails() {
        println("Permanent Staff: Name = $name, ID = $id, Annual Salary = $$annualSalary")
    }
}

interface Shape {
    fun setup()
    fun draw()
}

// Circle class implements Shape
class Circle : Shape {
    override fun setup() {
        println("Setting up a circle with radius and center.")
    }

    override fun draw() {
        println("Drawing a circle.")
    }
}

// Rectangle class implements Shape
class Rectangle : Shape {
    override fun setup() {
        println("Setting up a rectangle with width and height.")
    }

    override fun draw() {
        println("Drawing a rectangle.")
    }
}

// Triangle class implements Shape
class Triangle : Shape {
    override fun setup() {
        println("Setting up a triangle with 3 sides.")
    }

    override fun draw() {
        println("Drawing a triangle.")
    }
}