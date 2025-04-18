package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzazo implements Comparator {
    public zzazo(zzazq zzazqVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazu zzazuVar = (zzazu) obj;
        zzazu zzazuVar2 = (zzazu) obj2;
        int i10 = zzazuVar.zzc - zzazuVar2.zzc;
        if (i10 != 0) {
            return i10;
        }
        return Long.compare(zzazuVar.zza, zzazuVar2.zza);
    }
}
