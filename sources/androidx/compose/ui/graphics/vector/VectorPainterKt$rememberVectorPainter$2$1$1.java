package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Size;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class VectorPainterKt$rememberVectorPainter$2$1$1 extends r implements p {
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
            return b0.f30125a;
        }
        Size.d(0L);
        Size.b(0L);
        throw null;
    }
}
