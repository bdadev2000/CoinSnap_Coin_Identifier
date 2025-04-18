package androidx.compose.material3;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class DividerKt$HorizontalDivider$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerKt$HorizontalDivider$1$1(long j2, float f2) {
        super(1);
        this.f9229a = f2;
        this.f9230b = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float f2 = this.f9229a;
        float f3 = 2;
        drawScope.b1(this.f9230b, OffsetKt.a(0.0f, drawScope.y1(f2) / f3), OffsetKt.a(Size.d(drawScope.b()), drawScope.y1(f2) / f3), (r26 & 8) != 0 ? 0.0f : drawScope.y1(f2), (r26 & 16) != 0 ? 0 : 0, null, (r26 & 64) != 0 ? 1.0f : 0.0f, null, (r26 & 256) != 0 ? 3 : 0);
        return b0.f30125a;
    }
}
