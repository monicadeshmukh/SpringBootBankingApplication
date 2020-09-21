package com.github.perscholas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    //map it to the accountnumber in accounts table.
    //X define bidirectional  OneToOne relationship between customer and account for the sake of this case study
    //define Unidirectional OneToOne relationship
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    //@OneToOne
    private Accounts account = null;

   @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address1", nullable = false)
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "zipcode", nullable = false)
    private Integer zipcode;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    //define constructors

    public Customer(Accounts account, String firstName, String lastName,
                    String email, String phone,
                    String address1, String address2,
                    String city, String state, Integer zipcode,
                    String username, String password) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.username = username;
        this.password = password;
    }

    //nullary constructor
    public Customer(){this(null,"","","","",
            "","","","",0,"","");};

    //getters and setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    //@Query("FROM Accounts a WHERE a.customerId = :customerId")
    //public Accounts getAccount(@Param("customerId") this.customerId) {
    public Accounts getAccount(){
        return account;
    }
    //Person findByName(@Param("name") String name);

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccountNumber() {
        return this.account.getAccountNumber();
    }

    /*public void setAccount(Long accountNumber) {
        this.account = Account(accountNumber);
    }*/

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", account=" + account +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return customerId.equals(customer.customerId) &&
                account.equals(customer.account) &&
                firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName) &&
                Objects.equals(email, customer.email) &&
                phone.equals(customer.phone) &&
                address1.equals(customer.address1) &&
                Objects.equals(address2, customer.address2) &&
                city.equals(customer.city) &&
                state.equals(customer.state) &&
                zipcode.equals(customer.zipcode) &&
                username.equals(customer.username) &&
                password.equals(customer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, account, firstName, lastName, email, phone, address1, address2, city, state, zipcode, username, password);
    }
}
