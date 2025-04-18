package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzum extends zzwt {
    private final boolean zzb;
    private final zzbu zzc;
    private final zzbt zzd;
    private zzuk zze;

    @Nullable
    private zzuj zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzum(zzut zzutVar, boolean z10) {
        super(zzutVar);
        boolean z11;
        if (z10) {
            zzutVar.zzv();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzbu();
        this.zzd = new zzbt();
        zzutVar.zzM();
        this.zze = zzuk.zzq(zzutVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 != null && obj.equals(zzuk.zzc)) {
            obj3 = this.zze.zze;
            return obj3;
        }
        return obj;
    }

    private final boolean zzL(long j3) {
        zzuj zzujVar = this.zzf;
        int zza = this.zze.zza(zzujVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzuk zzukVar = this.zze;
        zzbt zzbtVar = this.zzd;
        zzukVar.zzd(zza, zzbtVar, false);
        long j10 = zzbtVar.zzd;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        zzujVar.zzs(j3);
        return true;
    }

    public final zzbv zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    @Nullable
    public final zzur zzD(zzur zzurVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzurVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zzuk.zzc;
            }
        }
        return zzurVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzE(com.google.android.gms.internal.ads.zzbv r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            if (r15 == 0) goto L9e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9e
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbu.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzuk.zzc
            com.google.android.gms.internal.ads.zzuk r15 = com.google.android.gms.internal.ads.zzuk.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.zzbu r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzbu r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zzuj r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzuk r8 = r14.zze
            com.google.android.gms.internal.ads.zzbt r9 = r14.zzd
            com.google.android.gms.internal.ads.zzur r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzuk r5 = r14.zze
            com.google.android.gms.internal.ads.zzbu r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzbu r9 = r14.zzc
            com.google.android.gms.internal.ads.zzbt r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzuk r0 = r14.zze
            com.google.android.gms.internal.ads.zzuk r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzuk r15 = com.google.android.gms.internal.ads.zzuk.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            if (r15 == 0) goto L9e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzur r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzur r1 = r15.zza(r0)
        L9e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzuk r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzuj r15 = r14.zzf
            r15.getClass()
            r15.zzr(r1)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzum.zzE(com.google.android.gms.internal.ads.zzbv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwt) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzuj) zzupVar).zzt();
        if (zzupVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzut
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuj zzI(zzur zzurVar, zzys zzysVar, long j3) {
        zzuj zzujVar = new zzuj(zzurVar, zzysVar, j3);
        zzujVar.zzu(((zzwt) this).zza);
        if (this.zzh) {
            zzujVar.zzr(zzurVar.zza(zzK(zzurVar.zza)));
        } else {
            this.zzf = zzujVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwt) this).zza);
            }
        }
        return zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzaw zzawVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwp(this.zze.zzb, zzawVar));
        } else {
            this.zze = zzuk.zzq(zzawVar);
        }
        ((zzwt) this).zza.zzt(zzawVar);
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
