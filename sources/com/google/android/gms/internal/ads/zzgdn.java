package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzgdn implements FilenameFilter {
    private final Pattern zza;

    public zzgdn(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
