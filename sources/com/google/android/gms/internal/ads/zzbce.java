package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zzbce {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbce(int i10, String str, Object obj, Object obj2, zzbcd zzbcdVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbe.zza().zzd(this);
    }

    public static zzbce zzf(int i10, String str, float f10, float f11) {
        return new zzbcb(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbce zzg(int i10, String str, int i11, int i12) {
        return new zzbbz(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbce zzh(int i10, String str, long j3, long j10) {
        return new zzbca(1, str, Long.valueOf(j3), Long.valueOf(j10));
    }

    public static zzbce zzi(int i10, String str) {
        zzbcc zzbccVar = new zzbcc(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbe.zza().zzc(zzbccVar);
        return zzbccVar;
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
