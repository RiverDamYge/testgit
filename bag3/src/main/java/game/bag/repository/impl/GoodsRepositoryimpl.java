package game.bag.repository.impl;

import game.bag.entity.Goods;
import org.springframework.stereotype.Repository;
import game.bag.repository.GoodsRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GoodsRepositoryimpl implements GoodsRepository {
      private  static Map<Long , Goods> goodsMap;
      static {
          goodsMap =new HashMap<>();
          goodsMap.put(1L,new Goods(1,"无尽之刃",50));
          goodsMap.put(2L,new Goods(2,"暴风大剑",99));
          goodsMap.put(3L,new Goods(3,"轻语",45));
      }

    public Collection<Goods> FindAll(){
          return goodsMap.values();
      }

    @Override
    public Goods FindByid(long id) {
        return goodsMap.get(id);
    }
    @Override
    public void Save(Goods goods) {
    goodsMap.put(goods.getId(),goods);
    }
    @Override
    public void DeleteByid(long id) { goodsMap.remove(id);
    }
    @Override
    public Collection<Goods> Sort() {
        return null;
    }
    @Override
    public void Update(Goods goods) {
        goodsMap.put(goods.getId(),goods);
    }
}
