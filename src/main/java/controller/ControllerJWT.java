package controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import models.User;

@RestController
public class ControllerJWT {
	
	@PostMapping("user")
    public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		System.out.println("Entro al controller");
        String token = getJWTToken(username);
        User user = new User();
        System.out.println("Ya creo el User");
        user.setUser(username);
        user.setToken(token);       
        return user;

    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");
        System.out.println("Entro al metodo");
        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();
        System.out.println("Termina de buildear el token");
        return "Bearer " + token;
    }
	
}
