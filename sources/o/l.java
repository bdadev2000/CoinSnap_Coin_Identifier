package o;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class l {
    public final Intent a;

    /* renamed from: b, reason: collision with root package name */
    public final ic.t f22933b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f22934c;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f22935d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f22936e;

    /* renamed from: f, reason: collision with root package name */
    public int f22937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22938g;

    public l() {
        this.a = new Intent("android.intent.action.VIEW");
        this.f22933b = new ic.t(1);
        this.f22937f = 0;
        this.f22938g = true;
    }

    public final m a() {
        Bundle bundle;
        Intent intent = this.a;
        Bundle bundle2 = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f22938g);
        intent.putExtras(this.f22933b.e().w());
        Bundle bundle4 = this.f22936e;
        if (bundle4 != null) {
            intent.putExtras(bundle4);
        }
        if (this.f22935d != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f22935d);
            intent.putExtras(bundle5);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f22937f);
        int i10 = Build.VERSION.SDK_INT;
        String a = j.a();
        if (!TextUtils.isEmpty(a)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", a);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        if (i10 >= 34) {
            if (this.f22934c == null) {
                this.f22934c = i.a();
            }
            k.a(this.f22934c, false);
        }
        ActivityOptions activityOptions = this.f22934c;
        if (activityOptions != null) {
            bundle2 = activityOptions.toBundle();
        }
        return new m(intent, bundle2);
    }

    public final void b(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f22937f = i10;
            Intent intent = this.a;
            if (i10 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return;
            } else if (i10 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return;
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                return;
            }
        }
        throw new IllegalArgumentException("Invalid value for the shareState argument");
    }

    public l(s sVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.f22933b = new ic.t(1);
        this.f22937f = 0;
        this.f22938g = true;
        if (sVar != null) {
            intent.setPackage(sVar.f22952d.getPackageName());
            IBinder asBinder = sVar.f22951c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = sVar.f22953e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
