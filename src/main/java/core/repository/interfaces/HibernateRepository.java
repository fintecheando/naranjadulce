package core.repository.interfaces;

public interface HibernateRepository<E, K> {
    public void add(E entity);
    public E find(K key);
    public void remove(K key);
    public void update(E entity);
}