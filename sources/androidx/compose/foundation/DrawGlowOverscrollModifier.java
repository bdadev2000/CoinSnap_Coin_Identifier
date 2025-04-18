package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import p0.a;

/* loaded from: classes3.dex */
final class DrawGlowOverscrollModifier extends InspectorValueInfo implements DrawModifier {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidEdgeEffectOverscrollEffect f2685a;

    /* renamed from: b, reason: collision with root package name */
    public final EdgeEffectWrapper f2686b;

    /* renamed from: c, reason: collision with root package name */
    public final OverscrollConfiguration f2687c;

    public DrawGlowOverscrollModifier(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, OverscrollConfiguration overscrollConfiguration) {
        this.f2685a = androidEdgeEffectOverscrollEffect;
        this.f2686b = edgeEffectWrapper;
        this.f2687c = overscrollConfiguration;
    }

    public static boolean a(float f2, long j2, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f2);
        canvas.translate(Offset.g(j2), Offset.h(j2));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void z(ContentDrawScope contentDrawScope) {
        long b2 = contentDrawScope.b();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f2685a;
        androidEdgeEffectOverscrollEffect.l(b2);
        if (Size.e(contentDrawScope.b())) {
            contentDrawScope.P1();
            return;
        }
        contentDrawScope.P1();
        androidEdgeEffectOverscrollEffect.f2445c.getValue();
        Canvas b3 = AndroidCanvas_androidKt.b(contentDrawScope.A1().a());
        EdgeEffectWrapper edgeEffectWrapper = this.f2686b;
        boolean f2 = EdgeEffectWrapper.f(edgeEffectWrapper.f2694f);
        OverscrollConfiguration overscrollConfiguration = this.f2687c;
        boolean a2 = f2 ? a(270.0f, OffsetKt.a(-Size.b(contentDrawScope.b()), contentDrawScope.y1(overscrollConfiguration.f2837b.b(contentDrawScope.getLayoutDirection()))), edgeEffectWrapper.c(), b3) : false;
        if (EdgeEffectWrapper.f(edgeEffectWrapper.d)) {
            a2 = a(0.0f, OffsetKt.a(0.0f, contentDrawScope.y1(overscrollConfiguration.f2837b.d())), edgeEffectWrapper.e(), b3) || a2;
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.f2695g)) {
            a2 = a(90.0f, OffsetKt.a(0.0f, contentDrawScope.y1(overscrollConfiguration.f2837b.c(contentDrawScope.getLayoutDirection())) + (-((float) a.t0(Size.d(contentDrawScope.b()))))), edgeEffectWrapper.d(), b3) || a2;
        }
        if (EdgeEffectWrapper.f(edgeEffectWrapper.e)) {
            if (!a(180.0f, OffsetKt.a(-Size.d(contentDrawScope.b()), (-Size.b(contentDrawScope.b())) + contentDrawScope.y1(overscrollConfiguration.f2837b.a())), edgeEffectWrapper.b(), b3) && !a2) {
                return;
            }
        } else if (!a2) {
            return;
        }
        androidEdgeEffectOverscrollEffect.g();
    }
}
