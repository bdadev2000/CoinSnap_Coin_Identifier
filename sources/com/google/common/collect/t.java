package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class t extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f12031c;

    public t(u uVar, int i10) {
        this.f12030b = i10;
        if (i10 != 1) {
            this.f12031c = uVar;
        } else {
            this.f12031c = uVar;
        }
    }

    public final void a() {
        this.f12031c.clear();
    }

    public final boolean b(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f12031c.b(entry.getKey(), entry.getValue());
        }
        return false;
    }

    public final boolean c(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.f12031c.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f12030b) {
            case 0:
                this.f12031c.clear();
                return;
            default:
                a();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f12030b) {
            case 0:
                return this.f12031c.c(obj);
            default:
                return b(obj);
        }
    }

    public final int d() {
        return this.f12031c.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f12030b;
        u uVar = this.f12031c;
        switch (i10) {
            case 0:
                return uVar.g();
            default:
                return uVar.f();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f12030b) {
            case 1:
                return c(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f12030b) {
            case 0:
                return this.f12031c.size();
            default:
                return d();
        }
    }
}
