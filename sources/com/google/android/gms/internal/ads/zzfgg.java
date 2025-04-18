package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public final class zzfgg {
    private final Pattern zza;

    public zzfgg() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgJ));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    @Nullable
    public final String zza(@Nullable String str) {
        Pattern pattern = this.zza;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }
        return null;
    }
}
