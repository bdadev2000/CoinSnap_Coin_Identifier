package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import com.mbridge.msdk.foundation.entity.o;
import java.io.File;

/* loaded from: classes2.dex */
public final class zzfsx {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzazw zzd;

    public zzfsx(@NonNull Context context, zzazw zzazwVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfsy.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfsy.zza(dir2, true);
        this.zza = dir2;
        this.zzd = zzazwVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return o.h(this.zzd.zza(), "FBAMTD");
    }

    private final String zzf() {
        return o.h(this.zzd.zza(), "LATMTD");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzazz r8, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzftd r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zza(com.google.android.gms.internal.ads.zzazz, com.google.android.gms.internal.ads.zzftd):boolean");
    }

    @Nullable
    public final zzbac zzb(int i9) {
        String string;
        if (i9 == 1) {
            string = this.zzc.getString(zzf(), null);
        } else {
            string = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzhac zzhacVar = zzhac.zzb;
            zzbac zzh = zzbac.zzh(zzhac.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfsy.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfsy.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfsy.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzhcd unused) {
        }
        return null;
    }

    @Nullable
    public final zzfsw zzc(int i9) {
        zzbac zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfsy.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfsy.zzb(zzk, "pcam", zzd());
        }
        return new zzfsw(zzb, zzb2, zzfsy.zzb(zzk, "pcbc", zzd()), zzfsy.zzb(zzk, "pcopt", zzd()));
    }
}
