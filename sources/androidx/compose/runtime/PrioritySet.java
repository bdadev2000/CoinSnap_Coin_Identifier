package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.u;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PrioritySet {

    /* renamed from: a, reason: collision with root package name */
    public final List f13855a = new ArrayList();

    public final void a(int i2) {
        List list = this.f13855a;
        if ((!list.isEmpty()) && (((Number) list.get(0)).intValue() == i2 || ((Number) androidx.compose.foundation.text.input.a.g(list, 1)).intValue() == i2)) {
            return;
        }
        int size = list.size();
        list.add(Integer.valueOf(i2));
        while (size > 0) {
            int i3 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) list.get(i3)).intValue();
            if (i2 <= intValue) {
                break;
            }
            list.set(size, Integer.valueOf(intValue));
            size = i3;
        }
        list.set(size, Integer.valueOf(i2));
    }

    public final int b() {
        int intValue;
        List list = this.f13855a;
        if (!(list.size() > 0)) {
            ComposerKt.c("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, u.L0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i2 = 0;
            while (i2 < size2) {
                int intValue3 = ((Number) list.get(i2)).intValue();
                int i3 = (i2 + 1) * 2;
                int i4 = i3 - 1;
                int intValue4 = ((Number) list.get(i4)).intValue();
                if (i3 >= size || (intValue = ((Number) list.get(i3)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i2, Integer.valueOf(intValue4));
                        list.set(i4, Integer.valueOf(intValue3));
                        i2 = i4;
                    }
                } else if (intValue > intValue3) {
                    list.set(i2, Integer.valueOf(intValue));
                    list.set(i3, Integer.valueOf(intValue3));
                    i2 = i3;
                }
            }
        }
        return intValue2;
    }
}
