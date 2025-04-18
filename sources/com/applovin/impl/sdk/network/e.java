package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sj;
import com.applovin.impl.vi;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f26823s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26824t;

    /* loaded from: classes3.dex */
    public static class a extends a.C0099a {

        /* renamed from: r, reason: collision with root package name */
        private String f26825r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f26826s;

        public a(j jVar) {
            super(jVar);
            this.f26777h = ((Integer) jVar.a(sj.a3)).intValue();
            this.f26778i = ((Integer) jVar.a(sj.Z2)).intValue();
            this.f26779j = ((Integer) jVar.a(sj.j3)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(vi.a aVar) {
            this.f26786q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i2) {
            this.f26777h = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i2) {
            this.f26779j = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i2) {
            this.f26778i = i2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f26772a = str;
            return this;
        }

        public a h(boolean z2) {
            this.f26826s = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z2) {
            this.f26785p = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f26776g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f26774c = str;
            return this;
        }

        public a e(String str) {
            this.f26825r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f26773b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z2) {
            this.f26783n = z2;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f26775f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0099a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f26823s = aVar.f26825r;
        this.f26824t = aVar.f26826s;
    }

    public static a b(j jVar) {
        return new a(jVar);
    }

    public String s() {
        return this.f26823s;
    }

    public boolean t() {
        return this.f26823s != null;
    }

    public boolean u() {
        return this.f26824t;
    }
}
