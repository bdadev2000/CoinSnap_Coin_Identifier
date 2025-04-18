package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzevk implements zzevz {
    private final zzbyv zza;
    private final zzges zzb;
    private final Context zzc;

    public zzevk(zzbyv zzbyvVar, zzges zzgesVar, Context context) {
        this.zza = zzbyvVar;
        this.zzb = zzgesVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevk.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzevl zzc() throws Exception {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!this.zza.zzp(this.zzc)) {
            return new zzevl(null, null, null, null, null);
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
        Long l10 = null;
        if (true != this.zza.zzp(this.zzc)) {
            str4 = null;
        } else {
            str4 = "fa";
        }
        if ("TIME_OUT".equals(str2)) {
            l10 = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaq);
        }
        Long l11 = l10;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        return new zzevl(str, str2, str3, str5, l11);
    }
}
