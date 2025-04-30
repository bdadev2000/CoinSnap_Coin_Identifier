package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzbbp implements Comparator {
    public zzbbp(zzbbr zzbbrVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbv zzbbvVar = (zzbbv) obj;
        zzbbv zzbbvVar2 = (zzbbv) obj2;
        int i9 = zzbbvVar.zzc - zzbbvVar2.zzc;
        if (i9 != 0) {
            return i9;
        }
        return Long.compare(zzbbvVar.zza, zzbbvVar2.zza);
    }
}
