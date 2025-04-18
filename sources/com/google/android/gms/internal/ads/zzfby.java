package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfby {
    public static void zza(AtomicReference atomicReference, zzfbx zzfbxVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfbxVar.zza(obj);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
