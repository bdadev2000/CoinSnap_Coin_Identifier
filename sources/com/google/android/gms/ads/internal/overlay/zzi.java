package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfk;

/* loaded from: classes3.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcfk zzcfkVar) throws zzg {
        this.zzb = zzcfkVar.getLayoutParams();
        ViewParent parent = zzcfkVar.getParent();
        this.zzd = zzcfkVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcfkVar.zzF());
            viewGroup.removeView(zzcfkVar.zzF());
            zzcfkVar.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
