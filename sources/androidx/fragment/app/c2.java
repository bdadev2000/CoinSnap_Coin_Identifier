package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract class c2 {
    public b2 a;

    /* renamed from: b, reason: collision with root package name */
    public a2 f1595b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f1596c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1597d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1598e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1599f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1600g;

    public c2(b2 finalState, a2 lifecycleImpact, Fragment fragment, j0.e cancellationSignal) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.a = finalState;
        this.f1595b = lifecycleImpact;
        this.f1596c = fragment;
        this.f1597d = new ArrayList();
        this.f1598e = new LinkedHashSet();
        cancellationSignal.a(new androidx.core.app.h(this, 2));
    }

    public final void a() {
        if (this.f1599f) {
            return;
        }
        this.f1599f = true;
        if (this.f1598e.isEmpty()) {
            b();
            return;
        }
        for (j0.e eVar : CollectionsKt.toMutableSet(this.f1598e)) {
            synchronized (eVar) {
                if (!eVar.a) {
                    eVar.a = true;
                    eVar.f19710c = true;
                    j0.d dVar = eVar.f19709b;
                    if (dVar != null) {
                        try {
                            dVar.d();
                        } catch (Throwable th2) {
                            synchronized (eVar) {
                                eVar.f19710c = false;
                                eVar.notifyAll();
                                throw th2;
                            }
                        }
                    }
                    synchronized (eVar) {
                        eVar.f19710c = false;
                        eVar.notifyAll();
                    }
                }
            }
        }
    }

    public abstract void b();

    public final void c(b2 finalState, a2 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        b2 b2Var = b2.REMOVED;
        Fragment fragment = this.f1596c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.f1595b + " to REMOVING.");
                    }
                    this.a = b2Var;
                    this.f1595b = a2.REMOVING;
                    return;
                }
                return;
            }
            if (this.a == b2Var) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1595b + " to ADDING.");
                }
                this.a = b2.VISIBLE;
                this.f1595b = a2.ADDING;
                return;
            }
            return;
        }
        if (this.a != b2Var) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> " + finalState + '.');
            }
            this.a = finalState;
        }
    }

    public abstract void d();

    public final String toString() {
        StringBuilder o10 = a4.j.o("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        o10.append(this.a);
        o10.append(" lifecycleImpact = ");
        o10.append(this.f1595b);
        o10.append(" fragment = ");
        o10.append(this.f1596c);
        o10.append(AbstractJsonLexerKt.END_OBJ);
        return o10.toString();
    }
}
