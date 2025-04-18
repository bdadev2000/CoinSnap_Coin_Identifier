package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import ra.a;
import ra.i;
import ra.l;

/* loaded from: classes3.dex */
public final class zzhi {
    private static volatile i zza = a.f24044b;
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        boolean z10;
        String authority = uri.getAuthority();
        boolean z11 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.b()) {
            return ((Boolean) zza.a()).booleanValue();
        }
        synchronized (zzb) {
            if (zza.b()) {
                return ((Boolean) zza.a()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    z10 = false;
                    if (z10 && zza(context)) {
                        z11 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z11);
                    valueOf.getClass();
                    zza = new l(valueOf);
                    return ((Boolean) zza.a()).booleanValue();
                }
            }
            z10 = true;
            if (z10) {
                z11 = true;
            }
            Boolean valueOf2 = Boolean.valueOf(z11);
            valueOf2.getClass();
            zza = new l(valueOf2);
            return ((Boolean) zza.a()).booleanValue();
        }
    }
}
