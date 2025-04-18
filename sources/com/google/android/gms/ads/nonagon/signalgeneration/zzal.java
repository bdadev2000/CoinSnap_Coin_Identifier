package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class zzal implements zzgfk {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbzp zzb;
    final /* synthetic */ zzbzi zzc;
    final /* synthetic */ zzflp zzd;
    final /* synthetic */ zzap zze;

    public zzal(zzap zzapVar, ListenableFuture listenableFuture, zzbzp zzbzpVar, zzbzi zzbziVar, zzflp zzflpVar) {
        this.zza = listenableFuture;
        this.zzb = zzbzpVar;
        this.zzc = zzbziVar;
        this.zzd = zzflpVar;
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhp)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfma zzr = zzap.zzr(this.zza, this.zzb);
        if (((Boolean) zzbek.zze.zze()).booleanValue() && zzr != null) {
            zzflp zzflpVar = this.zzd;
            zzflpVar.zzh(th);
            zzflpVar.zzg(false);
            zzr.zza(zzflpVar);
            zzr.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzbd zzbdVar = (zzbd) obj;
        zzfma zzr = zzap.zzr(this.zza, this.zzb);
        atomicBoolean = this.zze.zzG;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhk)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzflp zzflpVar = this.zzd;
            zzflpVar.zzc("QueryInfo generation has been disabled.");
            zzflpVar.zzg(false);
            zzr.zza(zzflpVar);
            zzr.zzh();
            return;
        }
        try {
            try {
                if (zzbdVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzbdVar.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzflp zzflpVar2 = this.zzd;
                        zzflpVar2.zzc("Request ID empty");
                        zzflpVar2.zzg(false);
                        if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzh();
                        return;
                    }
                    Bundle bundle = zzbdVar.zzd;
                    zzap zzapVar = this.zze;
                    z2 = zzapVar.zzu;
                    if (z2 && bundle != null) {
                        str5 = zzapVar.zzw;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzap zzapVar2 = this.zze;
                            str6 = zzapVar2.zzw;
                            atomicInteger = zzapVar2.zzx;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzap zzapVar3 = this.zze;
                    z3 = zzapVar3.zzt;
                    if (z3 && bundle != null) {
                        str = zzapVar3.zzv;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zze.zzz;
                            if (TextUtils.isEmpty(str2)) {
                                zzap zzapVar4 = this.zze;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzu.zzp();
                                zzap zzapVar5 = this.zze;
                                context = zzapVar5.zzg;
                                versionInfoParcel = zzapVar5.zzy;
                                zzapVar4.zzz = zzp.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzap zzapVar6 = this.zze;
                            str3 = zzapVar6.zzv;
                            str4 = zzapVar6.zzz;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzbdVar.zza, zzbdVar.zzb, bundle);
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e2.toString());
                    zzflp zzflpVar3 = this.zzd;
                    zzflpVar3.zzh(e2);
                    zzflpVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            } catch (RemoteException e3) {
                zzflp zzflpVar4 = this.zzd;
                zzflpVar4.zzh(e3);
                zzflpVar4.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbek.zze.zze()).booleanValue() || zzr == null) {
                    return;
                }
                zzr.zza(this.zzd);
                zzr.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbek.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzh();
            }
            throw th;
        }
    }
}
