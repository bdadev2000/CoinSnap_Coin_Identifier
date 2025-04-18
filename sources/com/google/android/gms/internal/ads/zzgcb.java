package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzgcb {
    private static final zzgcb zza;

    static {
        new zzgby("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzgby("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzgca("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgca("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzgbx("base16()", "0123456789ABCDEF");
    }

    public static zzgcb zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzgbz;

    public abstract void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzd(int i10);

    public abstract int zze(int i10);

    public abstract zzgcb zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzfwq.zzj(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zze(i11));
        try {
            zzc(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzd = zzd(zzg.length());
            byte[] bArr = new byte[zzd];
            int zza2 = zza(bArr, zzg);
            if (zza2 != zzd) {
                byte[] bArr2 = new byte[zza2];
                System.arraycopy(bArr, 0, bArr2, 0, zza2);
                return bArr2;
            }
            return bArr;
        } catch (zzgbz e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
