package com.example.pfastage.user;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController

@RequestMapping(path = "api/")
public class UserController<user> {


    @GetMapping(path = "users/")
    public ArrayList<AppUser> getUsers(){
        ArrayList<AppUser> users = new ArrayList<AppUser>();
        users.add(new AppUser("data","data"));
        users.add(new AppUser("2","2"));
    return users;
}

    @GetMapping(path = "users/{id}")
    public AppUser getUser(@PathVariable int id){
        ArrayList<AppUser> users = new ArrayList<AppUser>();
        users.add(new AppUser("data","data"));
        users.add(new AppUser("2","2"));
        return users.get(id);
    }

    @PostMapping("postusers/")
    public ArrayList<AppUser> postUser(@RequestBody AppUser user ){
        ArrayList<AppUser> users = new ArrayList<AppUser>();
        users.add(new AppUser("data","data"));
        users.add(new AppUser("2","2"));
        users.add(user);
        return  users;
    }
    @PutMapping(path = "edituser/{id}")
    public  ArrayList<AppUser> editUser(@RequestBody AppUser user , @PathVariable int id ){
        ArrayList<AppUser> users = new ArrayList<AppUser>();
        users.add(new AppUser("data","data"));
        users.add(new AppUser("2","2"));
        users.add(new AppUser("3","3"));
        users.set(id, user);
        return users;
    }

    @DeleteMapping(path = "deleteuser/{id}")
    public  ArrayList<AppUser> deleteUser(@PathVariable int id){
        ArrayList<AppUser> users = new ArrayList<AppUser>();
        users.add(new AppUser("data","data"));
        users.add(new AppUser("2","2"));
        users.add(new AppUser("3","3"));
        if( id>users.size()){
            return  users;
        }
        users.remove(id);
        return users;
    }




}
