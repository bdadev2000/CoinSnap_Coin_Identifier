package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzelt extends com.google.android.gms.ads.internal.client.zzbx {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbl zzb;
    private final zzffo zzc;
    private final zzcpd zzd;
    private final ViewGroup zze;
    private final zzdsm zzf;

    public zzelt(Context context, @Nullable com.google.android.gms.ads.internal.client.zzbl zzblVar, zzffo zzffoVar, zzcpd zzcpdVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzblVar;
        this.zzc = zzffoVar;
        this.zzd = zzcpdVar;
        this.zzf = zzdsmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzd = zzcpdVar.zzd();
        com.google.android.gms.ads.internal.zzv.zzq();
        frameLayout.addView(zzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzd;
        if (zzcpdVar != null) {
            zzcpdVar.zzi(this.zze, zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) throws RemoteException {
        zzems zzemsVar = this.zzc.zzc;
        if (zzemsVar != null) {
            zzemsVar.zzm(zzcmVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbai zzbaiVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtp zzbtpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z10) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdi zzbdiVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzll)).booleanValue()) {
            zzems zzemsVar = this.zzc.zzc;
            if (zzemsVar != null) {
                try {
                    if (!zzdrVar.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Error in making CSI ping for reporting paid event callback", e2);
                }
                zzemsVar.zzl(zzdrVar);
                return;
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbts zzbtsVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwp zzbwpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        zzcpd zzcpdVar = this.zzd;
        return zzcpdVar != null && zzcpdVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzs zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzffu.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzdy zzk() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzeb zzl() throws RemoteException {
        return this.zzd.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb(null);
    }
}
