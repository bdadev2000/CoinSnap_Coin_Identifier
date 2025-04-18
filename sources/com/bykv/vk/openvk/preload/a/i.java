package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends k implements Iterable<k> {
    private final List<k> a = new ArrayList();

    public final void a(k kVar) {
        if (kVar == null) {
            kVar = m.a;
        }
        this.a.add(kVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        if (this.a.size() == 1) {
            return this.a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        if (this.a.size() == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        if (this.a.size() == 1) {
            return this.a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        if (this.a.size() == 1) {
            return this.a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).a.equals(this.a);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        if (this.a.size() == 1) {
            return this.a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return this.a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        if (this.a.size() == 1) {
            return this.a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
