package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbcs implements zzbfg {
    final /* synthetic */ SharedPreferences zza;

    public zzbcs(zzbct zzbctVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final Boolean zza(String str, boolean z2) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z2));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final Double zzb(String str, double d) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final Long zzc(String str, long j2) {
        try {
            return Long.valueOf(this.zza.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
