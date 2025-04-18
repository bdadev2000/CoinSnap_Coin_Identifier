package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes3.dex */
final class CombinedClickableNodeImpl$clickPointerInput$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNodeImpl f2670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNodeImpl$clickPointerInput$3(CombinedClickableNodeImpl combinedClickableNodeImpl) {
        super(1);
        this.f2670a = combinedClickableNodeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        a aVar = this.f2670a.J;
        if (aVar != null) {
            aVar.invoke();
        }
        return b0.f30125a;
    }
}
