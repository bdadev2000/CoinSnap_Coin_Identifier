package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class BorderKt$drawRectBorder$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Brush f2582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2584c;
    public final /* synthetic */ DrawStyle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRectBorder$1(Brush brush, long j2, long j3, DrawStyle drawStyle) {
        super(1);
        this.f2582a = brush;
        this.f2583b = j2;
        this.f2584c = j3;
        this.d = drawStyle;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        DrawScope.a1(contentDrawScope, this.f2582a, this.f2583b, this.f2584c, 0.0f, this.d, null, 104);
        return b0.f30125a;
    }
}
