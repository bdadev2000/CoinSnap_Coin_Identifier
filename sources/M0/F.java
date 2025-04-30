package M0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class F {
    public final View b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1845a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1846c = new ArrayList();

    public F(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            F f9 = (F) obj;
            if (this.b == f9.b && this.f1845a.equals(f9.f1845a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1845a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder c9 = AbstractC2965e.c("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        c9.append(this.b);
        c9.append("\n");
        String j7 = com.mbridge.msdk.foundation.entity.o.j(c9.toString(), "    values:");
        HashMap hashMap = this.f1845a;
        for (String str : hashMap.keySet()) {
            j7 = j7 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return j7;
    }
}
