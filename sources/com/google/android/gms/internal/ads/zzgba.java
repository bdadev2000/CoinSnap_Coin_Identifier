package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgba extends zzfzc {
    private final zzgbc zza;

    public zzgba(zzgbc zzgbcVar, int i9) {
        super(zzgbcVar.size(), i9);
        this.zza = zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final Object zza(int i9) {
        return this.zza.get(i9);
    }
}
