package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b {
    protected a a;

    public b(String str) {
        a aVar = new a();
        aVar.a(str);
        aVar.a(c.AD_ROOT);
        List<a> a = a();
        if (a != null && a.size() > 0) {
            aVar.a(a);
        }
        this.a = aVar;
    }

    public final a a(ArrayList<a> arrayList, c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        arrayList.add(aVar);
        return aVar;
    }

    public abstract List<a> a();

    public final a b() {
        return this.a;
    }
}
