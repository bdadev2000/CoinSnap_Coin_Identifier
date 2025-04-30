package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a6 = a((a<IN, OUT>) in);
        l.a aVar = this.f13158g.get(a6);
        if (aVar != null) {
            List<h> list = aVar.f13159a;
            Object a9 = c.a(list, ((i) bVar).f13153a, this).a((b) in);
            return !l.a(list) ? a9 : bVar.a((b<OUT>) a9);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(a6)));
    }

    public abstract String a(IN in);
}
