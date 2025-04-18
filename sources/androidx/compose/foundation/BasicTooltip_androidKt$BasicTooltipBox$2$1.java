package androidx.compose.foundation;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class BasicTooltip_androidKt$BasicTooltipBox$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipState f2518a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$BasicTooltipBox$2$1(BasicTooltipState basicTooltipState) {
        super(1);
        this.f2518a = basicTooltipState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final BasicTooltipState basicTooltipState = this.f2518a;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                BasicTooltipState.this.a();
            }
        };
    }
}
