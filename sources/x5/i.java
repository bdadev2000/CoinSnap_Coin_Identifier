package x5;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.facebook.x;
import com.facebook.y;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n9.o;
import s7.x1;
import y7.c0;

/* loaded from: classes3.dex */
public abstract class i {
    public static final /* synthetic */ int a = 0;

    /* renamed from: c, reason: collision with root package name */
    public static UiModeManager f27399c;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f27402f;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27398b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f27400d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f27401e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static void a() {
        cg.a aVar = new cg.a();
        aVar.f2798e = 0;
        aVar.f2797d++;
        aVar.f2796c = System.currentTimeMillis();
        r(aVar);
    }

    public static boolean b() {
        if (d().f2795b < d().a) {
            return true;
        }
        return false;
    }

    public static void c(Function0 onHideFrsAds, Function0 onShowFrsAds) {
        Intrinsics.checkNotNullParameter(onHideFrsAds, "onHideFrsAds");
        Intrinsics.checkNotNullParameter(onShowFrsAds, "onShowFrsAds");
        if (l()) {
            onHideFrsAds.invoke();
            return;
        }
        if (k()) {
            if (b()) {
                onHideFrsAds.invoke();
                return;
            } else {
                onShowFrsAds.invoke();
                return;
            }
        }
        onShowFrsAds.invoke();
    }

    public static cg.a d() {
        boolean z10;
        if (((String) ac.e.m("", "iap_json")).length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new cg.a();
        }
        String json = (String) ac.e.m("", "iap_json");
        Intrinsics.checkNotNullParameter(json, "json");
        Class object = cg.a.class;
        Intrinsics.checkNotNullParameter(object, "object");
        Object b3 = new n().b(json, new TypeToken(object));
        if (object == Integer.TYPE) {
            object = Integer.class;
        } else if (object == Float.TYPE) {
            object = Float.class;
        } else if (object == Byte.TYPE) {
            object = Byte.class;
        } else if (object == Double.TYPE) {
            object = Double.class;
        } else if (object == Long.TYPE) {
            object = Long.class;
        } else if (object == Character.TYPE) {
            object = Character.class;
        } else if (object == Boolean.TYPE) {
            object = Boolean.class;
        } else if (object == Short.TYPE) {
            object = Short.class;
        } else if (object == Void.TYPE) {
            object = Void.class;
        }
        return (cg.a) object.cast(b3);
    }

    public static int e(c0 c0Var) {
        int i10 = c0Var.i(4);
        if (i10 == 15) {
            if (c0Var.b() >= 24) {
                return c0Var.i(24);
            }
            throw x1.a("AAC header insufficient data", null);
        }
        if (i10 < 13) {
            return f27400d[i10];
        }
        throw x1.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static int f() {
        return d().f2798e;
    }

    public static final boolean g(Context context, String redirectURI) {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static boolean h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (d0.h.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    public static boolean i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (d0.h.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && d0.h.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public static boolean j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 33 && d0.h.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return false;
        }
        return true;
    }

    public static boolean k() {
        return f() == 1;
    }

    public static boolean l() {
        return f() == 0;
    }

    public static final void m(String arg, String name) {
        boolean z10;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("Argument '", name, "' cannot be empty").toString());
        }
    }

    public static final void n(Collection container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        if (!container.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void o(String str, String name) {
        boolean z10;
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z11 = false;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
        } else {
            throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("Argument '", name, "' cannot be null or empty").toString());
        }
    }

    public static u7.a p(c0 c0Var, boolean z10) {
        int i10 = c0Var.i(5);
        if (i10 == 31) {
            i10 = c0Var.i(6) + 32;
        }
        int e2 = e(c0Var);
        int i11 = c0Var.i(4);
        String i12 = eb.j.i("mp4a.40.", i10);
        if (i10 == 5 || i10 == 29) {
            e2 = e(c0Var);
            int i13 = c0Var.i(5);
            if (i13 == 31) {
                i13 = c0Var.i(6) + 32;
            }
            i10 = i13;
            if (i10 == 22) {
                i11 = c0Var.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw x1.c("Unsupported audio object type: " + i10);
                }
            }
            if (c0Var.h()) {
                o.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c0Var.h()) {
                c0Var.r(14);
            }
            boolean h10 = c0Var.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    c0Var.r(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        c0Var.r(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        c0Var.r(3);
                    }
                    c0Var.r(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i14 = c0Var.i(2);
                        if (i14 == 2 || i14 == 3) {
                            throw x1.c("Unsupported epConfig: " + i14);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i15 = f27401e[i11];
        if (i15 != -1) {
            return new u7.a(e2, i15, i12);
        }
        throw x1.a(null, null);
    }

    public static u7.a q(byte[] bArr) {
        return p(new c0(bArr, 2, (Object) null), false);
    }

    public static void r(cg.a iapEntity) {
        Intrinsics.checkNotNullParameter(iapEntity, "iapEntity");
        String value = new n().e(iapEntity);
        Intrinsics.checkNotNullExpressionValue(value, "toJson(...)");
        Intrinsics.checkNotNullParameter(value, "value");
        ac.e.t(value, "iap_json");
    }

    public static final void s() {
        if (x.h()) {
        } else {
            throw new y("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
