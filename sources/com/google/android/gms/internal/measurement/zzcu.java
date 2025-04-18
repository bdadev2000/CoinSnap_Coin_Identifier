package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import v8.u0;

/* loaded from: classes3.dex */
public final class zzcu {
    private static final ThreadLocal<Boolean> zza = new zzct();

    public static SharedPreferences zza(Context context, String str, int i10, zzcm zzcmVar) {
        zzcp zzcpVar;
        if (zzcf.zza().zza(str, zzcmVar, zzcj.SHARED_PREFS_TYPE).equals("")) {
            zzcpVar = new zzcp();
        } else {
            zzcpVar = null;
        }
        if (zzcpVar != null) {
            return zzcpVar;
        }
        ThreadLocal<Boolean> threadLocal = zza;
        u0.f(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th2) {
            zza.set(Boolean.TRUE);
            throw th2;
        }
    }
}
