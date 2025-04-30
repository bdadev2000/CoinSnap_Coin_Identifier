package V4;

/* loaded from: classes2.dex */
public enum b implements J4.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int b;

    b(int i9) {
        this.b = i9;
    }

    @Override // J4.c
    public final int getNumber() {
        return this.b;
    }
}
