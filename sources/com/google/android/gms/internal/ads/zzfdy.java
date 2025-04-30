package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfdy {
    public static void zza(AtomicReference atomicReference, zzfdx zzfdxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfdxVar.zza(obj);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
        } catch (NullPointerException e9) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
