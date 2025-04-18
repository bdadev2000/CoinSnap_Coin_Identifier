package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class h implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f11962b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11963c = null;

    /* renamed from: d, reason: collision with root package name */
    public Collection f11964d = null;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f11965f = m1.f12003b;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f11966g;

    public h(r rVar) {
        this.f11966g = rVar;
        this.f11962b = rVar.f12024f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11962b.hasNext() || this.f11965f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f11965f.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f11962b.next();
            this.f11963c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f11964d = collection;
            this.f11965f = collection.iterator();
        }
        Object obj = this.f11963c;
        Object next = this.f11965f.next();
        switch (((d) this).f11928h) {
            case 0:
                return next;
            default:
                return new l0(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11965f.remove();
        Collection collection = this.f11964d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f11962b.remove();
        }
        r rVar = this.f11966g;
        rVar.f12025g--;
    }
}
