package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzra extends zzea {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i9 : iArr) {
                zzj.putShort(byteBuffer.getShort(i9 + i9 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdx zzi(zzdx zzdxVar) throws zzdy {
        boolean z8;
        boolean z9;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdx.zza;
        }
        if (zzdxVar.zzd == 2) {
            if (zzdxVar.zzc != iArr.length) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i9 = 0;
            while (true) {
                int length = iArr.length;
                if (i9 < length) {
                    int i10 = iArr[i9];
                    if (i10 < zzdxVar.zzc) {
                        if (i10 != i9) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z8 |= z9;
                        i9++;
                    } else {
                        throw new zzdy("Unhandled input format:", zzdxVar);
                    }
                } else {
                    if (z8) {
                        return new zzdx(zzdxVar.zzb, length, 2);
                    }
                    return zzdx.zza;
                }
            }
        } else {
            throw new zzdy("Unhandled input format:", zzdxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
