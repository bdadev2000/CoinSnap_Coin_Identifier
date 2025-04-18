package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzgzs implements Iterable<Byte>, Serializable {
    public static final zzgzs zzb = new zzgzq(zzhbr.zzb);
    private int zza = 0;

    static {
        int i2 = zzgzf.zza;
    }

    private static zzgzs zzc(Iterator it, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (zzgzs) it.next();
        }
        int i3 = i2 >>> 1;
        zzgzs zzc = zzc(it, i3);
        zzgzs zzc2 = zzc(it, i2 - i3);
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
            return zzhdj.zzC(zzc, zzc2);
        }
        throw new IllegalArgumentException(d.k("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
    }

    public static int zzq(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(d.j("Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(d.k("Beginning index larger than ending index: ", i2, ", ", i3));
        }
        throw new IndexOutOfBoundsException(d.k("End index: ", i3, " >= ", i4));
    }

    public static zzgzr zzt() {
        return new zzgzr(128);
    }

    public static zzgzs zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgzs zzv(byte[] bArr, int i2, int i3) {
        zzq(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzgzq(bArr2);
    }

    public static zzgzs zzw(String str) {
        return new zzgzq(str.getBytes(zzhbr.zza));
    }

    public static void zzy(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(d.k("Index > length: ", i2, ", ", i3));
            }
            throw new ArrayIndexOutOfBoundsException(d.i("Index < 0: ", i2));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int zzd = zzd();
            i2 = zzi(zzd, 0, zzd);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zza = i2;
        }
        return i2;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzhdw.zza(this) : zzhdw.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzhbr.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i2, int i3, int i4);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i2, int i3, int i4);

    public abstract int zzj(int i2, int i3, int i4);

    public abstract zzgzs zzk(int i2, int i3);

    public abstract zzhac zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgzj zzgzjVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgzn iterator() {
        return new zzgzk(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzhbr.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i2, int i3, int i4) {
        zzq(0, i4, zzd());
        zzq(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }
}
