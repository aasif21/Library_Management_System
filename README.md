# Library Management System

A full-stack library management system with a Node.js backend and Jetpack Compose Android frontend.

## Frontend (Android)

### Technologies Used
- Kotlin
- Jetpack Compose
- Material 3 UI components
- Navigation Graphs for screen navigation
- ViewModel for state management
- Coil library for image loading
- Retrofit for API communication
- OkHttp Logger for request/response logging

### Features
- Material 3 design for a modern UI
- Bottom navigation bar with Home, Update, and Modify sections
- Real-time book search using Google Books API
- Asynchronous image loading from Google Books API
- Book details retrieval by ID
- Logout functionality

### UI Components
- Scaffold for consistent app structure
- Top app bar
- Alert dialogs for user interactions
- Circular progress indicator for loading states
- Snackbars for user notifications

### Navigation
- Implemented using Jetpack Navigation component with NavGraphs
- Nested navigation for complex screen hierarchies

### Architecture
- MVVM (Model-View-ViewModel) architecture
- Data models for structured data representation
- ViewModels for managing UI-related data and business logic
- Repository pattern for data operations

### State Management
- Use of StateFlow and MutableStateFlow for reactive state management
- ViewModel to store and manage UI-related data in a lifecycle conscious way

## Backend

### Technologies Used
- Node.js
- Express.js
- Firebase for authentication and database

### Features
- User authentication (Sign up, Login, Logout)
- CRUD operations for books:
  - Add a new book
  - Get all books
  - Get a book by ID
  - Update book information
  - Delete a book

## Getting Started

### Prerequisites
- Node.js and npm installed
- Android Studio with Kotlin support
- Firebase account and project set up

### Installation

1. Clone the repository
git clone https://github.com/aasif21/Library_Management_System
Copy
2. Backend Setup
cd backend
npm install
Copy- Configure Firebase credentials in the backend

3. Frontend Setup
- Open the `frontend` folder in Android Studio
- Sync Gradle and install dependencies

### Running the Application

1. Start the backend server
cd backend
npm start
Copy
2. Run the Android app from Android Studio

## API Routes

## API Routes

- POST /api/add_book - Add a new book
- GET /api/get_all_books - Get all books
- DELETE /api/delete_book_id/:id - Delete a book by ID
- GET /api/get_book_id/:id - Get a book by ID
- PUT /api/update_book_id/:id - Update a book by ID
- POST /api/login - User login
- POST /api/signup - User registration

## Deployment

### Backend
The backend of this project is hosted on Render for free.

- **Render**: The Node.js backend is deployed on Render's free tier.
- Base URL: `https://library-management-server-2mgq.onrender.com`
- Note: Due to free-tier limitations, the server may experience cold starts after periods of inactivity.

### Frontend
- The Android app can be built and distributed as an APK.
- Ensure the app is configured to use the Render-hosted backend URL.

For local development:
1. Update the `BASE_URL` in the Android app to point to your Render-hosted backend.
2. Build and run the app in Android Studio.

## Contributing

We welcome contributions to the Library Management System! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature/your-feature`)
6. Open a Pull Request

## Future Enhancements
- Implement pagination for book listings
- Add a recommendation engine
- Develop a more robust search functionality
- Implement offline support with local caching
- Add user profiles and favorite books feature

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Google Books API for providing book information
- Firebase team for their authentication and database services
- Jetpack Compose community for inspiration and support
