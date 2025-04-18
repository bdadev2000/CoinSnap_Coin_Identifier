package l7;

/* loaded from: classes3.dex */
public enum c implements yb.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: b, reason: collision with root package name */
    public final int f21152b;

    c(int i10) {
        this.f21152b = i10;
    }

    @Override // yb.c
    public final int getNumber() {
        return this.f21152b;
    }
}
