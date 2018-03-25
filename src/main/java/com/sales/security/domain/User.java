package com.sales.security.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Role;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@Document(collection="users")
@TypeAlias("users")
public class User implements UserDetails {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String id;
	
	private String username;
	
	private String password;
	
	private boolean enabled = false;
	private String[] roles;
	public User(String username, String password, String[] roles) {
		this.username = username;
		this.password = password;
		this.roles = roles;
		
	}	
	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}







	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		return authorities;
	}

	


	@Override
	public String getUsername() {
		System.out.println(username);
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}

	
	@Override

	public String getPassword() {
		
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	/**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	public static final String ROLES_PREFIX = "ROLE_";

    private User user;
    
    private String username;
    private String password;
    private List<GrantedAuthority> grantedAuthorities;
    public MongoUserDetails(String username,String password,String[] authorities) {
        this.username = username;
        this.password = password;
        this.grantedAuthorities = AuthorityUtils.createAuthorityList(authorities);
    }
   

	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String roles[] = user.getRoles();

        if (roles == null) {
            return Collections.emptyList();
        }

        return Arrays.stream(roles).map(
                role -> (GrantedAuthority) () -> ROLES_PREFIX + role
        ).collect(Collectors.toList());
    }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return grantedAuthorities;
	}

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return  true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}*/

}
