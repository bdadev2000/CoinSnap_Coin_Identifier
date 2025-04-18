package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
public final class WindowInsetsPadding_androidKt$windowInsetsPadding$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(359872873);
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        boolean I = composer.I(WindowInsetsHolder.Companion.c(composer));
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            throw null;
        }
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) u2;
        composer.D();
        return insetsPaddingModifier;
    }
}
