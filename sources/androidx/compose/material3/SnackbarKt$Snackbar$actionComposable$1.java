package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes4.dex */
final class SnackbarKt$Snackbar$actionComposable$1 extends r implements p {

    /* renamed from: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(3);
            this.f11606a = str;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Composer composer = (Composer) obj2;
            if ((((Number) obj3).intValue() & 17) == 16 && composer.i()) {
                composer.A();
            } else {
                TextKt.b(this.f11606a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            }
            return b0.f30125a;
        }
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors e = ButtonDefaults.e(0L, 0L, composer, 13);
            boolean I = composer.I(null);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new SnackbarKt$Snackbar$actionComposable$1$1$1(null);
                composer.o(u2);
            }
            ButtonKt.c((q0.a) u2, null, false, null, e, null, null, null, null, ComposableLambdaKt.c(521110564, new AnonymousClass2(null), composer), composer, 805306368, 494);
        }
        return b0.f30125a;
    }
}
