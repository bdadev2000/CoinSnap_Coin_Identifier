package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbem implements zzbgz {
    final /* synthetic */ SharedPreferences zza;

    public zzbem(zzben zzbenVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final Boolean zza(String str, boolean z8) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z8));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final Double zzb(String str, double d2) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d2));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final Long zzc(String str, long j7) {
        try {
            return Long.valueOf(this.zza.getLong(str, j7));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
