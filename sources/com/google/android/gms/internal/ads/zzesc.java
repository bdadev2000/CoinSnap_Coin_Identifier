package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzesc implements zzexw {
    private final zzgge zza;
    private final VersionInfoParcel zzb;

    public zzesc(VersionInfoParcel versionInfoParcel, zzgge zzggeVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesc.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzesd zzc() throws Exception {
        return zzesd.zzb(this.zzb);
    }
}
