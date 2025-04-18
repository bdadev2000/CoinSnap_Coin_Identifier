package androidx.room;

import androidx.annotation.RestrictTo;
import b1.f0;
import h0.i;
import h0.j;
import h0.k;
import h0.l;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.q;
import q0.p;

@RestrictTo
/* loaded from: classes4.dex */
public final class TransactionElement implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final Key f21390c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final i f21391a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f21392b = new AtomicInteger(0);

    /* loaded from: classes4.dex */
    public static final class Key implements k {
    }

    public TransactionElement(i iVar) {
        this.f21391a = iVar;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.j
    public final k getKey() {
        return f21390c;
    }

    @Override // h0.l
    public final j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public final l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}
