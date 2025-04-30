package O5;

/* loaded from: classes3.dex */
public enum e {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String b;

    e(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
