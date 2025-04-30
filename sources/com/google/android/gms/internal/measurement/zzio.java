package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzio {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzis zzc;

    public static long zza(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static int zze(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public abstract double zza() throws IOException;

    public abstract int zza(int i9) throws zzjs;

    public abstract float zzb() throws IOException;

    public abstract void zzb(int i9) throws zzjs;

    public abstract int zzc();

    public abstract void zzc(int i9);

    public abstract int zzd() throws IOException;

    public abstract boolean zzd(int i9) throws IOException;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzia zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    private zzio() {
        this.zzb = zzd;
    }

    public static zzio zza(byte[] bArr, int i9, int i10, boolean z8) {
        zzin zzinVar = new zzin(bArr, i10);
        try {
            zzinVar.zza(i10);
            return zzinVar;
        } catch (zzjs e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
