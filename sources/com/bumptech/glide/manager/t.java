package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Set f9749b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        Iterator it = w4.m.d(this.f9749b).iterator();
        while (it.hasNext()) {
            ((t4.e) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        Iterator it = w4.m.d(this.f9749b).iterator();
        while (it.hasNext()) {
            ((t4.e) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        Iterator it = w4.m.d(this.f9749b).iterator();
        while (it.hasNext()) {
            ((t4.e) it.next()).onStop();
        }
    }
}
