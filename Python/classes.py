from typing import Self


class Pessoa:
  def __init__(self, nome, idade):
      self.__nome = nome
      self.__idade = idade
      self.__falando = False
      self.__comendo = False

  @property
  def nome(self):
      return self.__nome
    
  @nome.setter
  def nome(self, nome):
    if isinstance(nome, str) and nome.strip():
        self.__nome = nome
    else:
        print("Nome deve ser uma string não vazia.")

  @property
  def idade(self):
      return self.__idade

  @idade.setter
  def idade(self, idade):
      if isinstance(idade, int) and idade >= 0:
          self.__idade = idade
      else:
          print("Idade deve ser um número inteiro não negativo.")

  @property
  def falando(self):
      return self.__falando

  @property
  def comendo(self):
      return self.__comendo

  def comer(self, comida):
      if self.__falando:
          print(f"{self.__nome} não pode comer enquanto fala.")
      else:
          self.__comendo = True
          print(f"{self.__nome} está comendo {comida}.")

  def falar(self, assunto):
      if self.__comendo:
          print(f"{self.__nome} não pode falar enquanto come.")
      else:
          self.__falando = True
          print(f"{self.__nome} está falando sobre {assunto}.")

  def parar_comer(self):
      if self.__comendo:
          self.__comendo = False
          print(f"{self.__nome} parou de comer.")
      else:
          print(f'{self.__nome} não estava comendo.')

  def parar_falar(self):
      if self.__falando:
          self.__falando = False
          print(f'{self.__nome} parou de falar.')
      else:
          print(f"{self.__nome} não estava falando.")


class Carro:
  def __init__(self):
    self._velocidade = 0
  
  @property
  def velocidade(self):
    return self._velocidade
  
  @velocidade.setter
  def velocidade(self, v):
    if 0 <= v <= 200:
      self._velocidade = v
    else:
      print("Velocidade inválida")


  class Conta:
    def __int__(self, nome, saldo=0):
      self.__nome = nome
      self.__saldo = saldo

    @property
    def nome(self):
      return self.__nome
    @property
    def saldo(self):
      return self.__saldo

    @saldo.setter
    def saldo(self):
      return self.__saldo

    def depositar(self, valor):
      if valor > 0:
        self.__saldo += valor
      else:
        print("Valor inválido")
    def saque(self, valor):
      if valor > 0:
        if self.__saldo > 0:
          if self.__saldo >= valor:
              self.__saldo -= valor
        else:
          print("Saldo insuficiente")
      else:
        print("Valor inválido")