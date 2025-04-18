package androidx.compose.material3.pulltorefresh;

import android.support.v4.media.d;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.google.android.material.internal.ViewUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes3.dex */
final class PullToRefreshKt$CircularArrowProgressIndicator$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f13145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f13146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13147c;
    public final /* synthetic */ Path d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$2$1(a aVar, State state, long j2, Path path) {
        super(1);
        this.f13145a = aVar;
        this.f13146b = state;
        this.f13147c = j2;
        this.d = path;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2;
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1;
        float f2;
        Rect rect;
        DrawScope drawScope = (DrawScope) obj;
        float floatValue = ((Number) this.f13145a.invoke()).floatValue();
        float f3 = PullToRefreshKt.f13139a;
        float max = (Math.max(Math.min(1.0f, floatValue) - 0.4f, 0.0f) * 5) / 3;
        float z2 = p0.a.z(Math.abs(floatValue) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (z2 - (((float) Math.pow(z2, 2)) / 4))) * 0.5f;
        float f4 = 360;
        float f5 = pow * f4;
        float f6 = ((0.8f * max) + pow) * f4;
        ArrowValues arrowValues = new ArrowValues(pow, f5, f6, Math.min(1.0f, max));
        float floatValue2 = ((Number) this.f13146b.getValue()).floatValue();
        long j3 = this.f13147c;
        Path path = this.d;
        long F1 = drawScope.F1();
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            A1.f15139a.d(F1, pow);
            float y1 = drawScope.y1(PullToRefreshKt.f13140b);
            f2 = PullToRefreshKt.f13139a;
            float y12 = (drawScope.y1(f2) / 2.0f) + y1;
            long b3 = SizeKt.b(drawScope.b());
            try {
                rect = new Rect(Offset.g(b3) - y12, Offset.h(b3) - y12, Offset.g(b3) + y12, Offset.h(b3) + y12);
            } catch (Throwable th) {
                th = th;
                canvasDrawScope$drawContext$1 = A1;
                j2 = b2;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = b2;
            canvasDrawScope$drawContext$1 = A1;
        }
        try {
            DrawScope.t1(drawScope, j3, f5, f6 - f5, rect.g(), rect.f(), floatValue2, new Stroke(drawScope.y1(f2), 0.0f, 0, 0, 26), ViewUtils.EDGE_TO_EDGE_FLAGS);
            PullToRefreshKt.b(drawScope, path, rect, j3, floatValue2, arrowValues);
            d.A(A1, b2);
            return b0.f30125a;
        } catch (Throwable th3) {
            th = th3;
            j2 = b2;
            canvasDrawScope$drawContext$1 = A1;
            d.A(canvasDrawScope$drawContext$1, j2);
            throw th;
        }
    }
}
