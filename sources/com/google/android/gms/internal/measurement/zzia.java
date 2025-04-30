package com.google.android.gms.internal.measurement;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzia implements Serializable, Iterable<Byte> {
    public static final zzia zza = new zzij(zzjm.zzb);
    private static final zzid zzb = new zzim();
    private int zzc = 0;

    static {
        new zzic();
    }

    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public static zzia zzb(byte[] bArr) {
        return new zzij(bArr);
    }

    public static zzif zzc(int i9) {
        return new zzif(i9);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i9 = this.zzc;
        if (i9 == 0) {
            int zzb2 = zzb();
            i9 = zzb(zzb2, 0, zzb2);
            if (i9 == 0) {
                i9 = 1;
            }
            this.zzc = i9;
        }
        return i9;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzhz(this);
    }

    public final String toString() {
        String j7;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        if (zzb() <= 50) {
            j7 = zzmb.zza(this);
        } else {
            j7 = o.j(zzmb.zza(zza(0, 47)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzb2);
        sb.append(" contents=\"");
        return AbstractC2914a.h(sb, j7, "\">");
    }

    public abstract byte zza(int i9);

    public abstract zzia zza(int i9, int i10);

    public abstract void zza(zzhx zzhxVar) throws IOException;

    public abstract byte zzb(int i9);

    public abstract int zzb();

    public abstract int zzb(int i9, int i10, int i11);

    public static int zza(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(n0.f(i9, "Beginning index: ", " < 0"));
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException(n0.e(i9, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(n0.e(i10, i11, "End index: ", " >= "));
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzia zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzia zza(byte[] bArr, int i9, int i10) {
        zza(i9, i9 + i10, bArr.length);
        return new zzij(zzb.zza(bArr, i9, i10));
    }

    public static zzia zza(String str) {
        return new zzij(str.getBytes(zzjm.zza));
    }
}
