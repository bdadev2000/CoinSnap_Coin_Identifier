package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.x0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class jm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final b f5527h;

    /* loaded from: classes.dex */
    public interface b {
        void a(x0.b bVar);

        void a(String str);
    }

    public jm(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f5527h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf;
        if (this.a.y() != null) {
            valueOf = String.valueOf(this.a.z().g().f());
        } else {
            valueOf = String.valueOf(this.a.x().A().get(CampaignEx.JSON_KEY_PACKAGE_NAME));
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Looking up developer URI for package name: ".concat(valueOf));
        }
        this.a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).c("GET").b("https://play.google.com/store/apps/details?id=".concat(valueOf)).a((Object) "").a(false).a(), this.a));
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
                    this.f9061c.b(this.f9060b, "No developer URI found - response is empty");
                }
                jm.this.f5527h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").+?(?=\">)").matcher(str2);
            if (matcher.find()) {
                String group = matcher.group();
                if (com.applovin.impl.sdk.t.a()) {
                    a4.j.v("Found developer URI: ", group, this.f9061c, this.f9060b);
                }
                jm.this.f5527h.a(group);
                return;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to find developer URI from the Play Store listing metadata");
            }
            jm.this.f5527h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to fetch developer URI due to: " + str2 + ", and received error code: " + i10);
            }
            jm.this.f5527h.a(x0.b.DEVELOPER_URI_NOT_FOUND);
        }
    }
}
