import time
import requests

# This function will pass your text to the machine learning model
# and return the top result with the highest confidence
def classify(text):
    key="1df6b4b0-5599-11f0-9cad-ed4d6d264911073a9b51-138a-40d8-b4ba-611cc69a1073"
    url = "https://machinelearningforkids.co.uk/api/scratch/"+ key + "/classify"

    response = requests.get(url, params={ "data" : text })

    if response.ok:
        responseData = response.json()
        topMatch = responseData[0]
        return topMatch
    else:
        response.raise_for_status()


def answer_question():
    eingabe = input("Give compliment!\n")
    klassifikation = classify(eingabe)
    kategorie = klassifikation["class_name"]
    confidence = klassifikation["confidence"]
    if confidence > 60:
        match kategorie:
            case "compliment":
                print(":3")
            case "insult":
                print(":'3")

    time.sleep(5)
    print("I demand more compliments >:3")

print("I demand compliments >:3")

while True:
    answer_question()