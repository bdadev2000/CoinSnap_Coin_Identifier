package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzrj {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, UnsignedBytes.MAX_POWER_OF_TWO, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzct.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j2, int i2, int i3, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z2 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgdx.zza(i3));
    }

    public final void zza(zzhq zzhqVar, List list) {
        int i2;
        ByteBuffer byteBuffer = zzhqVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhqVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzhqVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i3 = limit - position;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.zzd == 2) {
            i2 = bArr != null ? bArr.length + 28 : 47;
            i5 += i2 + 44;
        } else {
            i2 = 0;
        }
        if (this.zzc.capacity() < i5) {
            this.zzc = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzgdx.zza(length));
                byteBuffer3.put(bArr);
                int i6 = length + 28;
                byteBuffer3.putInt(22, zzeu.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), i6, 0));
                byteBuffer3.position(i6);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzadw.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i4, false);
        for (int i7 = 0; i7 < i4; i7++) {
            if (i3 >= 255) {
                byteBuffer3.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer3.put((byte) i3);
                i3 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i2 + 66, zzeu.zze(byteBuffer3.array(), byteBuffer3.arrayOffset() + i2 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzeu.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhqVar.zzb();
        zzhqVar.zzj(this.zzc.remaining());
        zzhqVar.zzc.put(this.zzc);
        zzhqVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzct.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
