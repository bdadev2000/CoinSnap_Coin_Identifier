package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeiu {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;

    @Nullable
    final Integer zze;

    public zzeiu(String str, String str2, int i10, long j3, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j3;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, ".", this.zzb);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbI)).booleanValue() && this.zze != null && !TextUtils.isEmpty(this.zzb)) {
            return str + "." + this.zze;
        }
        return str;
    }
}
