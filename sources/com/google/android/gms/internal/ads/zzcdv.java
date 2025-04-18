package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcdv extends zzcdr {
    public zzcdv(zzccf zzccfVar) {
        super(zzccfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final boolean zzt(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzccf zzccfVar = (zzccf) this.zzc.get();
        if (zzccfVar != null && zzf != null) {
            zzccfVar.zzt(zzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
