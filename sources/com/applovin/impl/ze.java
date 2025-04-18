package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ze {

    /* renamed from: a, reason: collision with root package name */
    private final List f28329a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes3.dex */
    public interface a {
        void a(ge geVar);
    }

    public void a(a aVar) {
        this.f28329a.add(aVar);
    }

    public void b(a aVar) {
        this.f28329a.remove(aVar);
    }

    public void a(ge geVar) {
        Iterator it = new ArrayList(this.f28329a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(geVar);
        }
    }
}
