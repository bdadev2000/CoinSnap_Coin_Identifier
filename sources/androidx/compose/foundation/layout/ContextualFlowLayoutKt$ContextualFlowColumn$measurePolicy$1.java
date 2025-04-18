package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.r f3859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1(q0.r rVar) {
        super(4);
        this.f3859a = rVar;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj4).intValue();
        int i2 = ((FlowLineInfo) obj2).f3955a;
        ContextualFlowColumnScopeImpl contextualFlowColumnScopeImpl = new ContextualFlowColumnScopeImpl();
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf((intValue2 << 3) & 112);
        this.f3859a.invoke(contextualFlowColumnScopeImpl, valueOf, (Composer) obj3, valueOf2);
        return b0.f30125a;
    }
}
