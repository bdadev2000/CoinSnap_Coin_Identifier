package com.google.common.collect;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11940b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f11941c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11942d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11943f;

    public f(o oVar) {
        Iterator it;
        this.f11943f = oVar;
        Collection collection = oVar.f12009c;
        this.f11942d = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11941c = it;
    }

    public final void a() {
        Object obj = this.f11943f;
        ((o) obj).b();
        if (((o) obj).f12009c == ((Collection) this.f11942d)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f11940b;
        Iterator it = this.f11941c;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                a();
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f11940b;
        Iterator it = this.f11941c;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f11942d = (Collection) entry.getValue();
                return ((g) this.f11943f).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f11942d = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f11940b;
        boolean z10 = true;
        Object obj = this.f11943f;
        Iterator it = this.f11941c;
        switch (i10) {
            case 0:
                if (((Collection) this.f11942d) == null) {
                    z10 = false;
                }
                v8.u0.n("no calls to next() since the last call to remove()", z10);
                it.remove();
                ((g) obj).f11956f.f12025g -= ((Collection) this.f11942d).size();
                ((Collection) this.f11942d).clear();
                this.f11942d = null;
                return;
            case 1:
                if (((Map.Entry) this.f11942d) == null) {
                    z10 = false;
                }
                v8.u0.n("no calls to next() since the last call to remove()", z10);
                Collection collection = (Collection) ((Map.Entry) this.f11942d).getValue();
                it.remove();
                ((i) obj).f11972d.f12025g -= collection.size();
                collection.clear();
                this.f11942d = null;
                return;
            default:
                it.remove();
                o oVar = (o) obj;
                r rVar = oVar.f12012g;
                rVar.f12025g--;
                oVar.c();
                return;
        }
    }

    public f(o oVar, ListIterator listIterator) {
        this.f11943f = oVar;
        this.f11942d = oVar.f12009c;
        this.f11941c = listIterator;
    }

    public f(i iVar, Iterator it) {
        this.f11943f = iVar;
        this.f11941c = it;
    }

    public f(g gVar) {
        this.f11943f = gVar;
        this.f11941c = gVar.f11955d.entrySet().iterator();
    }
}
