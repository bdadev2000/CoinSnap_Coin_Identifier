package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcq extends zzcn {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e8->B:43:0x00ea, LOOP_START, PHI: r0
      0x00e8: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcq.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzi(zzck zzckVar) throws zzcl {
        int i10 = zzckVar.zzd;
        if (i10 != 3) {
            if (i10 != 2) {
                if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                    throw new zzcl("Unhandled input format:", zzckVar);
                }
            } else {
                return zzck.zza;
            }
        }
        return new zzck(zzckVar.zzb, zzckVar.zzc, 2);
    }
}
