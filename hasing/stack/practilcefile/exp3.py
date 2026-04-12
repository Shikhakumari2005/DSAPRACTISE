# # import heapq

# # def ucs(graph, start, goal):
# #     visited = set()
    
# #     # Priority Queue → (cost, node)
# #     pq = [(0, start)]

# #     while pq:
# #         cost, node = heapq.heappop(pq)

# #         if node == goal:
# #             print(f"Goal reached with cost: {cost}")
# #             return

# #         if node not in visited:
# #             print(f"{node} with cost {cost}")
# #             visited.add(node)

# #             for neighbor, weight in graph[node]:
# #                 if neighbor not in visited:
# # #                     heapq.heappush(pq, (cost + weight, neighbor))


# # # # Graph
# # # # graph = {
# # # #     'A': [('B', 1), ('C', 4)],
# # # #     'B': [('D', 2), ('E', 5)],
# # # #     'C': [('F', 1)],
# # # #     'D': [],
# # # #     'E': [('F', 1)],
# # # #     'F': []
# # # # }

# # # # # Function Call
# # # # ucs(graph, 'A', 'F')










# # # def dls(graph, node, limit, visited=None):
# # #     if visited is None:
# # #         visited = set()

# # #     if limit < 0:
# # #         return

# # #     print(node, end=" ")
# # #     visited.add(node)

# #     for neighbor in graph[node]:
# #         if neighbor not in visited:
# #             dls(graph, neighbor, limit - 1, visited)


# # # Graph
# # graph = {
# #     'A': ['B', 'C'],
# #     'B': ['D', 'E'],
# #     'C': ['F'],
# #     'D': [],
# #     'E': [],
# #     'F': []
# # }

# # # Limit
# # limit = 2

# # # Function Call
# # dls(graph, 'A', limit)







# import heapq

# def a_star(graph, heuristic, start, goal):
#     open_list = []
#     heapq.heappush(open_list, (0, start))

#     g_cost = {start: 0}
#     visited = set()

#     while open_list:
#         f, node = heapq.heappop(open_list)

#         if node == goal:
#             print("Goal reached with cost:", g_cost[node])
# #             return

# #         if node not in visited:
# #             print(node, "visited")
# #             visited.add(node)

# #             for neighbor, cost in graph[node]:
# #                 new_g = g_cost[node] + cost

# #                 if neighbor not in g_cost or new_g < g_cost[neighbor]:
# #                     g_cost[neighbor] = new_g
# #                     f_cost = new_g + heuristic[neighbor]
# #                     heapq.heappush(open_list, (f_cost, neighbor))


# # Graph
# # graph = {
# #     'A': [('B', 1), ('C', 3)],
# #     'B': [('D', 3), ('E', 1)],
# #     'C': [('F', 5)],
# #     'D': [],
# #     'E': [('F', 2)],
# #     'F': []
# # }

# # # Heuristic
# # heuristic = {
# #     'A': 6,
# #     'B': 4,
# #     'C': 5,
# #     'D': 3,
# #     'E': 1,
# #     'F': 0
# # }

# # a_star(graph, heuristic, 'A', 'F')


# def ida_star(graph, heuristic, start, goal):

#     def dfs(path, g, limit):
#         node = path[-1]
#         f = g + heuristic[node]

#         if f > limit:
#             return f

#         if node == goal:
#             print("Path found:", path)
#             return True

#         min_cost = float('inf')

#         for neighbor, cost in graph[node]:
#             if neighbor not in path:
#                 temp = dfs(path + [neighbor], g + cost, limit)

#                 if temp is True:
#                     return True

#                 min_cost = min(min_cost, temp)

#         return min_cost

#     limit = heuristic[start]

#     while True:
#         result = dfs([start], 0, limit)

#         if result is True:
#             return

#         if result == float('inf'):
#             print("No path found")
#             return

#         limit = result


# # Graph representation
# graph = {
#     'A': [('B', 1), ('C', 3)],
#     'B': [('D', 3), ('E', 1)],
#     'C': [('F', 5)],
#     'D': [],
#     'E': [('F', 2)],
#     'F': []
# }

