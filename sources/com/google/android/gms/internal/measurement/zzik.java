package com.google.android.gms.internal.measurement;

import android.support.v4.media.d;
import androidx.compose.foundation.text.input.a;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(zzjv.zzb);
    private static final zzir zzb = new zziu();
    private int zzc = 0;

    static {
        new zzim();
    }

    public static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    public static zzit zzc(int i2) {
        return new zzit(i2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzb2 = zzb();
            i2 = zzb(zzb2, 0, zzb2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzin(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? zzmg.zza(this) : a.j(zzmg.zza(zza(0, 47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i2);

    public final int zza() {
        return this.zzc;
    }

    public abstract zzik zza(int i2, int i3);

    public abstract void zza(zzil zzilVar) throws IOException;

    public abstract byte zzb(int i2);

    public abstract int zzb();

    public abstract int zzb(int i2, int i3, int i4);

    public static /* synthetic */ int zza(byte b2) {
        return b2 & UnsignedBytes.MAX_VALUE;
    }

    public static int zza(int i2, int i3, int i4) {
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

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i2, int i3) {
        zza(i2, i2 + i3, bArr.length);
        return new zziv(zzb.zza(bArr, i2, i3));
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(zzjv.zza));
    }
}
