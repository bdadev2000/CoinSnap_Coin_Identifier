package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SnapshotStateList$addAll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f14590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateList$addAll$1(int i2, Collection collection) {
        super(1);
        this.f14589a = i2;
        this.f14590b = collection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.f14589a, this.f14590b));
    }
}
