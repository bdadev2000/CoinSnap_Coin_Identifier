package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzhac {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzhad zzc;

    private zzhac() {
    }

    public static int zzD(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static int zzE(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i3 |= (read & 127) << i4;
            if ((read & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw new zzhbt("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }

    public static zzhac zzG(InputStream inputStream, int i2) {
        if (inputStream != null) {
            return new zzgzy(inputStream, 4096, null);
        }
        byte[] bArr = zzhbr.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    public static zzhac zzH(byte[] bArr, int i2, int i3, boolean z2) {
        zzgzu zzgzuVar = new zzgzu(bArr, i2, i3, z2, null);
        try {
            zzgzuVar.zzd(i3);
            return zzgzuVar;
        } catch (zzhbt e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int i2) throws zzhbt;

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

    public abstract zzgzs zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int i2) throws zzhbt;

    public abstract void zzz(int i2);

    public /* synthetic */ zzhac(zzhab zzhabVar) {
    }
}
