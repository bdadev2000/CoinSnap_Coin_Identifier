package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ue {

    /* renamed from: a, reason: collision with root package name */
    private final List f11590a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes.dex */
    public interface a {
        void a(be beVar);
    }

    public void a(a aVar) {
        this.f11590a.add(aVar);
    }

    public void b(a aVar) {
        this.f11590a.remove(aVar);
    }

    public void a(be beVar) {
        Iterator it = new ArrayList(this.f11590a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(beVar);
        }
    }
}
