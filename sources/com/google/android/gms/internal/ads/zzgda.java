package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzgda {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j3, Object obj2, Object obj3) {
        while (!a.a(unsafe, obj, j3, obj2, obj3)) {
            if (unsafe.getObject(obj, j3) != obj2) {
                return false;
            }
        }
        return true;
    }
}
