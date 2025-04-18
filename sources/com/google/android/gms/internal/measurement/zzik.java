package com.google.android.gms.internal.measurement;

import eb.j;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import kotlin.UByte;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(zzjv.zzb);
    private static final zzir zzb = new zziu();
    private int zzc = 0;

    static {
        new zzim();
    }

    public static /* synthetic */ int zza(byte b3) {
        return b3 & UByte.MAX_VALUE;
    }

    public static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    public static zzit zzc(int i10) {
        return new zzit(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzin(this);
    }

    public final String toString() {
        String k10;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            k10 = zzmg.zza(this);
        } else {
            k10 = j.k(zzmg.zza(zza(0, 47)), "...");
        }
        objArr[2] = k10;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract zzik zza(int i10, int i11);

    public abstract void zza(zzil zzilVar) throws IOException;

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(a.i("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a4.j.e("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(a4.j.e("End index: ", i11, " >= ", i12));
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zziv(zzb.zza(bArr, i10, i11));
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(zzjv.zza));
    }
}
