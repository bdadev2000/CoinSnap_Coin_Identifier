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
    private final com.applovin.impl.sdk.network.e f4778h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinPostbackListener f4779i;

    /* renamed from: j, reason: collision with root package name */
    private final sm.b f4780j;

    /* loaded from: classes.dex */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            fm.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (fm.this.f4779i != null) {
                fm.this.f4779i.onPostbackSuccess(fm.this.f4778h.f());
            }
        }
    }

    public fm(com.applovin.impl.sdk.network.e eVar, sm.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar != null) {
            this.f4778h = eVar;
            this.f4779i = appLovinPostbackListener;
            this.f4780j = bVar;
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f4778h, b());
        bVar.a(this.f4780j);
        b().l0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!StringUtils.isValidString(this.f4778h.f())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.d(this.f9060b, "Requested URL is not valid; nothing to do...");
            }
            AppLovinPostbackListener appLovinPostbackListener = this.f4779i;
            if (appLovinPostbackListener != null) {
                appLovinPostbackListener.onPostbackFailure(this.f4778h.f(), AppLovinErrorCodes.INVALID_URL);
                return;
            }
            return;
        }
        if (this.f4778h.u()) {
            b().u0().a(this.f4778h, new a());
        } else {
            e();
        }
    }

    /* loaded from: classes.dex */
    public class b extends en {

        /* renamed from: n, reason: collision with root package name */
        final String f4781n;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f4781n = fm.this.f4778h.f();
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.a.c(oj.F0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                c4.c(jSONObject, this.a);
                                c4.b(jSONObject, this.a);
                                c4.a(jSONObject, this.a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (fm.this.f4779i != null) {
                fm.this.f4779i.onPostbackSuccess(this.f4781n);
            }
            if (fm.this.f4778h.t()) {
                this.a.o().a(fm.this.f4778h.s(), this.f4781n, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t tVar = this.f9061c;
                String str3 = this.f9060b;
                StringBuilder m10 = a4.j.m("Failed to dispatch postback. Error code: ", i10, " URL: ");
                m10.append(this.f4781n);
                tVar.b(str3, m10.toString());
            }
            if (fm.this.f4779i != null) {
                fm.this.f4779i.onPostbackFailure(this.f4781n, i10);
            }
            if (fm.this.f4778h.t()) {
                this.a.o().a(fm.this.f4778h.s(), this.f4781n, i10, obj, str2, false);
            }
        }
    }
}
