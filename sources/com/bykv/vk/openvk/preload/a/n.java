package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: a, reason: collision with root package name */
    public final com.bykv.vk.openvk.preload.a.b.h<String, k> f13131a = new com.bykv.vk.openvk.preload.a.b.h<>();

    public final void a(String str, k kVar) {
        com.bykv.vk.openvk.preload.a.b.h<String, k> hVar = this.f13131a;
        if (kVar == null) {
            kVar = m.f13130a;
        }
        hVar.put(str, kVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof n) || !((n) obj).f13131a.equals(this.f13131a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13131a.hashCode();
    }
}
