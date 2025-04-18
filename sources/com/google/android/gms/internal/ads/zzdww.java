package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class zzdww {
    private final zzdwg zza;
    private final zzdrr zzb;
    private final Object zzc = new Object();

    @GuardedBy
    private final List zzd = new ArrayList();

    @GuardedBy
    private boolean zze;

    public zzdww(zzdwg zzdwgVar, zzdrr zzdrrVar) {
        this.zza = zzdwgVar;
        this.zzb = zzdrrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        zzdrq zza;
        zzbrz zzbrzVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblu zzbluVar = (zzblu) it.next();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziT)).booleanValue()) {
                        zzdrq zza2 = this.zzb.zza(zzbluVar.zza);
                        if (zza2 != null && (zzbrzVar = zza2.zzc) != null) {
                            str = zzbrzVar.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziU)).booleanValue() && (zza = this.zzb.zza(zzbluVar.zza)) != null && zza.zzd;
                    List list2 = this.zzd;
                    String str3 = zzbluVar.zza;
                    list2.add(new zzdwv(str3, str2, this.zzb.zzb(str3), zzbluVar.zzb ? 1 : 0, zzbluVar.zzd, zzbluVar.zzc, z2));
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
                    jSONArray.put(((zzdwv) it.next()).zza());
                }
            } finally {
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdwu(this));
    }
}
