package android.support.v4.media;

import android.content.ComponentName;
import b1.z;
import g1.n;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* renamed from: b, reason: collision with root package name */
    public Object f94b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95c;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.f93a = i2;
        this.f95c = obj;
        this.f94b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f93a;
        Object obj = this.f95c;
        switch (i2) {
            case 0:
                if (!l.f99b) {
                    d.C(obj);
                    throw null;
                }
                Objects.toString((ComponentName) this.f94b);
                d.C(obj);
                throw null;
            case 1:
                ((b1.k) obj).E((z) this.f94b);
                return;
            case 2:
                ((b1.k) this.f94b).E((c1.e) obj);
                return;
            default:
                int i3 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f94b).run();
                    } catch (Throwable th) {
                        kotlin.jvm.internal.e.o(h0.m.f30726a, th);
                    }
                    n nVar = (n) obj;
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n.f30624i;
                    Runnable l02 = nVar.l0();
                    if (l02 == null) {
                        return;
                    }
                    this.f94b = l02;
                    i3++;
                    if (i3 >= 16) {
                        z zVar = nVar.f30625c;
                        if (zVar.j0(nVar)) {
                            zVar.h0(nVar, this);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i2) {
        this.f93a = i2;
        this.f94b = obj;
        this.f95c = obj2;
    }
}
