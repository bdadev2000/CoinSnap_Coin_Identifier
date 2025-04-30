package com.facebook.login;

import M0.C0219j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.Fragment;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.facebook.C1854n;
import com.facebook.EnumC1828f;
import com.facebook.internal.H;
import java.util.ArrayList;
import u7.AbstractC2816g;
import u7.AbstractC2817h;

/* loaded from: classes.dex */
public abstract class B extends z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13688d;

    /* renamed from: f, reason: collision with root package name */
    public Object f13689f;

    public /* synthetic */ B() {
        this.f13688d = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @Override // com.facebook.login.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.B.i(int, int, android.content.Intent):boolean");
    }

    public void m(s sVar) {
        if (sVar != null) {
            e().e(sVar);
        } else {
            e().k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle n(com.facebook.login.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = "request"
            G7.j.e(r8, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r8.f13744c
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L29
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L17
            goto L29
        L17:
            java.util.Set r1 = r8.f13744c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)
            java.lang.String r2 = "scope"
            r0.putString(r2, r1)
            r7.a(r2, r1)
        L29:
            com.facebook.login.d r1 = r8.f13745d
            if (r1 != 0) goto L2f
            com.facebook.login.d r1 = com.facebook.login.d.NONE
        L2f:
            java.lang.String r2 = "default_audience"
            java.lang.String r1 = r1.b
            r0.putString(r2, r1)
            java.lang.String r8 = r8.f13747g
            java.lang.String r8 = r7.d(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = com.facebook.C0785a.f13439n
            com.facebook.a r8 = com.facebook.appevents.g.m()
            if (r8 != 0) goto L4b
            r8 = 0
            goto L4d
        L4b:
            java.lang.String r8 = r8.f13445g
        L4d:
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            java.lang.String r3 = "access_token"
            if (r8 == 0) goto L7f
            com.facebook.login.t r4 = r7.e()
            androidx.fragment.app.FragmentActivity r4 = r4.f()
            if (r4 != 0) goto L63
            android.content.Context r4 = com.facebook.r.a()
        L63:
            java.lang.String r5 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L7f
            r0.putString(r3, r8)
            r7.a(r3, r2)
            goto L90
        L7f:
            com.facebook.login.t r8 = r7.e()
            androidx.fragment.app.FragmentActivity r8 = r8.f()
            if (r8 != 0) goto L8a
            goto L8d
        L8a:
            com.facebook.internal.H.c(r8)
        L8d:
            r7.a(r3, r1)
        L90:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "cbt"
            r0.putString(r3, r8)
            com.facebook.r r8 = com.facebook.r.f13801a
            boolean r8 = com.facebook.N.b()
            if (r8 == 0) goto La6
            r1 = r2
        La6:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.B.n(com.facebook.login.q):android.os.Bundle");
    }

    public EnumC1828f o() {
        return (EnumC1828f) this.f13689f;
    }

    public void p(q qVar, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            C1851b.l = true;
            m(null);
            return;
        }
        if (AbstractC2816g.I(AbstractC2817h.B("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
            return;
        }
        if (AbstractC2816g.I(AbstractC2817h.B("access_denied", "OAuthAccessDeniedException"), str)) {
            m(new s(qVar, r.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m(new s(qVar, r.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    public void q(q qVar, Bundle bundle) {
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        try {
            m(new s(qVar, r.SUCCESS, C0219j.m(qVar.f13744c, bundle, o(), qVar.f13746f), C0219j.n(bundle, qVar.f13755q), null, null));
        } catch (C1849l e4) {
            String message = e4.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m(new s(qVar, r.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public void r(q qVar, Bundle bundle, C1849l c1849l) {
        String message;
        s sVar;
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        t e4 = e();
        String str = null;
        this.f13689f = null;
        r rVar = r.ERROR;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f13689f = bundle.getString("e2e");
            }
            try {
                C0785a m = C0219j.m(qVar.f13744c, bundle, o(), qVar.f13746f);
                sVar = new s(e4.f13775i, r.SUCCESS, m, C0219j.n(bundle, qVar.f13755q), null, null);
                if (e4.f() != null) {
                    try {
                        CookieSyncManager.createInstance(e4.f()).sync();
                    } catch (Exception unused) {
                    }
                    if (m != null) {
                        String str2 = m.f13445g;
                        Context f9 = e().f();
                        if (f9 == null) {
                            f9 = com.facebook.r.a();
                        }
                        f9.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (C1849l e9) {
                q qVar2 = e4.f13775i;
                String message2 = e9.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message2 != null) {
                    arrayList.add(message2);
                }
                sVar = new s(qVar2, rVar, null, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (c1849l instanceof C1854n) {
            sVar = new s(e4.f13775i, r.CANCEL, null, null, "User canceled log in.", null);
        } else {
            this.f13689f = null;
            if (c1849l == null) {
                message = null;
            } else {
                message = c1849l.getMessage();
            }
            if (c1849l instanceof com.facebook.t) {
                com.facebook.p pVar = ((com.facebook.t) c1849l).b;
                str = String.valueOf(pVar.f13792c);
                message = pVar.toString();
            }
            String str3 = str;
            q qVar3 = e4.f13775i;
            ArrayList arrayList2 = new ArrayList();
            if (message != null) {
                arrayList2.add(message);
            }
            sVar = new s(qVar3, rVar, null, null, TextUtils.join(": ", arrayList2), str3);
        }
        if (!H.B((String) this.f13689f)) {
            h((String) this.f13689f);
        }
        e4.e(sVar);
    }

    public boolean s(Intent intent) {
        w wVar;
        if (intent != null) {
            G7.j.d(com.facebook.r.a().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!r1.isEmpty()) {
                Fragment fragment = e().f13771d;
                t7.y yVar = null;
                if (fragment instanceof w) {
                    wVar = (w) fragment;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    h.c cVar = wVar.f13783f;
                    if (cVar != null) {
                        cVar.a(intent);
                        yVar = t7.y.f23029a;
                    } else {
                        G7.j.k("launcher");
                        throw null;
                    }
                }
                if (yVar == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Parcel parcel, int i9) {
        super(parcel);
        this.f13688d = i9;
        switch (i9) {
            case 1:
                super(parcel);
                return;
            default:
                G7.j.e(parcel, "source");
                this.f13689f = EnumC1828f.FACEBOOK_APPLICATION_WEB;
                return;
        }
    }

    public B(t tVar) {
        this.f13688d = 0;
        this.f13788c = tVar;
        this.f13689f = EnumC1828f.FACEBOOK_APPLICATION_WEB;
    }
}
