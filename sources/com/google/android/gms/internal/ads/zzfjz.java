package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzfjz {
    public static zzfka zza(Context context, int i10) {
        boolean booleanValue;
        if (zzfko.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbeg.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbeg.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbeg.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbeg.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfkc(context, i10);
            }
        }
        return new zzfle();
    }

    public static zzfka zzb(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfka zza = zza(context, i10);
        if (zza instanceof zzfkc) {
            zza.zzi();
            zza.zzn(i11);
            zza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzmVar.zzm));
            if (zzfkk.zze(zzmVar.zzp)) {
                zza.zze(zzmVar.zzp);
            }
        }
        return zza;
    }
}
