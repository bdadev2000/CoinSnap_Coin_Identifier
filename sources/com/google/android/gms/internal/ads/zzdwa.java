package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdwa implements AppEventListener, zzdcg, com.google.android.gms.ads.internal.client.zza, zzczl, zzdaf, zzdag, zzdaz, zzczo, zzflu {
    private final List zza;
    private final zzdvo zzb;
    private long zzc;

    public zzdwa(zzdvo zzdvoVar, zzcjd zzcjdVar) {
        this.zzb = zzdvoVar;
        this.zza = Collections.singletonList(zzcjdVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        zzg(zzczl.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
        zzg(zzczl.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        zzg(zzczl.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) {
        zzg(zzflm.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzczo.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) {
        zzg(zzflm.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) {
        zzg(zzflm.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) {
        zzg(zzflm.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(Context context) {
        zzg(zzdag.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(Context context) {
        zzg(zzdag.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(Context context) {
        zzg(zzdag.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        zzg(zzdcg.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
        zzg(zzczl.class, "onRewarded", zzbyhVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
        zzg(zzczl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
        zzg(zzczl.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        zzg(zzdaf.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
        zzg(zzdaz.class, "onAdLoaded", new Object[0]);
    }
}
