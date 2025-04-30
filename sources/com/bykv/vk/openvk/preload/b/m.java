package com.bykv.vk.openvk.preload.b;

/* loaded from: classes.dex */
final class m<IN> implements b<IN> {

    /* renamed from: a, reason: collision with root package name */
    private b<IN> f13161a;

    public m(b<IN> bVar) {
        this.f13161a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(IN in) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <O> O b(Class<? extends d<?, O>> cls) {
        return (O) this.f13161a.b(cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final <I> I a(Class<? extends d<I, ?>> cls) {
        return (I) this.f13161a.a((Class) cls);
    }
}
