package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
public final class LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparable f4966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Integer num) {
        super(1);
        this.f4966a = num;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Integer.valueOf(q.c(Integer.valueOf(((LazyStaggeredGridLaneInfo.SpannedItem) obj).f4968a), this.f4966a));
    }
}
