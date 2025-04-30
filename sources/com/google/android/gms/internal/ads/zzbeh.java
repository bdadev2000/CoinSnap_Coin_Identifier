package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbeh {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbeg) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbeq.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbeg) it.next());
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbeq.zzb());
        return zza;
    }

    public final void zzc(zzbeg zzbegVar) {
        this.zzb.add(zzbegVar);
    }

    public final void zzd(zzbeg zzbegVar) {
        this.zza.add(zzbegVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i9, JSONObject jSONObject) {
        for (zzbeg zzbegVar : this.zza) {
            if (zzbegVar.zze() == 1) {
                zzbegVar.zzd(editor, zzbegVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Flag Json is null.");
        }
    }
}
