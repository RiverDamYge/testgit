package game.bag.repository;

import game.bag.entity.Goods;

import java.util.Collection;

public interface GoodsRepository {
    public Collection<Goods>FindAll();
    public Goods FindByid(long id);
    public void Save(Goods goods);
    public void DeleteByid(long id);

    public void Update(Goods goods);
}
