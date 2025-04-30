package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzsi extends zzea {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i9, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i9 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.zzb.zzd;
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 1342177280) {
                    if (i10 == 1610612736) {
                        zzj = zzj(i9);
                        while (position < limit) {
                            int i11 = byteBuffer.get(position + 3) & 255;
                            int i12 = (byteBuffer.get(position + 2) & 255) << 8;
                            zzo(i11 | i12 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    zzj = zzj((i9 / 3) * 4);
                    while (position < limit) {
                        zzo(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzj);
                        position += 3;
                    }
                }
            } else {
                zzj = zzj(i9);
                while (position < limit) {
                    int i13 = byteBuffer.get(position) & 255;
                    int i14 = (byteBuffer.get(position + 1) & 255) << 8;
                    zzo(i13 | i14 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzj);
                    position += 4;
                }
            }
        } else {
            zzj = zzj((i9 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzj);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdx zzi(zzdx zzdxVar) throws zzdy {
        int i9 = zzdxVar.zzd;
        int i10 = zzgd.zza;
        if (i9 != 21 && i9 != 1342177280 && i9 != 22 && i9 != 1610612736) {
            if (i9 == 4) {
                return zzdx.zza;
            }
            throw new zzdy("Unhandled input format:", zzdxVar);
        }
        return new zzdx(zzdxVar.zzb, zzdxVar.zzc, 4);
    }
}
