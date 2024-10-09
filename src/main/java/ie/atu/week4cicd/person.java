package ie.atu.week4cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class person {
    @NotBlank(message="You must enter a name")
    private String name;
    @NotBlank(message="You must enter a title")
    private String title;
    @Min(value=1, message="Must be greater or equal to 1")
    private int id;
    @Min(value=0, message="You need to be older than 0")
    private int age;
    @Email(message="Not a valid email try something like john.doe@example.com")
    private String email;
    @NotBlank(message = "Not a valid position")
    private String position;
    @NotBlank(message = "Not a valid department")
    private String department;
}
