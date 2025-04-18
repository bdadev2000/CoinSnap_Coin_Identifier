package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzacv {
    public static int zza(zzacs zzacsVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzacsVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, @Nullable String str) throws zzbh {
        if (!z10) {
            throw zzbh.zza(str, null);
        }
    }

    public static boolean zzc(zzacs zzacsVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzacsVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e2) {
            if (z10) {
                return false;
            }
            throw e2;
        }
    }

    public static boolean zzd(zzacs zzacsVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            zzacsVar.zzi(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacs zzacsVar, int i10) throws IOException {
        try {
            zzacsVar.zzk(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
