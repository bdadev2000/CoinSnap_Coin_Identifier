package androidx.compose.ui.unit;

/* loaded from: classes4.dex */
public final class TextUnitKt {
    public static final long a(double d) {
        return d(4294967296L, (float) d);
    }

    public static final long b(int i2) {
        return d(4294967296L, i2);
    }

    public static final boolean c(long j2) {
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        return (j2 & 1095216660480L) == 0;
    }

    public static final long d(long j2, float f2) {
        long floatToIntBits = j2 | (Float.floatToIntBits(f2) & 4294967295L);
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        return floatToIntBits;
    }
}
