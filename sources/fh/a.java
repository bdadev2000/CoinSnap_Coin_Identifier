package fh;

/* loaded from: classes4.dex */
public enum a {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);

    private final Boolean value;

    a(Boolean bool) {
        this.value = bool;
    }

    public final Boolean getValue() {
        return this.value;
    }
}
