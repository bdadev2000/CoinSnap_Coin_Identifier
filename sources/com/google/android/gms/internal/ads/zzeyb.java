package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzeyb implements zzexv {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;
    public final String zzp;
    public final int zzq;

    public zzeyb(boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z13, String str6, long j7, boolean z14, String str7, int i9) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z13;
        this.zzm = str6;
        this.zzn = j7;
        this.zzo = z14;
        this.zzp = str7;
        this.zzq = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkY)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle zza = zzfic.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString("build", this.zzk);
        zza.putLong("remaining_data_partition_space", this.zzn);
        Bundle zza2 = zzfic.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle zza3 = zzfic.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlq)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlj)).booleanValue()) {
            zzfic.zzg(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlg)).booleanValue());
            zzfic.zzg(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlf)).booleanValue());
        }
    }
}
