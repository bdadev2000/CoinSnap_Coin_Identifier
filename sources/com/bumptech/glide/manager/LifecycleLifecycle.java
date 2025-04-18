package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.g0;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements g, u {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9712b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.p f9713c;

    public LifecycleLifecycle(androidx.lifecycle.p pVar) {
        this.f9713c = pVar;
        pVar.a(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final void e(h hVar) {
        this.f9712b.remove(hVar);
    }

    @Override // com.bumptech.glide.manager.g
    public final void k(h hVar) {
        this.f9712b.add(hVar);
        androidx.lifecycle.o oVar = ((x) this.f9713c).f1835d;
        if (oVar == androidx.lifecycle.o.DESTROYED) {
            hVar.onDestroy();
        } else if (oVar.a(androidx.lifecycle.o.STARTED)) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    @g0(androidx.lifecycle.n.ON_DESTROY)
    public void onDestroy(@NonNull v vVar) {
        Iterator it = w4.m.d(this.f9712b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
        vVar.getLifecycle().b(this);
    }

    @g0(androidx.lifecycle.n.ON_START)
    public void onStart(@NonNull v vVar) {
        Iterator it = w4.m.d(this.f9712b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    @g0(androidx.lifecycle.n.ON_STOP)
    public void onStop(@NonNull v vVar) {
        Iterator it = w4.m.d(this.f9712b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}
