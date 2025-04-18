package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class zzrd {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcm.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j3, int i10, int i11, boolean z10) {
        byte b3;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (true != z10) {
            b3 = 0;
        } else {
            b3 = 2;
        }
        byteBuffer.put(b3);
        byteBuffer.putLong(j3);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgcu.zza(i11));
    }

    public final void zza(zzhm zzhmVar, List list) {
        int i10;
        ByteBuffer byteBuffer = zzhmVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhmVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzhmVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i11 = limit - position;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.zzd == 2) {
            if (bArr != null) {
                i10 = bArr.length + 28;
            } else {
                i10 = 47;
            }
            i13 += i10 + 44;
        } else {
            i10 = 0;
        }
        if (this.zzc.capacity() < i13) {
            this.zzc = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzgcu.zza(length));
                byteBuffer3.put(bArr);
                int i14 = length + 28;
                byteBuffer3.putInt(22, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), i14, 0));
                byteBuffer3.position(i14);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzadm.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i12, false);
        for (int i15 = 0; i15 < i12; i15++) {
            if (i11 >= 255) {
                byteBuffer3.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer3.put((byte) i11);
                i11 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i10 + 66, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset() + i10 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzen.zzf(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzhmVar.zzb();
        zzhmVar.zzj(this.zzc.remaining());
        zzhmVar.zzc.put(this.zzc);
        zzhmVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzcm.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
