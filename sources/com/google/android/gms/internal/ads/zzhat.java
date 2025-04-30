package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzhat extends zzgzq {
    private static final Logger zza = Logger.getLogger(zzhat.class.getName());
    private static final boolean zzb = zzhfa.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzhau zze;

    private zzhat() {
        throw null;
    }

    public static int zzA(zzhde zzhdeVar, zzhdz zzhdzVar) {
        int zzaM = ((zzgzi) zzhdeVar).zzaM(zzhdzVar);
        return zzD(zzaM) + zzaM;
    }

    public static int zzB(int i9) {
        if (i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhff.zze(str);
        } catch (zzhfe unused) {
            length = str.getBytes(zzhcb.zzb).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int zzE(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static zzhat zzF(byte[] bArr, int i9, int i10) {
        return new zzhap(bArr, 0, i10);
    }

    @Deprecated
    public static int zzy(int i9, zzhde zzhdeVar, zzhdz zzhdzVar) {
        int zzD = zzD(i9 << 3);
        return ((zzgzi) zzhdeVar).zzaM(zzhdzVar) + zzD + zzD;
    }

    public static int zzz(zzhde zzhdeVar) {
        int zzaY = zzhdeVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzG() {
        if (zzb() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzH(String str, zzhfe zzhfeVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhfeVar);
        byte[] bytes = str.getBytes(zzhcb.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzhaq(e4);
        }
    }

    public abstract void zzL() throws IOException;

    public abstract void zzM(byte b) throws IOException;

    public abstract void zzN(int i9, boolean z8) throws IOException;

    public abstract void zzO(int i9, zzhac zzhacVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgzq
    public abstract void zza(byte[] bArr, int i9, int i10) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i9, int i10) throws IOException;

    public abstract void zzi(int i9) throws IOException;

    public abstract void zzj(int i9, long j7) throws IOException;

    public abstract void zzk(long j7) throws IOException;

    public abstract void zzl(int i9, int i10) throws IOException;

    public abstract void zzm(int i9) throws IOException;

    public abstract void zzn(int i9, zzhde zzhdeVar, zzhdz zzhdzVar) throws IOException;

    public abstract void zzo(int i9, zzhde zzhdeVar) throws IOException;

    public abstract void zzp(int i9, zzhac zzhacVar) throws IOException;

    public abstract void zzq(int i9, String str) throws IOException;

    public abstract void zzs(int i9, int i10) throws IOException;

    public abstract void zzt(int i9, int i10) throws IOException;

    public abstract void zzu(int i9) throws IOException;

    public abstract void zzv(int i9, long j7) throws IOException;

    public abstract void zzw(long j7) throws IOException;

    public /* synthetic */ zzhat(zzhas zzhasVar) {
    }
}
