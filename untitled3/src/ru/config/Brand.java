package ru.config;

import java.util.Set;

@Getter
@Setter
@Entity
@Table (name = "brand") //тут указываешь название таблицы из бд
public class Brand {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Column (name = "Manufacturer") //тут указываешь название поля из бд
    private String manufacturer;

    @OneToMany (mappedBy = "brand") //тут пишешь название класса с маленькой буквы
    Set<Motherboard> motherboards; //тут пишешь связь короче в квадратных скобках пишешь ту название таблицы с которой у тебя связь, в данном случае у тебя связь таблицы brand и motherboard (один ко многим)
}


//в Motherboard пишешь вместо 16 и 17 строки
@ManyToOne
@JoinColumn (name = "brand_id") //тут указываешь название поле с красненьким четырехугольником
private Brand brand;
