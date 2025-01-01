package Projects;

class LoginSystem {
    private User user;

    
    public void registerUser(String username, String password) {
        user = new User(username, password);
        System.out.println("User registered successfully!");
    }

    
    public boolean login(String username, String password) {
        if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

   
    public boolean isUserRegistered() {
        return user != null;
    }
}
