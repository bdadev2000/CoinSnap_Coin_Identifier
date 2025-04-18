package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import o.h;
import o.o;

/* loaded from: classes3.dex */
public final class zzhgr extends o {
    private final WeakReference zza;

    public zzhgr(zzbdo zzbdoVar) {
        this.zza = new WeakReference(zzbdoVar);
    }

    @Override // o.o
    public final void onCustomTabsServiceConnected(ComponentName componentName, h hVar) {
        zzbdo zzbdoVar = (zzbdo) this.zza.get();
        if (zzbdoVar != null) {
            zzbdoVar.zzc(hVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdo zzbdoVar = (zzbdo) this.zza.get();
        if (zzbdoVar != null) {
            zzbdoVar.zzd();
        }
    }
}
