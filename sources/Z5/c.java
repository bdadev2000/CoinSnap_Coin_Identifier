package Z5;

/* loaded from: classes3.dex */
public enum c {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String b;

    c(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
