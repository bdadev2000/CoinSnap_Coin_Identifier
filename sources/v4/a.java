package V4;

/* loaded from: classes2.dex */
public enum a implements J4.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);

    public final int b;

    a(int i9) {
        this.b = i9;
    }

    @Override // J4.c
    public final int getNumber() {
        return this.b;
    }
}
