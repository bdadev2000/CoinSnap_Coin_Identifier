package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j2 extends b {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f11984d;

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f11985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k2 f11986g;

    public j2(k2 k2Var) {
        this.f11986g = k2Var;
        this.f11984d = k2Var.f11992d.iterator();
        this.f11985f = k2Var.f11993f.iterator();
    }

    @Override // com.google.common.collect.b
    public final Object a() {
        Object next;
        Iterator it = this.f11984d;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.f11985f;
            if (it2.hasNext()) {
                next = it2.next();
            } else {
                this.f11903b = 3;
                return null;
            }
        } while (this.f11986g.f11992d.contains(next));
        return next;
    }
}
