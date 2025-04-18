package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: h, reason: collision with root package name */
    private String f9986h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a = a((j<IN, OUT>) in);
        this.f9986h = a;
        l.a aVar = this.f9988g.get(a);
        while (aVar != null) {
            List<h> list = aVar.a;
            try {
                Object a10 = c.a(list, bVar.a, this).a((b) in);
                return !l.a(list) ? a10 : bVar.a((b<OUT>) a10);
            } catch (i.a e2) {
                Throwable cause = e2.getCause();
                new m(bVar);
                String a11 = a(in, cause, this.f9986h);
                this.f9986h = a11;
                aVar = this.f9988g.get(a11);
            } catch (Throwable th2) {
                new m(bVar);
                String a12 = a(in, th2, this.f9986h);
                this.f9986h = a12;
                aVar = this.f9988g.get(a12);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f9986h);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th2, String str);
}
