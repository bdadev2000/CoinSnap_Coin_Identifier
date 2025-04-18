package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class BorderModifierNode$drawRoundRectBorder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Brush f2596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2597c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Stroke f2601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$1(boolean z2, Brush brush, long j2, float f2, float f3, long j3, long j4, Stroke stroke) {
        super(1);
        this.f2595a = z2;
        this.f2596b = brush;
        this.f2597c = j2;
        this.d = f2;
        this.f2598f = f3;
        this.f2599g = j3;
        this.f2600h = j4;
        this.f2601i = stroke;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        if (this.f2595a) {
            DrawScope.l0(contentDrawScope, this.f2596b, 0L, 0L, this.f2597c, null, 246);
        } else {
            long j2 = this.f2597c;
            float b2 = CornerRadius.b(j2);
            float f2 = this.d;
            if (b2 < f2) {
                float f3 = this.f2598f;
                float d = Size.d(contentDrawScope.b());
                float f4 = this.f2598f;
                float f5 = d - f4;
                float b3 = Size.b(contentDrawScope.b()) - f4;
                Brush brush = this.f2596b;
                long j3 = this.f2597c;
                CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
                long b4 = A1.b();
                A1.a().p();
                try {
                    A1.f15139a.b(f3, f3, f5, b3, 0);
                    DrawScope.l0(contentDrawScope, brush, 0L, 0L, j3, null, 246);
                } finally {
                    d.A(A1, b4);
                }
            } else {
                DrawScope.l0(contentDrawScope, this.f2596b, this.f2599g, this.f2600h, BorderKt.a(j2, f2), this.f2601i, 208);
            }
        }
        return b0.f30125a;
    }
}
