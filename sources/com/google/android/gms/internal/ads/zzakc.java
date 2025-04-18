package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzakc {
    public static void zza(zzakd zzakdVar, zzakh zzakhVar, zzdg zzdgVar) {
        for (int i10 = 0; i10 < zzakdVar.zza(); i10++) {
            long zzb = zzakdVar.zzb(i10);
            List zzc = zzakdVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i10 != zzakdVar.zza() - 1) {
                    long zzb2 = zzakdVar.zzb(i10 + 1) - zzakdVar.zzb(i10);
                    if (zzb2 > 0) {
                        zzdgVar.zza(new zzaka(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
