package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class d1 extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11930f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object f11931g;

    public d1(Object obj) {
        obj.getClass();
        this.f11931g = obj;
    }

    @Override // com.google.common.collect.b1, com.google.common.collect.k0
    public final r0 a() {
        switch (this.f11930f) {
            case 1:
                return r0.o(this.f11931g);
            default:
                return super.a();
        }
    }

    @Override // com.google.common.collect.k0
    public final int b(Object[] objArr, int i10) {
        switch (this.f11930f) {
            case 1:
                objArr[i10] = this.f11931g;
                return i10 + 1;
            default:
                return super.b(objArr, i10);
        }
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f11930f;
        Object obj2 = this.f11931g;
        switch (i10) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return ((f1) obj2).b(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // com.google.common.collect.k0
    public final boolean f() {
        return false;
    }

    @Override // com.google.common.collect.k0
    /* renamed from: g */
    public final q2 iterator() {
        int i10 = this.f11930f;
        Object obj = this.f11931g;
        switch (i10) {
            case 0:
                f1 f1Var = (f1) obj;
                f1Var.getClass();
                return new v0(f1Var);
            default:
                return new k1(obj);
        }
    }

    @Override // com.google.common.collect.b1, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.f11930f) {
            case 1:
                return this.f11931g.hashCode();
            default:
                return c6.c.r(this);
        }
    }

    @Override // com.google.common.collect.k0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.f11930f) {
            case 0:
                return iterator();
            default:
                return iterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11930f) {
            case 0:
                return ((f1) this.f11931g).f12057g;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f11930f) {
            case 1:
                String obj = this.f11931g.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(obj);
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
