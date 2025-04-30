package com.google.android.gms.internal.play_billing;

import Q7.n0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzbq implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzbq zzb = new zzbn(zzda.zzd);
    private static final zzbp zzd;
    private int zzc = 0;

    static {
        int i9 = zzbb.zza;
        zzd = new zzbp(null);
        zza = new zzbh();
    }

    public static int zzj(int i9, int i10, int i11) {
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

    public static zzbq zzl(byte[] bArr, int i9, int i10) {
        zzj(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        return new zzbn(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i9 = this.zzc;
        if (i9 == 0) {
            int zzd2 = zzd();
            i9 = zze(zzd2, 0, zzd2);
            if (i9 == 0) {
                i9 = 1;
            }
            this.zzc = i9;
        }
        return i9;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbg(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        if (zzd() <= 50) {
            concat = zzfd.zza(this);
        } else {
            concat = zzfd.zza(zzf(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return AbstractC2914a.h(sb, concat, "\">");
    }

    public abstract byte zza(int i9);

    public abstract byte zzb(int i9);

    public abstract int zzd();

    public abstract int zze(int i9, int i10, int i11);

    public abstract zzbq zzf(int i9, int i10);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzbf zzbfVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
