package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Set f9714b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    public boolean f9715c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9716d;

    public final void a() {
        this.f9716d = true;
        Iterator it = w4.m.d(this.f9714b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
    }

    public final void b() {
        this.f9715c = true;
        Iterator it = w4.m.d(this.f9714b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    public final void c() {
        this.f9715c = false;
        Iterator it = w4.m.d(this.f9714b).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void e(h hVar) {
        this.f9714b.remove(hVar);
    }

    @Override // com.bumptech.glide.manager.g
    public final void k(h hVar) {
        this.f9714b.add(hVar);
        if (this.f9716d) {
            hVar.onDestroy();
        } else if (this.f9715c) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }
}
