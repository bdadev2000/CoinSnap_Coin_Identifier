package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes2.dex */
public final class zzjq {
    final Context zza;
    zzer zzb;
    zzfyw zzc;
    zzfyw zzd;
    zzfyw zze;
    zzfyw zzf;
    zzfyw zzg;
    zzfxu zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzmr zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    String zzr;
    zzja zzs;

    public zzjq(final Context context, zzcgn zzcgnVar) {
        zzjj zzjjVar = new zzjj(zzcgnVar);
        zzjk zzjkVar = new zzjk(context);
        zzfyw zzfywVar = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzjl
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return new zzze(context);
            }
        };
        zzfyw zzfywVar2 = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return new zzjd();
            }
        };
        zzjn zzjnVar = new zzjn(context);
        zzfxu zzfxuVar = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzpa((zzer) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzjjVar;
        this.zzd = zzjkVar;
        this.zze = zzfywVar;
        this.zzf = zzfywVar2;
        this.zzg = zzjnVar;
        this.zzh = zzfxuVar;
        this.zzi = zzgd.zzy();
        this.zzj = zzk.zza;
        this.zzk = 1;
        this.zzl = true;
        this.zzm = zzmr.zze;
        this.zzs = new zzja(0.97f, 1.03f, 1000L, 1.0E-7f, zzgd.zzr(20L), zzgd.zzr(500L), 0.999f, null);
        this.zzb = zzer.zza;
        this.zzn = 500L;
        this.zzo = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        this.zzp = true;
        this.zzr = "";
    }

    public static /* synthetic */ zzvn zza(Context context) {
        return new zzvb(context, new zzadn());
    }
}
