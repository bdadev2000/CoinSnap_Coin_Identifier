package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzw;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbyc;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzehb;

/* loaded from: classes2.dex */
public final class zzu {
    private static final zzu zza = new zzu();
    private final zzcau zzA;
    private final zzcm zzB;
    private final zzcfi zzC;
    private final zzccv zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzt zzd;
    private final zzchq zze;
    private final zzab zzf;
    private final zzbbh zzg;
    private final zzcby zzh;
    private final zzac zzi;
    private final zzbcu zzj;
    private final Clock zzk;
    private final zzf zzl;
    private final zzbev zzm;
    private final zzay zzn;
    private final zzbyc zzo;
    private final zzbon zzp;
    private final zzcco zzq;
    private final zzbpy zzr;
    private final zzx zzs;
    private final zzbx zzt;
    private final com.google.android.gms.ads.internal.overlay.zzab zzu;
    private final com.google.android.gms.ads.internal.overlay.zzac zzv;
    private final zzbra zzw;
    private final zzby zzx;
    private final zzehb zzy;
    private final zzbdj zzz;

    public zzu() {
        zzab zzvVar;
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzt zztVar = new com.google.android.gms.ads.internal.util.zzt();
        zzchq zzchqVar = new zzchq();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            zzvVar = new zzz();
        } else if (i9 >= 28) {
            zzvVar = new zzy();
        } else if (i9 >= 26) {
            zzvVar = new zzw();
        } else {
            zzvVar = new zzv();
        }
        zzbbh zzbbhVar = new zzbbh();
        zzcby zzcbyVar = new zzcby();
        zzac zzacVar = new zzac();
        zzbcu zzbcuVar = new zzbcu();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbev zzbevVar = new zzbev();
        zzay zzayVar = new zzay();
        zzbyc zzbycVar = new zzbyc();
        zzbon zzbonVar = new zzbon();
        zzcco zzccoVar = new zzcco();
        zzbpy zzbpyVar = new zzbpy();
        zzx zzxVar = new zzx();
        zzbx zzbxVar = new zzbx();
        com.google.android.gms.ads.internal.overlay.zzab zzabVar = new com.google.android.gms.ads.internal.overlay.zzab();
        com.google.android.gms.ads.internal.overlay.zzac zzacVar2 = new com.google.android.gms.ads.internal.overlay.zzac();
        zzbra zzbraVar = new zzbra();
        zzby zzbyVar = new zzby();
        zzeha zzehaVar = new zzeha();
        zzbdj zzbdjVar = new zzbdj();
        zzcau zzcauVar = new zzcau();
        zzcm zzcmVar = new zzcm();
        zzcfi zzcfiVar = new zzcfi();
        zzccv zzccvVar = new zzccv();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zztVar;
        this.zze = zzchqVar;
        this.zzf = zzvVar;
        this.zzg = zzbbhVar;
        this.zzh = zzcbyVar;
        this.zzi = zzacVar;
        this.zzj = zzbcuVar;
        this.zzk = defaultClock;
        this.zzl = zzfVar;
        this.zzm = zzbevVar;
        this.zzn = zzayVar;
        this.zzo = zzbycVar;
        this.zzp = zzbonVar;
        this.zzq = zzccoVar;
        this.zzr = zzbpyVar;
        this.zzt = zzbxVar;
        this.zzs = zzxVar;
        this.zzu = zzabVar;
        this.zzv = zzacVar2;
        this.zzw = zzbraVar;
        this.zzx = zzbyVar;
        this.zzy = zzehaVar;
        this.zzz = zzbdjVar;
        this.zzA = zzcauVar;
        this.zzB = zzcmVar;
        this.zzC = zzcfiVar;
        this.zzD = zzccvVar;
    }

    public static zzehb zzA() {
        return zza.zzy;
    }

    public static Clock zzB() {
        return zza.zzk;
    }

    public static zzf zza() {
        return zza.zzl;
    }

    public static zzbbh zzb() {
        return zza.zzg;
    }

    public static zzbcu zzc() {
        return zza.zzj;
    }

    public static zzbdj zzd() {
        return zza.zzz;
    }

    public static zzbev zze() {
        return zza.zzm;
    }

    public static zzbpy zzf() {
        return zza.zzr;
    }

    public static zzbra zzg() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzh() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzi() {
        return zza.zzc;
    }

    public static zzx zzj() {
        return zza.zzs;
    }

    public static com.google.android.gms.ads.internal.overlay.zzab zzk() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzac zzl() {
        return zza.zzv;
    }

    public static zzbyc zzm() {
        return zza.zzo;
    }

    public static zzcau zzn() {
        return zza.zzA;
    }

    public static zzcby zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzt zzp() {
        return zza.zzd;
    }

    public static zzab zzq() {
        return zza.zzf;
    }

    public static zzac zzr() {
        return zza.zzi;
    }

    public static zzay zzs() {
        return zza.zzn;
    }

    public static zzbx zzt() {
        return zza.zzt;
    }

    public static zzby zzu() {
        return zza.zzx;
    }

    public static zzcm zzv() {
        return zza.zzB;
    }

    public static zzcco zzw() {
        return zza.zzq;
    }

    public static zzccv zzx() {
        return zza.zzD;
    }

    public static zzcfi zzy() {
        return zza.zzC;
    }

    public static zzchq zzz() {
        return zza.zze;
    }
}
