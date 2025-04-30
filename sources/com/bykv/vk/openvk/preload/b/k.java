package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;

/* loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    protected IN f13157g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.f13157g = in;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e4) {
            return a((b) bVar, e4.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    public abstract boolean a(Throwable th);

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (a(th)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e4) {
                th = e4.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public OUT a() {
        return this.f13157g;
    }
}
