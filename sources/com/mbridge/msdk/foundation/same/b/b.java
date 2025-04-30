package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected a f15716a;

    public b(String str) {
        a aVar = new a();
        aVar.a(str);
        aVar.a(c.AD_ROOT);
        List<a> a6 = a();
        if (a6 != null && a6.size() > 0) {
            aVar.a(a6);
        }
        this.f15716a = aVar;
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
        return this.f15716a;
    }
}
