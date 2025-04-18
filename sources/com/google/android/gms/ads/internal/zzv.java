package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzazg;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcap;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcfx;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzeer;

/* loaded from: classes3.dex */
public final class zzv {
    private static final zzv zza = new zzv();
    private final zzbyv zzA;
    private final zzch zzB;
    private final zzcdk zzC;
    private final zzcaw zzD;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfx zze;
    private final zzaa zzf;
    private final zzazg zzg;
    private final zzbzz zzh;
    private final zzab zzi;
    private final zzbat zzj;
    private final Clock zzk;
    private final zzf zzl;
    private final zzbct zzm;
    private final zzbdm zzn;
    private final zzax zzo;
    private final zzbwe zzp;
    private final zzcap zzq;
    private final zzbnz zzr;
    private final zzz zzs;
    private final zzbs zzt;
    private final zzad zzu;
    private final zzae zzv;
    private final zzbpb zzw;
    private final zzbt zzx;
    private final zzeer zzy;
    private final zzbbi zzz;

    public zzv() {
        zzaa zzuVar;
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfx zzcfxVar = new zzcfx();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            zzuVar = new zzy();
        } else if (i10 >= 28) {
            zzuVar = new zzx();
        } else if (i10 >= 26) {
            zzuVar = new com.google.android.gms.ads.internal.util.zzv();
        } else {
            zzuVar = new com.google.android.gms.ads.internal.util.zzu();
        }
        zzazg zzazgVar = new zzazg();
        zzbzz zzbzzVar = new zzbzz();
        zzab zzabVar = new zzab();
        zzbat zzbatVar = new zzbat();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbct zzbctVar = new zzbct();
        zzbdm zzbdmVar = new zzbdm();
        zzax zzaxVar = new zzax();
        zzbwe zzbweVar = new zzbwe();
        zzcap zzcapVar = new zzcap();
        zzbnz zzbnzVar = new zzbnz();
        zzz zzzVar = new zzz();
        zzbs zzbsVar = new zzbs();
        zzad zzadVar = new zzad();
        zzae zzaeVar = new zzae();
        zzbpb zzbpbVar = new zzbpb();
        zzbt zzbtVar = new zzbt();
        zzeeq zzeeqVar = new zzeeq();
        zzbbi zzbbiVar = new zzbbi();
        zzbyv zzbyvVar = new zzbyv();
        zzch zzchVar = new zzch();
        zzcdk zzcdkVar = new zzcdk();
        zzcaw zzcawVar = new zzcaw();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzcfxVar;
        this.zzf = zzuVar;
        this.zzg = zzazgVar;
        this.zzh = zzbzzVar;
        this.zzi = zzabVar;
        this.zzj = zzbatVar;
        this.zzk = defaultClock;
        this.zzl = zzfVar;
        this.zzm = zzbctVar;
        this.zzn = zzbdmVar;
        this.zzo = zzaxVar;
        this.zzp = zzbweVar;
        this.zzq = zzcapVar;
        this.zzr = zzbnzVar;
        this.zzt = zzbsVar;
        this.zzs = zzzVar;
        this.zzu = zzadVar;
        this.zzv = zzaeVar;
        this.zzw = zzbpbVar;
        this.zzx = zzbtVar;
        this.zzy = zzeeqVar;
        this.zzz = zzbbiVar;
        this.zzA = zzbyvVar;
        this.zzB = zzchVar;
        this.zzC = zzcdkVar;
        this.zzD = zzcawVar;
    }

    public static zzcfx zzA() {
        return zza.zze;
    }

    public static zzeer zzB() {
        return zza.zzy;
    }

    public static Clock zzC() {
        return zza.zzk;
    }

    public static zzf zza() {
        return zza.zzl;
    }

    public static zzazg zzb() {
        return zza.zzg;
    }

    public static zzbat zzc() {
        return zza.zzj;
    }

    public static zzbbi zzd() {
        return zza.zzz;
    }

    public static zzbct zze() {
        return zza.zzm;
    }

    public static zzbdm zzf() {
        return zza.zzn;
    }

    public static zzbnz zzg() {
        return zza.zzr;
    }

    public static zzbpb zzh() {
        return zza.zzw;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzj() {
        return zza.zzc;
    }

    public static zzz zzk() {
        return zza.zzs;
    }

    public static zzad zzl() {
        return zza.zzu;
    }

    public static zzae zzm() {
        return zza.zzv;
    }

    public static zzbwe zzn() {
        return zza.zzp;
    }

    public static zzbyv zzo() {
        return zza.zzA;
    }

    public static zzbzz zzp() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzq() {
        return zza.zzd;
    }

    public static zzaa zzr() {
        return zza.zzf;
    }

    public static zzab zzs() {
        return zza.zzi;
    }

    public static zzax zzt() {
        return zza.zzo;
    }

    public static zzbs zzu() {
        return zza.zzt;
    }

    public static zzbt zzv() {
        return zza.zzx;
    }

    public static zzch zzw() {
        return zza.zzB;
    }

    public static zzcap zzx() {
        return zza.zzq;
    }

    public static zzcaw zzy() {
        return zza.zzD;
    }

    public static zzcdk zzz() {
        return zza.zzC;
    }
}
