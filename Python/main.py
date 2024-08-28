from classes import Pessoa
from classes import Carro

pessoa1= Pessoa("João", 20)
pessoa1.falar("Python")
pessoa1.comer("Feijao")
pessoa1.parar_falar()
pessoa1.comer("Feijao")

c = Carro()
c.velocidade = 300 # setter
print(c.velocidade) # getter