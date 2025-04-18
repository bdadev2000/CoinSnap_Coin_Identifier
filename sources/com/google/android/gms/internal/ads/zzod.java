package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class zzod implements zzoh {
    public static final zzfxg zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzob
        @Override // com.google.android.gms.internal.ads.zzfxg
        public final Object zza() {
            String zzn;
            zzn = zzod.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzbu zzc;
    private final zzbt zzd;
    private final HashMap zze;
    private zzog zzf;
    private zzbv zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzod() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzoc zzocVar = (zzoc) this.zze.get(this.zzh);
        if (zzocVar != null && zzoc.zzb(zzocVar) != -1) {
            return zzoc.zzb(zzocVar);
        }
        return this.zzi + 1;
    }

    private final zzoc zzm(int i10, @Nullable zzur zzurVar) {
        long j3 = Long.MAX_VALUE;
        zzoc zzocVar = null;
        for (zzoc zzocVar2 : this.zze.values()) {
            zzocVar2.zzg(i10, zzurVar);
            if (zzocVar2.zzj(i10, zzurVar)) {
                long zzb2 = zzoc.zzb(zzocVar2);
                if (zzb2 != -1 && zzb2 >= j3) {
                    if (zzb2 == j3) {
                        int i11 = zzen.zza;
                        if (zzoc.zzc(zzocVar) != null && zzoc.zzc(zzocVar2) != null) {
                            zzocVar = zzocVar2;
                        }
                    }
                } else {
                    zzocVar = zzocVar2;
                    j3 = zzb2;
                }
            }
        }
        if (zzocVar == null) {
            String zzn = zzn();
            zzoc zzocVar3 = new zzoc(this, zzn, i10, zzurVar);
            this.zze.put(zzn, zzocVar3);
            return zzocVar3;
        }
        return zzocVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoc zzocVar) {
        if (zzoc.zzb(zzocVar) != -1) {
            this.zzi = zzoc.zzb(zzocVar);
        }
        this.zzh = null;
    }

    private final void zzp(zzlx zzlxVar) {
        if (zzlxVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzoc zzocVar = (zzoc) this.zze.get(str);
                zzocVar.getClass();
                zzo(zzocVar);
                return;
            }
            return;
        }
        zzoc zzocVar2 = (zzoc) this.zze.get(this.zzh);
        zzoc zzm = zzm(zzlxVar.zzc, zzlxVar.zzd);
        this.zzh = zzoc.zzd(zzm);
        zzi(zzlxVar);
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar != null && zzurVar.zzb()) {
            if (zzocVar2 != null) {
                if (zzoc.zzb(zzocVar2) == zzurVar.zzd && zzoc.zzc(zzocVar2) != null && zzoc.zzc(zzocVar2).zzb == zzlxVar.zzd.zzb && zzoc.zzc(zzocVar2).zzc == zzlxVar.zzd.zzc) {
                    return;
                }
            }
            zzur zzurVar2 = zzlxVar.zzd;
            zzoc.zzd(zzm(zzlxVar.zzc, new zzur(zzurVar2.zza, zzurVar2.zzd)));
            zzoc.zzd(zzm);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    @Nullable
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized String zzf(zzbv zzbvVar, zzur zzurVar) {
        return zzoc.zzd(zzm(zzbvVar.zzn(zzurVar.zza, this.zzd).zzc, zzurVar));
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzg(zzlx zzlxVar) {
        zzog zzogVar;
        String str = this.zzh;
        if (str != null) {
            zzoc zzocVar = (zzoc) this.zze.get(str);
            zzocVar.getClass();
            zzo(zzocVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoc zzocVar2 = (zzoc) it.next();
            it.remove();
            if (zzoc.zzi(zzocVar2) && (zzogVar = this.zzf) != null) {
                zzogVar.zzd(zzlxVar, zzoc.zzd(zzocVar2), false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final void zzh(zzog zzogVar) {
        this.zzf = zzogVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (com.google.android.gms.internal.ads.zzoc.zza(r0) == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzoh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzlx r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzog r0 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            r0.getClass()
            com.google.android.gms.internal.ads.zzbv r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzur r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoc r0 = (com.google.android.gms.internal.ads.zzoc) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zzoc.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zzoc.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoc r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzoc.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzh = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzur r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r6 = new com.google.android.gms.internal.ads.zzur     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoc r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzoc.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zzoc.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbv r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbt r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzbt r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzur r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzg(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzen.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzen.zzv(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoc.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zzoc.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zzoc.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoc.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzoc.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zzoc.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zzoc.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzog r1 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zzoc.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.zzi(com.google.android.gms.internal.ads.zzlx):void");
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzj(zzlx zzlxVar, int i10) {
        this.zzf.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoc zzocVar = (zzoc) it.next();
            if (zzocVar.zzk(zzlxVar)) {
                it.remove();
                if (zzoc.zzi(zzocVar)) {
                    boolean equals = zzoc.zzd(zzocVar).equals(this.zzh);
                    boolean z10 = false;
                    if (i10 == 0 && equals && zzoc.zzh(zzocVar)) {
                        z10 = true;
                    }
                    if (equals) {
                        zzo(zzocVar);
                    }
                    this.zzf.zzd(zzlxVar, zzoc.zzd(zzocVar), z10);
                }
            }
        }
        zzp(zzlxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoh
    public final synchronized void zzk(zzlx zzlxVar) {
        this.zzf.getClass();
        zzbv zzbvVar = this.zzg;
        this.zzg = zzlxVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoc zzocVar = (zzoc) it.next();
            if (!zzocVar.zzl(zzbvVar, this.zzg) || zzocVar.zzk(zzlxVar)) {
                it.remove();
                if (zzoc.zzi(zzocVar)) {
                    if (zzoc.zzd(zzocVar).equals(this.zzh)) {
                        zzo(zzocVar);
                    }
                    this.zzf.zzd(zzlxVar, zzoc.zzd(zzocVar), false);
                }
            }
        }
        zzp(zzlxVar);
    }

    public zzod(zzfxg zzfxgVar) {
        this.zzc = new zzbu();
        this.zzd = new zzbt();
        this.zze = new HashMap();
        this.zzg = zzbv.zza;
        this.zzi = -1L;
    }
}
