package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.b.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    private final Map<Class<? extends d<?, ?>>, com.bykv.vk.openvk.preload.b.b.b> a = new HashMap();

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.a) {
            com.bykv.vk.openvk.preload.b.b.b bVar = this.a.get(cls);
            if (bVar == null) {
                bVar = new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                this.a.put(cls, bVar);
            }
            bVar.a(aVar);
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class<? extends d<?, ?>> cls) {
        com.bykv.vk.openvk.preload.b.b.b bVar;
        synchronized (this.a) {
            bVar = this.a.get(cls);
        }
        return bVar;
    }
}
