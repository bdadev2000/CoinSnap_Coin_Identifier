package qc;

/* loaded from: classes3.dex */
public enum i implements xb.f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* renamed from: b, reason: collision with root package name */
    public final int f23820b;

    i(int i10) {
        this.f23820b = i10;
    }

    @Override // xb.f
    public final int getNumber() {
        return this.f23820b;
    }
}
