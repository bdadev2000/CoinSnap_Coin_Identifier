package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzrl extends zzcu {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 == 21) {
            zzj = zzj((i2 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 24), zzj);
                position += 3;
            }
        } else if (i3 == 22) {
            zzj = zzj(i2);
            while (position < limit) {
                int i4 = byteBuffer.get(position) & UnsignedBytes.MAX_VALUE;
                int i5 = (byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 8;
                zzo(i4 | i5 | ((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UnsignedBytes.MAX_VALUE) << 24), zzj);
                position += 4;
            }
        } else if (i3 == 1342177280) {
            zzj = zzj((i2 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) << 24), zzj);
                position += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            zzj = zzj(i2);
            while (position < limit) {
                int i6 = byteBuffer.get(position + 3) & UnsignedBytes.MAX_VALUE;
                int i7 = (byteBuffer.get(position + 2) & UnsignedBytes.MAX_VALUE) << 8;
                zzo(i6 | i7 | ((byteBuffer.get(position + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(position) & UnsignedBytes.MAX_VALUE) << 24), zzj);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) throws zzcs {
        int i2 = zzcrVar.zzd;
        int i3 = zzeu.zza;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736) {
            return new zzcr(zzcrVar.zzb, zzcrVar.zzc, 4);
        }
        if (i2 == 4) {
            return zzcr.zza;
        }
        throw new zzcs("Unhandled input format:", zzcrVar);
    }
}
