package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzady {
    public static int zza(zzadv zzadvVar, byte[] bArr, int i9, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int zzb = zzadvVar.zzb(bArr, i9 + i11, i10 - i11);
            if (zzb == -1) {
                break;
            }
            i11 += zzb;
        }
        return i11;
    }

    public static void zzb(boolean z8, @Nullable String str) throws zzch {
        if (z8) {
        } else {
            throw zzch.zza(str, null);
        }
    }

    public static boolean zzc(zzadv zzadvVar, byte[] bArr, int i9, int i10, boolean z8) throws IOException {
        try {
            return zzadvVar.zzm(bArr, 0, i10, z8);
        } catch (EOFException e4) {
            if (z8) {
                return false;
            }
            throw e4;
        }
    }

    public static boolean zzd(zzadv zzadvVar, byte[] bArr, int i9, int i10) throws IOException {
        try {
            ((zzadi) zzadvVar).zzn(bArr, i9, i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzadv zzadvVar, int i9) throws IOException {
        try {
            ((zzadi) zzadvVar).zzo(i9, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
