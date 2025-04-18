package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.x0;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class hm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b f5173h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5174i;

    /* renamed from: j, reason: collision with root package name */
    private String f5175j;

    /* loaded from: classes.dex */
    public interface b {
        void a(x0.b bVar, String str);

        void a(String str, String str2);
    }

    public hm(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f5174i = str;
        this.f5173h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f5174i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String join = TextUtils.join(".", arrayList);
        Uri build = new Uri.Builder().scheme(Constants.SCHEME).authority(join).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a a10 = com.applovin.impl.sdk.network.a.a(this.a).c("GET").b(build.toString()).a(new Uri.Builder().scheme("http").authority(join).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f5175j = build.toString();
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Looking up app-ads.txt at " + this.f5175j);
        }
        this.a.l0().a(new a(a10, this.a));
    }

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "No app-ads.txt found");
                }
                hm.this.f5173h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.f5175j);
            } else {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Found app-ads.txt");
                }
                hm.this.f5173h.a(str2, hm.this.f5175j);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            hm.this.f5173h.a(x0.b.APPADSTXT_NOT_FOUND, hm.this.f5175j);
        }
    }
}
