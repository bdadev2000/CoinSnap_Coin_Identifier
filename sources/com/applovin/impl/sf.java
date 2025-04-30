package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class sf {

    /* loaded from: classes.dex */
    public static class a extends AbstractC0687e {

        /* renamed from: g, reason: collision with root package name */
        transient Supplier f11190g;

        public a(Map map, Supplier supplier) {
            super(map);
            this.f11190g = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.impl.AbstractC0702h
        public Map b() {
            return h();
        }

        @Override // com.applovin.impl.AbstractC0702h
        public Set c() {
            return i();
        }

        @Override // com.applovin.impl.AbstractC0692f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public List g() {
            return (List) this.f11190g.get();
        }
    }

    public static boolean a(pf pfVar, Object obj) {
        if (obj == pfVar) {
            return true;
        }
        if (obj instanceof pf) {
            return pfVar.a().equals(((pf) obj).a());
        }
        return false;
    }

    public static ac a(Map map, Supplier supplier) {
        return new a(map, supplier);
    }
}
