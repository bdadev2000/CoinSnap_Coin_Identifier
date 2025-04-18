package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbct {
    public static final void zza(zzbcs zzbcsVar, @Nullable zzbcq zzbcqVar) {
        if (zzbcqVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbcqVar.zzb())) {
                zzbcsVar.zzd(zzbcqVar.zza(), zzbcqVar.zzb(), zzbcqVar.zzc(), zzbcqVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
