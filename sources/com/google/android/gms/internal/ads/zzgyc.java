package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzgyc extends zzgxg {
    private static final Logger zza = Logger.getLogger(zzgyc.class.getName());
    private static final boolean zzb = zzhbu.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgyd zze;

    private zzgyc() {
        throw null;
    }

    public /* synthetic */ zzgyc(zzgyb zzgybVar) {
    }

    public static int zzA(zzhai zzhaiVar, zzhbb zzhbbVar) {
        int zzaM = ((zzgwy) zzhaiVar).zzaM(zzhbbVar);
        return zzD(zzaM) + zzaM;
    }

    public static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhbz.zze(str);
        } catch (zzhby unused) {
            length = str.getBytes(zzgzk.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzE(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i10, zzhai zzhaiVar, zzhbb zzhbbVar) {
        int zzD = zzD(i10 << 3);
        return ((zzgwy) zzhaiVar).zzaM(zzhbbVar) + zzD + zzD;
    }

    public static int zzz(zzhai zzhaiVar) {
        int zzaY = zzhaiVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzF() {
        if (zzb() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhby zzhbyVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbyVar);
        byte[] bytes = str.getBytes(zzgzk.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxz(e2);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b3) throws IOException;

    public abstract void zzM(int i10, boolean z10) throws IOException;

    public abstract void zzN(int i10, zzgxp zzgxpVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgxg
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j3) throws IOException;

    public abstract void zzk(long j3) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    public abstract void zzn(int i10, zzhai zzhaiVar, zzhbb zzhbbVar) throws IOException;

    public abstract void zzo(int i10, zzhai zzhaiVar) throws IOException;

    public abstract void zzp(int i10, zzgxp zzgxpVar) throws IOException;

    public abstract void zzq(int i10, String str) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10, int i11) throws IOException;

    public abstract void zzu(int i10) throws IOException;

    public abstract void zzv(int i10, long j3) throws IOException;

    public abstract void zzw(long j3) throws IOException;
}
