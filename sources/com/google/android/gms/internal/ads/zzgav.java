package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgav extends zzfyx {
    private final zzgax zza;

    public zzgav(zzgax zzgaxVar, int i2) {
        super(zzgaxVar.size(), i2);
        this.zza = zzgaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyx
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
