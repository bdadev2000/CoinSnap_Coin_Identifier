package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class gm extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f24137h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinPostbackListener f24138i;

    /* renamed from: j, reason: collision with root package name */
    private final tm.b f24139j;

    /* loaded from: classes2.dex */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i2) {
            gm.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (gm.this.f24138i != null) {
                gm.this.f24138i.onPostbackSuccess(gm.this.f24137h.f());
            }
        }
    }

    public gm(com.applovin.impl.sdk.network.e eVar, tm.b bVar, com.applovin.impl.sdk.j jVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", jVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f24137h = eVar;
        this.f24138i = appLovinPostbackListener;
        this.f24139j = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f24137h, b());
        bVar.a(this.f24139j);
        b().j0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f24137h.f())) {
            if (this.f24137h.u()) {
                b().r0().a(this.f24137h, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.d(this.f28217b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f24138i;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f24137h.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends dn {

        /* renamed from: n, reason: collision with root package name */
        final String f24141n;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
            this.f24141n = gm.this.f24137h.f();
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, Object obj, int i2) {
            if (obj instanceof String) {
                for (String str2 : this.f28216a.c(sj.I0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                e4.c(jSONObject, this.f28216a);
                                e4.b(jSONObject, this.f28216a);
                                e4.a(jSONObject, this.f28216a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (gm.this.f24138i != null) {
                gm.this.f24138i.onPostbackSuccess(this.f24141n);
            }
            if (gm.this.f24137h.t()) {
                this.f28216a.p().a(gm.this.f24137h.s(), this.f24141n, i2, obj, null, true);
            }
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, Object obj) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f28218c;
                String str3 = this.f28217b;
                StringBuilder t2 = android.support.v4.media.d.t("Failed to dispatch postback. Error code: ", i2, " URL: ");
                t2.append(this.f24141n);
                nVar.b(str3, t2.toString());
            }
            if (gm.this.f24138i != null) {
                gm.this.f24138i.onPostbackFailure(this.f24141n, i2);
            }
            if (gm.this.f24137h.t()) {
                this.f28216a.p().a(gm.this.f24137h.s(), this.f24141n, i2, obj, str2, false);
            }
        }
    }
}
