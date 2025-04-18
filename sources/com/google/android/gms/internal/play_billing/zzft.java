package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzft implements zzga {
    private final zzga[] zza;

    public zzft(zzga... zzgaVarArr) {
        this.zza = zzgaVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzga
    public final zzfz zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzga zzgaVar = this.zza[i2];
            if (zzgaVar.zzc(cls)) {
                return zzgaVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzga
    public final boolean zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
