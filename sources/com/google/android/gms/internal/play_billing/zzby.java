package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzby extends zzbf {
    private static final Logger zzb = Logger.getLogger(zzby.class.getName());
    private static final boolean zzc = zzfp.zzx();
    zzbz zza;

    private zzby() {
        throw null;
    }

    @Deprecated
    public static int zzt(int i9, zzec zzecVar, zzeo zzeoVar) {
        int zzw = zzw(i9 << 3);
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

    public static int zzw(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int zzx(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static zzby zzy(byte[] bArr, int i9, int i10) {
        return new zzbv(bArr, 0, i10);
    }

    public final void zzA(String str, zzft zzftVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzftVar);
        byte[] bytes = str.getBytes(zzda.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzbw(e4);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i9, boolean z8) throws IOException;

    public abstract void zze(int i9, zzbq zzbqVar) throws IOException;

    public abstract void zzf(int i9, int i10) throws IOException;

    public abstract void zzg(int i9) throws IOException;

    public abstract void zzh(int i9, long j7) throws IOException;

    public abstract void zzi(long j7) throws IOException;

    public abstract void zzj(int i9, int i10) throws IOException;

    public abstract void zzk(int i9) throws IOException;

    public abstract void zzl(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void zzm(int i9, String str) throws IOException;

    public abstract void zzo(int i9, int i10) throws IOException;

    public abstract void zzp(int i9, int i10) throws IOException;

    public abstract void zzq(int i9) throws IOException;

    public abstract void zzr(int i9, long j7) throws IOException;

    public abstract void zzs(long j7) throws IOException;

    public final void zzz() {
        if (zza() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public /* synthetic */ zzby(zzbx zzbxVar) {
    }
}
