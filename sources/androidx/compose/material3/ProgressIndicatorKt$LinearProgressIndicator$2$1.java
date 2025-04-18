package androidx.compose.material3;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ProgressIndicatorKt$LinearProgressIndicator$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$2$1(long j2, int i2) {
        super(1);
        this.f10697a = j2;
        this.f10698b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float f2 = ProgressIndicatorDefaults.e;
        long j2 = this.f10697a;
        float min = Math.min(drawScope.y1(f2), Size.b(drawScope.b()));
        float b2 = (Size.b(drawScope.b()) - min) / 2;
        if (StrokeCap.a(this.f10698b, 1)) {
            float f3 = min / 2.0f;
            drawScope.j1(j2, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : f3, (r19 & 4) != 0 ? drawScope.F1() : OffsetKt.a((Size.d(drawScope.b()) - f3) - b2, Size.b(drawScope.b()) / 2.0f), (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
        } else {
            DrawScope.R0(drawScope, j2, OffsetKt.a((Size.d(drawScope.b()) - min) - b2, (Size.b(drawScope.b()) - min) / 2.0f), SizeKt.a(min, min), 0.0f, null, 120);
        }
        return b0.f30125a;
    }
}
