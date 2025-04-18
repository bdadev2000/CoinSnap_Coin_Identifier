package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(359872873);
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        WindowInsetsHolder c2 = WindowInsetsHolder.Companion.c(composer);
        boolean I = composer.I(c2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new InsetsPaddingModifier(c2.f4144j);
            composer.o(u2);
        }
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) u2;
        composer.D();
        return insetsPaddingModifier;
    }
}
