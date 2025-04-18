package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzfdm {
    public static void zza(AtomicReference atomicReference, zzfdl zzfdlVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfdlVar.zza(obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
