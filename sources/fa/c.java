package fa;

import android.window.OnBackInvokedCallback;
import androidx.activity.t;
import java.util.Objects;

/* loaded from: classes3.dex */
public class c {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(b bVar) {
        Objects.requireNonNull(bVar);
        return new t(bVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(@androidx.annotation.NonNull fa.b r2, @androidx.annotation.NonNull android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 == 0) goto L5
            return
        L5:
            android.window.OnBackInvokedDispatcher r3 = androidx.activity.j.l(r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.a = r2
            if (r4 == 0) goto L18
            r4 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r4 = 0
        L19:
            androidx.activity.j.u(r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.c.b(fa.b, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(@androidx.annotation.NonNull android.view.View r2) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 != 0) goto L5
            return
        L5:
            android.window.OnBackInvokedDispatcher r2 = androidx.activity.j.l(r2)
            if (r2 != 0) goto Lc
            return
        Lc:
            android.window.OnBackInvokedCallback r0 = r1.a
            androidx.activity.j.v(r2, r0)
            r2 = 0
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.c.c(android.view.View):void");
    }
}
