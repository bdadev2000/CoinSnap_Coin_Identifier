package u;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;
import q.C2609l;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2738g {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f23042a;
    public final C2609l b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f23043c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f23044d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f23045e;

    /* renamed from: f, reason: collision with root package name */
    public int f23046f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23047g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, q.l] */
    public C2738g() {
        this.f23042a = new Intent("android.intent.action.VIEW");
        this.b = new Object();
        this.f23046f = 0;
        this.f23047g = true;
    }

    public final C2739h a() {
        Bundle bundle;
        Intent intent = this.f23042a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f23047g);
        this.b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle3 = this.f23045e;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        if (this.f23044d != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f23044d);
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f23046f);
        String a6 = AbstractC2737f.a();
        if (!TextUtils.isEmpty(a6)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", a6);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return new C2739h(intent, this.f23043c);
    }

    public final void b(int i9) {
        if (i9 >= 0 && i9 <= 2) {
            this.f23046f = i9;
            Intent intent = this.f23042a;
            if (i9 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return;
            } else if (i9 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return;
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                return;
            }
        }
        throw new IllegalArgumentException("Invalid value for the shareState argument");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, q.l] */
    public C2738g(C2744m c2744m) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f23042a = intent;
        this.b = new Object();
        this.f23046f = 0;
        this.f23047g = true;
        if (c2744m != null) {
            intent.setPackage(c2744m.f23055d.getPackageName());
            IBinder asBinder = c2744m.f23054c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = c2744m.f23056e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
