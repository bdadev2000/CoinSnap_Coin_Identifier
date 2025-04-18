package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzacw implements zzaeh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ int zzf(zzp zzpVar, int i2, boolean z2) {
        return zzaef.zza(this, zzpVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final int zzg(zzp zzpVar, int i2, boolean z2, int i3) throws IOException {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i2));
        if (zza != -1) {
            return zza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzl(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final /* synthetic */ void zzq(zzek zzekVar, int i2) {
        zzaef.zzb(this, zzekVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzr(zzek zzekVar, int i2, int i3) {
        zzekVar.zzM(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeh
    public final void zzs(long j2, int i2, int i3, int i4, @Nullable zzaeg zzaegVar) {
    }
}
