package canonical

Person p1 = new Person("david","sanchez","davidsanchez@gmail.com")
Person p2 = new Person("david","sanchez","davidsanchez@gmail.com")

assert p1 == p2
println p1.toString()