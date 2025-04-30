package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzsg {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzdz.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j7, int i9, int i10, boolean z8) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        if (true != z8) {
            b = 0;
        } else {
            b = 2;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i9);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgec.zza(i10));
    }

    public final void zza(zzin zzinVar, List list) {
        int i9;
        ByteBuffer byteBuffer = zzinVar.zzc;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzinVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer2 = zzinVar.zzc;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i10 = limit - position;
        int i11 = (i10 + 255) / 255;
        int i12 = i11 + 27 + i10;
        if (this.zzd == 2) {
            if (bArr != null) {
                i9 = bArr.length + 28;
            } else {
                i9 = 47;
            }
            i12 += i9 + 44;
        } else {
            i9 = 0;
        }
        if (this.zzc.capacity() < i12) {
            this.zzc = ByteBuffer.allocate(i12).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer3 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                zzc(byteBuffer3, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer3.put(zzgec.zza(length));
                byteBuffer3.put(bArr);
                int i13 = length + 28;
                byteBuffer3.putInt(22, zzgd.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), i13, 0));
                byteBuffer3.position(i13);
            } else {
                byteBuffer3.put(zza);
            }
            byteBuffer3.put(zzb);
        }
        int zzc = this.zze + zzaep.zzc(byteBuffer2);
        this.zze = zzc;
        zzc(byteBuffer3, zzc, this.zzd, i11, false);
        for (int i14 = 0; i14 < i11; i14++) {
            if (i10 >= 255) {
                byteBuffer3.put((byte) -1);
                i10 -= 255;
            } else {
                byteBuffer3.put((byte) i10);
                i10 = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.zzd == 2) {
            byteBuffer3.putInt(i9 + 66, zzgd.zze(byteBuffer3.array(), byteBuffer3.arrayOffset() + i9 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, zzgd.zze(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer3;
        zzinVar.zzb();
        zzinVar.zzi(this.zzc.remaining());
        zzinVar.zzc.put(this.zzc);
        zzinVar.zzj();
    }

    public final void zzb() {
        this.zzc = zzdz.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
