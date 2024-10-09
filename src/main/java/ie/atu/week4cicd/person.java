package ie.atu.week4cicd;

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
   // private int age;
   // private String email;
  //  private String psotition;
   // private String department;
}
