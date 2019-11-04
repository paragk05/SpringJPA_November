package com.gamacker.November.controller;

import com.gamacker.November.model.November;
import com.gamacker.November.repository.NovRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class NovController
{
    @Autowired
    NovRepository novRepository;

    @GetMapping("/all")
    public List<November> getAll()
    {
        return novRepository.findAll();
    }

    @PostMapping()
    public List<November> saveData(@RequestBody final November november)
    {
        novRepository.save(november);
        return novRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable int id)
    {
        Optional<November> user = novRepository.findById(id);

        if (user.isPresent())
        {
            novRepository.delete(user.get());
            return "User Is Deleted Successfully";
        }
        else
        {
            throw new RuntimeException("User is not Found");
        }
    }

    @PutMapping()
    public November update(@RequestBody November november)
    {
        return novRepository.save(november);
    }



}
