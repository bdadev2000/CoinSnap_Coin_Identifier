package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SliderDefaults$Track$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderPositions f11236b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(long j2, SliderPositions sliderPositions, long j3, long j4, long j5) {
        super(1);
        this.f11235a = j2;
        this.f11236b = sliderPositions;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.f17495b;
        long a2 = OffsetKt.a(0.0f, Offset.h(drawScope.F1()));
        long a3 = OffsetKt.a(Size.d(drawScope.b()), Offset.h(drawScope.F1()));
        long j2 = z2 ? a3 : a2;
        long j3 = z2 ? a2 : a3;
        drawScope.y1(SliderDefaults.f11223c);
        drawScope.b1(this.f11235a, j2, j3, (r26 & 8) != 0 ? 0.0f : drawScope.y1(SliderKt.f11297a), (r26 & 16) != 0 ? 0 : 1, null, (r26 & 64) != 0 ? 1.0f : 0.0f, null, (r26 & 256) != 0 ? 3 : 0);
        Offset.g(j2);
        Offset.g(j3);
        Offset.g(j2);
        this.f11236b.getClass();
        throw null;
    }
}
