package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzexf implements zzevz {
    private final Executor zza;
    private final String zzb;

    public zzexf(zzbzq zzbzqVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzf(zzgei.zzm(zzgei.zzh(this.zzb), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzexg((String) obj);
            }
        }, this.zza), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzexf.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ ua.b zzc(Throwable th2) throws Exception {
        return zzgei.zzh(new zzexg(this.zzb));
    }
}
