package androidx.compose.ui.focus;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusTransactionsKt$requestFocus$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14900a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKt$requestFocus$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.f14900a = focusTargetNode;
    }

    @Override // q0.a
    public final Object invoke() {
        FocusTargetNode focusTargetNode = this.f14900a;
        if (focusTargetNode.f14688a.f14699n) {
            FocusEventModifierNodeKt.b(focusTargetNode);
        }
        return b0.f30125a;
    }
}
