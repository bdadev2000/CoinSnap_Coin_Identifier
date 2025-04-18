package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzgee;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import ua.b;

/* loaded from: classes3.dex */
final class zzal implements zzgee {
    final /* synthetic */ b zza;
    final /* synthetic */ zzbzl zzb;
    final /* synthetic */ zzbze zzc;
    final /* synthetic */ zzfka zzd;
    final /* synthetic */ zzap zze;

    public zzal(zzap zzapVar, b bVar, zzbzl zzbzlVar, zzbze zzbzeVar, zzfka zzfkaVar) {
        this.zza = bVar;
        this.zzb = zzbzlVar;
        this.zzc = zzbzeVar;
        this.zzd = zzfkaVar;
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "SignalGeneratorImpl.generateSignals");
        }
        zzfkl zzr = zzap.zzr(this.zza, this.zzb);
        if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
            zzfka zzfkaVar = this.zzd;
            zzfkaVar.zzh(th2);
            zzfkaVar.zzg(false);
            zzr.zza(zzfkaVar);
            zzr.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        AtomicBoolean atomicBoolean;
        boolean z10;
        boolean z11;
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
        zzfkl zzr = zzap.zzr(this.zza, this.zzb);
        atomicBoolean = this.zze.zzG;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhm)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e2.toString()));
            }
            if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                zzfka zzfkaVar = this.zzd;
                zzfkaVar.zzc("QueryInfo generation has been disabled.");
                zzfkaVar.zzg(false);
                zzr.zza(zzfkaVar);
                zzr.zzh();
                return;
            }
            return;
        }
        try {
            try {
                if (zzbdVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzg(true);
                    if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzh();
                        return;
                    }
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzbdVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfka zzfkaVar2 = this.zzd;
                        zzfkaVar2.zzc("Request ID empty");
                        zzfkaVar2.zzg(false);
                        if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                            zzr.zza(this.zzd);
                            zzr.zzh();
                            return;
                        }
                        return;
                    }
                    Bundle bundle = zzbdVar.zzd;
                    zzap zzapVar = this.zze;
                    z10 = zzapVar.zzu;
                    if (z10 && bundle != null) {
                        str5 = zzapVar.zzw;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzap zzapVar2 = this.zze;
                            str6 = zzapVar2.zzw;
                            atomicInteger = zzapVar2.zzx;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzap zzapVar3 = this.zze;
                    z11 = zzapVar3.zzt;
                    if (z11 && bundle != null) {
                        str = zzapVar3.zzv;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zze.zzz;
                            if (TextUtils.isEmpty(str2)) {
                                zzap zzapVar4 = this.zze;
                                com.google.android.gms.ads.internal.util.zzs zzq = com.google.android.gms.ads.internal.zzv.zzq();
                                zzap zzapVar5 = this.zze;
                                context = zzapVar5.zzg;
                                versionInfoParcel = zzapVar5.zzy;
                                zzapVar4.zzz = zzq.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzap zzapVar6 = this.zze;
                            str3 = zzapVar6.zzv;
                            str4 = zzapVar6.zzz;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzbdVar.zza, zzbdVar.zzb, bundle);
                    this.zzd.zzg(true);
                    if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzh();
                    }
                } catch (JSONException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e10.toString());
                    zzfka zzfkaVar3 = this.zzd;
                    zzfkaVar3.zzh(e10);
                    zzfkaVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzh();
                    }
                }
            } catch (RemoteException e11) {
                zzfka zzfkaVar4 = this.zzd;
                zzfkaVar4.zzh(e11);
                zzfkaVar4.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e11);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzh();
                }
            }
        } catch (Throwable th2) {
            if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzh();
            }
            throw th2;
        }
    }
}
