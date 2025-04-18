package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzdyo implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzdyo(zzhja zzhjaVar, zzhja zzhjaVar2, zzhja zzhjaVar3) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzavn zzavnVar = (zzavn) this.zza.zzb();
        final Context zza = ((zzchu) this.zzb).zza();
        ListenableFuture zzb = zzfkb.zzc().zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzavn.this.zzc().zzg(zza);
            }
        });
        zzhiq.zzb(zzb);
        return zzb;
    }
}
