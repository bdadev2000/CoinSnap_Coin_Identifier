package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.C0774x0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class jm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b f8485h;

    /* loaded from: classes.dex */
    public interface b {
        void a(C0774x0.b bVar);

        void a(String str);
    }

    public jm(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f8485h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf;
        if (this.f12278a.y() != null) {
            valueOf = String.valueOf(this.f12278a.z().g().f());
        } else {
            valueOf = String.valueOf(this.f12278a.x().A().get(CampaignEx.JSON_KEY_PACKAGE_NAME));
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Looking up developer URI for package name: ".concat(valueOf));
        }
        this.f12278a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f12278a).c("GET").b("https://play.google.com/store/apps/details?id=".concat(valueOf)).a((Object) "").a(false).a(), this.f12278a));
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
                    this.f12279c.b(this.b, "No developer URI found - response is empty");
                }
                jm.this.f8485h.a(C0774x0.b.DEVELOPER_URI_NOT_FOUND);
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str2);
            if (matcher.find()) {
                String group = matcher.group();
                if (com.applovin.impl.sdk.t.a()) {
                    Q7.n0.s("Found developer URI: ", group, this.f12279c, this.b);
                }
                jm.this.f8485h.a(group);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to find developer URI from the Play Store listing metadata");
            }
            jm.this.f8485h.a(C0774x0.b.DEVELOPER_URI_NOT_FOUND);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to fetch developer URI due to: " + str2 + ", and received error code: " + i9);
            }
            jm.this.f8485h.a(C0774x0.b.DEVELOPER_URI_NOT_FOUND);
        }
    }
}
