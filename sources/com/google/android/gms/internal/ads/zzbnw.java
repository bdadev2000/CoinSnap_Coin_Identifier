package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbnw implements zzbmo, zzbnv {
    private final zzbnv zza;
    private final HashSet zzb = new HashSet();

    public zzbnw(zzbnv zzbnvVar) {
        this.zza = zzbnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmy
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbmn.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjr) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbjr) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbmn.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmo, com.google.android.gms.internal.ads.zzbmm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbmn.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbmn.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzq(String str, zzbjr zzbjrVar) {
        this.zza.zzq(str, zzbjrVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjrVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(String str, zzbjr zzbjrVar) {
        this.zza.zzr(str, zzbjrVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjrVar));
    }
}
