package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfp;
import f4.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzaf implements zzgfp {
    final /* synthetic */ c zza;
    final /* synthetic */ zzcbk zzb;
    final /* synthetic */ zzcbd zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzaj zze;

    public zzaf(zzaj zzajVar, c cVar, zzcbk zzcbkVar, zzcbd zzcbdVar, zzfmc zzfmcVar) {
        this.zza = cVar;
        this.zzb = zzcbkVar;
        this.zzc = zzcbdVar;
        this.zzd = zzfmcVar;
        this.zze = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfmn zzr = zzaj.zzr(this.zza, this.zzb);
        if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzr.zza(zzfmcVar);
            zzr.zzi();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z8;
        boolean z9;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzax zzaxVar = (zzax) obj;
        zzfmn zzr = zzaj.zzr(this.zza, this.zzb);
        atomicBoolean = this.zze.zzG;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e4.toString()));
            }
            if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                zzfmc zzfmcVar = this.zzd;
                zzfmcVar.zzc("QueryInfo generation has been disabled.");
                zzfmcVar.zzh(false);
                zzr.zza(zzfmcVar);
                zzr.zzi();
                return;
            }
            return;
        }
        try {
            try {
                if (zzaxVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzh(true);
                    if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzi();
                        return;
                    }
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzaxVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfmc zzfmcVar2 = this.zzd;
                        zzfmcVar2.zzc("Request ID empty");
                        zzfmcVar2.zzh(false);
                        if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                            zzr.zza(this.zzd);
                            zzr.zzi();
                            return;
                        }
                        return;
                    }
                    Bundle bundle = zzaxVar.zzd;
                    zzaj zzajVar = this.zze;
                    z8 = zzajVar.zzu;
                    if (z8 && bundle != null) {
                        str5 = zzajVar.zzw;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaj zzajVar2 = this.zze;
                            str6 = zzajVar2.zzw;
                            atomicInteger = zzajVar2.zzx;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaj zzajVar3 = this.zze;
                    z9 = zzajVar3.zzt;
                    if (z9 && bundle != null) {
                        str = zzajVar3.zzv;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zze.zzz;
                            if (TextUtils.isEmpty(str2)) {
                                zzaj zzajVar4 = this.zze;
                                com.google.android.gms.ads.internal.util.zzt zzp = com.google.android.gms.ads.internal.zzu.zzp();
                                zzaj zzajVar5 = this.zze;
                                context = zzajVar5.zzg;
                                versionInfoParcel = zzajVar5.zzy;
                                zzajVar4.zzz = zzp.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzaj zzajVar6 = this.zze;
                            str3 = zzajVar6.zzv;
                            str4 = zzajVar6.zzz;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzaxVar.zza, zzaxVar.zzb, bundle);
                    this.zzd.zzh(true);
                    if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzi();
                    }
                } catch (JSONException e9) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e9.toString());
                    zzfmc zzfmcVar3 = this.zzd;
                    zzfmcVar3.zzi(e9);
                    zzfmcVar3.zzh(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e9, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzi();
                    }
                }
            } catch (RemoteException e10) {
                zzfmc zzfmcVar4 = this.zzd;
                zzfmcVar4.zzi(e10);
                zzfmcVar4.zzh(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e10);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzi();
                }
            }
        } catch (Throwable th) {
            if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzi();
            }
            throw th;
        }
    }
}
