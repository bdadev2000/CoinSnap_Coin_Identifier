package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzes extends zzce {
    final /* synthetic */ PreloadCallback zza;
    final /* synthetic */ zzex zzb;

    public zzes(zzex zzexVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        this.zzb = zzexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) {
        zzex.zzk(this.zzb, zzftVar).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzeq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzes.this.zza.onAdsAvailable((PreloadConfiguration) obj);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) {
        zzex.zzk(this.zzb, zzftVar).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzes.this.zza.onAdsExhausted((PreloadConfiguration) obj);
            }
        });
    }
}
