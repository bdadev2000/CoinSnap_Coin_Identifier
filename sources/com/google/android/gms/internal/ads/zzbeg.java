package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzbeg {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbeg(int i9, String str, Object obj, Object obj2, zzbef zzbefVar) {
        this.zza = i9;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zza().zzd(this);
    }

    public static zzbeg zzf(int i9, String str, float f9, float f10) {
        return new zzbed(1, str, Float.valueOf(f9), Float.valueOf(f10));
    }

    public static zzbeg zzg(int i9, String str, int i10, int i11) {
        return new zzbeb(1, str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static zzbeg zzh(int i9, String str, long j7, long j9) {
        return new zzbec(1, str, Long.valueOf(j7), Long.valueOf(j9));
    }

    public static zzbeg zzi(int i9, String str, Boolean bool, Boolean bool2) {
        return new zzbea(i9, str, bool, bool2);
    }

    public static zzbeg zzj(int i9, String str, String str2, String str3) {
        return new zzbee(1, str, str2, str3);
    }

    public static zzbeg zzk(int i9, String str) {
        zzbeg zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zza(this);
    }

    public final Object zzm() {
        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzf()) {
            return this.zzd;
        }
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
