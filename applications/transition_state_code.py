import pandas as pd
import openpyxl 
import numpy as np
file = '/Users/harveycampos/Work/summer research/fullgamedata.xlsx'
#find file directory 
x = pd.read_excel(file, sheet_name= 'Sheet1')
newdf = x[(x.count_x == 1) | (x.count_y == 1) | x.count_z ==1
# cna just switch arround the varibles
#print(newdf)
newdf.to_excel('refinedfullgamedata.xlsx') 
#makes new excel file with refined data
