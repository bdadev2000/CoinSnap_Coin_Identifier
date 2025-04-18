package androidx.lifecycle.viewmodel.internal;

import b1.d0;
import h0.l;
import kotlin.jvm.internal.e;
import p0.a;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f20242a;

    public CloseableCoroutineScope(l lVar) {
        a.s(lVar, "coroutineContext");
        this.f20242a = lVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e.h(this.f20242a, null);
    }

    @Override // b1.d0
    public final l getCoroutineContext() {
        return this.f20242a;
    }
}
