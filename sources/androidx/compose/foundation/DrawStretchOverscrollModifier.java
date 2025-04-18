package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.d;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;

@RequiresApi
/* loaded from: classes4.dex */
final class DrawStretchOverscrollModifier extends InspectorValueInfo implements DrawModifier {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidEdgeEffectOverscrollEffect f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final EdgeEffectWrapper f2689b;

    /* renamed from: c, reason: collision with root package name */
    public RenderNode f2690c;

    public DrawStretchOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.f2688a = androidEdgeEffectOverscrollEffect;
        this.f2689b = edgeEffectWrapper;
    }

    public static boolean a(float f2, EdgeEffect edgeEffect, Canvas canvas) {
        if (f2 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f2);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode b() {
        RenderNode renderNode = this.f2690c;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode e = d.e();
        this.f2690c = e;
        return e;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void z(ContentDrawScope contentDrawScope) {
        RecordingCanvas beginRecording;
        boolean z2;
        long b2 = contentDrawScope.b();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f2688a;
        androidEdgeEffectOverscrollEffect.l(b2);
        if (Size.e(contentDrawScope.b())) {
            contentDrawScope.P1();
            return;
        }
        androidEdgeEffectOverscrollEffect.f2445c.getValue();
        float y1 = contentDrawScope.y1(ClipScrollableContainerKt.f2657a);
        Canvas b3 = AndroidCanvas_androidKt.b(contentDrawScope.A1().a());
        EdgeEffectWrapper edgeEffectWrapper = this.f2689b;
        boolean z3 = EdgeEffectWrapper.f(edgeEffectWrapper.d) || EdgeEffectWrapper.g(edgeEffectWrapper.f2696h) || EdgeEffectWrapper.f(edgeEffectWrapper.e) || EdgeEffectWrapper.g(edgeEffectWrapper.f2697i);
        boolean z4 = EdgeEffectWrapper.f(edgeEffectWrapper.f2694f) || EdgeEffectWrapper.g(edgeEffectWrapper.f2698j) || EdgeEffectWrapper.f(edgeEffectWrapper.f2695g) || EdgeEffectWrapper.g(edgeEffectWrapper.f2699k);
        if (z3 && z4) {
            b().setPosition(0, 0, b3.getWidth(), b3.getHeight());
        } else if (z3) {
            b().setPosition(0, 0, (a.t0(y1) * 2) + b3.getWidth(), b3.getHeight());
        } else {
            if (!z4) {
                contentDrawScope.P1();
                return;
            }
            b().setPosition(0, 0, b3.getWidth(), (a.t0(y1) * 2) + b3.getHeight());
        }
        beginRecording = b().beginRecording();
        if (EdgeEffectWrapper.g(edgeEffectWrapper.f2698j)) {
            EdgeEffect edgeEffect = edgeEffectWrapper.f2698j;
            if (edgeEffect == null) {
                edgeEffect = edgeEffectWrapper.a();
                edgeEffectWrapper.f2698j = edgeEffect;
            }
            a(90.0f, edgeEffect, beginRecording);
            edgeEffect.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.f2694f)) {
            EdgeEffect c2 = edgeEffectWrapper.c();
            z2 = a(270.0f, c2, beginRecording);
            if (EdgeEffectWrapper.g(edgeEffectWrapper.f2694f)) {
                float h2 = Offset.h(androidEdgeEffectOverscrollEffect.f());
                EdgeEffect edgeEffect2 = edgeEffectWrapper.f2698j;
                if (edgeEffect2 == null) {
                    edgeEffect2 = edgeEffectWrapper.a();
                    edgeEffectWrapper.f2698j = edgeEffect2;
                }
                EdgeEffectCompat.c(edgeEffect2, EdgeEffectCompat.a(c2), 1 - h2);
            }
        } else {
            z2 = false;
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.f2696h)) {
            EdgeEffect edgeEffect3 = edgeEffectWrapper.f2696h;
            if (edgeEffect3 == null) {
                edgeEffect3 = edgeEffectWrapper.a();
                edgeEffectWrapper.f2696h = edgeEffect3;
            }
            a(180.0f, edgeEffect3, beginRecording);
            edgeEffect3.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.d)) {
            EdgeEffect e = edgeEffectWrapper.e();
            z2 = a(0.0f, e, beginRecording) || z2;
            if (EdgeEffectWrapper.g(edgeEffectWrapper.d)) {
                float g2 = Offset.g(androidEdgeEffectOverscrollEffect.f());
                EdgeEffect edgeEffect4 = edgeEffectWrapper.f2696h;
                if (edgeEffect4 == null) {
                    edgeEffect4 = edgeEffectWrapper.a();
                    edgeEffectWrapper.f2696h = edgeEffect4;
                }
                EdgeEffectCompat.c(edgeEffect4, EdgeEffectCompat.a(e), g2);
            }
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.f2699k)) {
            EdgeEffect edgeEffect5 = edgeEffectWrapper.f2699k;
            if (edgeEffect5 == null) {
                edgeEffect5 = edgeEffectWrapper.a();
                edgeEffectWrapper.f2699k = edgeEffect5;
            }
            a(270.0f, edgeEffect5, beginRecording);
            edgeEffect5.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.f2695g)) {
            EdgeEffect d = edgeEffectWrapper.d();
            z2 = a(90.0f, d, beginRecording) || z2;
            if (EdgeEffectWrapper.g(edgeEffectWrapper.f2695g)) {
                float h3 = Offset.h(androidEdgeEffectOverscrollEffect.f());
                EdgeEffect edgeEffect6 = edgeEffectWrapper.f2699k;
                if (edgeEffect6 == null) {
                    edgeEffect6 = edgeEffectWrapper.a();
                    edgeEffectWrapper.f2699k = edgeEffect6;
                }
                EdgeEffectCompat.c(edgeEffect6, EdgeEffectCompat.a(d), h3);
            }
        }
        if (EdgeEffectWrapper.g(edgeEffectWrapper.f2697i)) {
            EdgeEffect edgeEffect7 = edgeEffectWrapper.f2697i;
            if (edgeEffect7 == null) {
                edgeEffect7 = edgeEffectWrapper.a();
                edgeEffectWrapper.f2697i = edgeEffect7;
            }
            a(0.0f, edgeEffect7, beginRecording);
            edgeEffect7.finish();
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.e)) {
            EdgeEffect b4 = edgeEffectWrapper.b();
            boolean z5 = a(180.0f, b4, beginRecording) || z2;
            if (EdgeEffectWrapper.g(edgeEffectWrapper.e)) {
                float g3 = Offset.g(androidEdgeEffectOverscrollEffect.f());
                EdgeEffect edgeEffect8 = edgeEffectWrapper.f2697i;
                if (edgeEffect8 == null) {
                    edgeEffect8 = edgeEffectWrapper.a();
                    edgeEffectWrapper.f2697i = edgeEffect8;
                }
                EdgeEffectCompat.c(edgeEffect8, EdgeEffectCompat.a(b4), 1 - g3);
            }
            z2 = z5;
        }
        if (z2) {
            androidEdgeEffectOverscrollEffect.g();
        }
        float f2 = z4 ? 0.0f : y1;
        if (z3) {
            y1 = 0.0f;
        }
        LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
        AndroidCanvas a2 = AndroidCanvas_androidKt.a(beginRecording);
        long b5 = contentDrawScope.b();
        Density d2 = contentDrawScope.A1().d();
        LayoutDirection f3 = contentDrawScope.A1().f();
        androidx.compose.ui.graphics.Canvas a3 = contentDrawScope.A1().a();
        long b6 = contentDrawScope.A1().b();
        GraphicsLayer graphicsLayer = contentDrawScope.A1().f15140b;
        CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
        A1.h(contentDrawScope);
        A1.j(layoutDirection);
        A1.g(a2);
        A1.c(b5);
        A1.f15140b = null;
        a2.p();
        try {
            contentDrawScope.A1().f15139a.g(f2, y1);
            try {
                contentDrawScope.P1();
                float f4 = -f2;
                float f5 = -y1;
                contentDrawScope.A1().f15139a.g(f4, f5);
                a2.i();
                CanvasDrawScope$drawContext$1 A12 = contentDrawScope.A1();
                A12.h(d2);
                A12.j(f3);
                A12.g(a3);
                A12.c(b6);
                A12.f15140b = graphicsLayer;
                b().endRecording();
                int save = b3.save();
                b3.translate(f4, f5);
                b3.drawRenderNode(b());
                b3.restoreToCount(save);
            } catch (Throwable th) {
                contentDrawScope.A1().f15139a.g(-f2, -y1);
                throw th;
            }
        } catch (Throwable th2) {
            a2.i();
            CanvasDrawScope$drawContext$1 A13 = contentDrawScope.A1();
            A13.h(d2);
            A13.j(f3);
            A13.g(a3);
            A13.c(b6);
            A13.f15140b = graphicsLayer;
            throw th2;
        }
    }
}
