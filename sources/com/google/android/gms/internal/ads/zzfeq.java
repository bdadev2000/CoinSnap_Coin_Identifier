package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes3.dex */
public final class zzfeq extends zzbwl {
    private final zzfeg zza;
    private final zzfdw zzb;
    private final zzffg zzc;

    @Nullable
    private zzdor zzd;
    private boolean zze = false;

    public zzfeq(zzfeg zzfegVar, zzfdw zzfdwVar, zzffg zzffgVar) {
        this.zza = zzfegVar;
        this.zzb = zzfdwVar;
        this.zzc = zzffgVar;
    }

    private final synchronized boolean zzy() {
        zzdor zzdorVar = this.zzd;
        if (zzdorVar != null) {
            if (!zzdorVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdor zzdorVar = this.zzd;
        if (zzdorVar != null) {
            return zzdorVar.zza();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException {
        zzdor zzdorVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgD)).booleanValue() && (zzdorVar = this.zzd) != null) {
            return zzdorVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        zzdor zzdorVar = this.zzd;
        if (zzdorVar != null && zzdorVar.zzm() != null) {
            return zzdorVar.zzm().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzfs)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwq r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbce r1 = com.google.android.gms.internal.ads.zzbcn.zzfq     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbcl r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L2a
            if (r0 != 0) goto L19
            goto L2a
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.RuntimeException -> L20 java.lang.Throwable -> L62
            if (r0 == 0) goto L2a
            goto L42
        L20:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzbzz r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L62
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L62
        L2a:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzfs     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L44
        L42:
            monitor-exit(r4)
            return
        L44:
            com.google.android.gms.internal.ads.zzfdy r0 = new com.google.android.gms.internal.ads.zzfdy     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r4.zzd = r1     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzfeg r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzfeg r1 = r4.zza     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.ads.zzfeo r3 = new com.google.android.gms.internal.ads.zzfeo     // Catch: java.lang.Throwable -> L62
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)
            return
        L62:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeq.zzg(com.google.android.gms.internal.ads.zzbwq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zzb(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Context context;
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            if (iObjectWrapper == null) {
                context = null;
            } else {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzl(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzccVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfep(this, zzccVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzn(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzo(zzbwp zzbwpVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final synchronized void zzr(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
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
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final boolean zzt() {
        zzdor zzdorVar = this.zzd;
        return zzdorVar != null && zzdorVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzu(zzbwk zzbwkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbwkVar);
    }
}
