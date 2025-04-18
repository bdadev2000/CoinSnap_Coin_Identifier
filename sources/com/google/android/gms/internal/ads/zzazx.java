package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes4.dex */
final class zzazx implements Comparator {
    public zzazx(zzazz zzazzVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbad zzbadVar = (zzbad) obj;
        zzbad zzbadVar2 = (zzbad) obj2;
        int i2 = zzbadVar.zzc - zzbadVar2.zzc;
        return i2 != 0 ? i2 : Long.compare(zzbadVar.zza, zzbadVar2.zza);
    }
}
