package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzael {
    private final zzfu zza = new zzfu(10);

    @Nullable
    public final zzcd zza(zzadv zzadvVar, @Nullable zzaho zzahoVar) throws IOException {
        zzcd zzcdVar = null;
        int i9 = 0;
        while (true) {
            try {
                ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 10, false);
                this.zza.zzK(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzL(3);
                int zzl = this.zza.zzl();
                int i10 = zzl + 10;
                if (zzcdVar == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zza.zzM(), 0, bArr, 0, 10);
                    ((zzadi) zzadvVar).zzm(bArr, 10, zzl, false);
                    zzcdVar = zzahq.zza(bArr, i10, zzahoVar, new zzagr());
                } else {
                    ((zzadi) zzadvVar).zzl(zzl, false);
                }
                i9 += i10;
            } catch (EOFException unused) {
            }
        }
        zzadvVar.zzj();
        ((zzadi) zzadvVar).zzl(i9, false);
        return zzcdVar;
    }
}
