package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzys {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyl[] zzd = new zzyl[100];

    public zzys(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public final synchronized zzyl zzb() {
        zzyl zzylVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzyl[] zzylVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzylVar = zzylVarArr[i11];
            zzylVar.getClass();
            zzylVarArr[i11] = null;
        } else {
            zzylVar = new zzyl(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
            int i12 = this.zzb;
            zzyl[] zzylVarArr2 = this.zzd;
            int length = zzylVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzyl[]) Arrays.copyOf(zzylVarArr2, length + length);
                return zzylVar;
            }
        }
        return zzylVar;
    }

    public final synchronized void zzc(zzyl zzylVar) {
        zzyl[] zzylVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzylVarArr[i10] = zzylVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@Nullable zzym zzymVar) {
        while (zzymVar != null) {
            zzyl[] zzylVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzylVarArr[i10] = zzymVar.zzc();
            this.zzb--;
            zzymVar = zzymVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzen.zza;
        int max = Math.max(0, ((i10 + 65535) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.zzb);
        int i12 = this.zzc;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.zzd, max, i12, (Object) null);
        this.zzc = max;
    }
}
