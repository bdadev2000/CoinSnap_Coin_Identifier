package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzele {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;

    @Nullable
    final Integer zze;

    public zzele(String str, String str2, int i9, long j7, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i9;
        this.zzd = j7;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = o.k(str, ".", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbD)).booleanValue() && this.zze != null && !TextUtils.isEmpty(this.zzb)) {
            return str + "." + this.zze;
        }
        return str;
    }
}
