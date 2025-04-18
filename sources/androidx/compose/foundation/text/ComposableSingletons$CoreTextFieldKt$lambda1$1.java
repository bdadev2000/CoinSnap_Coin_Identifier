package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* renamed from: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt$lambda1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final ComposableSingletons$CoreTextFieldKt$lambda1$1 f5778a = new r(3);

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.w(pVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            pVar.invoke(composer, Integer.valueOf(intValue & 14));
        }
        return b0.f30125a;
    }
}
