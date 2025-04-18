package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CombinedClickableNodeImpl$clickPointerInput$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNodeImpl f2674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNodeImpl$clickPointerInput$5(CombinedClickableNodeImpl combinedClickableNodeImpl) {
        super(1);
        this.f2674a = combinedClickableNodeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        CombinedClickableNodeImpl combinedClickableNodeImpl = this.f2674a;
        if (combinedClickableNodeImpl.f2411u) {
            combinedClickableNodeImpl.f2412v.invoke();
        }
        return b0.f30125a;
    }
}
