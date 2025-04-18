package jc;

/* loaded from: classes3.dex */
public enum b implements yb.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: b, reason: collision with root package name */
    public final int f19988b;

    b(int i10) {
        this.f19988b = i10;
    }

    @Override // yb.c
    public final int getNumber() {
        return this.f19988b;
    }
}
