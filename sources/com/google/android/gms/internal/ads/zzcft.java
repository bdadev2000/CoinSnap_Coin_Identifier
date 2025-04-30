package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcft extends zzcfp {
    public zzcft(zzcee zzceeVar) {
        super(zzceeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcfp
    public final boolean zzt(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcee zzceeVar = (zzcee) this.zzc.get();
        if (zzceeVar != null && zzf != null) {
            zzceeVar.zzt(zzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
