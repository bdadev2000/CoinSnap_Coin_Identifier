package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzgee;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzao implements zzgee {
    final /* synthetic */ zzap zza;

    public zzao(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzdsr zzdsrVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzdsrVar = this.zza.zzp;
        atomicInteger = this.zza.zzH;
        zzv.zzd(zzdsrVar, null, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjn)).booleanValue()) {
            atomicBoolean = this.zza.zzG;
            if (!atomicBoolean.get()) {
                atomicInteger2 = this.zza.zzH;
                if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjo)).intValue()) {
                    this.zza.zzT();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        zzdsr zzdsrVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjn)).booleanValue()) {
            zzdsrVar = this.zza.zzp;
            atomicInteger = this.zza.zzH;
            zzv.zzd(zzdsrVar, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzG;
            atomicBoolean.set(true);
        }
    }
}
