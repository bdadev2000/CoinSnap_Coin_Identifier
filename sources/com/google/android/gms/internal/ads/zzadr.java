package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzadr {
    private final zzek zza = new zzek(10);

    @Nullable
    public final zzbk zza(zzadc zzadcVar, @Nullable zzags zzagsVar) throws IOException {
        zzbk zzbkVar = null;
        int i2 = 0;
        while (true) {
            try {
                zzadcVar.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int zzl = this.zza.zzl();
                int i3 = zzl + 10;
                if (zzbkVar == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzadcVar.zzh(bArr, 10, zzl);
                    zzbkVar = zzagu.zza(bArr, i3, zzagsVar, new zzafw());
                } else {
                    zzadcVar.zzg(zzl);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        zzadcVar.zzj();
        zzadcVar.zzg(i2);
        return zzbkVar;
    }
}
