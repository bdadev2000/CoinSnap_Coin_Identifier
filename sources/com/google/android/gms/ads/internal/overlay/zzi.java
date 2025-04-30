package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzchd;

/* loaded from: classes2.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzchd zzchdVar) throws zzg {
        this.zzb = zzchdVar.getLayoutParams();
        ViewParent parent = zzchdVar.getParent();
        this.zzd = zzchdVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzchdVar.zzF());
            viewGroup.removeView(zzchdVar.zzF());
            zzchdVar.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
