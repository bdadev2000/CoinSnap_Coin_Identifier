package androidx.compose.material3;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class RangeSliderState$gestureEndAction$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f10776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderState$gestureEndAction$1(RangeSliderState rangeSliderState) {
        super(1);
        this.f10776a = rangeSliderState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        q0.a aVar = this.f10776a.f10762b;
        if (aVar != null) {
            aVar.invoke();
        }
        return b0.f30125a;
    }
}
