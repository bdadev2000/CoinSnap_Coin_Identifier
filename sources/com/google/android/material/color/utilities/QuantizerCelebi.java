package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestrictTo
/* loaded from: classes3.dex */
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i2) {
        Set<Integer> keySet = new QuantizerWu().quantize(iArr, i2).colorToCount.keySet();
        int[] iArr2 = new int[keySet.size()];
        Iterator<Integer> it = keySet.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr2[i3] = it.next().intValue();
            i3++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i2);
    }
}
