package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vd.e;

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

        public zza(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                if ((i11 | 0 | (bArr.length - i11)) >= 0) {
                    this.zzb = bArr;
                    this.zzd = 0;
                    this.zzc = i11;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            throw new NullPointerException("buffer");
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
                this.zzd += i11;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] bArr, int i10, int i11) throws IOException {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int i10, int i11) throws IOException {
            zzc(i10, 0);
            zzc(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b3) throws IOException {
            int i10;
            int i11 = this.zzd;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
            try {
                this.zzb[i11] = b3;
                this.zzd = i10;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i11 = i10;
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i11), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i10, int i11) throws IOException {
            zzc(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i10) throws IOException {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i10, int i11) throws IOException {
            zzc((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, boolean z10) throws IOException {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i10, zzik zzikVar) throws IOException {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzikVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, zzik zzikVar) throws IOException {
            zzc(i10, 2);
            zza(zzikVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzikVar) throws IOException {
            zzc(zzikVar.zzb());
            zzikVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int i10, long j3) throws IOException {
            zzc(i10, 0);
            zzb(j3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, int i11) throws IOException {
            zzc(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long j3) throws IOException {
            if (zzjc.zzc && zza() >= 10) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    zzml.zza(bArr, i10, (byte) (((int) j3) | 128));
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzml.zza(bArr2, i11, (byte) j3);
                return;
            }
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zzd;
                    this.zzd = i12 + 1;
                    bArr3[i12] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            bArr4[i13] = (byte) j3;
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.zzd = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, long j3) throws IOException {
            zzc(i10, 1);
            zza(j3);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long j3) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                int i11 = i10 + 1;
                bArr[i10] = (byte) j3;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (j3 >> 8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (j3 >> 16);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (j3 >> 24);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (j3 >> 32);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (j3 >> 40);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (j3 >> 48);
                this.zzd = i17 + 1;
                bArr[i17] = (byte) (j3 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] bArr, int i10, int i11) throws IOException {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, zzlc zzlcVar, zzlu zzluVar) throws IOException {
            zzc(i10, 2);
            zzc(((zzib) zzlcVar).zza(zzluVar));
            zzluVar.zza((zzlu) zzlcVar, (zznb) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlcVar) throws IOException {
            zzc(zzlcVar.zzcb());
            zzlcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, zzlc zzlcVar) throws IOException {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzlcVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int i10, String str) throws IOException {
            zzc(i10, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String str) throws IOException {
            int i10 = this.zzd;
            try {
                int zzj = zzjc.zzj(str.length() * 3);
                int zzj2 = zzjc.zzj(str.length());
                if (zzj2 == zzj) {
                    int i11 = i10 + zzj2;
                    this.zzd = i11;
                    int zza = zzmp.zza(str, this.zzb, i11, zza());
                    this.zzd = i10;
                    zzc((zza - i10) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmp.zza(str));
                this.zzd = zzmp.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmt e2) {
                this.zzd = i10;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzc(long j3) {
        return 8;
    }

    public static int zzd(int i10) {
        return zzg(i10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    private static long zzi(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static int zzj(int i10, int i11) {
        return zzj(i11) + zzj(i10 << 3);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b3) throws IOException;

    public abstract void zza(int i10) throws IOException;

    public abstract void zza(int i10, int i11) throws IOException;

    public abstract void zza(int i10, long j3) throws IOException;

    public abstract void zza(int i10, zzik zzikVar) throws IOException;

    public abstract void zza(int i10, zzlc zzlcVar) throws IOException;

    public abstract void zza(int i10, zzlc zzlcVar, zzlu zzluVar) throws IOException;

    public abstract void zza(int i10, String str) throws IOException;

    public abstract void zza(int i10, boolean z10) throws IOException;

    public abstract void zza(long j3) throws IOException;

    public abstract void zza(zzik zzikVar) throws IOException;

    public abstract void zza(zzlc zzlcVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i10) throws IOException;

    public abstract void zzb(int i10, int i11) throws IOException;

    public abstract void zzb(int i10, long j3) throws IOException;

    public abstract void zzb(int i10, zzik zzikVar) throws IOException;

    public abstract void zzb(long j3) throws IOException;

    public abstract void zzb(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzc(int i10) throws IOException;

    public abstract void zzc(int i10, int i11) throws IOException;

    public abstract void zzd(int i10, int i11) throws IOException;

    public final void zzk(int i10, int i11) throws IOException {
        zzd(i10, zzl(i11));
    }

    private zzjc() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzb(zzik zzikVar) {
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i10, long j3) {
        return zzg(j3) + zzj(i10 << 3);
    }

    public static int zze(long j3) {
        return 8;
    }

    public static int zzf(int i10) {
        return zzg(i10);
    }

    public static int zzg(int i10, int i11) {
        return zzg(i11) + zzj(i10 << 3);
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public static int zzi(int i10, int i11) {
        return zzj(zzl(i11)) + zzj(i10 << 3);
    }

    public final void zzk(int i10) throws IOException {
        zzc(zzl(i10));
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zzc(int i10, zzik zzikVar) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzikVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zze(int i10, int i11) {
        return zzg(i11) + zzj(i10 << 3);
    }

    public static int zzf(int i10, long j3) {
        return zzg(zzi(j3)) + zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzh(int i10, long j3) throws IOException {
        zzb(i10, zzi(j3));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i10, zzlc zzlcVar, zzlu zzluVar) {
        return ((zzib) zzlcVar).zza(zzluVar) + (zzj(i10 << 3) << 1);
    }

    public static int zzd(long j3) {
        return zzg(j3);
    }

    public static int zzg(int i10, long j3) {
        return zzg(j3) + zzj(i10 << 3);
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public final void zzh(long j3) throws IOException {
        zzb(zzi(j3));
    }

    public static int zzd(int i10, zzik zzikVar) {
        return zzc(3, zzikVar) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zze(int i10, long j3) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzf(long j3) {
        return zzg(zzi(j3));
    }

    /* loaded from: classes3.dex */
    public static class zzb extends IOException {
        public zzb(String str, Throwable th2) {
            super(e.e("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }

        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzlc zzlcVar) {
        return zzlcVar.zzcb();
    }

    public static int zzc(int i10, long j3) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzg(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzb(int i10, zzkk zzkkVar) {
        int zzj = zzj(i10 << 3);
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzc(int i10, zzlc zzlcVar, zzlu zzluVar) {
        return zza(zzlcVar, zzluVar) + zzj(i10 << 3);
    }

    public static int zza(int i10, zzkk zzkkVar) {
        return zzb(3, zzkkVar) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zzc(zzlc zzlcVar) {
        int zzcb = zzlcVar.zzcb();
        return zzj(zzcb) + zzcb;
    }

    public static int zzb(int i10, zzlc zzlcVar) {
        return zzc(zzlcVar) + zzj(24) + zzj(2, i10) + (zzj(8) << 1);
    }

    public static int zza(zzkk zzkkVar) {
        int zza2 = zzkkVar.zza();
        return zzj(zza2) + zza2;
    }

    public static int zza(zzlc zzlcVar, zzlu zzluVar) {
        int zza2 = ((zzib) zzlcVar).zza(zzluVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i10, String str) {
        return zzb(str) + zzj(i10 << 3);
    }

    public final void zza(String str, zzmt zzmtVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmtVar);
        byte[] bytes = str.getBytes(zzjv.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
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

    public final void zzb(boolean z10) throws IOException {
        zza(z10 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i10, double d10) throws IOException {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) throws IOException {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) throws IOException {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) throws IOException {
        zza(Float.floatToRawIntBits(f10));
    }
}
