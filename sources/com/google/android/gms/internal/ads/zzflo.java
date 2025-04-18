package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzflo {
    public static zzflp zza(Context context, int i2) {
        boolean booleanValue;
        if (zzfmd.zza()) {
            int i3 = i2 - 2;
            if (i3 != 20 && i3 != 21) {
                switch (i3) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbek.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbek.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbek.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbek.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzflr(context, i2);
            }
        }
        return new zzfmt();
    }

    public static zzflp zzb(Context context, int i2, int i3, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzflp zza = zza(context, i2);
        if (zza instanceof zzflr) {
            zza.zzi();
            zza.zzn(i3);
            zza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzmVar.zzm));
            if (zzflz.zze(zzmVar.zzp)) {
                zza.zze(zzmVar.zzp);
            }
        }
        return zza;
    }
}
