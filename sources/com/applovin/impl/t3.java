package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class t3 extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final String f11284h;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f11285i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z8) {
            super(aVar, kVar, z8);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, JSONObject jSONObject) {
            this.f12278a.o().a(t3.this.f11284h, t3.this.f11285i.f(), i9, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i9) {
            this.f12278a.o().a(t3.this.f11284h, t3.this.f11285i.f(), i9, jSONObject, null, true);
        }
    }

    public t3(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f11284h = str;
        this.f11285i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f12278a.l0().a(new a(this.f11285i, this.f12278a, d()));
    }
}
