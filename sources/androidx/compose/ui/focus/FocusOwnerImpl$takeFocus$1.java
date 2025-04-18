package androidx.compose.ui.focus;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class FocusOwnerImpl$takeFocus$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14857a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$takeFocus$1(int i2) {
        super(1);
        this.f14857a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Boolean h2 = FocusTransactionsKt.h((FocusTargetNode) obj, this.f14857a);
        return Boolean.valueOf(h2 != null ? h2.booleanValue() : false);
    }
}
