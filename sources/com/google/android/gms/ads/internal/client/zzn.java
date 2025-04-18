package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzn {
    private Bundle zza = new Bundle();
    private List zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List zzj = new ArrayList();
    private int zzk = 60000;
    private final int zzl = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final zzm zza() {
        Bundle bundle = this.zze;
        Bundle bundle2 = this.zza;
        Bundle bundle3 = this.zzf;
        return new zzm(8, -1L, bundle2, -1, this.zzb, this.zzc, this.zzd, false, null, null, null, null, bundle, bundle3, this.zzg, null, null, false, null, this.zzh, this.zzi, this.zzj, this.zzk, null, this.zzl, this.zzm);
    }

    public final zzn zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzn zzc(int i10) {
        this.zzk = i10;
        return this;
    }

    public final zzn zzd(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzn zze(List list) {
        this.zzb = list;
        return this;
    }

    public final zzn zzf(String str) {
        this.zzi = str;
        return this;
    }

    public final zzn zzg(long j3) {
        this.zzm = j3;
        return this;
    }

    public final zzn zzh(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzn zzi(int i10) {
        this.zzh = i10;
        return this;
    }
}
