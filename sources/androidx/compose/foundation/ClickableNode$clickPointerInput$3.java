package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class ClickableNode$clickPointerInput$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClickableNode f2646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$clickPointerInput$3(ClickableNode clickableNode) {
        super(1);
        this.f2646a = clickableNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        ClickableNode clickableNode = this.f2646a;
        if (clickableNode.f2411u) {
            clickableNode.f2412v.invoke();
        }
        return b0.f30125a;
    }
}
