package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfpp implements zzfpn {
    private final zzfpn zza;

    public zzfpp(zzfpn zzfpnVar) {
        this.zza = zzfpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final JSONObject zza(View view) {
        JSONObject zza = zzfpx.zza(0, 0, 0, 0);
        int zzb = zzfqa.zzb();
        int i2 = zzb - 1;
        if (zzb == 0) {
            throw null;
        }
        try {
            zza.put("noOutputDevice", i2 == 0);
        } catch (JSONException e) {
            zzfpy.zza("Error with setting output device status", e);
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzb(View view, JSONObject jSONObject, zzfpm zzfpmVar, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        zzfpd zza = zzfpd.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfom) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z4 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i2 = size2 - 1;
                                    if (((View) arrayList.get(i2)).getZ() <= z4) {
                                        break;
                                    } else {
                                        size2 = i2;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zzfpmVar.zza((View) arrayList.get(i3), this.zza, jSONObject, z3);
        }
    }
}
