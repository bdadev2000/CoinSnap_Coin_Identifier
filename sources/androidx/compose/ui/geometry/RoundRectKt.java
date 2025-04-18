package androidx.compose.ui.geometry;

/* loaded from: classes3.dex */
public final class RoundRectKt {
    public static final boolean a(RoundRect roundRect) {
        float b2 = CornerRadius.b(roundRect.e);
        long j2 = roundRect.e;
        if (b2 == CornerRadius.c(j2)) {
            float b3 = CornerRadius.b(j2);
            long j3 = roundRect.f14920f;
            if (b3 == CornerRadius.b(j3) && CornerRadius.b(j2) == CornerRadius.c(j3)) {
                float b4 = CornerRadius.b(j2);
                long j4 = roundRect.f14921g;
                if (b4 == CornerRadius.b(j4) && CornerRadius.b(j2) == CornerRadius.c(j4)) {
                    float b5 = CornerRadius.b(j2);
                    long j5 = roundRect.f14922h;
                    if (b5 == CornerRadius.b(j5) && CornerRadius.b(j2) == CornerRadius.c(j5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
