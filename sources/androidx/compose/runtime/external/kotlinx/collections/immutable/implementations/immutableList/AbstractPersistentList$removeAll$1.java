package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AbstractPersistentList$removeAll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f14168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPersistentList$removeAll$1(Collection collection) {
        super(1);
        this.f14168a = collection;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f14168a.contains(obj));
    }
}
