package Model;

import Model.DiscountCode;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-24T09:00:43")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> addressline2;
    public static volatile SingularAttribute<Customer, String> zip;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> addressline1;
    public static volatile SingularAttribute<Customer, Integer> customerId;
    public static volatile SingularAttribute<Customer, String> fax;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Integer> creditLimit;
    public static volatile SingularAttribute<Customer, String> state;
    public static volatile SingularAttribute<Customer, DiscountCode> discountCode;
    public static volatile SingularAttribute<Customer, String> city;

}