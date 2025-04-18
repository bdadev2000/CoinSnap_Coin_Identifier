package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzfpq implements zzfpn {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfpx.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfpx.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zzb(View view, JSONObject jSONObject, zzfpm zzfpmVar, boolean z2, boolean z3) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z2) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzfpmVar.zza(viewGroup.getChildAt(i3), this, jSONObject, z3);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
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
            int i5 = 0;
            while (i5 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i5));
                int size2 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    i2 = i5 + 1;
                    if (i6 < size2) {
                        zzfpmVar.zza((View) arrayList3.get(i6), this, jSONObject, z3);
                        i6++;
                    }
                }
                i5 = i2;
            }
        }
    }
}
