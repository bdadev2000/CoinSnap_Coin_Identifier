package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.C0774x0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class hm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b f8151h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8152i;

    /* renamed from: j, reason: collision with root package name */
    private String f8153j;

    /* loaded from: classes.dex */
    public interface b {
        void a(C0774x0.b bVar, String str);

        void a(String str, String str2);
    }

    public hm(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f8152i = str;
        this.f8151h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f8152i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String join = TextUtils.join(".", arrayList);
        Uri build = new Uri.Builder().scheme(Constants.SCHEME).authority(join).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a a6 = com.applovin.impl.sdk.network.a.a(this.f12278a).c("GET").b(build.toString()).a(new Uri.Builder().scheme("http").authority(join).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f8153j = build.toString();
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Looking up app-ads.txt at " + this.f8153j);
        }
        this.f12278a.l0().a(new a(a6, this.f12278a));
    }

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, String str2, int i9) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "No app-ads.txt found");
                }
                hm.this.f8151h.a(C0774x0.b.APPADSTXT_NOT_FOUND, hm.this.f8153j);
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Found app-ads.txt");
                }
                hm.this.f8151h.a(str2, hm.this.f8153j);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i9);
            }
            hm.this.f8151h.a(C0774x0.b.APPADSTXT_NOT_FOUND, hm.this.f8153j);
        }
    }
}
