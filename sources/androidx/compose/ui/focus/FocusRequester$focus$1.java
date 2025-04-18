package androidx.compose.ui.focus;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class FocusRequester$focus$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final FocusRequester$focus$1 f14875a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(FocusTransactionsKt.g((FocusTargetNode) obj));
    }
}
