package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SliderDefaults$Track$9$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$9$1(SliderColors sliderColors, boolean z2) {
        super(2);
        this.f11295a = sliderColors;
        this.f11296b = z2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DrawScope drawScope = (DrawScope) obj;
        long j2 = ((Offset) obj2).f14913a;
        SliderDefaults sliderDefaults = SliderDefaults.f11221a;
        SliderDefaults.d(drawScope, j2, SliderDefaults.f11222b, this.f11295a.b(this.f11296b, true));
        return b0.f30125a;
    }
}
