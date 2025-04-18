package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzdvf {
    private final zzdup zza;
    private final zzdqa zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdvf(zzdup zzdupVar, zzdqa zzdqaVar) {
        this.zza = zzdupVar;
        this.zzb = zzdqaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z10;
        zzdpz zza;
        zzbru zzbruVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblp zzblpVar = (zzblp) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziV)).booleanValue()) {
                    zzdpz zza2 = this.zzb.zza(zzblpVar.zza);
                    if (zza2 != null && (zzbruVar = zza2.zzc) != null) {
                        str = zzbruVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziW)).booleanValue() && (zza = this.zzb.zza(zzblpVar.zza)) != null && zza.zzd) {
                    z10 = true;
                    List list2 = this.zzd;
                    String str3 = zzblpVar.zza;
                    list2.add(new zzdve(str3, str2, this.zzb.zzb(str3), zzblpVar.zzb ? 1 : 0, zzblpVar.zzd, zzblpVar.zzc, z10));
                }
                z10 = false;
                List list22 = this.zzd;
                String str32 = zzblpVar.zza;
                list22.add(new zzdve(str32, str2, this.zzb.zzb(str32), zzblpVar.zzb ? 1 : 0, zzblpVar.zzd, zzblpVar.zzc, z10));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdve) it.next()).zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdvd(this));
    }
}
