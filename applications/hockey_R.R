
#install and load readxl package
install.packages('readxl')
library(readxl)
# Install ggplot2 and ridgelie
library(ggridges)
library(ggplot2)
#remotes::install_github("wilkelab/ggridges")


# R reads excel sheets in the form xls or xlxs
#pit_tor_data <- read_excel("C:\\Users\\menam\\OneDrive\\Documents\\Career\\Hockey_CURM\\Hockey-Research\\excel-data\\PIT_TOR_single_game.xlsx")
#time <- pit_tor_data$time
#state <- pit_tor_data$StateTranstion
#ggplot(pit_tor_data, aes(x = time, y = state) ) + geom_point()


h_data <- read_excel("C:\\Users\\menam\\OneDrive\\Documents\\Career\\Hockey_CURM\\Hockey-Research\\excel-data\\R_Subset_Hockey_Data.xls")
View(h_data) 
h_time <-h_data$time
h_state <-h_data$TransitionState
h_gameID <- h_data$TransitionState
sub_h_gameID <- sample(x = h_gameID, size = 20) # random sample of games?
# I have so many games, which means I have duplicates for time
# I need to be able to split up the data by game in order to see how each game goes. 
#ggplot(pit_tor_data, aes(x = h_time, y = h_state) ) + geom_point()

# This is exaclty what I want, it is beautiful! However there is too much. I wish I could take a random sample of games....
ggplot(h_data, aes(x = h_state, y = h_gameID, fill = h_gameID)) +
  geom_density_ridges() +
  theme_ridges() + 
  theme(legend.position = "none")

# test with a subset of data
ggplot(h_data, aes(x = h_state, y = sub_h_gameID, fill = sub_h_gameID)) +
  geom_density_ridges() +
  theme_ridges() + 
  theme(legend.position = "none")


