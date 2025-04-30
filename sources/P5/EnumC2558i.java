package p5;

/* renamed from: p5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2558i implements I4.f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);

    public final int b;

    EnumC2558i(int i9) {
        this.b = i9;
    }

    @Override // I4.f
    public final int getNumber() {
        return this.b;
    }
}
