package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class zzog implements zzok {
    public static final zzfyp zza = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzoe
        @Override // com.google.android.gms.internal.ads.zzfyp
        public final Object zza() {
            String zzn;
            zzn = zzog.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcb zzc;
    private final zzca zzd;
    private final HashMap zze;
    private zzoj zzf;
    private zzcc zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzog() {
        throw null;
    }

    public final long zzl() {
        long j2;
        long j3;
        zzof zzofVar = (zzof) this.zze.get(this.zzh);
        if (zzofVar != null) {
            j2 = zzofVar.zzd;
            if (j2 != -1) {
                j3 = zzofVar.zzd;
                return j3;
            }
        }
        return this.zzi + 1;
    }

    private final zzof zzm(int i2, @Nullable zzuy zzuyVar) {
        long j2;
        zzuy zzuyVar2;
        zzuy zzuyVar3;
        long j3 = Long.MAX_VALUE;
        zzof zzofVar = null;
        for (zzof zzofVar2 : this.zze.values()) {
            zzofVar2.zzg(i2, zzuyVar);
            if (zzofVar2.zzj(i2, zzuyVar)) {
                j2 = zzofVar2.zzd;
                if (j2 == -1 || j2 < j3) {
                    zzofVar = zzofVar2;
                    j3 = j2;
                } else if (j2 == j3) {
                    int i3 = zzeu.zza;
                    zzuyVar2 = zzofVar.zze;
                    if (zzuyVar2 != null) {
                        zzuyVar3 = zzofVar2.zze;
                        if (zzuyVar3 != null) {
                            zzofVar = zzofVar2;
                        }
                    }
                }
            }
        }
        if (zzofVar != null) {
            return zzofVar;
        }
        String zzn = zzn();
        zzof zzofVar3 = new zzof(this, zzn, i2, zzuyVar);
        this.zze.put(zzn, zzofVar3);
        return zzofVar3;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzof zzofVar) {
        long j2;
        long j3;
        j2 = zzofVar.zzd;
        if (j2 != -1) {
            j3 = zzofVar.zzd;
            this.zzi = j3;
        }
        this.zzh = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmb zzmbVar) {
        String str;
        long j2;
        zzuy zzuyVar;
        zzuy zzuyVar2;
        zzuy zzuyVar3;
        String unused;
        String unused2;
        if (zzmbVar.zzb.zzo()) {
            String str2 = this.zzh;
            if (str2 != null) {
                zzof zzofVar = (zzof) this.zze.get(str2);
                zzofVar.getClass();
                zzo(zzofVar);
                return;
            }
            return;
        }
        zzof zzofVar2 = (zzof) this.zze.get(this.zzh);
        zzof zzm = zzm(zzmbVar.zzc, zzmbVar.zzd);
        str = zzm.zzb;
        this.zzh = str;
        zzi(zzmbVar);
        zzuy zzuyVar4 = zzmbVar.zzd;
        if (zzuyVar4 == null || !zzuyVar4.zzb()) {
            return;
        }
        if (zzofVar2 != null) {
            long j3 = zzuyVar4.zzd;
            j2 = zzofVar2.zzd;
            if (j2 == j3) {
                zzuyVar = zzofVar2.zze;
                if (zzuyVar != null) {
                    zzuyVar2 = zzofVar2.zze;
                    if (zzuyVar2.zzb == zzmbVar.zzd.zzb) {
                        zzuyVar3 = zzofVar2.zze;
                        if (zzuyVar3.zzc == zzmbVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzuy zzuyVar5 = zzmbVar.zzd;
        unused = zzm(zzmbVar.zzc, new zzuy(zzuyVar5.zza, zzuyVar5.zzd)).zzb;
        unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    @Nullable
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized String zzf(zzcc zzccVar, zzuy zzuyVar) {
        String str;
        str = zzm(zzccVar.zzn(zzuyVar.zza, this.zzd).zzc, zzuyVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzg(zzmb zzmbVar) {
        boolean z2;
        zzoj zzojVar;
        String str;
        try {
            String str2 = this.zzh;
            if (str2 != null) {
                zzof zzofVar = (zzof) this.zze.get(str2);
                zzofVar.getClass();
                zzo(zzofVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar2 = (zzof) it.next();
                it.remove();
                z2 = zzofVar2.zzf;
                if (z2 && (zzojVar = this.zzf) != null) {
                    str = zzofVar2.zzb;
                    zzojVar.zzd(zzmbVar, str, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final void zzh(zzoj zzojVar) {
        this.zzf = zzojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzi(zzmb zzmbVar) {
        boolean z2;
        String str;
        boolean z3;
        String str2;
        boolean z4;
        String str3;
        long j2;
        int i2;
        String unused;
        String unused2;
        try {
            this.zzf.getClass();
            if (!zzmbVar.zzb.zzo()) {
                zzuy zzuyVar = zzmbVar.zzd;
                if (zzuyVar != null) {
                    if (zzuyVar.zzd >= zzl()) {
                        zzof zzofVar = (zzof) this.zze.get(this.zzh);
                        if (zzofVar != null) {
                            j2 = zzofVar.zzd;
                            if (j2 == -1) {
                                i2 = zzofVar.zzc;
                                if (i2 == zzmbVar.zzc) {
                                }
                            }
                        }
                    }
                }
                zzof zzm = zzm(zzmbVar.zzc, zzmbVar.zzd);
                if (this.zzh == null) {
                    str3 = zzm.zzb;
                    this.zzh = str3;
                }
                zzuy zzuyVar2 = zzmbVar.zzd;
                if (zzuyVar2 != null && zzuyVar2.zzb()) {
                    zzof zzm2 = zzm(zzmbVar.zzc, new zzuy(zzuyVar2.zza, zzuyVar2.zzd, zzuyVar2.zzb));
                    z4 = zzm2.zzf;
                    if (!z4) {
                        zzm2.zzf = true;
                        zzcc zzccVar = zzmbVar.zzb;
                        zzuy zzuyVar3 = zzmbVar.zzd;
                        zzccVar.zzn(zzuyVar3.zza, this.zzd);
                        this.zzd.zzg(zzmbVar.zzd.zzb);
                        Math.max(0L, zzeu.zzu(0L) + zzeu.zzu(0L));
                        unused = zzm2.zzb;
                    }
                }
                z2 = zzm.zzf;
                if (!z2) {
                    zzm.zzf = true;
                    unused2 = zzm.zzb;
                }
                str = zzm.zzb;
                if (str.equals(this.zzh)) {
                    z3 = zzm.zzg;
                    if (!z3) {
                        zzm.zzg = true;
                        zzoj zzojVar = this.zzf;
                        str2 = zzm.zzb;
                        zzojVar.zzc(zzmbVar, str2);
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzj(zzmb zzmbVar, int i2) {
        boolean z2;
        String str;
        String str2;
        boolean z3;
        try {
            this.zzf.getClass();
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar = (zzof) it.next();
                if (zzofVar.zzk(zzmbVar)) {
                    it.remove();
                    z2 = zzofVar.zzf;
                    if (z2) {
                        str = zzofVar.zzb;
                        boolean equals = str.equals(this.zzh);
                        boolean z4 = false;
                        if (i2 == 0 && equals) {
                            z3 = zzofVar.zzg;
                            if (z3) {
                                z4 = true;
                            }
                        }
                        if (equals) {
                            zzo(zzofVar);
                        }
                        zzoj zzojVar = this.zzf;
                        str2 = zzofVar.zzb;
                        zzojVar.zzd(zzmbVar, str2, z4);
                    }
                }
            }
            zzp(zzmbVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzk(zzmb zzmbVar) {
        boolean z2;
        String str;
        String str2;
        try {
            this.zzf.getClass();
            zzcc zzccVar = this.zzg;
            this.zzg = zzmbVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzof zzofVar = (zzof) it.next();
                if (zzofVar.zzl(zzccVar, this.zzg) && !zzofVar.zzk(zzmbVar)) {
                }
                it.remove();
                z2 = zzofVar.zzf;
                if (z2) {
                    str = zzofVar.zzb;
                    if (str.equals(this.zzh)) {
                        zzo(zzofVar);
                    }
                    zzoj zzojVar = this.zzf;
                    str2 = zzofVar.zzb;
                    zzojVar.zzd(zzmbVar, str2, false);
                }
            }
            zzp(zzmbVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzog(zzfyp zzfypVar) {
        this.zzc = new zzcb();
        this.zzd = new zzca();
        this.zze = new HashMap();
        this.zzg = zzcc.zza;
        this.zzi = -1L;
    }
}
