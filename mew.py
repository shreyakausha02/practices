import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

# Creating the dataset as a DataFrame
data = {
    "Food": ["Meat", "Banana", "Avocados", "Sweet Potatoes", "Spinach", 
             "Watermelon", "Coconut water", "Beans", "Legumes", "Tomato"],
    "Calories": [250, 130, 140, 120, 20, 20, 10, 50, 40, 19],
    "Potassium": [40, 55, 20, 30, 40, 32, 10, 26, 25, 20],
    "Fat": [8, 5, 3, 6, 1, 1.5, 0, 2, 1.5, 2.5]
}

df = pd.DataFrame(data)

# Bar chart for Calories
plt.figure(figsize=(12, 6))
df.plot(x="Food", y="Calories", kind="bar", color="lightblue", legend=False)
plt.title("Calories in Different Foods", fontsize=14)
plt.ylabel("Calories", fontsize=12)
plt.xticks(rotation=45, fontsize=10)
plt.tight_layout()
plt.show()

# Scatter plot for Potassium vs Fat
plt.figure(figsize=(8, 5))
plt.scatter(df["Potassium"], df["Fat"], color="green", label="Potassium vs Fat", marker="o")
for i, food in enumerate(df["Food"]):  # Annotating points with food names
    plt.text(df["Potassium"][i] + 0.5, df["Fat"][i] + 0.1, food, fontsize=9)
plt.xlabel("Potassium (mg)", fontsize=12)
plt.ylabel("Fat (g)", fontsize=12)
plt.title("Potassium vs Fat Content in Foods", fontsize=14)
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()

# Grouped bar chart for all nutrients
x = np.arange(len(df["Food"]))  # the label locations
width = 0.25  # the width of the bars

plt.figure(figsize=(12, 6))
plt.bar(x - width, df["Calories"], width, label="Calories", color="skyblue")
plt.bar(x, df["Potassium"], width, label="Potassium", color="orange")
plt.bar(x + width, df["Fat"], width, label="Fat", color="lightgreen")

# Formatting the plot
plt.xlabel("Food Items", fontsize=12)
plt.ylabel("Nutrient Value", fontsize=12)
plt.title("Nutrient Comparison of Foods", fontsize=14)
plt.xticks(x, df["Food"], rotation=45, fontsize=10)
plt.legend()
plt.tight_layout()
plt.show()
