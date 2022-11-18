package com.wesleysardi.workshopmongo.services;

import com.wesleysardi.workshopmongo.domain.Post;
import com.wesleysardi.workshopmongo.domain.User;
import com.wesleysardi.workshopmongo.dto.UserDTO;
import com.wesleysardi.workshopmongo.repository.PostRepository;
import com.wesleysardi.workshopmongo.repository.UserRepository;
import com.wesleysardi.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
