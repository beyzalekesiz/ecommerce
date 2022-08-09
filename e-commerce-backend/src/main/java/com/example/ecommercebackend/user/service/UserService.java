package com.example.ecommercebackend.user.service;
import com.example.ecommercebackend.dto.UserDto;
import com.example.ecommercebackend.user.model.Users;
import com.example.ecommercebackend.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> listUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUserByID(Long id) { return userRepository.findById(id); }

    public Users getUserByEmail(String email) {

        return (userRepository.findByEmail(email));
    }

    //public User getUserByID() { return userRepository.findById(id);}

    public void addUser(UserDto userDto) {

        Users user = new Users();

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
    }

    public Users login(UserDto userDto, Users user) throws Exception {
        Optional<Users> userLogin = Optional.ofNullable(userRepository.findByEmail(user.getEmail()));
        if(userLogin.isPresent()) {
            if(user.getPassword().equals(userDto.getPassword())){
                return userRepository.findByEmail(userDto.getEmail());
            } else throw new Exception("Incorrect password.");
        }
        else throw new Exception("User not found.");
    }

    //public Optional<Product> getProductByID(Long id) { return productrepository.findById(id); }

    public void deleteUserByID(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUserByID(Long id, Users user) throws Exception {
        Optional<Users> updateUser = userRepository.findById(id);
        if(updateUser.isPresent()){
            user.setId(updateUser.get().getId());
            userRepository.save(user);
        }else{
            throw new Exception("User not found.");
        }
    }
}

