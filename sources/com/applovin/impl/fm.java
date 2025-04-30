package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fm extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f7735h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinPostbackListener f7736i;

    /* renamed from: j, reason: collision with root package name */
    private final sm.b f7737j;

    /* loaded from: classes.dex */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i9) {
            fm.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (fm.this.f7736i != null) {
                fm.this.f7736i.onPostbackSuccess(fm.this.f7735h.f());
            }
        }
    }

    public fm(com.applovin.impl.sdk.network.e eVar, sm.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar != null) {
            this.f7735h = eVar;
            this.f7736i = appLovinPostbackListener;
            this.f7737j = bVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f7735h, b());
        bVar.a(this.f7737j);
        b().l0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f7735h.f())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.d(this.b, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f7736i;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f7735h.f(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.f7735h.u()) {
            b().u0().a(this.f7735h, new a());
        } else {
            e();
        }
    }

    /* loaded from: classes.dex */
    public class b extends en {

        /* renamed from: n, reason: collision with root package name */
        final String f7739n;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f7739n = fm.this.f7735h.f();
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, Object obj, int i9) {
            if (obj instanceof String) {
                for (String str2 : this.f12278a.c(oj.f9586F0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                c4.c(jSONObject, this.f12278a);
                                c4.b(jSONObject, this.f12278a);
                                c4.a(jSONObject, this.f12278a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (fm.this.f7736i != null) {
                fm.this.f7736i.onPostbackSuccess(this.f7739n);
            }
            if (fm.this.f7735h.t()) {
                this.f12278a.o().a(fm.this.f7735h.s(), this.f7739n, i9, obj, null, true);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, Object obj) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f12279c;
                String str3 = this.b;
                StringBuilder p2 = Q7.n0.p(i9, "Failed to dispatch postback. Error code: ", " URL: ");
                p2.append(this.f7739n);
                tVar.b(str3, p2.toString());
            }
            if (fm.this.f7736i != null) {
                fm.this.f7736i.onPostbackFailure(this.f7739n, i9);
            }
            if (fm.this.f7735h.t()) {
                this.f12278a.o().a(fm.this.f7735h.s(), this.f7739n, i9, obj, str2, false);
            }
        }
    }
}
