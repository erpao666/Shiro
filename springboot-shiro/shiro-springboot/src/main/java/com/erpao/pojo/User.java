package com.erpao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int UserId;
    private String LastName;
    private String Password;
    private String RoleId;
}
