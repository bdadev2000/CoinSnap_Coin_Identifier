package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SliderDefaults$Track$4$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$4$1(SliderColors sliderColors, boolean z2) {
        super(2);
        this.f11268a = sliderColors;
        this.f11269b = z2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DrawScope drawScope = (DrawScope) obj;
        long j2 = ((Offset) obj2).f14913a;
        SliderDefaults sliderDefaults = SliderDefaults.f11221a;
        SliderDefaults.d(drawScope, j2, SliderDefaults.f11222b, this.f11268a.b(this.f11269b, true));
        return b0.f30125a;
    }
}
