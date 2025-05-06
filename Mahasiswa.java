public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V kelas;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public void setName(U name) {
        this.name = name;
    }

    public void setClass(V kelas) {
        this.kelas = kelas;
    }

    public T getNim() {
        return nim;
    }

    public U getName() {
        return name;
    }

    public V getClassData() {
        return kelas;
    }

    // getClass() adalah method dari java.lang.Object, jadi gunakan nama lain agar tidak bentrok
}