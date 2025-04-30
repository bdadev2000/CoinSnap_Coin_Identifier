package com.facebook.internal;

import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public TreeSet f13568a;
    public final /* synthetic */ int b;

    public /* synthetic */ A(int i9) {
        this.b = i9;
    }

    public final synchronized void a(boolean z8) {
        TreeSet treeSet;
        if (!z8) {
            try {
                TreeSet treeSet2 = this.f13568a;
                if (treeSet2 != null) {
                    if (!G7.j.a(Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                    }
                    treeSet = this.f13568a;
                    if (treeSet != null || treeSet.isEmpty()) {
                        f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B b = B.f13569a;
        TreeSet treeSet3 = null;
        if (!O2.a.b(B.class)) {
            try {
                treeSet3 = b.f(this);
            } catch (Throwable th2) {
                O2.a.a(B.class, th2);
            }
        }
        this.f13568a = treeSet3;
        treeSet = this.f13568a;
        if (treeSet != null) {
        }
        f();
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return null;
            case 1:
                return "com.instagram.platform.AppAuthorizeActivity";
            case 2:
                return "com.facebook.katana.ProxyAuth";
            case 3:
                return null;
            default:
                return "com.facebook.katana.ProxyAuth";
        }
    }

    public final String c() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return FbValidationUtils.FB_PACKAGE;
            case 3:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public String d() {
        switch (this.b) {
            case 1:
                return "token,signed_request,graph_domain,granted_scopes";
            default:
                return e();
        }
    }

    public final String e() {
        return "id_token,token,signed_request,graph_domain";
    }

    public void f() {
        switch (this.b) {
            case 2:
                if (com.facebook.r.a().getApplicationInfo().targetSdkVersion >= 30) {
                    String str = null;
                    if (!O2.a.b(B.class)) {
                        str = "com.facebook.internal.B";
                    }
                    Log.w(str, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void g() {
    }
}
