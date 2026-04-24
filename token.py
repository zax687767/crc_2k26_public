# demo_secret_scanning.py
# UWAGA: To jest FAŁSZYWY token używany WYŁĄCZNIE do demo secret scanningu

GITHUB_TOKEN = "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"

def main():
    print("Hello from secret scanning demo!")
    # Symulacja użycia tokena
    headers = {
        "Authorization": f"token {GITHUB_TOKEN}"
    }
    print("Headers prepared:", headers)

if __name__ == "__main__":
    main()
