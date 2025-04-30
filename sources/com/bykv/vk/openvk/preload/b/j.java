package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.i;
import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: h, reason: collision with root package name */
    private String f13156h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a6 = a((j<IN, OUT>) in);
        this.f13156h = a6;
        l.a aVar = this.f13158g.get(a6);
        while (aVar != null) {
            List<h> list = aVar.f13159a;
            try {
                Object a9 = c.a(list, bVar.f13153a, this).a((b) in);
                return !l.a(list) ? a9 : bVar.a((b<OUT>) a9);
            } catch (i.a e4) {
                Throwable cause = e4.getCause();
                new m(bVar);
                String a10 = a(in, cause, this.f13156h);
                this.f13156h = a10;
                aVar = this.f13158g.get(a10);
            } catch (Throwable th) {
                new m(bVar);
                String a11 = a(in, th, this.f13156h);
                this.f13156h = a11;
                aVar = this.f13158g.get(a11);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f13156h);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th, String str);
}