# # Heuristic values
# heuristic = {
#     'A': 4,
#     'B': 2,
#     'C': 4,
#     'D': 6,
#     'E': 1,
#     'F': 0
# }

# # Function call
# ida_star(graph, heuristic, 'A', 'F')








# import heapq

# def best_first_search(graph, heuristic, start, goal):
#     visited = set()
#     pq = []

#     heapq.heappush(pq, (heuristic[start], start))

#     while pq:
#         h, node = heapq.heappop(pq)

#         if node == goal:
#             print("Goal reached:", node)
#             return

#         if node not in visited:
#             print(node, "visited")
#             visited.add(node)

#             for neighbor in graph[node]:
#                 if neighbor not in visited:
#                     heapq.heappush(pq, (heuristic[neighbor], neighbor))


# # Graph representation
# graph = {
#     'A': ['B', 'C'],
#     'B': ['D', 'E'],
#     'C': ['F'],
#     'D': [],
#     'E': ['F'],
#     'F': []
# }

# # Heuristic values
# heuristic = {
#     'A': 6,
#     'B': 4,
#     'C': 5,
#     'D': 3,
#     'E': 1,
#     'F': 0
# }

# # Function call
# best_first_search(graph, heuristic, 'A', 'F')







# import math

# # Term Frequency
# def tf(doc, term):
#     return doc.count(term) / len(doc)

# # Inverse Document Frequency
# def idf(docs, term):
#     count = sum(1 for doc in docs if term in doc)
#     return math.log(len(docs) / count)

# # TF-IDF
# def tfidf(docs, doc, term):
#     return tf(doc, term) * idf(docs, term)

# # Example
# doc1 = ["ai", "is", "powerful", "ai", "future"]
# doc2 = ["ai", "is", "changing", "world"]

# docs = [doc1, doc2]

# print("TF-IDF of 'ai':", tfidf(docs, doc1, "ai"))


# def f(x):
#     return -x*x + 10

# def steepest_hill_climb(start):
#     current = start
    
#     while True:
#         best = current
        
#         for i in [-1, 0, 1]:
#             neighbor = current + i
#             if f(neighbor) > f(best):
#                 best = neighbor
        
#         if best == current:
#             break
        
#         current = best
    
#     return current

# print("Steepest:", steepest_hill_climb(0))



# import random

# def f(x):
#     return -x*x + 10

# def stochastic_hill_climb(start):
#     current = start
    
#     while True:
#         neighbor = current + random.choice([-1, 1])
        
#         if f(neighbor) > f(current):
#             current = neighbor
#         else:
#             break
    
#     return current

# print("Stochastic:", stochastic_hill_climb(0))


# import random

# def f(x):
#     return -x*x + 10

# def first_choice_hill_climb(start):
#     current = start
    
#     while True:
#         found = False
        
#         for _ in range(10):
#             neighbor = current + random.choice([-1, 1])
            
#             if f(neighbor) > f(current):
#                 current = neighbor
#                 found = True
#                 break
        
#         if not found:
#             break
    
#     return current

# print("First Choice:", first_choice_hill_climb(0))




# import random

# def f(x):
#     return -x*x + 10

# def steepest_hill_climb(start):
#     current = start
    
#     while True:
#         best = current
        
#         for i in [-1, 0, 1]:
#             neighbor = current + i
#             if f(neighbor) > f(best):
#                 best = neighbor
        
#         if best == current:
#             break
        
#         current = best
    
#     return current

# def random_restart(restarts):
#     best = float('-inf')
    
#     for _ in range(restarts):
#         start = random.randint(-5, 5)
#         result = steepest_hill_climb(start)
        
#         if f(result) > f(best):
#             best = result
    
#     return best

# print("Random Restart:", random_restart(5))


# // 6
# def f(x):
#     return -x*x + 10

# def local_beam_search(k):
#     states = [-2, 0, 2]
    
#     while True:
#         neighbors = []
        
#         for state in states:
#             neighbors.append(state - 1)
#             neighbors.append(state + 1)
        
