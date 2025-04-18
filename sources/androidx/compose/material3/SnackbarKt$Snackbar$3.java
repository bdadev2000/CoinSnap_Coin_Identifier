package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnackbarKt$Snackbar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$3(SnackbarData snackbarData) {
        super(2);
        this.f11594a = snackbarData;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f11594a.a().getMessage();
            TextKt.b(null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return b0.f30125a;
    }
}
