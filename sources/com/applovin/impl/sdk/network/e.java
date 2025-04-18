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
    private String f7943s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7944t;

    /* loaded from: classes.dex */
    public static class a extends a.C0036a {

        /* renamed from: r, reason: collision with root package name */
        private String f7945r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f7946s;

        public a(k kVar) {
            super(kVar);
            this.f7896h = ((Integer) kVar.a(oj.U2)).intValue();
            this.f7897i = ((Integer) kVar.a(oj.T2)).intValue();
            this.f7898j = ((Integer) kVar.a(oj.f6616a3)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(qi.a aVar) {
            this.f7905q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f7891c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f7898j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f7890b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f7946s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f7904p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f7892d = map;
            return this;
        }

        public a e(String str) {
            this.f7945r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f7897i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f7902n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f7893e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f7896h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f7894f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0036a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f7895g = obj;
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
        this.f7943s = aVar.f7945r;
        this.f7944t = aVar.f7946s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f7943s;
    }

    public boolean t() {
        return this.f7943s != null;
    }

    public boolean u() {
        return this.f7944t;
    }
}
