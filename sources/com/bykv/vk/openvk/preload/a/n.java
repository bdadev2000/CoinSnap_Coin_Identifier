package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public final class n extends k {
    public final com.bykv.vk.openvk.preload.a.b.h<String, k> a = new com.bykv.vk.openvk.preload.a.b.h<>();

    public final void a(String str, k kVar) {
        com.bykv.vk.openvk.preload.a.b.h<String, k> hVar = this.a;
        if (kVar == null) {
            kVar = m.a;
        }
        hVar.put(str, kVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof n) || !((n) obj).a.equals(this.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
