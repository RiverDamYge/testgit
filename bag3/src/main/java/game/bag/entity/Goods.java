package game.bag.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {
     public long id;
     public String name;
     public int number;
}
