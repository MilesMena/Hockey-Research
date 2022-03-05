# Miles Mena
#import numpy as np

#import matplotlib.pyplot as plt


file = open("CHI_MIN_value_tabs.txt", "r").read().splitlines()
x = [0]
y = []
for parts in file:
    prt = parts.split("\t")
    for i in range(len(prt)):
        #print(prt[i])
        if float(prt[i]) >= 1:
            x.append(prt[i])
        else:
            y.append(prt[i])
y.remove("0")
for i in range(len(x)):
    x[i] = float(x[i])
    print(x[i])

print("")

for i in range(len(y)):
    y[i] = float(y[i])
    print(y[i])
