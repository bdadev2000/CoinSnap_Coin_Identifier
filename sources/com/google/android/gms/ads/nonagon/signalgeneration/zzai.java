package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzgfp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzai implements zzgfp {
    final /* synthetic */ zzaj zza;

    public zzai(zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzdvh zzdvhVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzdvhVar = this.zza.zzp;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        atomicInteger = this.zza.zzH;
        zzp.zzd(zzdvhVar, null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjI)).booleanValue()) {
            atomicBoolean = this.zza.zzG;
            if (!atomicBoolean.get()) {
                atomicInteger2 = this.zza.zzH;
                if (atomicInteger2.getAndIncrement() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjJ)).intValue()) {
                    this.zza.zzT();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        zzdvh zzdvhVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjI)).booleanValue()) {
            zzdvhVar = this.zza.zzp;
            Pair pair = new Pair("se", "query_g");
            Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
            Pair pair3 = new Pair("rtype", Integer.toString(6));
            Pair pair4 = new Pair("scar", "true");
            atomicInteger = this.zza.zzH;
            zzp.zzd(zzdvhVar, null, "sgs", pair, pair2, pair3, pair4, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzG;
            atomicBoolean.set(true);
        }
    }
}
