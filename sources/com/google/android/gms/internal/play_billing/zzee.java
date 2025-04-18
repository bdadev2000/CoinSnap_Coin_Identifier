package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzee extends zzdm {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzee.class.getName());
    private static final boolean zzd = zzhn.zzx();
    zzef zza;

    private zzee() {
    }

    @Deprecated
    public static int zzt(int i2, zzgc zzgcVar, zzgm zzgmVar) {
        int zza = ((zzdg) zzgcVar).zza(zzgmVar);
        int zzx = zzx(i2 << 3);
        return zzx + zzx + zza;
    }

    public static int zzu(int i2) {
        if (i2 >= 0) {
            return zzx(i2);
        }
        return 10;
    }

    public static int zzv(zzgc zzgcVar, zzgm zzgmVar) {
        int zza = ((zzdg) zzgcVar).zza(zzgmVar);
        return zzx(zza) + zza;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zzhs.zzc(str);
        } catch (zzhr unused) {
            length = str.getBytes(zzfd.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            j2 >>>= 14;
            i2 += 2;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static zzee zzz(byte[] bArr, int i2, int i3) {
        return new zzeb(bArr, 0, i3);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zzhr zzhrVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhrVar);
        byte[] bytes = str.getBytes(zzfd.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzec(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2) throws IOException;

    public abstract void zzd(int i2, boolean z2) throws IOException;

    public abstract void zze(int i2, zzdw zzdwVar) throws IOException;

    public abstract void zzf(int i2, int i3) throws IOException;

    public abstract void zzg(int i2) throws IOException;

    public abstract void zzh(int i2, long j2) throws IOException;

    public abstract void zzi(long j2) throws IOException;

    public abstract void zzj(int i2, int i3) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzl(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzm(int i2, String str) throws IOException;

    public abstract void zzo(int i2, int i3) throws IOException;

    public abstract void zzp(int i2, int i3) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2, long j2) throws IOException;

    public abstract void zzs(long j2) throws IOException;

    public /* synthetic */ zzee(zzed zzedVar) {
    }
}
