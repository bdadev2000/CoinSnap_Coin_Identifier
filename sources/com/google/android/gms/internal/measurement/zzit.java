package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzit extends zzhx {
    private static final Logger zzb = Logger.getLogger(zzit.class.getName());
    private static final boolean zzc = zzmg.zzc();
    zziw zza;

    /* loaded from: classes2.dex */
    public static class zza extends zzit {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i9, int i10) {
            super();
            if (bArr != null) {
                if (((bArr.length - i10) | i10) >= 0) {
                    this.zzb = bArr;
                    this.zzd = 0;
                    this.zzc = i10;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
            }
            throw new NullPointerException("buffer");
        }

        private final void zzc(byte[] bArr, int i9, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i9, this.zzb, this.zzd, i10);
                this.zzd += i10;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(byte[] bArr, int i9, int i10) throws IOException {
            zzc(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzd(int i9, int i10) throws IOException {
            zzc(i9, 0);
            zzc(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i9 = this.zzd;
                this.zzd = i9 + 1;
                bArr[i9] = b;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i9, int i10) throws IOException {
            zzc(i9, 0);
            zzb(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, boolean z8) throws IOException {
            zzc(i9, 0);
            zza(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i9) throws IOException {
            if (i9 >= 0) {
                zzc(i9);
            } else {
                zzb(i9);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzc(int i9, int i10) throws IOException {
            zzc((i9 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzc(int i9) throws IOException {
            while ((i9 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) (i9 | 128);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) i9;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, zzia zziaVar) throws IOException {
            zzc(i9, 2);
            zza(zziaVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i9, zzia zziaVar) throws IOException {
            zzc(1, 3);
            zzd(2, i9);
            zza(3, zziaVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(zzia zziaVar) throws IOException {
            zzc(zziaVar.zzb());
            zziaVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, int i10) throws IOException {
            zzc(i9, 5);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(int i9, long j7) throws IOException {
            zzc(i9, 0);
            zzb(j7);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                int i11 = i10 + 1;
                this.zzd = i11;
                bArr[i10] = (byte) i9;
                int i12 = i10 + 2;
                this.zzd = i12;
                bArr[i11] = (byte) (i9 >> 8);
                int i13 = i10 + 3;
                this.zzd = i13;
                bArr[i12] = (byte) (i9 >> 16);
                this.zzd = i10 + 4;
                bArr[i13] = (byte) (i9 >>> 24);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zzb(long j7) throws IOException {
            if (zzit.zzc && zza() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i9 = this.zzd;
                    this.zzd = i9 + 1;
                    zzmg.zza(bArr, i9, (byte) (((int) j7) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzmg.zza(bArr2, i10, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr3[i11] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr4 = this.zzb;
            int i12 = this.zzd;
            this.zzd = i12 + 1;
            bArr4[i12] = (byte) j7;
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, long j7) throws IOException {
            zzc(i9, 1);
            zza(j7);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(long j7) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i9 = this.zzd;
                int i10 = i9 + 1;
                this.zzd = i10;
                bArr[i9] = (byte) j7;
                int i11 = i9 + 2;
                this.zzd = i11;
                bArr[i10] = (byte) (j7 >> 8);
                int i12 = i9 + 3;
                this.zzd = i12;
                bArr[i11] = (byte) (j7 >> 16);
                int i13 = i9 + 4;
                this.zzd = i13;
                bArr[i12] = (byte) (j7 >> 24);
                int i14 = i9 + 5;
                this.zzd = i14;
                bArr[i13] = (byte) (j7 >> 32);
                int i15 = i9 + 6;
                this.zzd = i15;
                bArr[i14] = (byte) (j7 >> 40);
                int i16 = i9 + 7;
                this.zzd = i16;
                bArr[i15] = (byte) (j7 >> 48);
                this.zzd = i9 + 8;
                bArr[i16] = (byte) (j7 >> 56);
            } catch (IndexOutOfBoundsException e4) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhx
        public final void zza(byte[] bArr, int i9, int i10) throws IOException {
            zzc(bArr, i9, i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, zzkt zzktVar, zzll zzllVar) throws IOException {
            zzc(i9, 2);
            zzc(((zzhq) zzktVar).zza(zzllVar));
            zzllVar.zza((zzll) zzktVar, (zzna) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(zzkt zzktVar) throws IOException {
            zzc(zzktVar.zzca());
            zzktVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, zzkt zzktVar) throws IOException {
            zzc(1, 3);
            zzd(2, i9);
            zzc(3, 2);
            zza(zzktVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(int i9, String str) throws IOException {
            zzc(i9, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzit
        public final void zza(String str) throws IOException {
            int i9 = this.zzd;
            try {
                int zzj = zzit.zzj(str.length() * 3);
                int zzj2 = zzit.zzj(str.length());
                if (zzj2 == zzj) {
                    int i10 = i9 + zzj2;
                    this.zzd = i10;
                    int zza = zzmk.zza(str, this.zzb, i10, zza());
                    this.zzd = i9;
                    zzc((zza - i9) - zzj2);
                    this.zzd = zza;
                    return;
                }
                zzc(zzmk.zza(str));
                this.zzd = zzmk.zza(str, this.zzb, this.zzd, zza());
            } catch (zzmo e4) {
                this.zzd = i9;
                zza(str, e4);
            } catch (IndexOutOfBoundsException e9) {
                throw new zzb(e9);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzb(String str, Throwable th) {
            super(AbstractC2914a.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static int zza(double d2) {
        return 8;
    }

    public static int zzb(int i9, boolean z8) {
        return zzj(i9 << 3) + 1;
    }

    public static int zzc(long j7) {
        return 8;
    }

    public static int zzd(int i9) {
        return zzg(i9);
    }

    public static int zze(int i9) {
        return 4;
    }

    public static int zzf(int i9, int i10) {
        return zzj(i9 << 3) + 4;
    }

    public static int zzg(int i9) {
        return 4;
    }

    public static int zzh(int i9, int i10) {
        return zzj(i9 << 3) + 4;
    }

    private static long zzi(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static int zzj(int i9, int i10) {
        return zzj(i10) + zzj(i9 << 3);
    }

    private static int zzl(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i9) throws IOException;

    public abstract void zza(int i9, int i10) throws IOException;

    public abstract void zza(int i9, long j7) throws IOException;

    public abstract void zza(int i9, zzia zziaVar) throws IOException;

    public abstract void zza(int i9, zzkt zzktVar) throws IOException;

    public abstract void zza(int i9, zzkt zzktVar, zzll zzllVar) throws IOException;

    public abstract void zza(int i9, String str) throws IOException;

    public abstract void zza(int i9, boolean z8) throws IOException;

    public abstract void zza(long j7) throws IOException;

    public abstract void zza(zzia zziaVar) throws IOException;

    public abstract void zza(zzkt zzktVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i9) throws IOException;

    public abstract void zzb(int i9, int i10) throws IOException;

    public abstract void zzb(int i9, long j7) throws IOException;

    public abstract void zzb(int i9, zzia zziaVar) throws IOException;

    public abstract void zzb(long j7) throws IOException;

    public abstract void zzb(byte[] bArr, int i9, int i10) throws IOException;

    public abstract void zzc(int i9) throws IOException;

    public abstract void zzc(int i9, int i10) throws IOException;

    public abstract void zzd(int i9, int i10) throws IOException;

    public final void zzk(int i9, int i10) throws IOException {
        zzd(i9, zzl(i10));
    }

    private zzit() {
    }

    public static int zza(float f9) {
        return 4;
    }

    public static int zzb(zzia zziaVar) {
        int zzb2 = zziaVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzd(int i9, long j7) {
        return zzg(j7) + zzj(i9 << 3);
    }

    public static int zze(long j7) {
        return 8;
    }

    public static int zzf(int i9) {
        return zzg(i9);
    }

    public static int zzg(int i9, int i10) {
        return zzg(i10) + zzj(i9 << 3);
    }

    public static int zzh(int i9) {
        return zzj(zzl(i9));
    }

    public static int zzi(int i9, int i10) {
        return zzj(zzl(i10)) + zzj(i9 << 3);
    }

    public final void zzk(int i9) throws IOException {
        zzc(zzl(i9));
    }

    public static int zza(boolean z8) {
        return 1;
    }

    public static int zzc(int i9, zzia zziaVar) {
        int zzj = zzj(i9 << 3);
        int zzb2 = zziaVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zze(int i9, int i10) {
        return zzg(i10) + zzj(i9 << 3);
    }

    public static int zzf(int i9, long j7) {
        return zzg(zzi(j7)) + zzj(i9 << 3);
    }

    public static int zzj(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public final void zzh(int i9, long j7) throws IOException {
        zzb(i9, zzi(j7));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i9, zzkt zzktVar, zzll zzllVar) {
        return ((zzhq) zzktVar).zza(zzllVar) + (zzj(i9 << 3) << 1);
    }

    public static int zzd(long j7) {
        return zzg(j7);
    }

    public static int zzg(int i9, long j7) {
        return zzg(j7) + zzj(i9 << 3);
    }

    public static int zzi(int i9) {
        return zzj(i9 << 3);
    }

    public final void zzh(long j7) throws IOException {
        zzb(zzi(j7));
    }

    public static int zzd(int i9, zzia zziaVar) {
        return zzc(3, zziaVar) + zzj(2, i9) + (zzj(8) << 1);
    }

    public static int zze(int i9, long j7) {
        return zzj(i9 << 3) + 8;
    }

    public static int zzf(long j7) {
        return zzg(zzi(j7));
    }

    public static int zza(int i9, double d2) {
        return zzj(i9 << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzkt zzktVar) {
        return zzktVar.zzca();
    }

    public static int zzc(int i9, long j7) {
        return zzj(i9 << 3) + 8;
    }

    public static int zzg(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int zza(int i9, float f9) {
        return zzj(i9 << 3) + 4;
    }

    public static int zzb(int i9, zzkb zzkbVar) {
        int zzj = zzj(i9 << 3);
        int zza2 = zzkbVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzc(int i9, zzkt zzktVar, zzll zzllVar) {
        return zza(zzktVar, zzllVar) + zzj(i9 << 3);
    }

    public static int zza(int i9, zzkb zzkbVar) {
        return zzb(3, zzkbVar) + zzj(2, i9) + (zzj(8) << 1);
    }

    public static int zzc(zzkt zzktVar) {
        int zzca = zzktVar.zzca();
        return zzj(zzca) + zzca;
    }

    public static int zzb(int i9, zzkt zzktVar) {
        return zzc(zzktVar) + zzj(24) + zzj(2, i9) + (zzj(8) << 1);
    }

    public static int zza(zzkb zzkbVar) {
        int zza2 = zzkbVar.zza();
        return zzj(zza2) + zza2;
    }

    public static int zza(zzkt zzktVar, zzll zzllVar) {
        int zza2 = ((zzhq) zzktVar).zza(zzllVar);
        return zzj(zza2) + zza2;
    }

    public static int zzb(int i9, String str) {
        return zzb(str) + zzj(i9 << 3);
    }

    public final void zza(String str, zzmo zzmoVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmoVar);
        byte[] bytes = str.getBytes(zzjm.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzb(e4);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmk.zza(str);
        } catch (zzmo unused) {
            length = str.getBytes(zzjm.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzit zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z8) throws IOException {
        zza(z8 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i9, double d2) throws IOException {
        zza(i9, Double.doubleToRawLongBits(d2));
    }

    public final void zzb(double d2) throws IOException {
        zza(Double.doubleToRawLongBits(d2));
    }

    public final void zzb(int i9, float f9) throws IOException {
        zza(i9, Float.floatToRawIntBits(f9));
    }

    public final void zzb(float f9) throws IOException {
        zza(Float.floatToRawIntBits(f9));
    }
}
