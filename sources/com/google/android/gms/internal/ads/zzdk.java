package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class zzdk {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzgbc zzh;
    private final zzgbc zzi;
    private final int zzj;
    private final int zzk;
    private final zzgbc zzl;
    private final zzdj zzm;
    private zzgbc zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzdk() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzgbc.zzm();
        this.zzi = zzgbc.zzm();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzgbc.zzm();
        this.zzm = zzdj.zza;
        this.zzn = zzgbc.zzm();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public final zzdk zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzgd.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzgbc.zzn(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzdk zzf(int i9, int i10, boolean z8) {
        this.zze = i9;
        this.zzf = i10;
        this.zzg = true;
        return this;
    }

    public zzdk(zzdl zzdlVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzdlVar.zzl;
        this.zzf = zzdlVar.zzm;
        this.zzg = zzdlVar.zzn;
        this.zzh = zzdlVar.zzo;
        this.zzi = zzdlVar.zzq;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzdlVar.zzu;
        this.zzm = zzdlVar.zzv;
        this.zzn = zzdlVar.zzw;
        this.zzo = zzdlVar.zzx;
        this.zzq = new HashSet(zzdlVar.zzE);
        this.zzp = new HashMap(zzdlVar.zzD);
    }
}
