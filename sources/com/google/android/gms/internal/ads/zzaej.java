package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzaej {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i9 = zzgd.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzcd zzcdVar) {
        for (int i9 = 0; i9 < zzcdVar.zza(); i9++) {
            zzcc zzb = zzcdVar.zzb(i9);
            if (zzb instanceof zzahk) {
                zzahk zzahkVar = (zzahk) zzb;
                if ("iTunSMPB".equals(zzahkVar.zzb) && zzc(zzahkVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzaht) {
                zzaht zzahtVar = (zzaht) zzb;
                if ("com.apple.iTunes".equals(zzahtVar.zza) && "iTunSMPB".equals(zzahtVar.zzb) && zzc(zzahtVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
