package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {
    private List<a> a;

    /* renamed from: b, reason: collision with root package name */
    private String f13311b;

    /* renamed from: c, reason: collision with root package name */
    private a f13312c;

    /* renamed from: d, reason: collision with root package name */
    private c f13313d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f13313d = cVar;
        aVar.f13311b = str;
        a(aVar);
    }

    public final String b() {
        return this.f13311b;
    }

    public final a c() {
        return this.f13312c;
    }

    public final c d() {
        return this.f13313d;
    }

    private void a(a aVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        aVar.f13312c = this;
        this.a.add(aVar);
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
        return this.a;
    }

    public final void a(String str) {
        this.f13311b = str;
    }

    public final void a(c cVar) {
        this.f13313d = cVar;
    }
}
