package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements b {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // com.bumptech.glide.manager.b
    public final void a(boolean z10) {
        ArrayList arrayList;
        w4.m.a();
        synchronized (this.a) {
            arrayList = new ArrayList((Set) this.a.f9742c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(z10);
        }
    }
}
