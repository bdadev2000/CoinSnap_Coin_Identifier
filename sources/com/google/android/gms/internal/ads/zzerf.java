package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerf implements zzexh {
    private final zzgfz zza;
    private final VersionInfoParcel zzb;

    public zzerf(VersionInfoParcel versionInfoParcel, zzgfz zzgfzVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzere
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerf.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerg zzc() throws Exception {
        return zzerg.zzb(this.zzb);
    }
}
