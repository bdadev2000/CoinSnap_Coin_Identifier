package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzgq {
    public static <V> V zza(zzgp<V> zzgpVar) {
        try {
            return zzgpVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzgpVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
