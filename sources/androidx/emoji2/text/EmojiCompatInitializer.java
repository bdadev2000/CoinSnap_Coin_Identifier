package androidx.emoji2.text;

import J0.a;
import J0.b;
import T1.C0300f;
import android.content.Context;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import j0.j;
import j0.k;
import j0.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // J0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void b(Context context) {
        Object obj;
        q qVar = new q(new C0300f(context));
        qVar.b = 1;
        if (j.f20971k == null) {
            synchronized (j.f20970j) {
                try {
                    if (j.f20971k == null) {
                        j.f20971k = new j(qVar);
                    }
                } finally {
                }
            }
        }
        a c9 = a.c(context);
        c9.getClass();
        synchronized (a.f1482e) {
            try {
                obj = c9.f1483a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c9.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0505o lifecycle = ((InterfaceC0511v) obj).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
    }

    @Override // J0.b
    public final /* bridge */ /* synthetic */ Object create(Context context) {
        b(context);
        return Boolean.TRUE;
    }
}
