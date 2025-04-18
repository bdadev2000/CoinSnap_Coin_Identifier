package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzhaj extends zzgzj {
    private static final Logger zza = Logger.getLogger(zzhaj.class.getName());
    private static final boolean zzb = zzhef.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzhak zze;

    private zzhaj() {
        throw null;
    }

    public static int zzA(zzhcp zzhcpVar, zzhdk zzhdkVar) {
        int zzaM = ((zzgzb) zzhcpVar).zzaM(zzhdkVar);
        return zzD(zzaM) + zzaM;
    }

    public static int zzB(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhek.zze(str);
        } catch (zzhej unused) {
            length = str.getBytes(zzhbr.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zzE(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i2, zzhcp zzhcpVar, zzhdk zzhdkVar) {
        int zzD = zzD(i2 << 3);
        return ((zzgzb) zzhcpVar).zzaM(zzhdkVar) + zzD + zzD;
    }

    public static int zzz(zzhcp zzhcpVar) {
        int zzaY = zzhcpVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhej zzhejVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhejVar);
        byte[] bytes = str.getBytes(zzhbr.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhag(e);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b2) throws IOException;

    public abstract void zzM(int i2, boolean z2) throws IOException;

    public abstract void zzN(int i2, zzgzs zzgzsVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgzj
    public abstract void zza(byte[] bArr, int i2, int i3) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i2, int i3) throws IOException;

    public abstract void zzi(int i2) throws IOException;

    public abstract void zzj(int i2, long j2) throws IOException;

    public abstract void zzk(long j2) throws IOException;

    public abstract void zzl(int i2, int i3) throws IOException;

    public abstract void zzm(int i2) throws IOException;

    public abstract void zzn(int i2, zzhcp zzhcpVar, zzhdk zzhdkVar) throws IOException;

    public abstract void zzo(int i2, zzhcp zzhcpVar) throws IOException;

    public abstract void zzp(int i2, zzgzs zzgzsVar) throws IOException;

    public abstract void zzq(int i2, String str) throws IOException;

    public abstract void zzs(int i2, int i3) throws IOException;

    public abstract void zzt(int i2, int i3) throws IOException;

    public abstract void zzu(int i2) throws IOException;

    public abstract void zzv(int i2, long j2) throws IOException;

    public abstract void zzw(long j2) throws IOException;

    public /* synthetic */ zzhaj(zzhai zzhaiVar) {
    }
}
