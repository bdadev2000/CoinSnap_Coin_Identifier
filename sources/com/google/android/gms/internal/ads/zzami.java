package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzami {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzami(String str, int i2, String str2, Set set) {
        this.zzb = i2;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzami zza(String str, int i2) {
        String str2;
        String trim = str.trim();
        zzdi.zzd(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i3 = zzeu.zza;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i4 = 1; i4 < split.length; i4++) {
            hashSet.add(split[i4]);
        }
        return new zzami(str3, i2, str2, hashSet);
    }

    public static zzami zzb() {
        return new zzami("", 0, "", Collections.emptySet());
    }
}
