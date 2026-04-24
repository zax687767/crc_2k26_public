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
