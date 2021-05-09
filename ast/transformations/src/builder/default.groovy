package builder

Developer david = Developer
    .builder()
    .firstName("david")
    .lastName("sanchez")
    .middleInitial("A")
    .email("davidsanchez@gmail.com")
    .hireDate(new Date())
    .langugages(["Java","Groovy"])
    .build()

println david
assert david.firstName == "david"
assert david.lastName == "sanchez"
assert david.langugages.size() == 2

