import random

nomes = []
nomes1 = []
sorteio = []
n = int(input("Digite o número de pessoas: "))
for idx in range(0, n):
    nomes.append(input("Nome: "))

ans = "s"
while ans == "s":
    sortLoop = 1
    while sortLoop == 1:
        sorteio.clear()
        nomes1.clear()
        for nome in range(n):
            nomes1.append(nomes[nome])

        for idx in range(n):
            x = random.choice(nomes1)
            if idx == (n - 1) and x == nomes[idx]:
                sortLoop = 1
            else:
                while x == nomes[idx]:
                    x = random.choice(nomes1)
                sorteio.append(x)
                nomes1.remove(x)
                sortLoop = 2
    print("\n")
    for i in range(n):
        print(nomes[i], " presenteia ", sorteio[i])
        print("\n")
    ans = str(input("Digite s para sortear novamente: "))
