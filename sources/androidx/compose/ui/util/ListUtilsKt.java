package androidx.compose.ui.util;

import java.util.List;
import q0.l;

/* loaded from: classes3.dex */
public final class ListUtilsKt {
    public static String a(List list, String str, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        CharSequence charSequence = (i2 & 2) != 0 ? "" : null;
        String str2 = (i2 & 4) == 0 ? null : "";
        int i3 = (i2 & 8) != 0 ? -1 : 0;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(obj));
            } else if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append((CharSequence) str3);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }
}
