package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class en extends xl implements b4.e {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f4497h;

    /* renamed from: i, reason: collision with root package name */
    private final b4.e f4498i;

    /* renamed from: j, reason: collision with root package name */
    private sm.b f4499j;

    /* renamed from: k, reason: collision with root package name */
    private oj f4500k;

    /* renamed from: l, reason: collision with root package name */
    private oj f4501l;

    /* renamed from: m, reason: collision with root package name */
    protected b4.b f4502m;

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i10, String str2, Object obj);

    public abstract void a(String str, Object obj, int i10);

    @Override // java.lang.Runnable
    public void run() {
        String str;
        b4 r6 = b().r();
        if (!b().A0() && !b().y0()) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f4497h.f(), -22, null, null);
            return;
        }
        if (StringUtils.isValidString(this.f4497h.f()) && this.f4497h.f().length() >= 4) {
            if (TextUtils.isEmpty(this.f4497h.h())) {
                if (this.f4497h.b() != null) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                this.f4497h.b(str);
            }
            r6.a(this.f4497h, this.f4502m, this.f4498i);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Task has an invalid or null request endpoint.");
        }
        a(this.f4497h.f(), AppLovinErrorCodes.INVALID_URL, null, null);
    }

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
        super("TaskRepeatRequest", kVar, z10);
        this.f4499j = sm.b.OTHER;
        this.f4500k = null;
        this.f4501l = null;
        if (aVar != null) {
            a(aVar.f());
            this.f4497h = aVar;
            this.f4502m = new b4.b();
            this.f4498i = new a(kVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void b(oj ojVar) {
        this.f4501l = ojVar;
    }

    public void c(oj ojVar) {
        this.f4500k = ojVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(oj ojVar) {
        if (ojVar != null) {
            b().h0().a(ojVar, ojVar.a());
        }
    }

    public void a(sm.b bVar) {
        this.f4499j = bVar;
    }

    /* loaded from: classes.dex */
    public class a implements b4.e {
        final /* synthetic */ com.applovin.impl.sdk.k a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.a = kVar;
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, Object obj) {
            long millis;
            boolean z10 = false;
            boolean z11 = i10 < 200 || i10 >= 500;
            boolean z12 = i10 == 429;
            boolean z13 = i10 != -1009 || en.this.f4497h.q();
            boolean z14 = (i10 == -900 || i10 == -1000) ? false : true;
            if (z13 && z14 && (z11 || z12 || en.this.f4497h.p())) {
                String a = en.this.f4497h.a();
                if (en.this.f4497h.j() <= 0) {
                    if (a != null && a.equals(en.this.f4497h.f())) {
                        en enVar = en.this;
                        enVar.a(enVar.f4501l);
                    } else {
                        en enVar2 = en.this;
                        enVar2.a(enVar2.f4500k);
                    }
                    en enVar3 = en.this;
                    enVar3.a(enVar3.f4497h.f(), i10, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.t tVar = en.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    en enVar4 = en.this;
                    com.applovin.impl.sdk.t tVar2 = enVar4.f9061c;
                    String str3 = enVar4.f9060b;
                    StringBuilder m10 = a4.j.m("Unable to send request due to server failure (code ", i10, "). ");
                    m10.append(en.this.f4497h.j());
                    m10.append(" attempts left, retrying in ");
                    m10.append(TimeUnit.MILLISECONDS.toSeconds(en.this.f4497h.k()));
                    m10.append(" seconds...");
                    tVar2.k(str3, m10.toString());
                }
                int j3 = en.this.f4497h.j() - 1;
                en.this.f4497h.a(j3);
                if ((((Boolean) this.a.a(oj.F)).booleanValue() && en.this.f4497h.f().endsWith("4.0/ad")) || j3 == 0) {
                    en enVar5 = en.this;
                    enVar5.a(enVar5.f4500k);
                    if (StringUtils.isValidString(a) && a.length() >= 4) {
                        com.applovin.impl.sdk.t tVar3 = en.this.f9061c;
                        if (com.applovin.impl.sdk.t.a()) {
                            en enVar6 = en.this;
                            enVar6.f9061c.d(enVar6.f9060b, "Switching to backup endpoint ".concat(a));
                        }
                        en.this.f4497h.a(a);
                        z10 = true;
                    }
                }
                if (((Boolean) this.a.a(oj.f6731p3)).booleanValue() && z10) {
                    millis = 0;
                } else {
                    millis = en.this.f4497h.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, en.this.f4497h.c())) : en.this.f4497h.k();
                }
                sm l02 = this.a.l0();
                en enVar7 = en.this;
                l02.a(enVar7, enVar7.f4499j, millis);
                return;
            }
            en enVar8 = en.this;
            enVar8.a(enVar8.f4497h.f(), i10, str2, obj);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, Object obj, int i10) {
            en.this.f4497h.a(0);
            en.this.a(str, obj, i10);
        }
    }
}
