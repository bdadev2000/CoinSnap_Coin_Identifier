package jc;

/* loaded from: classes3.dex */
public enum c implements yb.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f19993b;

    c(int i10) {
        this.f19993b = i10;
    }

    @Override // yb.c
    public final int getNumber() {
        return this.f19993b;
    }
}
