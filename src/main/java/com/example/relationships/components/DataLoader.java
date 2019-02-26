package com.example.relationships.components;

import com.example.relationships.models.File;
import com.example.relationships.models.Folder;
import com.example.relationships.models.User;
import com.example.relationships.repositories.FileRepository;
import com.example.relationships.repositories.FolderRepository;
import com.example.relationships.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        User raul = new User("Raul");
        userRepository.save(raul);

        Folder topSecret =new Folder("TopSecret", raul);
        folderRepository.save(topSecret);

        Folder programs = new Folder("Programs", raul);
        folderRepository.save(programs);

        File alien = new File("Alien", ".txt", 12, topSecret);
        fileRepository.save(alien);
        File ufo = new File ("UFO", ".jpg", 345, topSecret );
        fileRepository.save(ufo);
        File ruby = new File("Ruby", ".rb", 5, programs);
        fileRepository.save(ruby);
        File java = new File("Java",".java", 10, programs);
        fileRepository.save(java);


//        raul.addFolder(topSecret);
//        raul.addFolder(programs);
//        userRepository.save(raul);
//
//        topSecret.addFile(alien);
//        topSecret.addFile(ufo);
//        folderRepository.save(topSecret);
//        programs.addFile(ruby);
//        programs.addFile(java);
//        folderRepository.save(programs);


    }

}
