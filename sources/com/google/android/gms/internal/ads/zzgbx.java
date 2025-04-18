package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import eb.j;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzgbx extends zzgca {
    final char[] zza;

    private zzgbx(zzgbw zzgbwVar) {
        super(zzgbwVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzgbwVar.zzf;
        zzfwq.zze(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgbwVar.zza(i10 >>> 4);
            this.zza[i10 | NotificationCompat.FLAG_LOCAL_ONLY] = zzgbwVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgbz {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.zzb.zzb(charSequence.charAt(i10)) << 4) | this.zzb.zzb(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new zzgbz(j.i("Invalid input length ", charSequence.length()));
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public final zzgcb zzb(zzgbw zzgbwVar, Character ch2) {
        return new zzgbx(zzgbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgca, com.google.android.gms.internal.ads.zzgcb
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzfwq.zzj(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & UByte.MAX_VALUE;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    public zzgbx(String str, String str2) {
        this(new zzgbw("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
