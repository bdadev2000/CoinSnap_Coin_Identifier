package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzed extends zzea {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e7->B:43:0x00e9, LOOP_START, PHI: r0
      0x00e7: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzed.zze(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdx zzi(zzdx zzdxVar) throws zzdy {
        int i9 = zzdxVar.zzd;
        if (i9 != 3) {
            if (i9 != 2) {
                if (i9 != 268435456 && i9 != 21 && i9 != 1342177280 && i9 != 22 && i9 != 1610612736 && i9 != 4) {
                    throw new zzdy("Unhandled input format:", zzdxVar);
                }
            } else {
                return zzdx.zza;
            }
        }
        return new zzdx(zzdxVar.zzb, zzdxVar.zzc, 2);
    }
}
