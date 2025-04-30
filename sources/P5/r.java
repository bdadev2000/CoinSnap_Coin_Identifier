package p5;

/* loaded from: classes2.dex */
public enum r implements I4.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    public final int b;

    r(int i9) {
        this.b = i9;
    }

    @Override // I4.f
    public final int getNumber() {
        return this.b;
    }
}
