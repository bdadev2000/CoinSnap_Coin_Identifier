package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbmx implements zzbmp, zzbmo {
    private final zzcfk zza;

    public zzbmx(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzavc zzavcVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcfw {
        com.google.android.gms.ads.internal.zzv.zzA();
        zzcfk zza = zzcfx.zza(context, zzche.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbbl.zza(), null, null, null, null);
        this.zza = zza;
        zza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmt
            @Override // java.lang.Runnable
            public final void run() {
                zzbmx.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmn.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmn.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmn.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmu
            @Override // java.lang.Runnable
            public final void run() {
                zzbmx.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final void run() {
                zzbmx.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmv
            @Override // java.lang.Runnable
            public final void run() {
                zzbmx.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzbnw zzj() {
        return new zzbnw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzk(final zzbnd zzbndVar) {
        zzchc zzN = this.zza.zzN();
        Objects.requireNonNull(zzbndVar);
        zzN.zzI(new zzchb() { // from class: com.google.android.gms.internal.ads.zzbms
            @Override // com.google.android.gms.internal.ads.zzchb
            public final void zza() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                zzbnd zzbndVar2 = zzbnd.this;
                final long j3 = zzbndVar2.zzc;
                final ArrayList arrayList = zzbndVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j3));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
                final zzbnu zzbnuVar = zzbndVar2.zza;
                final zzbnt zzbntVar = zzbndVar2.zzd;
                final zzbmp zzbmpVar = zzbndVar2.zze;
                zzftdVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnu.this.zzi(zzbntVar, zzbmpVar, arrayList, j3);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmn.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzq(String str, zzbjr zzbjrVar) {
        this.zza.zzag(str, new zzbmw(this, zzbjrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(String str, final zzbjr zzbjrVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbmq
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbjr zzbjrVar2;
                zzbjr zzbjrVar3 = (zzbjr) obj;
                if (zzbjrVar3 instanceof zzbmw) {
                    zzbjr zzbjrVar4 = zzbjr.this;
                    zzbjrVar2 = ((zzbmw) zzbjrVar3).zzb;
                    if (zzbjrVar2.equals(zzbjrVar4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
