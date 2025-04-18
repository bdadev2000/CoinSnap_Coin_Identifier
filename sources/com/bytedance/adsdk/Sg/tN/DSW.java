package com.bytedance.adsdk.Sg.tN;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DSW<T> {
    T Sg;
    T YFl;

    private static boolean Sg(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void YFl(T t5, T t10) {
        this.YFl = t5;
        this.Sg = t10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!Sg(pair.first, this.YFl) || !Sg(pair.second, this.Sg)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t5 = this.YFl;
        int hashCode = t5 == null ? 0 : t5.hashCode();
        T t10 = this.Sg;
        return hashCode ^ (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.YFl + " " + this.Sg + "}";
    }
}
