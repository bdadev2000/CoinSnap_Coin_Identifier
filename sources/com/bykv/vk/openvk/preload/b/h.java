package com.bykv.vk.openvk.preload.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f13149a;
    com.bykv.vk.openvk.preload.b.b.a b;

    /* renamed from: c, reason: collision with root package name */
    Object[] f13150c;

    public /* synthetic */ h(a aVar, byte b) {
        this(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Class<? extends d> f13151a;
        public com.bykv.vk.openvk.preload.b.b.a b;

        /* renamed from: c, reason: collision with root package name */
        public Object[] f13152c;

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f13151a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final h a() {
            return new h(this, (byte) 0);
        }
    }

    private h(a aVar) {
        Class<? extends d> cls = aVar.f13151a;
        this.f13149a = cls;
        this.b = aVar.b;
        this.f13150c = aVar.f13152c;
        if (cls == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
