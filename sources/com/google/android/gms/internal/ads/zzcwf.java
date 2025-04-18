package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzcwf extends com.google.android.gms.ads.internal.client.zzdx {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzefg zzh;
    private final Bundle zzi;

    public zzcwf(zzfet zzfetVar, String str, zzefg zzefgVar, zzfew zzfewVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (zzfetVar == null) {
            str3 = null;
        } else {
            str3 = zzfetVar.zzab;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfewVar == null) {
            str4 = null;
        } else {
            str4 = zzfewVar.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str6 = zzfetVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str6 != null ? str6 : str;
        this.zze = zzefgVar.zzc();
        this.zzh = zzefgVar;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgG)).booleanValue() && zzfewVar != null) {
            this.zzi = zzfewVar.zzk;
        } else {
            this.zzi = new Bundle();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziQ)).booleanValue() && zzfewVar != null && !TextUtils.isEmpty(zzfewVar.zzi)) {
            str5 = zzfewVar.zzi;
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

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zzf() {
        zzefg zzefgVar = this.zzh;
        if (zzefgVar != null) {
            return zzefgVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
