package com.bykv.vk.openvk.preload.a;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class t<T> {
    public final t<T> a() {
        return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.t.1
            @Override // com.bykv.vk.openvk.preload.a.t
            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException {
                if (t9 == null) {
                    cVar.e();
                } else {
                    t.this.a(cVar, t9);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return (T) t.this.a(aVar);
            }
        };
    }

    public abstract T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException;

    public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t9) throws IOException;

    public final k a(T t9) {
        try {
            com.bykv.vk.openvk.preload.a.b.a.f fVar = new com.bykv.vk.openvk.preload.a.b.a.f();
            a(fVar, t9);
            if (fVar.f12891a.isEmpty()) {
                return fVar.b;
            }
            throw new IllegalStateException("Expected one JSON element but was " + fVar.f12891a);
        } catch (IOException e4) {
            throw new l(e4);
        }
    }
}
