package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class zzham {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzhan zzc;

    public /* synthetic */ zzham(zzhal zzhalVar) {
    }

    public static int zzF(int i9) {
        return (i9 >>> 1) ^ (-(i9 & 1));
    }

    public static int zzG(int i9, InputStream inputStream) throws IOException {
        if ((i9 & 128) == 0) {
            return i9;
        }
        int i10 = i9 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i10 |= (read & 127) << i11;
                if ((read & 128) == 0) {
                    return i10;
                }
                i11 += 7;
            } else {
                throw zzhcd.zzj();
            }
        }
        while (i11 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i10;
                }
                i11 += 7;
            } else {
                throw zzhcd.zzj();
            }
        }
        throw zzhcd.zze();
    }

    public static long zzH(long j7) {
        return (j7 >>> 1) ^ (-(1 & j7));
    }

    public static zzham zzI(InputStream inputStream, int i9) {
        if (inputStream == null) {
            byte[] bArr = zzhcb.zzd;
            int length = bArr.length;
            return zzJ(bArr, 0, 0, false);
        }
        return new zzhai(inputStream, 4096, null);
    }

    public static zzham zzJ(byte[] bArr, int i9, int i10, boolean z8) {
        zzhae zzhaeVar = new zzhae(bArr, i9, i10, z8, null);
        try {
            zzhaeVar.zze(i10);
            return zzhaeVar;
        } catch (zzhcd e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public abstract void zzA(int i9);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i9) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i9) throws zzhcd;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzhac zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i9) throws zzhcd;
}
