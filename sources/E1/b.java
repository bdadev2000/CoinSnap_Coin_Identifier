package E1;

/* loaded from: classes.dex */
public enum b {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String b;

    b(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
