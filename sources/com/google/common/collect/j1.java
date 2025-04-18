package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j1 extends b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11981d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f11982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11983g;

    public j1(Iterator it, ra.j jVar) {
        this.f11982f = it;
        this.f11983g = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.google.common.collect.b
    public final Object a() {
        int i10 = this.f11981d;
        Object obj = this.f11983g;
        Iterator it = this.f11982f;
        switch (i10) {
            case 0:
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((ra.j) obj).apply(next)) {
                        return next;
                    }
                }
                this.f11903b = 3;
                return null;
            default:
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((k2) obj).f11993f.contains(next2)) {
                        return next2;
                    }
                }
                this.f11903b = 3;
                return null;
        }
    }

    public j1(k2 k2Var) {
        this.f11983g = k2Var;
        this.f11982f = k2Var.f11992d.iterator();
    }
}
