package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzbfl extends zzbfx {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbfl(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final double zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final Uri zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final IObjectWrapper zzf() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }
}
