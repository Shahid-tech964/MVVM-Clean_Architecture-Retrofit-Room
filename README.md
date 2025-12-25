<h1 align="center">MVVM + Clean Architecture (Retrofit & Room)</h1>

<p align="center">
  A beginner-friendly Android project demonstrating <b>MVVM</b> and <b>Clean Architecture</b> using 
  <b>Jetpack Compose</b>, <b>Room</b>, and <b>Retrofit</b>.
</p>

<hr/>

<h2>📌 What is MVVM?</h2>

<p>
<b>MVVM (Model–View–ViewModel)</b> is an Android architecture pattern that helps separate UI logic from business logic.
</p>

<ul>
  <li><b>Model</b> → Holds data (Room entities, API models)</li>
  <li><b>View</b> → UI layer (Jetpack Compose)</li>
  <li><b>ViewModel</b> → Manages UI state and business logic</li>
</ul>

<p>
MVVM makes code easier to test, maintain, and scale.
</p>

<hr/>

<h2>📌 What is Clean Architecture?</h2>

<p>
<b>Clean Architecture</b> is a layered architecture that separates the app into independent layers.
Each layer has a single responsibility and depends only on abstractions.
</p>

<h3>Clean Architecture Layers</h3>

<ul>
  <li><b>Presentation</b> → UI + ViewModel</li>
  <li><b>Domain</b> → Business logic (UseCases, Repository interfaces)</li>
  <li><b>Data</b> → Room, Retrofit, Repository implementations</li>
</ul>

<p>
The <b>Domain layer</b> does not depend on Android or any framework.
</p>

<hr/>

<h2>🤔 When to use MVVM vs Clean Architecture?</h2>

<table border="1" cellpadding="8" cellspacing="0">
  <tr>
    <th>Use Case</th>
    <th>Recommended</th>
  </tr>
  <tr>
    <td>Small / Medium apps</td>
    <td>MVVM only</td>
  </tr>
  <tr>
    <td>Large / Scalable apps</td>
    <td>MVVM + Clean Architecture</td>
  </tr>
  <tr>
    <td>Simple CRUD apps</td>
    <td>MVVM</td>
  </tr>
  <tr>
    <td>API + Database + Business rules</td>
    <td>MVVM + Clean Architecture</td>
  </tr>
</table>

<hr/>

<h2>🔄 Project Workflow</h2>

<pre>
UI (Compose)
    ↓
ViewModel
    ↓
UseCase (Domain)
    ↓
Repository Interface
    ↓
Repository Implementation (Data)
    ↓
Room / Retrofit
</pre>

<hr/>

<h2>🧩 Architecture Diagram</h2>

<pre>
Presentation Layer
 ├── UI (Compose)
 ├── ViewModel
      ↓
Domain Layer
 ├── UseCases
 ├── Repository Interfaces
      ↓
Data Layer
 ├── Retrofit (API)
 ├── Room (Database)
 ├── Repository Implementations
</pre>

<hr/>

<h2>🗄️ Features Implemented</h2>

<ul>
  <li>✔ MVVM Architecture</li>
  <li>✔ Clean Architecture Layering</li>
  <li>✔ Retrofit API integration</li>
  <li>✔ Room Database CRUD operations</li>
  <li>✔ Kotlin Coroutines & Flow</li>
  <li>✔ Repository Pattern</li>
  <li>✔ Mapper (Data ↔ Domain models)</li>
</ul>

<hr/>

<h2>🧪 CRUD Operations (Room)</h2>

<ul>
  <li>Add record</li>
  <li>Read records using Flow</li>
  <li>Delete record using ID</li>
</ul>

<p>
All database operations are handled inside the <b>Data layer</b> and exposed to the UI through the <b>Domain layer</b>.
</p>

<hr/>

<h2>📡 API Integration (Retrofit)</h2>

<p>
API calls are implemented using Retrofit and follow the same Clean Architecture flow:
</p>

<pre>
UI → ViewModel → UseCase → Repository → Retrofit
</pre>

<hr/>

<h2>🛠 Tech Stack</h2>

<ul>
  <li>Kotlin</li>
  <li>Jetpack Compose</li>
  <li>Room Database</li>
  <li>Retrofit</li>
  <li>Coroutines & Flow</li>
  <li>MVVM</li>
  <li>Clean Architecture</li>
</ul>

<hr/>

<h2>🎯 Purpose of This Project</h2>

<p>
This project is created to understand:
</p>

<ul>
  <li>How MVVM works in real projects</li>
  <li>Why Clean Architecture is useful</li>
  <li>How to structure scalable Android apps</li>
  <li>How to combine API + Database cleanly</li>
</ul>

<hr/>

<h2>📎 Author</h2>

<p>
<b>Shahid</b><br/>
Android Developer (MVVM • Clean Architecture • Kotlin)
</p>

<p>
🔗 GitHub: <a href="https://github.com/Shahid-tech964">Shahid-tech964</a>
</p>
