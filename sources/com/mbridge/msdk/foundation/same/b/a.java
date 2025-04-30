package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f15713a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private a f15714c;

    /* renamed from: d, reason: collision with root package name */
    private c f15715d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f15715d = cVar;
        aVar.b = str;
        a(aVar);
    }

    public final String b() {
        return this.b;
    }

    public final a c() {
        return this.f15714c;
    }

    public final c d() {
        return this.f15715d;
    }

    private void a(a aVar) {
        if (this.f15713a == null) {
            this.f15713a = new ArrayList();
        }
        aVar.f15714c = this;
        this.f15713a.add(aVar);
    }

    public final void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final List<a> a() {
        return this.f15713a;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(c cVar) {
        this.f15715d = cVar;
    }
}
