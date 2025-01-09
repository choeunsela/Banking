package model ;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;
    private String bio;
    private Boolean isDeleted;
    private Boolean isVerified;
    private LocalDateTime createdDate;
}


