package git_actions;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class GitController {
    @GetMapping("/action")
    public List<Object> search(){
        return List.of(new GitRecord(1,"happy",1));

    }
}
