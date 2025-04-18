package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzacm implements zzadx {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i10, boolean z10) {
        return zzadv.zza(this, zznVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i10, boolean z10, int i11) throws IOException {
        int zza = zznVar.zza(this.zza, 0, Math.min(4096, i10));
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i10) {
        zzadv.zzb(this, zzedVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i10, int i11) {
        zzedVar.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(long j3, int i10, int i11, int i12, @Nullable zzadw zzadwVar) {
    }
}
