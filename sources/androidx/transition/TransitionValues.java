package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TransitionValues {

    /* renamed from: b, reason: collision with root package name */
    public View f21618b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21617a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21619c = new ArrayList();

    public TransitionValues(View view) {
        this.f21618b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.f21618b == transitionValues.f21618b && this.f21617a.equals(transitionValues.f21617a);
    }

    public final int hashCode() {
        return this.f21617a.hashCode() + (this.f21618b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder B = androidx.compose.foundation.text.input.a.B("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        B.append(this.f21618b);
        B.append("\n");
        String j2 = androidx.compose.foundation.text.input.a.j(B.toString(), "    values:");
        HashMap hashMap = this.f21617a;
        for (String str : hashMap.keySet()) {
            j2 = j2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return j2;
    }
}
