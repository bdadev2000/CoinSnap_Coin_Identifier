package com.applovin.impl.sdk.network;

import com.applovin.impl.oj;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f11108s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11109t;

    /* loaded from: classes.dex */
    public static class a extends a.C0036a {

        /* renamed from: r, reason: collision with root package name */
        private String f11110r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f11111s;

        public a(k kVar) {
            super(kVar);
            this.f11066h = ((Integer) kVar.a(oj.f9684U2)).intValue();
            this.f11067i = ((Integer) kVar.a(oj.T2)).intValue();
            this.f11068j = ((Integer) kVar.a(oj.f9724a3)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(qi.a aVar) {
            this.f11073q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f11061c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i9) {
            this.f11068j = i9;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f11060a = str;
            return this;
        }

        public a h(boolean z8) {
            this.f11111s = z8;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z8) {
            this.f11072p = z8;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f11062d = map;
            return this;
        }

        public a e(String str) {
            this.f11110r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i9) {
            this.f11067i = i9;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z8) {
            this.f11070n = z8;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f11063e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i9) {
            this.f11066h = i9;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f11064f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f11065g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f11108s = aVar.f11110r;
        this.f11109t = aVar.f11111s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f11108s;
    }

    public boolean t() {
        if (this.f11108s != null) {
            return true;
        }
        return false;
    }

    public boolean u() {
        return this.f11109t;
    }
}
