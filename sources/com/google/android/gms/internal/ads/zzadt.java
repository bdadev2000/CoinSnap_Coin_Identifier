package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzadt implements zzafa {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i9, boolean z8) {
        return zzaey.zza(this, zzuVar, i9, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i9, boolean z8, int i10) throws IOException {
        int zza = zzuVar.zza(this.zza, 0, Math.min(4096, i9));
        if (zza == -1) {
            if (z8) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i9) {
        zzaey.zzb(this, zzfuVar, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i9, int i10) {
        zzfuVar.zzL(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(long j7, int i9, int i10, int i11, @Nullable zzaez zzaezVar) {
    }
}
