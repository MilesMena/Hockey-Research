file = open("interpolating_polynomials.txt", "r").read().splitlines()
polynomial_parts = ""
for junk in file:
    polynomial_parts += junk
new_poly = ""
for i in range(len(polynomial_parts)):
    if polynomial_parts[i] == "*":
        new_poly += "." + polynomial_parts[i]
    else: 
        new_poly += polynomial_parts[i]
    
print(new_poly)
