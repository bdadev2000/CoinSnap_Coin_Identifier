package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public final class zzbev {
    public static final void zza(zzbeu zzbeuVar, @Nullable zzbes zzbesVar) {
        if (zzbesVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbesVar.zzb())) {
                zzbeuVar.zzd(zzbesVar.zza(), zzbesVar.zzb(), zzbesVar.zzc(), zzbesVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
