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








import heapq

def best_first_search(graph, heuristic, start, goal):
    visited = set()
    pq = []

    heapq.heappush(pq, (heuristic[start], start))

    while pq:
        h, node = heapq.heappop(pq)

        if node == goal:
            print("Goal reached:", node)
            return

        if node not in visited:
            print(node, "visited")
            visited.add(node)

            for neighbor in graph[node]:
                if neighbor not in visited:
                    heapq.heappush(pq, (heuristic[neighbor], neighbor))


# Graph representation
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

# Heuristic values
heuristic = {
    'A': 6,
    'B': 4,
    'C': 5,
    'D': 3,
    'E': 1,
    'F': 0
}

# Function call
best_first_search(graph, heuristic, 'A', 'F')