#         neighbors.sort(key=lambda x: f(x), reverse=True)
        
#         new_states = neighbors[:k]
        
#         if new_states == states:
#             break
        
#         states = new_states
    
#     return states[0]

# print("Local Beam:", local_beam_search(3))



# import math

# # Training Data
# spam_emails = [
#     ["win", "money", "now"],
#     ["free", "offer", "win"],
#     ["win", "cash", "prize"]
# ]

# ham_emails = [
#     ["meeting", "schedule"],
#     ["project", "discussion"],
#     ["lunch", "meeting"]
# ]

# # Vocabulary
# vocab = set(word for email in spam_emails + ham_emails for word in email)

# # Count words
# def word_count(emails):
#     counts = {}
#     for email in emails:
#         for word in email:
#             counts[word] = counts.get(word, 0) + 1
#     return counts

# spam_counts = word_count(spam_emails)
# ham_counts = word_count(ham_emails)

# # Total words
# total_spam = sum(spam_counts.values())
# total_ham = sum(ham_counts.values())

# # Naive Bayes classification
# def classify(email):
#     spam_prob = math.log(0.5)
#     ham_prob = math.log(0.5)
    
#     for word in email:
#         # Laplace smoothing
#         spam_word = (spam_counts.get(word, 0) + 1) / (total_spam + len(vocab))
#         ham_word = (ham_counts.get(word, 0) + 1) / (total_ham + len(vocab))
        
#         spam_prob += math.log(spam_word)
#         ham_prob += math.log(ham_word)
    
#     return "Spam" if spam_prob > ham_prob else "Not Spam"

# # Test Email
# test_email = ["win", "free", "money"]
# print("Email Classification:", classify(test_email))




# import math

# # Training Data
# spam_emails = [
#     ["win", "money", "now"],
#     ["free", "offer", "win"],
#     ["win", "cash", "prize"]
# ]

# ham_emails = [
#     ["meeting", "schedule"],
#     ["project", "discussion"],
#     ["lunch", "meeting"]
# ]

# # Vocabulary
# vocab = set(word for email in spam_emails + ham_emails for word in email)

# # Count words
# def word_count(emails):
#     counts = {}
#     for email in emails:
#         for word in email:
#             counts[word] = counts.get(word, 0) + 1
#     return counts

# spam_counts = word_count(spam_emails)
# ham_counts = word_count(ham_emails)

# # Total words
# total_spam = sum(spam_counts.values())
# total_ham = sum(ham_counts.values())

# # Naive Bayes classification
# def classify(email):
#     spam_prob = math.log(0.5)
#     ham_prob = math.log(0.5)
    
#     for word in email:
#         # Laplace smoothing
#         spam_word = (spam_counts.get(word, 0) + 1) / (total_spam + len(vocab))
#         ham_word = (ham_counts.get(word, 0) + 1) / (total_ham + len(vocab))
        
#         spam_prob += math.log(spam_word)
#         ham_prob += math.log(ham_word)
    
#     return "Spam" if spam_prob > ham_prob else "Not Spam"

# # Test Email
# test_email = ["win", "free", "money"]
# print("Email Classification:", classify(test_email))




# Membership functions

# def poor(x):
#     if x <= 40:
#         return 1
#     elif 40 < x < 50:
#         return (50 - x) / 10
#     else:
#         return 0

# def average(x):
#     if 40 < x < 60:
#         return (x - 40) / 20
#     elif 60 <= x < 70:
#         return (70 - x) / 10
#     else:
#         return 0

# def good(x):
#     if 60 < x < 75:
#         return (x - 60) / 15
#     elif 75 <= x < 85:
#         return (85 - x) / 10
#     else:
#         return 0

# def excellent(x):
#     if x >= 85:
#         return 1
#     elif 75 < x < 85:
#         return (x - 75) / 10
#     else:
#         return 0

# # Fuzzy grading
# def fuzzy_grade(marks):
#     p = poor(marks)
#     a = average(marks)
#     g = good(marks)
#     e = excellent(marks)
    
