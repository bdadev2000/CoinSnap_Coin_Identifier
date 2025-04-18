package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqd extends zzcu {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i2 : iArr) {
                zzj.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) throws zzcs {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcr.zza;
        }
        if (zzcrVar.zzd != 2) {
            throw new zzcs("Unhandled input format:", zzcrVar);
        }
        boolean z2 = zzcrVar.zzc != iArr.length;
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                return z2 ? new zzcr(zzcrVar.zzb, length, 2) : zzcr.zza;
            }
            int i3 = iArr[i2];
            if (i3 >= zzcrVar.zzc) {
                throw new zzcs("Unhandled input format:", zzcrVar);
            }
            z2 |= i3 != i2;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
