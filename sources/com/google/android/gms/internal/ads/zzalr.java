package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzalr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgbc zze = zzgbc.zzp("auto", IntegrityManager.INTEGRITY_TYPE_NONE);
    private static final zzgbc zzf = zzgbc.zzq("dot", "sesame", "circle");
    private static final zzgbc zzg = zzgbc.zzp("filled", "open");
    private static final zzgbc zzh = zzgbc.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalr(int i2, int i3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    @Nullable
    public static zzalr zza(@Nullable String str) {
        boolean z2;
        if (str == null) {
            return null;
        }
        String zza = zzfxi.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgbc zzm = zzgbc.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzgbd.zza(zzgcz.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        int i2 = -1;
        int i3 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z2 = false;
            }
            z2 = -1;
        } else {
            if (str2.equals("outside")) {
                z2 = true;
            }
            z2 = -1;
        }
        int i4 = z2 ? !z2 ? 1 : -2 : 2;
        zzgcy zzb = zzgcz.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzgcy zzb2 = zzgcz.zzb(zzg, zzm);
            zzgcy zzb3 = zzgcz.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzgbd.zza(zzb2, "filled");
                int i5 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgbd.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i2 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    i2 = 2;
                } else if (i2 != 1) {
                    i3 = i5;
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                i3 = i5;
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(IntegrityManager.INTEGRITY_TYPE_NONE)) {
                i2 = 0;
            }
        }
        return new zzalr(i2, i3, i4);
    }
}
