package com.google.android.gms.internal.measurement;

import androidx.compose.ui.platform.j;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzjc extends zzil {
    private static final Logger zzb = Logger.getLogger(zzjc.class.getName());
    private static final boolean zzc = zzml.zzc();
    zzjf zza;

    /* loaded from: classes3.dex */
    public static class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i3) | i3) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i3;
        }

        private final void zzc(byte[] bArr, int i2, int i3) throws IOException {
            try {
                System.arraycopy(bArr, i2, this.zzb, this.zzd, i3);
                this.zzd += i3;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i3)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i2, int i3) throws IOException {
            zzc(i3);
            zzc(bArr, 0, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i2, int i3) throws IOException {
            zzc(i2, 0);
            zzc(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b2) throws IOException {
            int i2;
            int i3 = this.zzd;
            try {
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException e) {
                e = e;
            }
            try {
                this.zzb[i3] = b2;
                this.zzd = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i3 = i2;
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i3), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, int i3) throws IOException {
            zzc(i2, 0);
            zzb(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i2, int i3) throws IOException {
            zzc((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, boolean z2) throws IOException {
            zzc(i2, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2) throws IOException {
            if (i2 >= 0) {
                zzc(i2);
            } else {
                zzb(i2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i2) throws IOException {
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    bArr[i3] = (byte) (i2 | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr2[i4] = (byte) i2;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, zzik zzikVar) throws IOException {
            zzc(i2, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, zzik zzikVar) throws IOException {
            zzc(1, 3);
            zzd(2, i2);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) throws IOException {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, int i3) throws IOException {
            zzc(i2, 5);
            zza(i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i2, long j2) throws IOException {
            zzc(i2, 0);
            zzb(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                bArr[i3] = (byte) i2;
                bArr[i3 + 1] = (byte) (i2 >> 8);
                bArr[i3 + 2] = (byte) (i2 >> 16);
                this.zzd = i3 + 4;
                bArr[i3 + 3] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j2) throws IOException {
            if (zzjc.zzc && zza() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    zzml.zza(bArr, i2, (byte) (((int) j2) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                zzml.zza(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    bArr3[i4] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, long j2) throws IOException {
            zzc(i2, 1);
            zza(j2);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j2) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                bArr[i2] = (byte) j2;
                bArr[i2 + 1] = (byte) (j2 >> 8);
                bArr[i2 + 2] = (byte) (j2 >> 16);
                bArr[i2 + 3] = (byte) (j2 >> 24);
                bArr[i2 + 4] = (byte) (j2 >> 32);
                bArr[i2 + 5] = (byte) (j2 >> 40);
                bArr[i2 + 6] = (byte) (j2 >> 48);
                this.zzd = i2 + 8;
                bArr[i2 + 7] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i2, int i3) throws IOException {
            zzc(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, zzlc zzlcVar, zzlu zzluVar) throws IOException {
            zzc(i2, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza((zzlu) zzlcVar, (zznb) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) throws IOException {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, zzlc zzlcVar) throws IOException {
            zzc(1, 3);
            zzd(2, i2);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i2, String str) throws IOException {
            zzc(i2, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws IOException {
            int i2 = this.zzd;
            try {
                int zzj = zzjc.zzj(str.length() * 3);
                int zzj2 = zzjc.zzj(str.length());
                if (zzj2 == zzj) {
                    int i3 = i2 + zzj2;
                    this.zzd = i3;
                    int zza = zzmp.zza(str, this.zzb, i3, zza());
                    this.zzd = i2;
                    zzc((zza - i2) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmt e) {
                this.zzd = i2;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i2, boolean z2) {
        return zzj(i2 << 3) + 1;
    }

    public static int zzc(long j2) {
        return 8;
    }

    public static int zzd(int i2) {
        return zzg(i2);
    }

    public static int zze(int i2) {
        return 4;
    }

    public static int zzf(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzg(int i2) {
        return 4;
    }

    public static int zzh(int i2, int i3) {
        return zzj(i2 << 3) + 4;
    }

    private static long zzi(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int zzj(int i2, int i3) {
        return zzj(i3) + zzj(i2 << 3);
    }

    private static int zzl(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b2) throws IOException;

    public abstract void zza(int i2) throws IOException;

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zza(int i2, long j2) throws IOException;

    public abstract void zza(int i2, zzik zzikVar) throws IOException;

    public abstract void zza(int i2, zzlc zzlcVar) throws IOException;

    public abstract void zza(int i2, zzlc zzlcVar, zzlu zzluVar) throws IOException;

    public abstract void zza(int i2, String str) throws IOException;

    public abstract void zza(int i2, boolean z2) throws IOException;

    public abstract void zza(long j2) throws IOException;

    public abstract void zza(zzik zzikVar) throws IOException;

    public abstract void zza(zzlc zzlcVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i2) throws IOException;

    public abstract void zzb(int i2, int i3) throws IOException;

    public abstract void zzb(int i2, long j2) throws IOException;

    public abstract void zzb(int i2, zzik zzikVar) throws IOException;

    public abstract void zzb(long j2) throws IOException;

    public abstract void zzb(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzc(int i2) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzd(int i2, int i3) throws IOException;

    public final void zzk(int i2, int i3) throws IOException {
        zzd(i2, zzl(i3));
    }

    private zzjc() {
    }

    public static int zza(float f2) {
        return 4;
    }

    public static int zzb(zzik zzikVar) {
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i2, long j2) {
        return zzg(j2) + zzj(i2 << 3);
    }

    public static int zze(long j2) {
        return 8;
    }

    public static int zzf(int i2) {
        return zzg(i2);
    }

    public static int zzg(int i2, int i3) {
        return zzg(i3) + zzj(i2 << 3);
    }

    public static int zzh(int i2) {
        return zzj(zzl(i2));
    }

    public static int zzi(int i2, int i3) {
        return zzj(zzl(i3)) + zzj(i2 << 3);
    }

    public final void zzk(int i2) throws IOException {
        zzc(zzl(i2));
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i2, zzik zzikVar) {
        int zzj = zzj(i2 << 3);
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zze(int i2, int i3) {
        return zzg(i3) + zzj(i2 << 3);
    }

    public static int zzf(int i2, long j2) {
        return zzg(zzi(j2)) + zzj(i2 << 3);
    }

    public static int zzj(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public final void zzh(int i2, long j2) throws IOException {
        zzb(i2, zzi(j2));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i2, zzlc zzlcVar, zzlu zzluVar) {
        return ((zzib) zzlcVar).zza(zzluVar) + (zzj(i2 << 3) << 1);
    }

    public static int zzd(long j2) {
        return zzg(j2);
    }

    public static int zzg(int i2, long j2) {
        return zzg(j2) + zzj(i2 << 3);
    }

    public static int zzi(int i2) {
        return zzj(i2 << 3);
    }

    public final void zzh(long j2) throws IOException {
        zzb(zzi(j2));
    }

    public static int zzd(int i2, zzik zzikVar) {
        return zzc(3, zzikVar) + zzj(2, i2) + (zzj(8) << 1);
    }

    public static int zze(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zzf(long j2) {
        return zzg(zzi(j2));
    }

    /* loaded from: classes3.dex */
    public static class zzb extends IOException {
        public zzb(String str, Throwable th) {
            super(j.b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static int zza(int i2, double d) {
        return zzj(i2 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    public static int zzc(int i2, long j2) {
        return zzj(i2 << 3) + 8;
    }

    public static int zzg(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int zza(int i2, float f2) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzb(int i2, zzkk zzkkVar) {
        int zzj = zzj(i2 << 3);
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzc(int i2, zzlc zzlcVar, zzlu zzluVar) {
        return zza(zzlcVar, zzluVar) + zzj(i2 << 3);
    }

    public static int zza(int i2, zzkk zzkkVar) {
        return zzb(3, zzkkVar) + zzj(2, i2) + (zzj(8) << 1);
    }

    public static int zzc(zzlc zzlcVar) {
        int zzcb = zzlcVar.zzcb();
        return zzj(zzcb) + zzcb;
    }

    public static int zzb(int i2, zzlc zzlcVar) {
        return zzc(zzlcVar) + zzj(24) + zzj(2, i2) + (zzj(8) << 1);
    }

    public static int zza(zzkk zzkkVar) {
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2;
    }

    public static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int zza2 = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i2, String str) {
        return zzb(str) + zzj(i2 << 3);
    }

    public final void zza(String str, zzmt zzmtVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.zza(str);
        } catch (zzmt unused) {
            length = str.getBytes(zzjv.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzjc zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z2) throws IOException {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i2, double d) throws IOException {
        zza(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) throws IOException {
        zza(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i2, float f2) throws IOException {
        zza(i2, Float.floatToRawIntBits(f2));
    }

    public final void zzb(float f2) throws IOException {
        zza(Float.floatToRawIntBits(f2));
    }
}
