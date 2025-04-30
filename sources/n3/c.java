package n3;

/* loaded from: classes.dex */
public enum c implements J4.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int b;

    c(int i9) {
        this.b = i9;
    }

    @Override // J4.c
    public final int getNumber() {
        return this.b;
    }
}
