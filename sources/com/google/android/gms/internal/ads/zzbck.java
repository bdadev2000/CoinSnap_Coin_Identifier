package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbck implements zzbfc {
    final /* synthetic */ SharedPreferences zza;

    public zzbck(zzbcl zzbclVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final Long zzc(String str, long j3) {
        try {
            return Long.valueOf(this.zza.getLong(str, j3));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
