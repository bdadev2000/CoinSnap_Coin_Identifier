package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        String a = a((a<IN, OUT>) in);
        l.a aVar = this.f9988g.get(a);
        if (aVar != null) {
            List<h> list = aVar.a;
            Object a10 = c.a(list, ((i) bVar).a, this).a((b) in);
            return !l.a(list) ? a10 : bVar.a((b<OUT>) a10);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(a)));
    }

    public abstract String a(IN in);
}
