Ishtyaq Habib and Omer Syed:
Assignment 3 SuperMarket

This program takes a number of customers in a supermarket,
then places them in cashier queue. The customers have an AI which allows them
to leave their current line when another line is shorter.
The cashiers have random speeds of serving customers.

Features: All actors in the supermarket have their own AI. 

ReadMe:This program is poorly documented. Also, last minute testing proved that 
This program tends to not complete on Macs if the number of customers are greater
than 30, we believe this is because OSX has a check in place preventing large numbers of threads.
On PC this check does not trigger so even 1000 customers works, however the speed
of serving suffers because of the large number of threads and synchronized methods
being used between them.