package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzcze extends com.google.android.gms.ads.internal.client.zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzehq zzh;
    private final Bundle zzi;

    public zzcze(zzfgt zzfgtVar, String str, zzehq zzehqVar, zzfgw zzfgwVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (zzfgtVar == null) {
            str3 = null;
        } else {
            str3 = zzfgtVar.zzac;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfgwVar == null) {
            str4 = null;
        } else {
            str4 = zzfgwVar.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str6 = zzfgtVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str6 != null ? str6 : str;
        this.zze = zzehqVar.zzc();
        this.zzh = zzehqVar;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgZ)).booleanValue() && zzfgwVar != null) {
            this.zzi = zzfgwVar.zzj;
        } else {
            this.zzi = new Bundle();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjl)).booleanValue() && zzfgwVar != null && !TextUtils.isEmpty(zzfgwVar.zzh)) {
            str5 = zzfgwVar.zzh;
        } else {
            str5 = "";
        }
        this.zzg = str5;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzehq zzehqVar = this.zzh;
        if (zzehqVar != null) {
            return zzehqVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
