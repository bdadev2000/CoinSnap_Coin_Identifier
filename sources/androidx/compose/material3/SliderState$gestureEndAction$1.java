package androidx.compose.material3;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SliderState$gestureEndAction$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderState f11505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderState$gestureEndAction$1(SliderState sliderState) {
        super(0);
        this.f11505a = sliderState;
    }

    @Override // q0.a
    public final Object invoke() {
        q0.a aVar;
        SliderState sliderState = this.f11505a;
        if (!((Boolean) sliderState.f11495k.getValue()).booleanValue() && (aVar = sliderState.f11488b) != null) {
            aVar.invoke();
        }
        return b0.f30125a;
    }
}
