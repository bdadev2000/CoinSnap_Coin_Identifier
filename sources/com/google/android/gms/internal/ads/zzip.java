package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes3.dex */
public final class zzip {
    final Context zza;
    zzdc zzb;
    zzfxg zzc;
    zzfxg zzd;
    zzfxg zze;
    zzfxg zzf;
    zzfxg zzg;
    zzfwh zzh;
    Looper zzi;
    int zzj;
    zzg zzk;
    int zzl;
    boolean zzm;
    zzls zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    String zzs;
    zzia zzt;

    public zzip(final Context context, zzcep zzcepVar) {
        zzii zziiVar = new zzii(zzcepVar);
        zzij zzijVar = new zzij(context);
        zzfxg zzfxgVar = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return new zzyb(context);
            }
        };
        zzfxg zzfxgVar2 = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzil
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return new zzid();
            }
        };
        zzim zzimVar = new zzim(context);
        zzfwh zzfwhVar = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzoa((zzdc) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zziiVar;
        this.zzd = zzijVar;
        this.zze = zzfxgVar;
        this.zzf = zzfxgVar2;
        this.zzg = zzimVar;
        this.zzh = zzfwhVar;
        this.zzi = zzen.zzz();
        this.zzk = zzg.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzls.zzb;
        this.zzt = new zzia(0.97f, 1.03f, 1000L, 1.0E-7f, zzen.zzs(20L), zzen.zzs(500L), 0.999f, null);
        this.zzb = zzdc.zza;
        this.zzo = 500L;
        this.zzp = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
    }

    public static /* synthetic */ zzuq zza(Context context) {
        return new zzue(context, new zzacl());
    }
}
