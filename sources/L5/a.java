package L5;

/* loaded from: classes3.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    /* JADX INFO: Fake field, exist only in values array */
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    /* JADX INFO: Fake field, exist only in values array */
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    HANZI(new int[]{8, 10, 12}, 13);

    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1821c;

    a(int[] iArr, int i9) {
        this.b = iArr;
        this.f1821c = i9;
    }
}
