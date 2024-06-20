package com.alura.forohub.domain.usuarios;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String nombre;
    @Column(unique = true,nullable = false)
    @Email(message = "El formato de email no es valido")
    private String correo_electronico;
    @Column(nullable = false)
    private String contrasena;
    @ManyToOne // Configurar la relación como muchos-a-uno
    @JoinColumn(name = "rol_id", nullable = false) // Mapea la columna de la FK en la tabla de usuarios
    private Rol rol;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER" + rol.getNombre().toUpperCase()));
    }


    @Override
    public String getUsername() {
        return nombre;
    }

    @Override
    public String getPassword() {
        return contrasena;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}



