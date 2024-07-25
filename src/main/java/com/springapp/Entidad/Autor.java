package com.springapp.Entidad;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Autor {
    @Size(min=3, max=20)
    private String nombre;

    @NotBlank
    @Email(message = "Ingrese el correo en formato email")
    private String email;

    @NotNull
    @Size(min=5,max=15)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message =
                        "La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, " +
                            "un número y un carácter especial")
    private String password;


    @DateTimeFormat(pattern = "yyy-mm-dd")
    private Date fechanacimiento;

    @Min(500)
    @Max(2000)
    private Integer sueldo;
}

