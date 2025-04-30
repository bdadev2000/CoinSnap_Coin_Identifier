package I;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1394a;

    public m(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1394a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                l.a(str);
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
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        String str = ((m) obj).f1394a;
        String str2 = this.f1394a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f1394a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f1394a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
