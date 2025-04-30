package com.bytedance.adsdk.lottie.KS;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class QR<T> {
    T lMd;
    T zp;

    private static boolean lMd(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!lMd(pair.first, this.zp) || !lMd(pair.second, this.lMd)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t9 = this.zp;
        int i9 = 0;
        if (t9 == null) {
            hashCode = 0;
        } else {
            hashCode = t9.hashCode();
        }
        T t10 = this.lMd;
        if (t10 != null) {
            i9 = t10.hashCode();
        }
        return hashCode ^ i9;
    }

    public String toString() {
        return "Pair{" + this.zp + " " + this.lMd + "}";
    }

    public void zp(T t9, T t10) {
        this.zp = t9;
        this.lMd = t10;
    }
}
