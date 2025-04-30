package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzfgq extends zzbyj {
    private final zzfgg zza;
    private final zzffw zzb;
    private final zzfhg zzc;

    @Nullable
    private zzdrh zzd;
    private boolean zze = false;

    public zzfgq(zzfgg zzfggVar, zzffw zzffwVar, zzfhg zzfhgVar) {
        this.zza = zzfggVar;
        this.zzb = zzffwVar;
        this.zzc = zzfhgVar;
    }

    private final synchronized boolean zzy() {
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar != null) {
            if (!zzdrhVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar != null) {
            return zzdrhVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        zzdrh zzdrhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue() && (zzdrhVar = this.zzd) != null) {
            return zzdrhVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar != null && zzdrhVar.zzl() != null) {
            return zzdrhVar.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzfz)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbyo r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbeg r1 = com.google.android.gms.internal.ads.zzbep.zzfx     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzben r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcby r2 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L20
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzfz     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzffy r0 = new com.google.android.gms.internal.ads.zzffy     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfgg r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfgg r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzl r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfgo r3 = new com.google.android.gms.internal.ads.zzfgo     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgq.zzg(com.google.android.gms.internal.ads.zzbyo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzb(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgp(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzn(boolean z8) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzo(zzbyn zzbynVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbynVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzr(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (unwrap instanceof Activity) {
                        activity = (Activity) unwrap;
                    }
                }
                this.zzd.zzh(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzt() {
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar != null && zzdrhVar.zzg()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzu(zzbyi zzbyiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbyiVar);
    }
}
