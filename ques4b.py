import re

def validate_passwords(passwords):
    valid_passwords = []
    for password in passwords:
        # Check if the password matches all the criteria
        if (6 <= len(password) <= 12 and             # Length criteria
            re.search(r"[a-z]", password) and        # At least 1 lowercase letter
            re.search(r"[A-Z]", password) and        # At least 1 uppercase letter
            re.search(r"[0-9]", password) and        # At least 1 digit
            re.search(r"[$#@]", password)):          # At least 1 special character
            valid_passwords.append(password)
    return valid_passwords

# Input from the user
input_passwords = input("Enter comma-separated passwords: ")

# Split the input into a list
password_list = input_passwords.split(", ")

# Validate passwords
valid = validate_passwords(password_list)

# Output the valid passwords
print("Valid passwords:", ", ".join(valid))
