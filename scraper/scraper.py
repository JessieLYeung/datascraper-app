import requests
from bs4 import BeautifulSoup

# Step 1: Scrape article titles and URLs
url = "https://news.ycombinator.com/"
res = requests.get(url)
soup = BeautifulSoup(res.text, 'html.parser')

items = []
for item in soup.select('.titleline a'):
    items.append({
        'title': item.text,
        'url': item['href']
    })

# Step 2: Send to Spring Boot API
for data in items[:5]:  # limit to top 5 articles
    try:
        response = requests.post("http://localhost:8080/api/data", json=data)
        print(f"Posted: {data['title']} | Status: {response.status_code}")
    except Exception as e:
        print(f"Failed to post: {data['title']}\nError: {e}")
