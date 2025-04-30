package Z5;

/* loaded from: classes3.dex */
public enum f {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    public final String b;

    f(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
