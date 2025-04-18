package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.safedk.android.analytics.events.MaxEvent;
import e1.i1;
import e1.o0;
import e1.t0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20014b;

    /* renamed from: c, reason: collision with root package name */
    public FastSafeIterableMap f20015c;
    public Lifecycle.State d;
    public final WeakReference e;

    /* renamed from: f, reason: collision with root package name */
    public int f20016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20017g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20018h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f20019i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f20020j;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public static final class ObserverWithState {

        /* renamed from: a, reason: collision with root package name */
        public Lifecycle.State f20021a;

        /* renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f20022b;

        public final void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State a2 = event.a();
            Lifecycle.State state = this.f20021a;
            p0.a.s(state, "state1");
            if (a2.compareTo(state) < 0) {
                state = a2;
            }
            this.f20021a = state;
            this.f20022b.c(lifecycleOwner, event);
            this.f20021a = a2;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        p0.a.s(lifecycleOwner, "provider");
        this.f20014b = true;
        this.f20015c = new FastSafeIterableMap();
        Lifecycle.State state = Lifecycle.State.f19988b;
        this.d = state;
        this.f20019i = new ArrayList();
        this.e = new WeakReference(lifecycleOwner);
        this.f20020j = t0.c(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.lifecycle.LifecycleRegistry$ObserverWithState] */
    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        p0.a.s(lifecycleObserver, "observer");
        f("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.f19987a;
        if (state != state2) {
            state2 = Lifecycle.State.f19988b;
        }
        ?? obj = new Object();
        HashMap hashMap = Lifecycling.f20024a;
        boolean z2 = lifecycleObserver instanceof LifecycleEventObserver;
        boolean z3 = lifecycleObserver instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, (LifecycleEventObserver) lifecycleObserver);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) lifecycleObserver, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) lifecycleObserver;
        } else {
            Class<?> cls = lifecycleObserver.getClass();
            if (Lifecycling.b(cls) == 2) {
                Object obj2 = Lifecycling.f20025b.get(cls);
                p0.a.p(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.a((Constructor) list.get(0), lifecycleObserver));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        generatedAdapterArr[i2] = Lifecycling.a((Constructor) list.get(i2), lifecycleObserver);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lifecycleObserver);
            }
        }
        obj.f20022b = reflectiveGenericLifecycleObserver;
        obj.f20021a = state2;
        if (((ObserverWithState) this.f20015c.b(lifecycleObserver, obj)) == null && (lifecycleOwner = (LifecycleOwner) this.e.get()) != null) {
            boolean z4 = this.f20016f != 0 || this.f20017g;
            Lifecycle.State e = e(lifecycleObserver);
            this.f20016f++;
            while (obj.f20021a.compareTo(e) < 0 && this.f20015c.f1309f.containsKey(lifecycleObserver)) {
                this.f20019i.add(obj.f20021a);
                Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                Lifecycle.State state3 = obj.f20021a;
                companion.getClass();
                Lifecycle.Event b2 = Lifecycle.Event.Companion.b(state3);
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + obj.f20021a);
                }
                obj.a(lifecycleOwner, b2);
                ArrayList arrayList = this.f20019i;
                arrayList.remove(arrayList.size() - 1);
                e = e(lifecycleObserver);
            }
            if (!z4) {
                j();
            }
            this.f20016f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final o0 c() {
        return new o0(this.f20020j);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(LifecycleObserver lifecycleObserver) {
        p0.a.s(lifecycleObserver, "observer");
        f("removeObserver");
        this.f20015c.c(lifecycleObserver);
    }

    public final Lifecycle.State e(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        Map.Entry d = this.f20015c.d(lifecycleObserver);
        Lifecycle.State state = (d == null || (observerWithState = (ObserverWithState) d.getValue()) == null) ? null : observerWithState.f20021a;
        ArrayList arrayList = this.f20019i;
        Lifecycle.State state2 = arrayList.isEmpty() ^ true ? (Lifecycle.State) arrayList.get(arrayList.size() - 1) : null;
        Lifecycle.State state3 = this.d;
        p0.a.s(state3, "state1");
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void f(String str) {
        if (this.f20014b) {
            ArchTaskExecutor.a().f1303a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void g(Lifecycle.Event event) {
        p0.a.s(event, MaxEvent.f29810a);
        f("handleLifecycleEvent");
        h(event.a());
    }

    public final void h(Lifecycle.State state) {
        Lifecycle.State state2 = this.d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.f19988b;
        Lifecycle.State state4 = Lifecycle.State.f19987a;
        if (state2 == state3 && state == state4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = state;
        if (this.f20017g || this.f20016f != 0) {
            this.f20018h = true;
            return;
        }
        this.f20017g = true;
        j();
        this.f20017g = false;
        if (this.d == state4) {
            this.f20015c = new FastSafeIterableMap();
        }
    }

    public final void i(Lifecycle.State state) {
        p0.a.s(state, "state");
        f("setCurrentState");
        h(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r7.f20018h = false;
        r7.f20020j.h(r7.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.j():void");
    }
}
