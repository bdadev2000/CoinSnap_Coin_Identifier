package qc;

/* loaded from: classes3.dex */
public enum t implements xb.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f23875b;

    t(int i10) {
        this.f23875b = i10;
    }

    @Override // xb.f
    public final int getNumber() {
        return this.f23875b;
    }
}
