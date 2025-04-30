package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfpq implements zzfpo {
    private final zzfpo zza;

    public zzfpq(zzfpo zzfpoVar) {
        this.zza = zzfpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final JSONObject zza(View view) {
        boolean z8 = false;
        JSONObject zza = zzfpy.zza(0, 0, 0, 0);
        int zzb = zzfqb.zzb();
        int i9 = zzb - 1;
        if (zzb != 0) {
            if (i9 == 0) {
                z8 = true;
            }
            try {
                zza.put("noOutputDevice", z8);
            } catch (JSONException e4) {
                zzfpz.zza("Error with setting output device status", e4);
            }
            return zza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final void zzb(View view, JSONObject jSONObject, zzfpn zzfpnVar, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        zzfpe zza = zzfpe.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfon) it.next()).zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z10 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i9 = size2 - 1;
                                    if (((View) arrayList.get(i9)).getZ() <= z10) {
                                        break;
                                    } else {
                                        size2 = i9;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            zzfpnVar.zza((View) arrayList.get(i10), this.zza, jSONObject, z9);
        }
    }
}
