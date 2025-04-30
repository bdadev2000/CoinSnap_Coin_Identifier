package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzif {
    private final zzit zza;
    private final byte[] zzb;

    public final zzia zza() {
        this.zza.zzb();
        return new zzij(this.zzb);
    }

    public final zzit zzb() {
        return this.zza;
    }

    private zzif(int i9) {
        byte[] bArr = new byte[i9];
        this.zzb = bArr;
        this.zza = zzit.zzb(bArr);
    }
}
