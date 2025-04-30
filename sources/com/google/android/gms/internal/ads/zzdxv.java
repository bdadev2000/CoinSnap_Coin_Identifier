package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzdxv {
    private final zzdxf zza;
    private final zzdsq zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdxv(zzdxf zzdxfVar, zzdsq zzdsqVar) {
        this.zza = zzdxfVar;
        this.zzb = zzdsqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z8;
        zzdsp zza;
        zzbtt zzbttVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbnn zzbnnVar = (zzbnn) it.next();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjq)).booleanValue()) {
                        zzdsp zza2 = this.zzb.zza(zzbnnVar.zza);
                        if (zza2 != null && (zzbttVar = zza2.zzc) != null) {
                            str = zzbttVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue() || (zza = this.zzb.zza(zzbnnVar.zza)) == null || !zza.zzd) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    List list2 = this.zzd;
                    String str3 = zzbnnVar.zza;
                    list2.add(new zzdxu(str3, str2, this.zzb.zzb(str3), zzbnnVar.zzb ? 1 : 0, zzbnnVar.zzd, zzbnnVar.zzc, z8));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    if (this.zza.zzt()) {
                        zzd(this.zza.zzg());
                    } else {
                        zzc();
                    }
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdxu) it.next()).zza());
                }
            } finally {
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdxt(this));
    }
}
