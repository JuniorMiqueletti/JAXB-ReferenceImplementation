import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Junior-Pc on 06/03/2016.
 */
@XmlRootElement
public class People {

    String name;
    String nickName;
    int age;
    int id;


    public String getNickName() {
        return nickName;
    }

    @XmlElement(name = "NICK_NAME")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "NAME")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement(name = "AGE")
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute(name = "ID")
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
