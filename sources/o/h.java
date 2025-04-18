package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h {
    public final b.e a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f22931b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22932c;

    public h(b.e eVar, ComponentName componentName, Context context) {
        this.a = eVar;
        this.f22931b = componentName;
        this.f22932c = context;
    }

    public static void a(Context context, String str, o oVar) {
        oVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, oVar, 33);
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }

    public final s c(a aVar) {
        g gVar = new g(aVar);
        b.e eVar = this.a;
        try {
            if (((b.c) eVar).f(gVar)) {
                return new s(eVar, gVar, this.f22931b);
            }
        } catch (RemoteException unused) {
        }
        return null;
    }
}
