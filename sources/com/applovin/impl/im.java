package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.y0;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class im extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final b f24518h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24519i;

    /* renamed from: j, reason: collision with root package name */
    private String f24520j;

    /* loaded from: classes.dex */
    public interface b {
        void a(y0.b bVar, String str);

        void a(String str, String str2);
    }

    public im(com.applovin.impl.sdk.j jVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", jVar);
        this.f24519i = str;
        this.f24518h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f24519i).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String join = TextUtils.join(".", arrayList);
        Uri build = new Uri.Builder().scheme(TournamentShareDialogURIBuilder.scheme).authority(join).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a a2 = com.applovin.impl.sdk.network.a.a(this.f28216a).c("GET").b(build.toString()).a(new Uri.Builder().scheme(com.safedk.android.analytics.brandsafety.creatives.e.e).authority(join).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f24520j = build.toString();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Looking up app-ads.txt at " + this.f24520j);
        }
        this.f28216a.j0().a(new a(a2, this.f28216a));
    }

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, String str2, int i2) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "No app-ads.txt found");
                }
                im.this.f24518h.a(y0.b.APPADSTXT_NOT_FOUND, im.this.f24520j);
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Found app-ads.txt");
                }
                im.this.f24518h.a(str2, im.this.f24520j);
            }
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i2);
            }
            im.this.f24518h.a(y0.b.APPADSTXT_NOT_FOUND, im.this.f24520j);
        }
    }
}
