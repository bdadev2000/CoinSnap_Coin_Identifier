package P5;

/* loaded from: classes3.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    PREROLL("preroll"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDROLL("midroll"),
    /* JADX INFO: Fake field, exist only in values array */
    POSTROLL("postroll"),
    STANDALONE("standalone");

    public final String b;

    d(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
