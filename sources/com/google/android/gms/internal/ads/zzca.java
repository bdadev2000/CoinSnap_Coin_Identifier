package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class zzca {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfzo zzh;
    private final zzfzo zzi;
    private final int zzj;
    private final int zzk;
    private final zzfzo zzl;
    private final zzbz zzm;
    private zzfzo zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzca() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfzo.zzn();
        this.zzi = zzfzo.zzn();
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzfzo.zzn();
        this.zzm = zzbz.zza;
        this.zzn = zzfzo.zzn();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public static /* bridge */ /* synthetic */ int zza(zzca zzcaVar) {
        return zzcaVar.zzo;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzca zzcaVar) {
        return zzcaVar.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzca zzcaVar) {
        return zzcaVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzbz zzd(zzca zzcaVar) {
        return zzcaVar.zzm;
    }

    public static /* bridge */ /* synthetic */ zzfzo zzg(zzca zzcaVar) {
        return zzcaVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfzo zzh(zzca zzcaVar) {
        return zzcaVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfzo zzi(zzca zzcaVar) {
        return zzcaVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzfzo zzj(zzca zzcaVar) {
        return zzcaVar.zzh;
    }

    public static /* bridge */ /* synthetic */ HashMap zzk(zzca zzcaVar) {
        return zzcaVar.zzp;
    }

    public static /* bridge */ /* synthetic */ HashSet zzl(zzca zzcaVar) {
        return zzcaVar.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzm(zzca zzcaVar) {
        return zzcaVar.zzg;
    }

    public final zzca zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzen.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzfzo.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzca zzf(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    public zzca(zzcb zzcbVar) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzcbVar.zzi;
        this.zzf = zzcbVar.zzj;
        this.zzg = zzcbVar.zzk;
        this.zzh = zzcbVar.zzl;
        this.zzi = zzcbVar.zzn;
        this.zzj = Integer.MAX_VALUE;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = zzcbVar.zzr;
        this.zzm = zzcbVar.zzs;
        this.zzn = zzcbVar.zzt;
        this.zzo = zzcbVar.zzu;
        this.zzq = new HashSet(zzcbVar.zzB);
        this.zzp = new HashMap(zzcbVar.zzA);
    }
}
