package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeul implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeul(Context context, zzgge zzggeVar) {
        this.zza = context;
        this.zzb = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzbbm zzg = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzbbc zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzx(zzj);
                        }
                        if (zzk != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzz(zzk);
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzj();
                        zzk = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ()) {
                        if (zzk != null && !TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", zzk);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeum(bundle);
            }
        });
    }
}
