package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdtk implements AppEventListener, zzczj, com.google.android.gms.ads.internal.client.zza, zzcwm, zzcxg, zzcxh, zzcya, zzcwp, zzfjs {
    private final List zza;
    private final zzdsy zzb;
    private long zzc;

    public zzdtk(zzdsy zzdsyVar, zzchk zzchkVar) {
        this.zzb = zzdsyVar;
        this.zza = Collections.singletonList(zzchkVar);
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

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzg(zzcwm.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzg(zzcwm.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzg(zzcwm.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcwp.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th2) {
        zzg(zzfjk.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        zzg(zzfjk.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdj(Context context) {
        zzg(zzcxh.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdl(Context context) {
        zzg(zzcxh.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzdm(Context context) {
        zzg(zzcxh.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        zzg(zzczj.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
        zzg(zzcwm.class, "onRewarded", zzbwjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
        zzg(zzcwm.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
        zzg(zzcwm.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzg(zzcxg.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzc));
        zzg(zzcya.class, "onAdLoaded", new Object[0]);
    }
}
