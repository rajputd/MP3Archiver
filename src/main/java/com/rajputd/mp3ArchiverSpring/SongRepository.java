package com.rajputd.mp3ArchiverSpring;
import com.rajputd.mp3ArchiverSpring.dto.Song;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SongRepository extends CrudRepository<Song, Integer>{

}
