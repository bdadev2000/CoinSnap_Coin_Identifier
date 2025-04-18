package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class t3 extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final String f8130h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f8131i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.a.o().a(t3.this.f8130h, t3.this.f8131i.f(), i10, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.a.o().a(t3.this.f8130h, t3.this.f8131i.f(), i10, jSONObject, null, true);
        }
    }

    public t3(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f8130h = str;
        this.f8131i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.l0().a(new a(this.f8131i, this.a, d()));
    }
}
