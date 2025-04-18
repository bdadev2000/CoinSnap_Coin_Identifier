package androidx.compose.material3.pulltorefresh;

import android.support.v4.media.d;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import q0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class PullToRefreshKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f13139a = (float) 2.5d;

    /* renamed from: b, reason: collision with root package name */
    public static final float f13140b = (float) 5.5d;

    /* renamed from: c, reason: collision with root package name */
    public static final float f13141c = 16;
    public static final float d = 40;
    public static final float e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final float f13142f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final TweenSpec f13143g = AnimationSpecKt.d(300, 0, EasingKt.d, 2);

    public static final void a(a aVar, long j2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-569718810);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            Object obj = u2;
            if (u2 == composer$Companion$Empty$1) {
                AndroidPath a2 = AndroidPath_androidKt.a();
                a2.g(1);
                g2.o(a2);
                obj = a2;
            }
            Path path = (Path) obj;
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotStateKt.e(new PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1(aVar));
                g2.o(u3);
            }
            State b2 = AnimateAsStateKt.b(((Number) ((State) u3).getValue()).floatValue(), f13143g, g2);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object u4 = g2.u();
            if (z2 || u4 == composer$Companion$Empty$1) {
                u4 = new PullToRefreshKt$CircularArrowProgressIndicator$1$1(aVar);
                g2.o(u4);
            }
            Modifier n2 = SizeKt.n(SemanticsModifierKt.b(companion, true, (l) u4), f13141c);
            boolean I = (i4 == 4) | g2.I(b2) | ((i3 & 112) == 32) | g2.w(path);
            Object u5 = g2.u();
            if (I || u5 == composer$Companion$Empty$1) {
                PullToRefreshKt$CircularArrowProgressIndicator$2$1 pullToRefreshKt$CircularArrowProgressIndicator$2$1 = new PullToRefreshKt$CircularArrowProgressIndicator$2$1(aVar, b2, j2, path);
                g2.o(pullToRefreshKt$CircularArrowProgressIndicator$2$1);
                u5 = pullToRefreshKt$CircularArrowProgressIndicator$2$1;
            }
            CanvasKt.a(n2, (l) u5, g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PullToRefreshKt$CircularArrowProgressIndicator$3(aVar, j2, i2);
        }
    }

    public static final void b(DrawScope drawScope, Path path, Rect rect, long j2, float f2, ArrowValues arrowValues) {
        path.reset();
        path.n(0.0f, 0.0f);
        float f3 = e;
        float y1 = drawScope.y1(f3);
        float f4 = arrowValues.f13120b;
        path.u((y1 * f4) / 2, drawScope.y1(f13142f) * f4);
        path.u(drawScope.y1(f3) * f4, 0.0f);
        float g2 = (Offset.g(rect.d()) + (Math.min(rect.h(), rect.e()) / 2.0f)) - ((drawScope.y1(f3) * f4) / 2.0f);
        float h2 = Offset.h(rect.d());
        float f5 = f13139a;
        path.k(OffsetKt.a(g2, h2 - drawScope.y1(f5)));
        float y12 = arrowValues.f13119a - drawScope.y1(f5);
        long F1 = drawScope.F1();
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b2 = A1.b();
        A1.a().p();
        try {
            A1.f15139a.d(F1, y12);
            DrawScope.N(drawScope, path, j2, f2, new Stroke(drawScope.y1(f5), 0.0f, 0, 0, 30), 48);
        } finally {
            d.A(A1, b2);
        }
    }
}
