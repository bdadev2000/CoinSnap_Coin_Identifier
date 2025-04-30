package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeyy implements zzexw {
    private final Executor zza;
    private final String zzb;

    @Nullable
    private final PackageInfo zzc;
    private final zzcbp zzd;

    public zzeyy(zzcbp zzcbpVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i9) {
        this.zzd = zzcbpVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzf(zzgft.zzm(zzgft.zzh(this.zzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzeyz((String) obj);
            }
        }, this.zza), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeyx
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeyy.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ f4.c zzc(Throwable th) throws Exception {
        return zzgft.zzh(new zzeyz(this.zzb));
    }
}
