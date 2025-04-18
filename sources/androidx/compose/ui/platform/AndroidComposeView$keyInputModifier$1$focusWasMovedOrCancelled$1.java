package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusDirection f16252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1(FocusDirection focusDirection) {
        super(1);
        this.f16252a = focusDirection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Boolean h2 = FocusTransactionsKt.h((FocusTargetNode) obj, this.f16252a.f14833a);
        return Boolean.valueOf(h2 != null ? h2.booleanValue() : true);
    }
}
