package repository;

interface Repository {
    public Object select();
    public void insert(Object object);
    public void update(Object object1, Object object2);
    public void delete(Object object);
}
