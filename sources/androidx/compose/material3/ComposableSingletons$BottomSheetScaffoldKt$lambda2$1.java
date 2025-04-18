package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* renamed from: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda2$1 f8595a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarHostState snackbarHostState = (SnackbarHostState) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.I(snackbarHostState) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            SnackbarHostKt.b(snackbarHostState, null, null, composer, intValue & 14, 6);
        }
        return b0.f30125a;
    }
}
