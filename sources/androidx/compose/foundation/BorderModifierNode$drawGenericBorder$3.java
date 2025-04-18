package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BorderModifierNode$drawGenericBorder$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f2592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f2593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2594c;
    public final /* synthetic */ ColorFilter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$3(Rect rect, f0 f0Var, long j2, BlendModeColorFilter blendModeColorFilter) {
        super(1);
        this.f2592a = rect;
        this.f2593b = f0Var;
        this.f2594c = j2;
        this.d = blendModeColorFilter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        float f3;
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        Rect rect = this.f2592a;
        float f4 = rect.f14914a;
        f0 f0Var = this.f2593b;
        long j2 = this.f2594c;
        ColorFilter colorFilter = this.d;
        CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = contentDrawScope.A1().f15139a;
        float f5 = rect.f14915b;
        canvasDrawScopeKt$asDrawTransform$1.g(f4, f5);
        try {
        } catch (Throwable th) {
            th = th;
            f2 = f5;
            f3 = f4;
        }
        try {
            DrawScope.W(contentDrawScope, (ImageBitmap) f0Var.f30930a, 0L, j2, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890);
            contentDrawScope.A1().f15139a.g(-f4, -f5);
            return b0.f30125a;
        } catch (Throwable th2) {
            th = th2;
            f2 = f5;
            f3 = f4;
            contentDrawScope.A1().f15139a.g(-f3, -f2);
            throw th;
        }
    }
}
