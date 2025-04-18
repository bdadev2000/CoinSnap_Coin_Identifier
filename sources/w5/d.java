package w5;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.facebook.internal.d0;
import com.facebook.m0;
import com.facebook.x;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.common.util.ProcessUtils;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import qc.u;

/* loaded from: classes3.dex */
public abstract class d {
    public static boolean a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7.m f26763b = new i7.m(0);

    /* renamed from: c, reason: collision with root package name */
    public static volatile v3.d f26764c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile v3.c f26765d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26766e = 0;

    public static int a(Context context, float f10) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f10 + 0.5f, resources.getDisplayMetrics());
    }

    public static ArrayList b(Context context) {
        ActivityManager activityManager;
        int collectionSizeOrDefault;
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List filterNotNull = CollectionsKt.filterNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final String c() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        x xVar = x.a;
        return com.applovin.impl.mediation.ads.e.h(new Object[]{x.f11437q}, 1, "m.%s", "java.lang.String.format(format, *args)");
    }

    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        x xVar = x.a;
        return com.applovin.impl.mediation.ads.e.h(new Object[]{x.f11436p}, 1, "m.%s", "java.lang.String.format(format, *args)");
    }

    public static String e() {
        String d10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String o10 = androidx.activity.j.o();
            Intrinsics.checkNotNullExpressionValue(o10, "myProcessName()");
            return o10;
        }
        if (i10 >= 28 && (d10 = p2.c.d()) != null) {
            return d10;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        if (myProcessName != null) {
            return myProcessName;
        }
        return "";
    }

    public static void f(HashMap hashMap) {
        SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj != null && obj2 != null && obj3 != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("dataset_id", obj.toString());
            edit.putString("endpoint", obj2.toString());
            edit.putString("access_key", obj3.toString());
            edit.apply();
            com.facebook.internal.m mVar = d0.f11030d;
            com.facebook.internal.m.o(m0.APP_EVENTS, "w5.d", " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
        }
    }

    public static Intent g(Activity fromActivity) {
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        Intent intent = new Intent(fromActivity, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("key_tracking_screen_from", fromActivity.getClass().getSimpleName());
        fromActivity.startActivity(intent);
        return intent;
    }

    public static AdError h(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError g10 = c6.c.g(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e("d", g10.toString());
            return g10;
        }
        if (TextUtils.isEmpty(str2)) {
            AdError g11 = c6.c.g(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e("d", g11.toString());
            return g11;
        }
        return null;
    }

    public static AdError i(String str, String str2, String str3) {
        AdError h10 = h(str, str2);
        if (h10 != null) {
            return h10;
        }
        if (TextUtils.isEmpty(str3)) {
            AdError g10 = c6.c.g(103, "Missing or invalid Mintegral bidding signal in this ad request.");
            Log.w("d", g10.toString());
            return g10;
        }
        return null;
    }
}
