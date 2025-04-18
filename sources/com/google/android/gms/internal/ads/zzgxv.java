package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class zzgxv {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgxw zzc;

    private zzgxv() {
    }

    public static int zzD(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static int zzE(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & 127) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new zzgzm("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j3) {
        return (j3 >>> 1) ^ (-(1 & j3));
    }

    public static zzgxv zzG(InputStream inputStream, int i10) {
        if (inputStream == null) {
            byte[] bArr = zzgzk.zzb;
            int length = bArr.length;
            return zzH(bArr, 0, 0, false);
        }
        return new zzgxs(inputStream, 4096, null);
    }

    public static zzgxv zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzgxq zzgxqVar = new zzgxq(bArr, i10, i11, z10, null);
        try {
            zzgxqVar.zzd(i11);
            return zzgxqVar;
        } catch (zzgzm e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int i10) throws zzgzm;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract zzgxp zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int i10) throws zzgzm;

    public abstract void zzz(int i10);

    public /* synthetic */ zzgxv(zzgxu zzgxuVar) {
    }
}
