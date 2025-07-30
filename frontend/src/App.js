import React, { useEffect, useState } from 'react';

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/data")
      .then(res => res.json())
      .then(setData)
      .catch(err => console.error("Error fetching data:", err));
  }, []);

  return (
    <div style={{ padding: '1rem', fontFamily: 'Arial' }}>
      <h1>📰 Scraped News</h1>
      <ul>
        {data.map(item => (
          <li key={item.id} style={{ marginBottom: '8px' }}>
            <a href={item.url} target="_blank" rel="noopener noreferrer">
              {item.title}
            </a>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
