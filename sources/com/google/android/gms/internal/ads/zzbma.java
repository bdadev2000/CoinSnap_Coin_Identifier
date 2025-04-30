package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbma {
    @Nullable
    public static final Intent zza(Uri uri, Context context, zzaxd zzaxdVar, View view, zzfhs zzfhsVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent zzb(Intent intent, ResolveInfo resolveInfo, Context context, zzaxd zzaxdVar, View view, zzfhs zzfhsVar) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo zzc(Intent intent, Context context, zzaxd zzaxdVar, View view, zzfhs zzfhsVar) {
        return zzd(intent, new ArrayList(), context, zzaxdVar, view, zzfhsVar);
    }

    @Nullable
    public static final ResolveInfo zzd(Intent intent, ArrayList arrayList, Context context, zzaxd zzaxdVar, View view, zzfhs zzfhsVar) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i9 = 0;
            while (true) {
                if (i9 >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i9).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i9++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
