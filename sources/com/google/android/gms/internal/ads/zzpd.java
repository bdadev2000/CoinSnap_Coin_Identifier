package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzpd implements zzph {
    public static final zzfyw zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzpb
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() {
            String zzn;
            zzn = zzpd.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzdb zzc;
    private final zzcz zzd;
    private final HashMap zze;
    private final zzfyw zzf;
    private zzpg zzg;
    private zzdc zzh;

    @Nullable
    private String zzi;
    private long zzj;

    public zzpd() {
        throw null;
    }

    public final long zzl() {
        long j7;
        long j9;
        zzpc zzpcVar = (zzpc) this.zze.get(this.zzi);
        if (zzpcVar != null) {
            j7 = zzpcVar.zzd;
            if (j7 != -1) {
                j9 = zzpcVar.zzd;
                return j9;
            }
        }
        return this.zzj + 1;
    }

    private final zzpc zzm(int i9, @Nullable zzvo zzvoVar) {
        long j7;
        zzvo zzvoVar2;
        zzvo zzvoVar3;
        long j9 = Long.MAX_VALUE;
        zzpc zzpcVar = null;
        for (zzpc zzpcVar2 : this.zze.values()) {
            zzpcVar2.zzg(i9, zzvoVar);
            if (zzpcVar2.zzj(i9, zzvoVar)) {
                j7 = zzpcVar2.zzd;
                if (j7 != -1 && j7 >= j9) {
                    if (j7 == j9) {
                        int i10 = zzgd.zza;
                        zzvoVar2 = zzpcVar.zze;
                        if (zzvoVar2 != null) {
                            zzvoVar3 = zzpcVar2.zze;
                            if (zzvoVar3 != null) {
                                zzpcVar = zzpcVar2;
                            }
                        }
                    }
                } else {
                    zzpcVar = zzpcVar2;
                    j9 = j7;
                }
            }
        }
        if (zzpcVar == null) {
            String zzn = zzn();
            zzpc zzpcVar3 = new zzpc(this, zzn, i9, zzvoVar);
            this.zze.put(zzn, zzpcVar3);
            return zzpcVar3;
        }
        return zzpcVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzpc zzpcVar) {
        long j7;
        long j9;
        j7 = zzpcVar.zzd;
        if (j7 != -1) {
            j9 = zzpcVar.zzd;
            this.zzj = j9;
        }
        this.zzi = null;
    }

    private final void zzp(zzmy zzmyVar) {
        String str;
        long j7;
        zzvo zzvoVar;
        zzvo zzvoVar2;
        zzvo zzvoVar3;
        String unused;
        String unused2;
        if (zzmyVar.zzb.zzo()) {
            String str2 = this.zzi;
            if (str2 != null) {
                zzpc zzpcVar = (zzpc) this.zze.get(str2);
                zzpcVar.getClass();
                zzo(zzpcVar);
                return;
            }
            return;
        }
        zzpc zzpcVar2 = (zzpc) this.zze.get(this.zzi);
        zzpc zzm = zzm(zzmyVar.zzc, zzmyVar.zzd);
        str = zzm.zzb;
        this.zzi = str;
        zzi(zzmyVar);
        zzvo zzvoVar4 = zzmyVar.zzd;
        if (zzvoVar4 != null && zzvoVar4.zzb()) {
            if (zzpcVar2 != null) {
                long j9 = zzvoVar4.zzd;
                j7 = zzpcVar2.zzd;
                if (j7 == j9) {
                    zzvoVar = zzpcVar2.zze;
                    if (zzvoVar != null) {
                        zzvoVar2 = zzpcVar2.zze;
                        if (zzvoVar2.zzb == zzmyVar.zzd.zzb) {
                            zzvoVar3 = zzpcVar2.zze;
                            if (zzvoVar3.zzc == zzmyVar.zzd.zzc) {
                                return;
                            }
                        }
                    }
                }
            }
            zzvo zzvoVar5 = zzmyVar.zzd;
            unused = zzm(zzmyVar.zzc, new zzvo(zzvoVar5.zza, zzvoVar5.zzd)).zzb;
            unused2 = zzm.zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    @Nullable
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized String zzf(zzdc zzdcVar, zzvo zzvoVar) {
        String str;
        str = zzm(zzdcVar.zzn(zzvoVar.zza, this.zzd).zzd, zzvoVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzg(zzmy zzmyVar) {
        boolean z8;
        zzpg zzpgVar;
        String str;
        try {
            String str2 = this.zzi;
            if (str2 != null) {
                zzpc zzpcVar = (zzpc) this.zze.get(str2);
                zzpcVar.getClass();
                zzo(zzpcVar);
            }
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpc zzpcVar2 = (zzpc) it.next();
                it.remove();
                z8 = zzpcVar2.zzf;
                if (z8 && (zzpgVar = this.zzg) != null) {
                    str = zzpcVar2.zzb;
                    zzpgVar.zzd(zzmyVar, str, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final void zzh(zzpg zzpgVar) {
        this.zzg = zzpgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzi(zzmy zzmyVar) {
        boolean z8;
        String str;
        boolean z9;
        String str2;
        boolean z10;
        String str3;
        long j7;
        int i9;
        String unused;
        String unused2;
        try {
            this.zzg.getClass();
            if (!zzmyVar.zzb.zzo()) {
                zzvo zzvoVar = zzmyVar.zzd;
                if (zzvoVar != null) {
                    if (zzvoVar.zzd >= zzl()) {
                        zzpc zzpcVar = (zzpc) this.zze.get(this.zzi);
                        if (zzpcVar != null) {
                            j7 = zzpcVar.zzd;
                            if (j7 == -1) {
                                i9 = zzpcVar.zzc;
                                if (i9 == zzmyVar.zzc) {
                                }
                            }
                        }
                    }
                }
                zzpc zzm = zzm(zzmyVar.zzc, zzmyVar.zzd);
                if (this.zzi == null) {
                    str3 = zzm.zzb;
                    this.zzi = str3;
                }
                zzvo zzvoVar2 = zzmyVar.zzd;
                if (zzvoVar2 != null && zzvoVar2.zzb()) {
                    zzpc zzm2 = zzm(zzmyVar.zzc, new zzvo(zzvoVar2.zza, zzvoVar2.zzd, zzvoVar2.zzb));
                    z10 = zzm2.zzf;
                    if (!z10) {
                        zzm2.zzf = true;
                        zzdc zzdcVar = zzmyVar.zzb;
                        zzvo zzvoVar3 = zzmyVar.zzd;
                        zzdcVar.zzn(zzvoVar3.zza, this.zzd);
                        this.zzd.zzi(zzmyVar.zzd.zzb);
                        Math.max(0L, zzgd.zzu(0L) + zzgd.zzu(0L));
                        unused = zzm2.zzb;
                    }
                }
                z8 = zzm.zzf;
                if (!z8) {
                    zzm.zzf = true;
                    unused2 = zzm.zzb;
                }
                str = zzm.zzb;
                if (str.equals(this.zzi)) {
                    z9 = zzm.zzg;
                    if (!z9) {
                        zzm.zzg = true;
                        zzpg zzpgVar = this.zzg;
                        str2 = zzm.zzb;
                        zzpgVar.zzc(zzmyVar, str2);
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzj(zzmy zzmyVar, int i9) {
        boolean z8;
        String str;
        String str2;
        boolean z9;
        try {
            this.zzg.getClass();
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpc zzpcVar = (zzpc) it.next();
                if (zzpcVar.zzk(zzmyVar)) {
                    it.remove();
                    z8 = zzpcVar.zzf;
                    if (z8) {
                        str = zzpcVar.zzb;
                        boolean equals = str.equals(this.zzi);
                        boolean z10 = false;
                        if (i9 == 0 && equals) {
                            z9 = zzpcVar.zzg;
                            if (z9) {
                                z10 = true;
                            }
                        }
                        if (equals) {
                            zzo(zzpcVar);
                        }
                        zzpg zzpgVar = this.zzg;
                        str2 = zzpcVar.zzb;
                        zzpgVar.zzd(zzmyVar, str2, z10);
                    }
                }
            }
            zzp(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzph
    public final synchronized void zzk(zzmy zzmyVar) {
        boolean z8;
        String str;
        String str2;
        try {
            this.zzg.getClass();
            zzdc zzdcVar = this.zzh;
            this.zzh = zzmyVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzpc zzpcVar = (zzpc) it.next();
                if (zzpcVar.zzl(zzdcVar, this.zzh) && !zzpcVar.zzk(zzmyVar)) {
                }
                it.remove();
                z8 = zzpcVar.zzf;
                if (z8) {
                    str = zzpcVar.zzb;
                    if (str.equals(this.zzi)) {
                        zzo(zzpcVar);
                    }
                    zzpg zzpgVar = this.zzg;
                    str2 = zzpcVar.zzb;
                    zzpgVar.zzd(zzmyVar, str2, false);
                }
            }
            zzp(zzmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzpd(zzfyw zzfywVar) {
        this.zzf = zzfywVar;
        this.zzc = new zzdb();
        this.zzd = new zzcz();
        this.zze = new HashMap();
        this.zzh = zzdc.zza;
        this.zzj = -1L;
    }
}
