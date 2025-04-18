package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* loaded from: classes3.dex */
public final class zzfre {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfre(@NonNull Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfrf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfrf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzaxy r8, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzfrk r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfre.zza(com.google.android.gms.internal.ads.zzaxy, com.google.android.gms.internal.ads.zzfrk):boolean");
    }

    @Nullable
    public final zzayb zzb(int i10) {
        String string;
        if (i10 == 1) {
            string = this.zzc.getString(zzf(), null);
        } else {
            string = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgxp zzgxpVar = zzgxp.zzb;
            zzayb zzh = zzayb.zzh(zzgxp.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfrf.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfrf.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfrf.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgzm unused) {
        }
        return null;
    }

    @Nullable
    public final zzfrd zzc(int i10) {
        zzayb zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfrf.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfrf.zzb(zzk, "pcam", zzd());
        }
        return new zzfrd(zzb, zzb2, zzfrf.zzb(zzk, "pcbc", zzd()), zzfrf.zzb(zzk, "pcopt", zzd()));
    }
}
