package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcdz extends zzcdv {
    public zzcdz(zzccj zzccjVar) {
        super(zzccjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzt(String str) {
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzccj zzccjVar = (zzccj) this.zzc.get();
        if (zzccjVar != null && zzf != null) {
            zzccjVar.zzt(zzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
