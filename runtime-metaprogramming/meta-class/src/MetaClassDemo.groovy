// MetaClass Demo


//Expando e = new Expando()
//e.name = 'david'
//e.writeCode = { -> println "$name loves to write code..."}
//e.writeCode()

class Developer {

}
// per instance
Developer david = new Developer()
david.metaClass.name = 'david'
david.metaClass.writeCode = { -> println "$name loves to write code..."}
david.writeCode()

// every instance
String.metaClass.shout = { -> toUpperCase() }
println "hello david".shout()