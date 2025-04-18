package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ue {
    private final List a = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes.dex */
    public interface a {
        void a(be beVar);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b(a aVar) {
        this.a.remove(aVar);
    }

    public void a(be beVar) {
        Iterator it = new ArrayList(this.a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(beVar);
        }
    }
}
