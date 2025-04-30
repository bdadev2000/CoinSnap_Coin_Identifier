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
    private final com.applovin.impl.sdk.network.a f7465h;

    /* renamed from: i, reason: collision with root package name */
    private final b4.e f7466i;

    /* renamed from: j, reason: collision with root package name */
    private sm.b f7467j;

    /* renamed from: k, reason: collision with root package name */
    private oj f7468k;
    private oj l;
    protected b4.b m;

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        this(aVar, kVar, false);
    }

    public abstract void a(String str, int i9, String str2, Object obj);

    public abstract void a(String str, Object obj, int i9);

    @Override // java.lang.Runnable
    public void run() {
        String str;
        b4 r9 = b().r();
        if (!b().A0() && !b().y0()) {
            com.applovin.impl.sdk.t.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f7465h.f(), -22, null, null);
            return;
        }
        if (StringUtils.isValidString(this.f7465h.f()) && this.f7465h.f().length() >= 4) {
            if (TextUtils.isEmpty(this.f7465h.h())) {
                if (this.f7465h.b() != null) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                this.f7465h.b(str);
            }
            r9.a(this.f7465h, this.m, this.f7466i);
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Task has an invalid or null request endpoint.");
        }
        a(this.f7465h.f(), AppLovinErrorCodes.INVALID_URL, null, null);
    }

    public en(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z8) {
        super("TaskRepeatRequest", kVar, z8);
        this.f7467j = sm.b.OTHER;
        this.f7468k = null;
        this.l = null;
        if (aVar != null) {
            a(aVar.f());
            this.f7465h = aVar;
            this.m = new b4.b();
            this.f7466i = new a(kVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    public void b(oj ojVar) {
        this.l = ojVar;
    }

    public void c(oj ojVar) {
        this.f7468k = ojVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(oj ojVar) {
        if (ojVar != null) {
            b().h0().a(ojVar, ojVar.a());
        }
    }

    public void a(sm.b bVar) {
        this.f7467j = bVar;
    }

    /* loaded from: classes.dex */
    public class a implements b4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f7469a;

        public a(com.applovin.impl.sdk.k kVar) {
            this.f7469a = kVar;
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, Object obj) {
            long millis;
            boolean z8 = false;
            boolean z9 = i9 < 200 || i9 >= 500;
            boolean z10 = i9 == 429;
            boolean z11 = i9 != -1009 || en.this.f7465h.q();
            boolean z12 = (i9 == -900 || i9 == -1000) ? false : true;
            if (z11 && z12 && (z9 || z10 || en.this.f7465h.p())) {
                String a6 = en.this.f7465h.a();
                if (en.this.f7465h.j() <= 0) {
                    if (a6 != null && a6.equals(en.this.f7465h.f())) {
                        en enVar = en.this;
                        enVar.a(enVar.l);
                    } else {
                        en enVar2 = en.this;
                        enVar2.a(enVar2.f7468k);
                    }
                    en enVar3 = en.this;
                    enVar3.a(enVar3.f7465h.f(), i9, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.t tVar = en.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    en enVar4 = en.this;
                    com.applovin.impl.sdk.t tVar2 = enVar4.f12279c;
                    String str3 = enVar4.b;
                    StringBuilder p2 = Q7.n0.p(i9, "Unable to send request due to server failure (code ", "). ");
                    p2.append(en.this.f7465h.j());
                    p2.append(" attempts left, retrying in ");
                    p2.append(TimeUnit.MILLISECONDS.toSeconds(en.this.f7465h.k()));
                    p2.append(" seconds...");
                    tVar2.k(str3, p2.toString());
                }
                int j7 = en.this.f7465h.j() - 1;
                en.this.f7465h.a(j7);
                if ((((Boolean) this.f7469a.a(oj.f9585F)).booleanValue() && en.this.f7465h.f().endsWith("4.0/ad")) || j7 == 0) {
                    en enVar5 = en.this;
                    enVar5.a(enVar5.f7468k);
                    if (StringUtils.isValidString(a6) && a6.length() >= 4) {
                        com.applovin.impl.sdk.t tVar3 = en.this.f12279c;
                        if (com.applovin.impl.sdk.t.a()) {
                            en enVar6 = en.this;
                            enVar6.f12279c.d(enVar6.b, "Switching to backup endpoint ".concat(a6));
                        }
                        en.this.f7465h.a(a6);
                        z8 = true;
                    }
                }
                if (((Boolean) this.f7469a.a(oj.f9825p3)).booleanValue() && z8) {
                    millis = 0;
                } else {
                    millis = en.this.f7465h.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, en.this.f7465h.c())) : en.this.f7465h.k();
                }
                sm l02 = this.f7469a.l0();
                en enVar7 = en.this;
                l02.a(enVar7, enVar7.f7467j, millis);
                return;
            }
            en enVar8 = en.this;
            enVar8.a(enVar8.f7465h.f(), i9, str2, obj);
        }

        @Override // com.applovin.impl.b4.e
        public void a(String str, Object obj, int i9) {
            en.this.f7465h.a(0);
            en.this.a(str, obj, i9);
        }
    }
}
