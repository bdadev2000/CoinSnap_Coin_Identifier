package V4;

/* loaded from: classes2.dex */
public enum c implements J4.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int b;

    c(int i9) {
        this.b = i9;
    }

    @Override // J4.c
    public final int getNumber() {
        return this.b;
    }
}
