package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzadh {
    private final zzed zza = new zzed(10);

    @Nullable
    public final zzbd zza(zzacs zzacsVar, @Nullable zzagi zzagiVar) throws IOException {
        zzbd zzbdVar = null;
        int i10 = 0;
        while (true) {
            try {
                zzacsVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int zzl = this.zza.zzl();
                int i11 = zzl + 10;
                if (zzbdVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzacsVar.zzh(bArr, 10, zzl);
                    zzbdVar = zzagk.zza(bArr, i11, zzagiVar, new zzafm());
                } else {
                    zzacsVar.zzg(zzl);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        zzacsVar.zzj();
        zzacsVar.zzg(i10);
        return zzbdVar;
    }
}
