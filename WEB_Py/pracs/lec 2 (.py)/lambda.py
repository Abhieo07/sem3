people = [
    {"Name": "Harry", "House": "Gryffindor"},
    {"Name": "Cho", "House": "Ravenclaw"},
    {"Name": "Draco", "House": "Slytherine"}
]


people.sort(key=lambda person: person["Name"])

print(people)