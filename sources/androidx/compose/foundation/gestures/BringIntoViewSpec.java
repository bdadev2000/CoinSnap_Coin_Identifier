package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public interface BringIntoViewSpec {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f3100a = Companion.f3101a;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f3101a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public static final SpringSpec f3102b = AnimationSpecKt.c(0.0f, 0.0f, null, 7);

        /* renamed from: c, reason: collision with root package name */
        public static final BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1 f3103c = new Object();
    }

    default float a(float f2, float f3, float f4) {
        f3100a.getClass();
        float f5 = f3 + f2;
        if ((f2 >= 0.0f && f5 <= f4) || (f2 < 0.0f && f5 > f4)) {
            return 0.0f;
        }
        float f6 = f5 - f4;
        return Math.abs(f2) < Math.abs(f6) ? f2 : f6;
    }

    default AnimationSpec b() {
        f3100a.getClass();
        return Companion.f3102b;
    }
}
