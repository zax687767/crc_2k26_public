# demo_secret_scanning.py
# UWAGA: To jest FAŁSZYWY token używany WYŁĄCZNIE do demo secret scanningu

GITHUB_TOKEN = "ghp_8FJ3kLQm7P2ZxR4A9CwE0YbTn6UDe5Hs"

def main():
    print("Hello from secret scanning demo!")
    # Symulacja użycia tokena
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}"
    }
    print("Headers prepared:", headers)

if __name__ == "__main__":
    main()
