package f2;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public final View f17585b;
    public final HashMap a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17586c = new ArrayList();

    public c0(View view) {
        this.f17585b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f17585b == c0Var.f17585b && this.a.equals(c0Var.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.f17585b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder n10 = eb.j.n("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        n10.append(this.f17585b);
        n10.append("\n");
        String k10 = eb.j.k(n10.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            k10 = k10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return k10;
    }
}
