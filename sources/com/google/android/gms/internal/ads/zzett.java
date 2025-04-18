package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.k;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzett implements zzexh {
    private final zzgfz zza;

    public zzett(Context context, zzgfz zzgfzVar) {
        this.zza = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzets
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzazu zzg = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzazk zza = zzg.zza();
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
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzk);
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        bundle2.putString(k.f29698c, zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzetu(bundle);
            }
        });
    }
}
