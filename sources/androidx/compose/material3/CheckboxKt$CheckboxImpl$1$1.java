package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.util.MathHelpersKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CheckboxKt$CheckboxImpl$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f8212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f8213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f8214c;
    public final /* synthetic */ State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f8215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CheckDrawingCache f8216g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(State state, State state2, State state3, Transition.TransitionAnimationState transitionAnimationState, Transition.TransitionAnimationState transitionAnimationState2, CheckDrawingCache checkDrawingCache) {
        super(1);
        this.f8212a = state;
        this.f8213b = state2;
        this.f8214c = state3;
        this.d = transitionAnimationState;
        this.f8215f = transitionAnimationState2;
        this.f8216g = checkDrawingCache;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        CheckboxKt$CheckboxImpl$1$1 checkboxKt$CheckboxImpl$1$1 = this;
        DrawScope drawScope = (DrawScope) obj;
        float floor = (float) Math.floor(drawScope.y1(CheckboxKt.f8202c));
        long j2 = ((Color) checkboxKt$CheckboxImpl$1$1.f8212a.getValue()).f14964a;
        long j3 = ((Color) checkboxKt$CheckboxImpl$1$1.f8213b.getValue()).f14964a;
        float y1 = drawScope.y1(CheckboxKt.d);
        float f2 = floor / 2.0f;
        Stroke stroke = new Stroke(floor, 0.0f, 0, 0, 30);
        float d = Size.d(drawScope.b());
        boolean c2 = Color.c(j2, j3);
        Fill fill = Fill.f15146a;
        if (c2) {
            DrawScope.H0(drawScope, j2, 0L, SizeKt.a(d, d), CornerRadiusKt.a(y1, y1), fill, 226);
        } else {
            long a2 = OffsetKt.a(floor, floor);
            float f3 = d - (2 * floor);
            long a3 = SizeKt.a(f3, f3);
            float max = Math.max(0.0f, y1 - floor);
            DrawScope.H0(drawScope, j2, a2, a3, CornerRadiusKt.a(max, max), fill, 224);
            float f4 = d - floor;
            float f5 = y1 - f2;
            DrawScope.H0(drawScope, j3, OffsetKt.a(f2, f2), SizeKt.a(f4, f4), CornerRadiusKt.a(f5, f5), stroke, 224);
            checkboxKt$CheckboxImpl$1$1 = this;
        }
        long j4 = ((Color) checkboxKt$CheckboxImpl$1$1.f8214c.getValue()).f14964a;
        float floatValue = ((Number) checkboxKt$CheckboxImpl$1$1.d.getValue()).floatValue();
        float floatValue2 = ((Number) checkboxKt$CheckboxImpl$1$1.f8215f.getValue()).floatValue();
        Stroke stroke2 = new Stroke(floor, 0.0f, 2, 0, 26);
        float d2 = Size.d(drawScope.b());
        float b2 = MathHelpersKt.b(0.4f, 0.5f, floatValue2);
        float b3 = MathHelpersKt.b(0.7f, 0.5f, floatValue2);
        float b4 = MathHelpersKt.b(0.5f, 0.5f, floatValue2);
        float b5 = MathHelpersKt.b(0.3f, 0.5f, floatValue2);
        CheckDrawingCache checkDrawingCache = checkboxKt$CheckboxImpl$1$1.f8216g;
        checkDrawingCache.f8187a.reset();
        Path path = checkDrawingCache.f8187a;
        path.n(0.2f * d2, b4 * d2);
        path.u(b2 * d2, b3 * d2);
        path.u(0.8f * d2, d2 * b5);
        PathMeasure pathMeasure = checkDrawingCache.f8188b;
        pathMeasure.b(path);
        Path path2 = checkDrawingCache.f8189c;
        path2.reset();
        pathMeasure.a(0.0f, pathMeasure.c() * floatValue, path2);
        DrawScope.N(drawScope, checkDrawingCache.f8189c, j4, 0.0f, stroke2, 52);
        return b0.f30125a;
    }
}
