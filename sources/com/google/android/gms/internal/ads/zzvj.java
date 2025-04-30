package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzvj extends zzxt {
    private final boolean zzb;
    private final zzdb zzc;
    private final zzcz zzd;
    private zzvh zze;

    @Nullable
    private zzvg zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvj(zzvq zzvqVar, boolean z8) {
        super(zzvqVar);
        boolean z9;
        if (z8) {
            zzvqVar.zzv();
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzb = z9;
        this.zzc = new zzdb();
        this.zzd = new zzcz();
        zzvqVar.zzM();
        this.zze = zzvh.zzq(zzvqVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 != null && obj.equals(zzvh.zzd)) {
            obj3 = this.zze.zzf;
            return obj3;
        }
        return obj;
    }

    private final void zzL(long j7) {
        zzvg zzvgVar = this.zzf;
        int zza = this.zze.zza(zzvgVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzvh zzvhVar = this.zze;
        zzcz zzczVar = this.zzd;
        zzvhVar.zzd(zza, zzczVar, false);
        long j9 = zzczVar.zze;
        if (j9 != C.TIME_UNSET && j7 >= j9) {
            j7 = Math.max(0L, j9 - 1);
        }
        zzvgVar.zzs(j7);
    }

    public final zzdc zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    @Nullable
    public final zzvo zzD(zzvo zzvoVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zzf;
        Object obj3 = zzvoVar.zza;
        if (obj != null) {
            obj2 = this.zze.zzf;
            if (obj2.equals(obj3)) {
                obj3 = zzvh.zzd;
            }
        }
        return zzvoVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzxt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzE(com.google.android.gms.internal.ads.zzdc r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzvh r0 = r14.zze
            com.google.android.gms.internal.ads.zzvh r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzvg r15 = r14.zzf
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzvh r0 = r14.zze
            com.google.android.gms.internal.ads.zzvh r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzdb.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzvh.zzd
            com.google.android.gms.internal.ads.zzvh r15 = com.google.android.gms.internal.ads.zzvh.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.zzdb r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzdb r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzvg r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzvh r8 = r14.zze
            com.google.android.gms.internal.ads.zzcz r9 = r14.zzd
            com.google.android.gms.internal.ads.zzvo r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzvh r5 = r14.zze
            com.google.android.gms.internal.ads.zzdb r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzdb r9 = r14.zzc
            com.google.android.gms.internal.ads.zzcz r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzvh r0 = r14.zze
            com.google.android.gms.internal.ads.zzvh r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzvh r15 = com.google.android.gms.internal.ads.zzvh.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzvg r15 = r14.zzf
            if (r15 == 0) goto L9b
            r14.zzL(r4)
            com.google.android.gms.internal.ads.zzvo r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzvo r1 = r15.zza(r0)
        L9b:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzvh r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.zzvg r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvj.zzE(com.google.android.gms.internal.ads.zzdc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB(null, ((zzxt) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        ((zzvg) zzvmVar).zzt();
        if (zzvmVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzvq
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzvg zzI(zzvo zzvoVar, zzzv zzzvVar, long j7) {
        zzvg zzvgVar = new zzvg(zzvoVar, zzzvVar, j7);
        zzvgVar.zzu(((zzxt) this).zza);
        if (this.zzh) {
            zzvgVar.zzr(zzvoVar.zza(zzK(zzvoVar.zza)));
        } else {
            this.zzf = zzvgVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzxt) this).zza);
            }
        }
        return zzvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final void zzt(zzbu zzbuVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzxo(this.zze.zzc, zzbuVar));
        } else {
            this.zze = zzvh.zzq(zzbuVar);
        }
        ((zzxt) this).zza.zzt(zzbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzvq
    public final void zzz() {
    }
}
