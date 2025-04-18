package fh;

/* loaded from: classes4.dex */
public enum b {
    OPT_IN("opted_in"),
    OPT_OUT("opted_out");

    private final String value;

    b(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
