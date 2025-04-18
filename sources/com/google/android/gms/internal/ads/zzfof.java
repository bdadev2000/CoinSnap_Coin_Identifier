package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfof implements zzfod {
    private final zzfod zza;

    public zzfof(zzfod zzfodVar) {
        this.zza = zzfodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public final JSONObject zza(View view) {
        boolean z10 = false;
        JSONObject zza = zzfon.zza(0, 0, 0, 0);
        int zzb = zzfoq.zzb();
        int i10 = zzb - 1;
        if (zzb != 0) {
            if (i10 == 0) {
                z10 = true;
            }
            try {
                zza.put("noOutputDevice", z10);
            } catch (JSONException e2) {
                zzfoo.zza("Error with setting output device status", e2);
            }
            return zza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfod
    public final void zzb(View view, JSONObject jSONObject, zzfoc zzfocVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfnr zza = zzfnr.zza();
        if (zza != null) {
            Collection zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzb.iterator();
            while (it.hasNext()) {
                View zzf = ((zzfna) it.next()).zzf();
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
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
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
        for (int i11 = 0; i11 < size3; i11++) {
            zzfocVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
