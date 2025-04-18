package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcx extends zzcu {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e7->B:43:0x00e9, LOOP_START, PHI: r0
      0x00e7: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzct
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcx.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) throws zzcs {
        int i2 = zzcrVar.zzd;
        if (i2 != 3) {
            if (i2 == 2) {
                return zzcr.zza;
            }
            if (i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
                throw new zzcs("Unhandled input format:", zzcrVar);
            }
        }
        return new zzcr(zzcrVar.zzb, zzcrVar.zzc, 2);
    }
}
