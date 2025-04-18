package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzepv implements zzevz {
    private final zzges zza;
    private final VersionInfoParcel zzb;

    public zzepv(VersionInfoParcel versionInfoParcel, zzges zzgesVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepv.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepw zzc() throws Exception {
        return zzepw.zzb(this.zzb);
    }
}
