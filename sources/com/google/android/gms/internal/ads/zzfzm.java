package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfzm extends zzfxo {
    private final zzfzo zza;

    public zzfzm(zzfzo zzfzoVar, int i10) {
        super(zzfzoVar.size(), i10);
        this.zza = zzfzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxo
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
