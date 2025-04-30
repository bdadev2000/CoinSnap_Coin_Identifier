package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzani {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzani(String str, int i9, String str2, Set set) {
        this.zzb = i9;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzani zza(String str, int i9) {
        String str2;
        String trim = str.trim();
        zzeq.zzd(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i10 = zzgd.zza;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < split.length; i11++) {
            hashSet.add(split[i11]);
        }
        return new zzani(str3, i9, str2, hashSet);
    }

    public static zzani zzb() {
        return new zzani("", 0, "", Collections.emptySet());
    }
}
