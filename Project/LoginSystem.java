package Projects;

class LoginSystem {
    private User user;

    // Register a new user
    public void registerUser(String username, String password) {
        user = new User(username, password);
        System.out.println("User registered successfully!");
    }

    // Authenticate login
    public boolean login(String username, String password) {
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    // Check if a user is already registered
    public boolean isUserRegistered() {
        return user != null;
    }
}
