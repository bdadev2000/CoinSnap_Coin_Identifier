package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class zzbcm {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbcm(int i2, String str, Object obj, Object obj2, zzbcl zzbclVar) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbe.zza().zzd(this);
    }

    public static zzbcm zzf(int i2, String str, float f2, float f3) {
        return new zzbcj(1, str, Float.valueOf(f2), Float.valueOf(f3));
    }

    public static zzbcm zzg(int i2, String str, int i3, int i4) {
        return new zzbch(1, str, Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static zzbcm zzh(int i2, String str, long j2, long j3) {
        return new zzbci(1, str, Long.valueOf(j2), Long.valueOf(j3));
    }

    public static zzbcm zzi(int i2, String str) {
        zzbck zzbckVar = new zzbck(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbe.zza().zzc(zzbckVar);
        return zzbckVar;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzj() {
        return com.google.android.gms.ads.internal.client.zzbe.zzc().zza(this);
    }

    public final Object zzk() {
        return com.google.android.gms.ads.internal.client.zzbe.zzc().zzf() ? this.zzd : this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
