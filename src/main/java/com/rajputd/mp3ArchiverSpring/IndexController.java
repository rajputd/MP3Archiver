package com.rajputd.mp3ArchiverSpring;

import com.rajputd.mp3ArchiverSpring.dto.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class IndexController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/showSongs")
    public String showSongs(Model model) {
        Collection<Song> songs = (Collection) songRepository.findAll();
        model.addAttribute("songsList", songs);
        return "showSongs";
    }

}
