package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;

/* loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: g, reason: collision with root package name */
    protected IN f9987g;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.f9987g = in;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e2) {
            return a((b) bVar, e2.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    public abstract boolean a(Throwable th2);

    private Object a(b<OUT> bVar, Throwable th2) throws Throwable {
        while (a(th2)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e2) {
                th2 = e2.getCause();
            } catch (Throwable th3) {
                th2 = th3;
            }
        }
        throw th2;
    }

    public OUT a() {
        return this.f9987g;
    }
}
