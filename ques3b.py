# Accept input from the user
input_words = input("Enter a comma-separated sequence of words: ")

# Split the input string into a list of words
words_list = input_words.split(", ")

# Sort the list alphabetically
sorted_words = sorted(words_list)

# Join the sorted list back into a comma-separated string
output_words = ", ".join(sorted_words)

# Print the sorted sequence
print("Sorted sequence:", output_words)
