package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class BasicTooltip_androidKt$BasicTooltipBox$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TooltipState f12877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$BasicTooltipBox$2$1(TooltipState tooltipState) {
        super(1);
        this.f12877a = tooltipState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final TooltipState tooltipState = this.f12877a;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                TooltipState.this.a();
            }
        };
    }
}
