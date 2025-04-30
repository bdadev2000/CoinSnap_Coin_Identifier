package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.b.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends d<?, ?>>, com.bykv.vk.openvk.preload.b.b.b> f13257a = new HashMap();

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.f13257a) {
            try {
                com.bykv.vk.openvk.preload.b.b.b bVar = this.f13257a.get(cls);
                if (bVar == null) {
                    bVar = new com.bykv.vk.openvk.preload.b.b.b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                    this.f13257a.put(cls, bVar);
                }
                bVar.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class<? extends d<?, ?>> cls) {
        com.bykv.vk.openvk.preload.b.b.b bVar;
        synchronized (this.f13257a) {
            bVar = this.f13257a.get(cls);
        }
        return bVar;
    }
}
