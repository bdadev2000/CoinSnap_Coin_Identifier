package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.y0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class km extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final b f24929h;

    /* loaded from: classes.dex */
    public interface b {
        void a(y0.b bVar);

        void a(String str);
    }

    public km(com.applovin.impl.sdk.j jVar, b bVar) {
        super("TaskFetchDeveloperUri", jVar);
        this.f24929h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf = String.valueOf(this.f28216a.y().A().get("package_name"));
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Looking up developer URI for package name: ".concat(valueOf));
        }
        this.f28216a.j0().a(new a(com.applovin.impl.sdk.network.a.a(this.f28216a).c("GET").b("https://play.google.com/store/apps/details?id=".concat(valueOf)).a((Object) "").a(false).a(), this.f28216a));
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
                    this.f28218c.b(this.f28217b, "No developer URI found - response from the Play Store is empty");
                }
                km.this.f24929h.a(y0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                km.this.f24929h.a(y0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String group = matcher.group();
            if (!URLUtil.isValidUrl(group)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Developer URI (" + group + ") is not valid");
                }
                km.this.f24929h.a(y0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Found developer URI: ", group, this.f28218c, this.f28217b);
            }
            km.this.f24929h.a(group);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i2);
            }
            km.this.f24929h.a(y0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
