package androidx.compose.material3.pulltorefresh;

import android.support.v4.media.d;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PullToRefreshKt$pullToRefreshIndicator$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final PullToRefreshKt$pullToRefreshIndicator$1 f13162a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            A1.f15139a.b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
            contentDrawScope.P1();
            d.A(A1, b2);
            return b0.f30125a;
        } catch (Throwable th) {
            d.A(A1, b2);
            throw th;
        }
    }
}
