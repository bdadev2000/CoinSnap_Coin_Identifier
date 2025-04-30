package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbow implements zzboo, zzbom {
    private final zzchd zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbow(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzaxd zzaxdVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzchp {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzchd zza = zzchq.zza(context, zzcix.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbdm.zza(), null, null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!com.google.android.gms.ads.internal.util.zzt.zza.post(runnable)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // java.lang.Runnable
            public final void run() {
                zzbow.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbol.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbol.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbol.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbot
            @Override // java.lang.Runnable
            public final void run() {
                zzbow.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboq
            @Override // java.lang.Runnable
            public final void run() {
                zzbow.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbou
            @Override // java.lang.Runnable
            public final void run() {
                zzbow.this.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final zzbpv zzj() {
        return new zzbpv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzboo
    public final void zzk(final zzbpc zzbpcVar) {
        zzciv zzN = this.zza.zzN();
        Objects.requireNonNull(zzbpcVar);
        zzN.zzH(new zzciu() { // from class: com.google.android.gms.internal.ads.zzbor
            @Override // com.google.android.gms.internal.ads.zzciu
            public final void zza() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                zzbpc zzbpcVar2 = zzbpc.this;
                final long j7 = zzbpcVar2.zzc;
                final ArrayList arrayList = zzbpcVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j7));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbpt zzbptVar = zzbpcVar2.zza;
                final zzbps zzbpsVar = zzbpcVar2.zzd;
                final zzboo zzbooVar = zzbpcVar2.zze;
                zzfuvVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbpt.this.zzi(zzbpsVar, zzbooVar, arrayList, j7);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbol.zzd(this, str, jSONObject);
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

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, zzblp zzblpVar) {
        this.zza.zzag(str, new zzbov(this, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(String str, final zzblp zzblpVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbop
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzblp zzblpVar2;
                zzblp zzblpVar3 = (zzblp) obj;
                if (zzblpVar3 instanceof zzbov) {
                    zzblp zzblpVar4 = zzblp.this;
                    zzblpVar2 = ((zzbov) zzblpVar3).zzb;
                    if (zzblpVar2.equals(zzblpVar4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
