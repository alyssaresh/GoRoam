# GoRoam
Passion Project for Zip Code Wilmington

GoRoam - 3 tier web app for traveling - [kanban board](https://github.com/users/alyssaresh/projects/1/views/1)

This travel app will suggest activities to do when a user is traveling in a new, unfamiliar place. When a user signs up, they will be asked what kind of experiences they like to have while traveling (ex: great food, shopping, relaxation, live music). This info will be saved to an account that keeps tract of the users interests. Any time they travel, they can enter the address of their hotel (or the city they’re traveling to), how many day’s they’ll be there, and any restrictions (budget, traveling with kids, traveling with pets, etc.). From this information, the app will suggest trip itinerary based on the users interests, the weather, and location. The app will try to pair experiences together if they are close by. Users can save a suggestion if they like, or swap out individual parts. When the trip is over, they can share photos or reviews of each part of their trip, and the app will use this info to make better suggestions next time.

MVP: In the early stages of my project, I will focus on returning places that correspond with a user’s interests by integrating OpenStreetMap and Foursquare Places API. I’ll achieve this with Java, mySQL, Spring, and React.

The first draft of my data model looks like this (12/17/2024):
<img width="646" alt="Screen Shot 2024-12-17 at 10 30 21 AM" src="https://github.com/user-attachments/assets/8e4efd5a-ae4c-4cb3-a53c-f4c27e8ce769" />

Here are UI mockups of my home page and search page: 
Home Page:
![Rectangle 54](https://github.com/user-attachments/assets/735b2080-e285-4c5c-893a-c6bd32b6e066)
Search Page:
![Component 1](https://github.com/user-attachments/assets/c048d2b6-1f84-414d-969b-b31f1c54aa9c)
