package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import u7.AbstractC2816g;

/* loaded from: classes.dex */
public final class r implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    public final HashMap b;

    public r() {
        this.b = new HashMap();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            return new q(this.b);
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final void a(b bVar, List list) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(bVar, "accessTokenAppIdPair");
            G7.j.e(list, "appEvents");
            HashMap hashMap = this.b;
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, AbstractC2816g.U(list));
                return;
            }
            List list2 = (List) hashMap.get(bVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public r(HashMap hashMap) {
        G7.j.e(hashMap, "appEventMap");
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
