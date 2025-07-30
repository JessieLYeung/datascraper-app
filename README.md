# 📰 Full Stack Data Scraper App

This is a beginner-friendly full stack web app that scrapes data from Hacker News using Python, stores it in a Spring Boot + SQL backend, and displays it in a React frontend.

---

## 🔧 Tech Stack
- **Python** – Web scraper using `requests` + `BeautifulSoup`
- **Java + Spring Boot** – REST API backend
- **H2 Database** – In-memory SQL for development
- **ReactJS** – Frontend UI

---

## 📁 Folder Structure
```
datascraper-app/
├── backend/    # Spring Boot API + H2 DB
├── frontend/   # ReactJS frontend
└── scraper/    # Python script for scraping
```

---

## 🚀 How to Run This Project

### 1. Clone the Repo
```bash
git clone https://github.com/YOUR_USERNAME/datascraper-app.git
cd datascraper-app
```

### 2. Run the Backend (Spring Boot)
```bash
cd backend
./mvnw spring-boot:run   # macOS/Linux
# or
.\mvnw.cmd spring-boot:run   # Windows
```

### 3. Run the Scraper (Python)
```bash
cd ../scraper
pip install requests beautifulsoup4
python scraper.py
```

### 4. Run the Frontend (React)
```bash
cd ../frontend
npm install
npm start
```

---

## 🌐 API Endpoints
| Method | URL                 | Description          |
|--------|---------------------|----------------------|
| GET    | `/api/data`         | List all data items  |
| POST   | `/api/data`         | Add new data item    |

---

## 🧠 Why This Project?
This app is perfect for learning full stack development with real-world use:
- Web scraping
- REST API design
- Database integration
- Frontend data fetching
