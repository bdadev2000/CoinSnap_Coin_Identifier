package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class AndroidComposeView$requestFocus$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocus$1(int i2) {
        super(1);
        this.f16257a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Boolean h2 = FocusTransactionsKt.h((FocusTargetNode) obj, this.f16257a);
        return Boolean.valueOf(h2 != null ? h2.booleanValue() : false);
    }
}
