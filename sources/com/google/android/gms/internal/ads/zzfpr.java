package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfpr implements zzfpo {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfpy.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfpy.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final void zzb(View view, JSONObject jSONObject, zzfpn zzfpnVar, boolean z8, boolean z9) {
        int i9;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z8) {
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i11));
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        i9 = i11 + 1;
                        if (i12 < size2) {
                            zzfpnVar.zza((View) arrayList3.get(i12), this, jSONObject, z9);
                            i12++;
                        }
                    }
                    i11 = i9;
                }
                return;
            }
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                zzfpnVar.zza(viewGroup.getChildAt(i13), this, jSONObject, z9);
            }
        }
    }
}
