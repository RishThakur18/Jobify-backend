package com.jobify.microservices.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jobify.microservices.entities.enums.UserRole;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import static com.jobify.microservices.utilities.StaticStringUtility.NOT_BLANK;
import static com.jobify.microservices.utilities.StaticStringUtility.NOT_NULL;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private String id;

    @NotBlank(message = "firstname" + NOT_BLANK)
    private String firstName;

    @NotBlank(message = "lastname" + NOT_BLANK)
    private String lastName;

    @NotBlank(message = "email" + NOT_BLANK)
    private String email;

    @NotBlank(message = "password" + NOT_BLANK)
    private String password;

    @NotNull(message = "role" + NOT_NULL)
    private List<UserRole> role;

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
