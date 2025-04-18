package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class v3 extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final String f27451h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f27452i;

    /* loaded from: classes2.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z2) {
            super(aVar, jVar, z2);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            this.f28216a.p().a(v3.this.f27451h, v3.this.f27452i.f(), i2, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, JSONObject jSONObject, int i2) {
            this.f28216a.p().a(v3.this.f27451h, v3.this.f27452i.f(), i2, jSONObject, null, true);
        }
    }

    public v3(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        super("CommunicatorRequestTask", jVar, str);
        this.f27451h = str;
        this.f27452i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f28216a.j0().a(new a(this.f27452i, this.f28216a, d()));
    }
}
