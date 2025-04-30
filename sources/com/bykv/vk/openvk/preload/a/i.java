package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends k implements Iterable<k> {

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f13129a = new ArrayList();

    public final void a(k kVar) {
        if (kVar == null) {
            kVar = m.f13130a;
        }
        this.f13129a.add(kVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final String b() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final double c() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final long d() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final int e() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof i) || !((i) obj).f13129a.equals(this.f13129a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean f() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f13129a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return this.f13129a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final Number a() {
        if (this.f13129a.size() == 1) {
            return this.f13129a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
