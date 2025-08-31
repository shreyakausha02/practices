import tkinter as tk
from tkinter import messagebox

def button_click(number):
    current = entry.get()
    entry.delete(0, tk.END)
    entry.insert(0, current + str(number))

def clear():
    entry.delete(0, tk.END)

def calculate():
    try:
        result = eval(entry.get())  # Evaluate the expression
        entry.delete(0, tk.END)
        entry.insert(0, str(result))
    except Exception as e:
        messagebox.showerror("Error", "Invalid Input")

# Create the main window
root = tk.Tk()
root.title("Calculator")

# Entry widget to display the current input
entry = tk.Entry(root, width=16, font=('Arial', 24), borderwidth=5, relief=tk.RIDGE, justify='right')
entry.grid(row=0, column=0, columnspan=4)

# Button layout
buttons = [
    ('7', 1, 0), ('8', 1, 1), ('9', 1, 2), ('/', 1, 3),
    ('4', 2, 0), ('5', 2, 1), ('6', 2, 2), ('*', 2, 3),
    ('1', 3, 0), ('2', 3, 1), ('3', 3, 2), ('-', 3, 3),
    ('C', 4, 0), ('0', 4, 1), ('=', 4, 2), ('+', 4, 3),
]

# Create buttons dynamically
for (text, row, col) in buttons:
    if text == '=':
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 18),
                           command=calculate)
    elif text == 'C':
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 18),
                           command=clear)
    else:
        button = tk.Button(root, text=text, width=5, height=2, font=('Arial', 18),
                           command=lambda t=text: button_click(t))
    button.grid(row=row, column=col, padx=5, pady=5)

# Run the application
root.mainloop()
