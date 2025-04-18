package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LabelKt$HandleInteractions$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipState f9637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9638c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$2(boolean z2, TooltipState tooltipState, MutableInteractionSource mutableInteractionSource, int i2) {
        super(2);
        this.f9636a = z2;
        this.f9637b = tooltipState;
        this.f9638c = mutableInteractionSource;
        this.d = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.d | 1);
        TooltipState tooltipState = this.f9637b;
        MutableInteractionSource mutableInteractionSource = this.f9638c;
        LabelKt.a(this.f9636a, tooltipState, mutableInteractionSource, (Composer) obj, a2);
        return b0.f30125a;
    }
}
