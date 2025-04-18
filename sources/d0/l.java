package d0;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class l {
    public final String a;

    public l(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                ba.a.i();
                ba.a.c(str);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        String str = ((l) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
