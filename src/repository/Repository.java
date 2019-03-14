package repository;

interface Repository {
    public Object select();
    public void insert(Object object);
    public void update(String key, Object object);
    public void delete(String key);
}
