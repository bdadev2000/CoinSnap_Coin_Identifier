package O5;

/* loaded from: classes3.dex */
public enum i {
    NATIVE("native"),
    /* JADX INFO: Fake field, exist only in values array */
    JAVASCRIPT("javascript"),
    NONE("none");

    public final String b;

    i(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
