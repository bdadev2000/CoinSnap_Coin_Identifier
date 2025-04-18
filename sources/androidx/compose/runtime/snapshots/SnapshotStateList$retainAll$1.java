package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SnapshotStateList$retainAll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f14591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateList$retainAll$1(Collection collection) {
        super(1);
        this.f14591a = collection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).retainAll(this.f14591a));
    }
}
