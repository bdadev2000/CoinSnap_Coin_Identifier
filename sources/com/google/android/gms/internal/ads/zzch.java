package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class zzch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzgax zzh;
    private final zzgax zzi;
    private final int zzj;
    private final int zzk;
    private final zzgax zzl;
    private final zzcg zzm;
    private zzgax zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzch() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzgax.zzn();
        this.zzi = zzgax.zzn();
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzgax.zzn();
        this.zzm = zzcg.zza;
        this.zzn = zzgax.zzn();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public final zzch zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzeu.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzgax.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzch zzf(int i2, int i3, boolean z2) {
        this.zze = i2;
        this.zzf = i3;
        this.zzg = true;
        return this;
    }

    public zzch(zzci zzciVar) {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = zzciVar.zzi;
        this.zzf = zzciVar.zzj;
        this.zzg = zzciVar.zzk;
        this.zzh = zzciVar.zzl;
        this.zzi = zzciVar.zzn;
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzciVar.zzr;
        this.zzm = zzciVar.zzs;
        this.zzn = zzciVar.zzt;
        this.zzo = zzciVar.zzu;
        this.zzq = new HashSet(zzciVar.zzB);
        this.zzp = new HashMap(zzciVar.zzA);
    }
}
