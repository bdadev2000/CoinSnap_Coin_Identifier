package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import u.AbstractC2736e;
import u.AbstractServiceConnectionC2741j;

/* loaded from: classes2.dex */
public final class zzhli extends AbstractServiceConnectionC2741j {
    private final WeakReference zza;

    public zzhli(zzbfm zzbfmVar) {
        this.zza = new WeakReference(zzbfmVar);
    }

    @Override // u.AbstractServiceConnectionC2741j
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2736e abstractC2736e) {
        zzbfm zzbfmVar = (zzbfm) this.zza.get();
        if (zzbfmVar != null) {
            zzbfmVar.zzc(abstractC2736e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbfm zzbfmVar = (zzbfm) this.zza.get();
        if (zzbfmVar != null) {
            zzbfmVar.zzd();
        }
    }
}
