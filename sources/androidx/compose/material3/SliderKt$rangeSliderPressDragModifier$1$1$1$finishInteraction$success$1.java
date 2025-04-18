package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f11469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$finishInteraction$success$1(RangeSliderState rangeSliderState, b0 b0Var) {
        super(1);
        this.f11468a = rangeSliderState;
        this.f11469b = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float g2 = Offset.g(PointerEventKt.f((PointerInputChange) obj, false));
        boolean z2 = this.f11469b.f30919a;
        RangeSliderState rangeSliderState = this.f11468a;
        if (((Boolean) rangeSliderState.f10772n.getValue()).booleanValue()) {
            g2 = -g2;
        }
        rangeSliderState.g(g2, z2);
        return d0.b0.f30125a;
    }
}
