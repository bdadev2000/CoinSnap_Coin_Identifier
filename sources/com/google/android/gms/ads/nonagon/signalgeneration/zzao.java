package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzdui;
import com.google.android.gms.internal.ads.zzgfk;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzao implements zzgfk {
    final /* synthetic */ zzap zza;

    public zzao(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzdui zzduiVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzduiVar = this.zza.zzp;
        atomicInteger = this.zza.zzH;
        zzv.zzd(zzduiVar, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjl)).booleanValue()) {
            atomicBoolean = this.zza.zzG;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.zza.zzH;
            if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjm)).intValue()) {
                this.zza.zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        zzdui zzduiVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjl)).booleanValue()) {
            zzduiVar = this.zza.zzp;
            atomicInteger = this.zza.zzH;
            zzv.zzd(zzduiVar, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzG;
            atomicBoolean.set(true);
        }
    }
}
