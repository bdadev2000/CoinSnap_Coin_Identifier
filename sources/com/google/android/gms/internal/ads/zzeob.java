package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeob implements zzevz {
    private final zzges zza;
    private final zzffo zzb;

    public zzeob(zzges zzgesVar, zzffo zzffoVar, zzfgd zzfgdVar) {
        this.zza = zzgesVar;
        this.zzb = zzffoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeob.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeoc zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgT)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd))) {
            str = zzfgd.zza();
        }
        return new zzeoc(str);
    }
}
