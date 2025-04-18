package com.applovin.impl;

import com.applovin.impl.tm;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class an extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final WeakReference f22918h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f22919i;

    public an(fi fiVar, Object obj, String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.f22918h = new WeakReference(fiVar);
        this.f22919i = obj;
    }

    public static void a(long j2, fi fiVar, Object obj, String str, com.applovin.impl.sdk.j jVar) {
        if (j2 <= 0) {
            return;
        }
        jVar.j0().a(new an(fiVar, obj, str, jVar), tm.b.TIMEOUT, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        fi fiVar = (fi) this.f22918h.get();
        if (fiVar == null || fiVar.c()) {
            return;
        }
        this.f28216a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28216a.J().d(this.f28217b, "Attempting to timeout pending task " + fiVar.b() + " with " + this.f22919i);
        }
        fiVar.a(this.f22919i);
    }
}
