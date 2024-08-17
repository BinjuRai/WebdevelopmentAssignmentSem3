package com.example.webdevproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPojo {

    private Integer userid;

    private String name;

    private String email;

    private String contactNumber;

    private String password;


}
