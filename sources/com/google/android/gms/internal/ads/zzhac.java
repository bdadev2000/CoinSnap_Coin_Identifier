package com.google.android.gms.internal.ads;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzhac implements Iterable<Byte>, Serializable {
    private static final Comparator zza;
    public static final zzhac zzb = new zzgzy(zzhcb.zzd);
    private static final zzhab zzd;
    private int zzc = 0;

    static {
        int i9 = zzgzm.zza;
        zzd = new zzhab(null);
        zza = new zzgzs();
    }

    private static zzhac zzc(Iterator it, int i9) {
        if (i9 > 0) {
            if (i9 == 1) {
                return (zzhac) it.next();
            }
            int i10 = i9 >>> 1;
            zzhac zzc = zzc(it, i10);
            zzhac zzc2 = zzc(it, i9 - i10);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzhdy.zzD(zzc, zzc2);
            }
            throw new IllegalArgumentException(n0.e(zzc.zzd(), zzc2.zzd(), "ByteString would be too long: ", "+"));
        }
        throw new IllegalArgumentException(n0.f(i9, "length (", ") must be >= 1"));
    }

    public static int zzq(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) < 0) {
            if (i9 >= 0) {
                if (i10 < i9) {
                    throw new IndexOutOfBoundsException(n0.e(i9, i10, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(n0.e(i10, i11, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(n0.f(i9, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static zzgzz zzt() {
        return new zzgzz(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhac zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzhac zzv(byte[] bArr, int i9, int i10) {
        zzq(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return new zzgzy(bArr2);
    }

    public static zzhac zzw(String str) {
        return new zzgzy(str.getBytes(zzhcb.zzb));
    }

    public static void zzz(int i9, int i10) {
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(o.h(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(n0.e(i9, i10, "Index > length: ", ", "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i9 = this.zzc;
        if (i9 == 0) {
            int zzd2 = zzd();
            i9 = zzi(zzd2, 0, zzd2);
            if (i9 == 0) {
                i9 = 1;
            }
            this.zzc = i9;
        }
        return i9;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        if (zzd() <= 50) {
            concat = zzheo.zza(this);
        } else {
            concat = zzheo.zza(zzk(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return AbstractC2914a.h(sb, concat, "\">");
    }

    @Deprecated
    public final void zzA(byte[] bArr, int i9, int i10, int i11) {
        zzq(0, i11, zzd());
        zzq(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            zze(bArr, 0, i10, i11);
        }
    }

    public final byte[] zzB() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzhcb.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i9);

    public abstract byte zzb(int i9);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i9, int i10, int i11);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i9, int i10, int i11);

    public abstract int zzj(int i9, int i10, int i11);

    public abstract zzhac zzk(int i9, int i10);

    public abstract zzham zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgzq zzgzqVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgzv iterator() {
        return new zzgzr(this);
    }

    public final String zzx(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzm(charset);
    }

    public final String zzy() {
        return zzx(zzhcb.zzb);
    }
}
