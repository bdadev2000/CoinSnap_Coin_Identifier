package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
interface SideCalculator {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f4097a = Companion.f4098a;

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f4098a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final SideCalculator$Companion$LeftSideCalculator$1 f4099b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public static final SideCalculator$Companion$TopSideCalculator$1 f4100c = new Object();
        public static final SideCalculator$Companion$RightSideCalculator$1 d = new Object();
        public static final SideCalculator$Companion$BottomSideCalculator$1 e = new Object();
    }

    default float a(float f2, float f3) {
        return p0.a.v(b(f2, f3), 0.0f);
    }

    float b(float f2, float f3);

    Insets c(Insets insets, int i2);

    default float d(float f2, float f3) {
        return p0.a.x(b(f2, f3), 0.0f);
    }

    int e(Insets insets);

    long f(long j2);

    long g(long j2, float f2);
}
