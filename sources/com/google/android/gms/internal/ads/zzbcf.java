package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbcf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza((zzbce) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbco.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza((zzbce) it.next());
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbco.zzb());
        return zza;
    }

    public final void zzc(zzbce zzbceVar) {
        this.zzb.add(zzbceVar);
    }

    public final void zzd(zzbce zzbceVar) {
        this.zza.add(zzbceVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbce zzbceVar : this.zza) {
            if (zzbceVar.zze() == 1) {
                zzbceVar.zzd(editor, zzbceVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Flag Json is null.");
        }
    }
}
