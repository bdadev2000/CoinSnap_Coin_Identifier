package androidx.compose.runtime;

import b1.k;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Latch f13824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, b1.l lVar) {
        super(1);
        this.f13824a = latch;
        this.f13825b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Latch latch = this.f13824a;
        Object obj2 = latch.f13821a;
        k kVar = this.f13825b;
        synchronized (obj2) {
            latch.f13822b.remove(kVar);
        }
        return b0.f30125a;
    }
}
