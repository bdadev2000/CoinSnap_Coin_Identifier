package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class dn extends yl implements d4.e {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f23510h;

    /* renamed from: i, reason: collision with root package name */
    private final d4.e f23511i;

    /* renamed from: j, reason: collision with root package name */
    private tm.b f23512j;

    /* renamed from: k, reason: collision with root package name */
    private sj f23513k;

    /* renamed from: l, reason: collision with root package name */
    private sj f23514l;

    /* renamed from: m, reason: collision with root package name */
    protected d4.b f23515m;

    public dn(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
        this(aVar, jVar, false);
    }

    public void a(tm.b bVar) {
        this.f23512j = bVar;
    }

    @Override // com.applovin.impl.d4.e
    public abstract void a(String str, int i2, String str2, Object obj);

    @Override // com.applovin.impl.d4.e
    public abstract void a(String str, Object obj, int i2);

    public void b(sj sjVar) {
        this.f23514l = sjVar;
    }

    public void c(sj sjVar) {
        this.f23513k = sjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d4 s2 = b().s();
        if (!b().x0() && !b().u0()) {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f23510h.f(), -22, null, null);
        } else if (!StringUtils.isValidString(this.f23510h.f()) || this.f23510h.f().length() < 4) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Task has an invalid or null request endpoint.");
            }
            a(this.f23510h.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.f23510h.h())) {
                this.f23510h.b(this.f23510h.b() != null ? com.safedk.android.a.g.f29074c : "GET");
            }
            s2.a(this.f23510h, this.f23515m, this.f23511i);
        }
    }

    public dn(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar, boolean z2) {
        super("TaskRepeatRequest", jVar, z2);
        this.f23512j = tm.b.OTHER;
        this.f23513k = null;
        this.f23514l = null;
        if (aVar != null) {
            a(aVar.f());
            this.f23510h = aVar;
            this.f23515m = new d4.b();
            this.f23511i = new a(jVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(sj sjVar) {
        if (sjVar != null) {
            b().h0().a(sjVar, sjVar.a());
        }
    }

    /* loaded from: classes3.dex */
    public class a implements d4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f23516a;

        public a(com.applovin.impl.sdk.j jVar) {
            this.f23516a = jVar;
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, Object obj) {
            long millis;
            boolean z2 = false;
            boolean z3 = i2 < 200 || i2 >= 500;
            boolean z4 = i2 == 429;
            boolean z5 = i2 != -1009 || dn.this.f23510h.q();
            boolean z6 = (i2 == -900 || i2 == -1000) ? false : true;
            if (!z5 || !z6 || (!z3 && !z4 && !dn.this.f23510h.p())) {
                dn dnVar = dn.this;
                dnVar.a(dnVar.f23510h.f(), i2, str2, obj);
                return;
            }
            String a2 = dn.this.f23510h.a();
            if (dn.this.f23510h.j() <= 0) {
                if (a2 == null || !a2.equals(dn.this.f23510h.f())) {
                    dn dnVar2 = dn.this;
                    dnVar2.a(dnVar2.f23513k);
                } else {
                    dn dnVar3 = dn.this;
                    dnVar3.a(dnVar3.f23514l);
                }
                dn dnVar4 = dn.this;
                dnVar4.a(dnVar4.f23510h.f(), i2, str2, obj);
                return;
            }
            com.applovin.impl.sdk.n nVar = dn.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                dn dnVar5 = dn.this;
                com.applovin.impl.sdk.n nVar2 = dnVar5.f28218c;
                String str3 = dnVar5.f28217b;
                StringBuilder t2 = android.support.v4.media.d.t("Unable to send request due to server failure (code ", i2, "). ");
                t2.append(dn.this.f23510h.j());
                t2.append(" attempts left, retrying in ");
                t2.append(TimeUnit.MILLISECONDS.toSeconds(dn.this.f23510h.k()));
                t2.append(" seconds...");
                nVar2.k(str3, t2.toString());
            }
            int j2 = dn.this.f23510h.j() - 1;
            dn.this.f23510h.a(j2);
            if ((((Boolean) this.f23516a.a(sj.w)).booleanValue() && dn.this.f23510h.f().endsWith("4.0/ad")) || j2 == 0) {
                dn dnVar6 = dn.this;
                dnVar6.a(dnVar6.f23513k);
                if (StringUtils.isValidString(a2) && a2.length() >= 4) {
                    com.applovin.impl.sdk.n nVar3 = dn.this.f28218c;
                    if (com.applovin.impl.sdk.n.a()) {
                        dn dnVar7 = dn.this;
                        dnVar7.f28218c.d(dnVar7.f28217b, "Switching to backup endpoint ".concat(a2));
                    }
                    dn.this.f23510h.a(a2);
                    z2 = true;
                }
            }
            if (((Boolean) this.f23516a.a(sj.y3)).booleanValue() && z2) {
                millis = 0;
            } else {
                millis = dn.this.f23510h.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, dn.this.f23510h.c())) : dn.this.f23510h.k();
            }
            tm j02 = this.f23516a.j0();
            dn dnVar8 = dn.this;
            j02.a(dnVar8, dnVar8.f23512j, millis);
        }

        @Override // com.applovin.impl.d4.e
        public void a(String str, Object obj, int i2) {
            dn.this.f23510h.a(0);
            dn.this.a(str, obj, i2);
        }
    }
}
