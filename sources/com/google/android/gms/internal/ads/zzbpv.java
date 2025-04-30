package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbpv implements zzbom, zzbpu {
    private final zzbpu zza;
    private final HashSet zzb = new HashSet();

    public zzbpv(zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom, com.google.android.gms.internal.ads.zzbox
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbom, com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbol.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzblp) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzblp) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbol.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbom, com.google.android.gms.internal.ads.zzbok
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbol.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbol.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, zzblp zzblpVar) {
        this.zza.zzq(str, zzblpVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(String str, zzblp zzblpVar) {
        this.zza.zzr(str, zzblpVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzblpVar));
    }
}
