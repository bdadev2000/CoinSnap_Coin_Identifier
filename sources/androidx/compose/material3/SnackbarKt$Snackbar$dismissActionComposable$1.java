package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class SnackbarKt$Snackbar$dismissActionComposable$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            boolean I = composer.I(null);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new SnackbarKt$Snackbar$dismissActionComposable$1$1$1(null);
                composer.o(u2);
            }
            IconButtonKt.a((q0.a) u2, null, false, null, null, ComposableSingletons$SnackbarKt.f8636a, composer, 196608, 30);
        }
        return b0.f30125a;
    }
}
