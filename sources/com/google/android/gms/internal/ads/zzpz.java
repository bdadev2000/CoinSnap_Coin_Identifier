package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzpz extends zzcn {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcm
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzi(zzck zzckVar) throws zzcl {
        boolean z10;
        boolean z11;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzck.zza;
        }
        if (zzckVar.zzd == 2) {
            if (zzckVar.zzc != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 < length) {
                    int i11 = iArr[i10];
                    if (i11 < zzckVar.zzc) {
                        if (i11 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 |= z11;
                        i10++;
                    } else {
                        throw new zzcl("Unhandled input format:", zzckVar);
                    }
                } else {
                    if (z10) {
                        return new zzck(zzckVar.zzb, length, 2);
                    }
                    return zzck.zza;
                }
            }
        } else {
            throw new zzcl("Unhandled input format:", zzckVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
