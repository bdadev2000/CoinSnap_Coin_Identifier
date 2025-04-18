package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzadp {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i2 = zzeu.zza;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbk zzbkVar) {
        for (int i2 = 0; i2 < zzbkVar.zza(); i2++) {
            zzbj zzb = zzbkVar.zzb(i2);
            if (zzb instanceof zzagp) {
                zzagp zzagpVar = (zzagp) zzb;
                if ("iTunSMPB".equals(zzagpVar.zzb) && zzc(zzagpVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzagy) {
                zzagy zzagyVar = (zzagy) zzb;
                if ("com.apple.iTunes".equals(zzagyVar.zza) && "iTunSMPB".equals(zzagyVar.zzb) && zzc(zzagyVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
