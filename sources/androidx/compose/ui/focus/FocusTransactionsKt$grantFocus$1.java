package androidx.compose.ui.focus;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FocusTransactionsKt$grantFocus$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTransactionsKt$grantFocus$1(FocusTargetNode focusTargetNode) {
        super(0);
        this.f14899a = focusTargetNode;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f14899a.e2();
        return b0.f30125a;
    }
}
