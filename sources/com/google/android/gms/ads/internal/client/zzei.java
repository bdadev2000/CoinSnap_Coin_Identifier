package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzei {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final Map zze;
    private final String zzf;
    private final String zzg;

    @Nullable
    private final SearchAdRequest zzh;
    private final int zzi;
    private final Set zzj;
    private final Bundle zzk;
    private final Set zzl;
    private final boolean zzm;
    private final String zzn;
    private final int zzo;
    private long zzp = 0;

    public zzei(zzeh zzehVar, @Nullable SearchAdRequest searchAdRequest) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i10;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z10;
        String str4;
        int i11;
        str = zzehVar.zzg;
        this.zza = str;
        list = zzehVar.zzh;
        this.zzb = list;
        hashSet = zzehVar.zza;
        this.zzc = Collections.unmodifiableSet(hashSet);
        bundle = zzehVar.zzb;
        this.zzd = bundle;
        hashMap = zzehVar.zzc;
        this.zze = Collections.unmodifiableMap(hashMap);
        str2 = zzehVar.zzi;
        this.zzf = str2;
        str3 = zzehVar.zzj;
        this.zzg = str3;
        this.zzh = searchAdRequest;
        i10 = zzehVar.zzk;
        this.zzi = i10;
        hashSet2 = zzehVar.zzd;
        this.zzj = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzehVar.zze;
        this.zzk = bundle2;
        hashSet3 = zzehVar.zzf;
        this.zzl = Collections.unmodifiableSet(hashSet3);
        z10 = zzehVar.zzl;
        this.zzm = z10;
        str4 = zzehVar.zzm;
        this.zzn = str4;
        i11 = zzehVar.zzn;
        this.zzo = i11;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzp;
    }

    @Nullable
    public final Bundle zzd(Class cls) {
        Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzk;
    }

    @Nullable
    public final Bundle zzf(Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.zze.get(cls);
    }

    @Nullable
    public final SearchAdRequest zzi() {
        return this.zzh;
    }

    @Nullable
    public final String zzj() {
        return this.zzn;
    }

    public final String zzk() {
        return this.zza;
    }

    public final String zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final List zzn() {
        return new ArrayList(this.zzb);
    }

    public final Set zzo() {
        return this.zzl;
    }

    public final Set zzp() {
        return this.zzc;
    }

    public final void zzq(long j3) {
        this.zzp = j3;
    }

    @Deprecated
    public final boolean zzr() {
        return this.zzm;
    }

    public final boolean zzs(Context context) {
        RequestConfiguration zzc = zzex.zzf().zzc();
        zzbc.zzb();
        Set set = this.zzj;
        String zzz = com.google.android.gms.ads.internal.util.client.zzf.zzz(context);
        if (!set.contains(zzz) && !zzc.getTestDeviceIds().contains(zzz)) {
            return false;
        }
        return true;
    }
}
