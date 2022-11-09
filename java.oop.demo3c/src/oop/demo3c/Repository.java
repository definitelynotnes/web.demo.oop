package oop.demo3c;

public interface Repository {
	void findAll();
	void findByPrimaryKey(int id);
	void save();
	void update();
	void delete();
}
