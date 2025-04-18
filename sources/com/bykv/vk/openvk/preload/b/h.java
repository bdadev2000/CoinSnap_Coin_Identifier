package com.bykv.vk.openvk.preload.b;

/* loaded from: classes.dex */
public final class h {
    Class<? extends d> a;

    /* renamed from: b, reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.b.a f9979b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f9980c;

    public /* synthetic */ h(a aVar, byte b3) {
        this(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {
        Class<? extends d> a;

        /* renamed from: b, reason: collision with root package name */
        public com.bykv.vk.openvk.preload.b.b.a f9981b;

        /* renamed from: c, reason: collision with root package name */
        public Object[] f9982c;

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final h a() {
            return new h(this, (byte) 0);
        }
    }

    private h(a aVar) {
        Class<? extends d> cls = aVar.a;
        this.a = cls;
        this.f9979b = aVar.f9981b;
        this.f9980c = aVar.f9982c;
        if (cls == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