#     grades = {
#         "Poor": p,
#         "Average": a,
#         "Good": g,
#         "Excellent": e
#     }
    
#     # Get highest membership
#     final_grade = max(grades, key=grades.get)
    
#     return final_grade, grades

# # Input
# marks = int(input("Enter marks: "))

# grade, details = fuzzy_grade(marks)

# print("Final Grade:", grade)
# print("Membership Values:", details)



# Keyphrase Extraction using TF-IDF

# import math
# from collections import Counter

# # Sample scientific article
# text = """
# Machine learning is widely used in scientific research.
# Machine learning models help in data analysis and prediction.
# Scientific methods rely on data and experiments.
# """

# # Preprocess
# words = text.lower().split()

# # Remove simple stopwords
# stopwords = {"is", "in", "on", "and", "the", "a", "of"}
# words = [w for w in words if w not in stopwords]

# # Term Frequency
# tf = Counter(words)

# # IDF (since single document, use fake corpus idea)
# def idf(term, doc):
#     return math.log(len(doc) / (1 + doc.count(term)))

# # TF-IDF score
# tfidf = {}
# for word in tf:
#     tfidf[word] = tf[word] * idf(word, words)

# # Sort keywords
# keywords = sorted(tfidf.items(), key=lambda x: x[1], reverse=True)

# # Extract top keywords
# print("Top Keywords:")
# for word, score in keywords[:5]:
#     print(word, ":", round(score, 3))



# Stock Sentiment Analysis from Headlines

# Sample headlines
# headlines = [
#     "Company reports huge profit and growth",
#     "Stock faces major loss and decline",
#     "Strong performance boosts investor confidence",
#     "Market crash causes panic among investors"
# ]

# # Positive & Negative word lists
# positive_words = {"profit", "growth", "strong", "boost", "gain", "rise"}
# negative_words = {"loss", "decline", "crash", "fall", "panic"}

# def analyze_sentiment(headline):
#     words = headline.lower().split()
    
#     pos = sum(1 for w in words if w in positive_words)
#     neg = sum(1 for w in words if w in negative_words)
    
#     if pos > neg:
#         return "Positive 📈"
#     elif neg > pos:
#         return "Negative 📉"
#     else:
#         return "Neutral"

# # Analyze all headlines
# for h in headlines:
#     print(h)
#     print("Sentiment:", analyze_sentiment(h))
#     print()



import tensorflow as tf
from tensorflow.keras import layers, models
import matplotlib.pyplot as plt

# Load MNIST dataset
(x_train, y_train), (x_test, y_test) = tf.keras.datasets.mnist.load_data()

# Normalize data (0–255 → 0–1)
x_train = x_train / 255.0
x_test = x_test / 255.0

# Reshape to include channel (28,28,1)
x_train = x_train.reshape(-1, 28, 28, 1)
x_test = x_test.reshape(-1, 28, 28, 1)

# ---------------- CNN Model ----------------
model = models.Sequential()

# a. Input + Convolution layer
model.add(layers.Conv2D(32, (3,3), activation='relu', input_shape=(28,28,1)))

# b. MaxPooling
model.add(layers.MaxPooling2D((2,2)))

# c. Another Conv + Pooling
model.add(layers.Conv2D(64, (3,3), activation='relu'))
model.add(layers.MaxPooling2D((2,2)))

# d. Flatten + Dense
model.add(layers.Flatten())
model.add(layers.Dense(64, activation='relu'))

# e. Output layer (Softmax for 10 classes)
model.add(layers.Dense(10, activation='softmax'))

# Compile model
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])

# Train model
model.fit(x_train, y_train, epochs=5, validation_data=(x_test, y_test))

# Evaluate
test_loss, test_acc = model.evaluate(x_test, y_test)
print("Test Accuracy:", test_acc)

# Predict example
import numpy as np
pred = model.predict(x_test[:1])
print("Predicted Digit:", np.argmax(pred))

# Show image
plt.imshow(x_test[0].reshape(28,28), cmap='gray')
plt.title("Sample Test Image")
plt.show()