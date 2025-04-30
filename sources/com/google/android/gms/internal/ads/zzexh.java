package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexh implements zzexw {
    private final zzcau zza;
    private final zzgge zzb;
    private final Context zzc;

    public zzexh(zzcau zzcauVar, zzgge zzggeVar, Context context) {
        this.zza = zzcauVar;
        this.zzb = zzggeVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexh.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzexi zzc() throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!this.zza.zzp(this.zzc)) {
            return new zzexi(null, null, null, null, null);
        }
        String zzd = this.zza.zzd(this.zzc);
        if (zzd == null) {
            str = "";
        } else {
            str = zzd;
        }
        String zzb = this.zza.zzb(this.zzc);
        if (zzb == null) {
            str2 = "";
        } else {
            str2 = zzb;
        }
        String zza = this.zza.zza(this.zzc);
        if (zza == null) {
            str3 = "";
        } else {
            str3 = zza;
        }
        Long l = null;
        if (true != this.zza.zzp(this.zzc)) {
            str4 = null;
        } else {
            str4 = "fa";
        }
        if ("TIME_OUT".equals(str2)) {
            l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzag);
        }
        Long l2 = l;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        return new zzexi(str, str2, str3, str5, l2);
    }
}
