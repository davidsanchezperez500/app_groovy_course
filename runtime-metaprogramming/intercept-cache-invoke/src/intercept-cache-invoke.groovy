
// Intercept - Cache - Invoke Pattern

class Developer {

    List languages = []

    def methodMissing(String name, args){

        println "${name}() method was called..."

        if( name.startsWith('write') ) {
            String language = name.split("write")[1]

            if( languages.contains(language) ) {
                def impl = { Object[] theArgs ->
                    println "I like to write code  in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }

}

Developer david = new Developer()
david.languages << "Groovy"
david.languages << "Java"
println david.metaClass.methods.size()
david.writeGroovy()
david.writeGroovy()
david.writeGroovy()
println david.metaClass.methods.size()
david.writeJava()
david.writeJava()
println david.metaClass.methods.size()