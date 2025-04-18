package androidx.compose.ui.focus;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class FocusOwnerImpl$moveFocus$focusSearchSuccess$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f14855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$focusSearchSuccess$1(int i2, f0 f0Var) {
        super(1);
        this.f14855a = f0Var;
        this.f14856b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Boolean h2 = FocusTransactionsKt.h((FocusTargetNode) obj, this.f14856b);
        this.f14855a.f30930a = h2;
        return Boolean.valueOf(h2 != null ? h2.booleanValue() : false);
    }
}
