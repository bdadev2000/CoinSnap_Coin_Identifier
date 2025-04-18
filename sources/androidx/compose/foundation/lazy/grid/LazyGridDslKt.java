package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r27, int r28, androidx.compose.foundation.gestures.FlingBehavior r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.foundation.layout.PaddingValues r32, androidx.compose.foundation.lazy.grid.GridCells r33, androidx.compose.foundation.lazy.grid.LazyGridState r34, androidx.compose.runtime.Composer r35, androidx.compose.ui.Modifier r36, q0.l r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.a(int, int, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, q0.l, boolean, boolean):void");
    }

    public static final ArrayList b(int i2, int i3, int i4) {
        int i5 = i2 - ((i3 - 1) * i4);
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }
}
