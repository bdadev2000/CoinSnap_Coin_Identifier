package jc;

/* loaded from: classes3.dex */
public enum d implements yb.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: b, reason: collision with root package name */
    public final int f19997b;

    d(int i10) {
        this.f19997b = i10;
    }

    @Override // yb.c
    public final int getNumber() {
        return this.f19997b;
    }
}
