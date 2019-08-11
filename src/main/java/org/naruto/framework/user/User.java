package org.naruto.framework.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;

    @NotBlank(message = "nickname is blank")
    private String nickname;
    private String mobile;
    private String password;
}
