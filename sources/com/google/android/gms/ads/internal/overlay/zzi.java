package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfo;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcfo zzcfoVar) throws zzg {
        this.zzb = zzcfoVar.getLayoutParams();
        ViewParent parent = zzcfoVar.getParent();
        this.zzd = zzcfoVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcfoVar.zzF());
        viewGroup.removeView(zzcfoVar.zzF());
        zzcfoVar.zzaq(true);
    }
}
