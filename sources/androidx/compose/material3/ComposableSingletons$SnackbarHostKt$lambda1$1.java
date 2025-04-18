package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* renamed from: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f8635a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(snackbarData) ? 4 : 2;
        }
        int i2 = intValue;
        if ((i2 & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            SnackbarKt.b(snackbarData, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i2 & 14, 510);
        }
        return b0.f30125a;
    }
}
