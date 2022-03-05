# Miles Mena
# State changes
state_numb = 0
my_dict = {}

for x in range(-2,3):
    for y in range(-4,5):
        for z in range(-2,3):
            my_list = []
            state_numb = state_numb + 1
            #print("State %d = (%d%d%d)" % (state_numb,x,y,z))
            my_list.append(x)
            my_list.append(y)
            my_list.append(z)
            my_dict[state_numb] = my_list
            print(my_dict)

            
