package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzby extends zzbf {
    private static final Logger zzb = Logger.getLogger(zzby.class.getName());
    private static final boolean zzc = zzfp.zzx();
    zzbz zza;

    private zzby() {
        throw null;
    }

    public /* synthetic */ zzby(zzbx zzbxVar) {
    }

    @Deprecated
    public static int zzt(int i10, zzec zzecVar, zzeo zzeoVar) {
        int zzw = zzw(i10 << 3);
        return ((zzay) zzecVar).zza(zzeoVar) + zzw + zzw;
    }

    public static int zzu(zzec zzecVar, zzeo zzeoVar) {
        int zza = ((zzay) zzecVar).zza(zzeoVar);
        return zzw(zza) + zza;
    }

    public static int zzv(String str) {
        int length;
        try {
            length = zzfu.zzc(str);
        } catch (zzft unused) {
            length = str.getBytes(zzda.zzb).length;
        }
        return zzw(length) + length;
    }

    public static int zzw(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzx(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static zzby zzy(byte[] bArr, int i10, int i11) {
        return new zzbv(bArr, 0, i11);
    }

    public final void zzA(String str, zzft zzftVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzftVar);
        byte[] bytes = str.getBytes(zzda.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbw(e2);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b3) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzbq zzbqVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j3) throws IOException;

    public abstract void zzi(long j3) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, String str) throws IOException;

    public abstract void zzo(int i10, int i11) throws IOException;

    public abstract void zzp(int i10, int i11) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10, long j3) throws IOException;

    public abstract void zzs(long j3) throws IOException;

    public final void zzz() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
