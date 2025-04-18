package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class zzadf {
    public static int zza(zzadc zzadcVar, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int zzb = zzadcVar.zzb(bArr, i2 + i4, i3 - i4);
            if (zzb == -1) {
                break;
            }
            i4 += zzb;
        }
        return i4;
    }

    @Pure
    public static void zzb(boolean z2, @Nullable String str) throws zzbo {
        if (!z2) {
            throw zzbo.zza(str, null);
        }
    }

    public static boolean zzc(zzadc zzadcVar, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        try {
            return zzadcVar.zzm(bArr, 0, i3, z2);
        } catch (EOFException e) {
            if (z2) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzadc zzadcVar, byte[] bArr, int i2, int i3) throws IOException {
        try {
            zzadcVar.zzi(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzadc zzadcVar, int i2) throws IOException {
        try {
            zzadcVar.zzk(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
