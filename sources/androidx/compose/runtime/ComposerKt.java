package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionImpl;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ComposerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final OpaqueKey f13728a = new OpaqueKey("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final OpaqueKey f13729b = new OpaqueKey("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final OpaqueKey f13730c = new OpaqueKey("compositionLocalMap");
    public static final OpaqueKey d = new OpaqueKey("providers");
    public static final OpaqueKey e = new OpaqueKey("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final a f13731f = new Object();

    public static final void a(int i2, int i3, ArrayList arrayList) {
        int f2 = f(i2, arrayList);
        if (f2 < 0) {
            f2 = -(f2 + 1);
        }
        while (f2 < arrayList.size() && ((Invalidation) arrayList.get(f2)).f13810b < i3) {
            arrayList.remove(f2);
        }
    }

    public static final void b(SlotReader slotReader, ArrayList arrayList, int i2) {
        int[] iArr = slotReader.f13978b;
        if (SlotTableKt.f(i2, iArr)) {
            arrayList.add(slotReader.i(i2));
            return;
        }
        int c2 = SlotTableKt.c(i2, iArr) + i2;
        for (int i3 = i2 + 1; i3 < c2; i3 += iArr[(i3 * 5) + 3]) {
            b(slotReader, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new ComposeRuntimeError(androidx.compose.foundation.text.input.a.A("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void d(String str) {
        throw new ComposeRuntimeError(androidx.compose.foundation.text.input.a.A("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(SlotWriter slotWriter, RememberManager rememberManager) {
        int i2;
        int i3;
        int i4 = slotWriter.f14018t;
        int i5 = slotWriter.f14019u;
        while (i4 < i5) {
            Object z2 = slotWriter.z(i4);
            if (z2 instanceof ComposeNodeLifecycleCallback) {
                CompositionImpl.RememberEventDispatcher rememberEventDispatcher = (CompositionImpl.RememberEventDispatcher) rememberManager;
                rememberEventDispatcher.g(slotWriter.o() - slotWriter.I(slotWriter.p(i4), slotWriter.f14002b), -1, -1, (ComposeNodeLifecycleCallback) z2);
            }
            int I = slotWriter.I(slotWriter.p(i4), slotWriter.f14002b);
            int i6 = i4 + 1;
            int f2 = slotWriter.f(slotWriter.p(i6), slotWriter.f14002b);
            for (int i7 = I; i7 < f2; i7++) {
                int i8 = i7 - I;
                Object obj = slotWriter.f14003c[slotWriter.g(i7)];
                boolean z3 = obj instanceof RememberObserverHolder;
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
                if (z3) {
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    RememberObserver rememberObserver = rememberObserverHolder.f13970a;
                    if (rememberObserver instanceof ReusableRememberObserver) {
                        continue;
                    } else {
                        int g2 = slotWriter.g(slotWriter.J(i4, i8));
                        Object[] objArr = slotWriter.f14003c;
                        Object obj2 = objArr[g2];
                        objArr[g2] = composer$Companion$Empty$1;
                        if (obj != obj2) {
                            c("Slot table is out of sync");
                            throw null;
                        }
                        int o2 = slotWriter.o() - i8;
                        Anchor anchor = rememberObserverHolder.f13971b;
                        if (anchor == null || !anchor.a()) {
                            i2 = -1;
                            i3 = -1;
                        } else {
                            i2 = slotWriter.c(anchor);
                            i3 = slotWriter.o() - slotWriter.f(slotWriter.p(slotWriter.q(i2) + i2), slotWriter.f14002b);
                        }
                        ((CompositionImpl.RememberEventDispatcher) rememberManager).g(o2, i2, i3, rememberObserver);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    int g3 = slotWriter.g(slotWriter.J(i4, i8));
                    Object[] objArr2 = slotWriter.f14003c;
                    Object obj3 = objArr2[g3];
                    objArr2[g3] = composer$Companion$Empty$1;
                    if (obj != obj3) {
                        c("Slot table is out of sync");
                        throw null;
                    }
                    ((RecomposeScopeImpl) obj).d();
                } else {
                    continue;
                }
            }
            i4 = i6;
        }
    }

    public static final int f(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int E = p0.a.E(((Invalidation) arrayList.get(i4)).f13810b, i2);
            if (E < 0) {
                i3 = i4 + 1;
            } else {
                if (E <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void g(SlotWriter slotWriter, RememberManager rememberManager) {
        int i2;
        int i3;
        int[] iArr = slotWriter.f14002b;
        int i4 = slotWriter.f14018t;
        int f2 = slotWriter.f(slotWriter.p(slotWriter.q(i4) + i4), iArr);
        for (int f3 = slotWriter.f(slotWriter.p(slotWriter.f14018t), slotWriter.f14002b); f3 < f2; f3++) {
            Object obj = slotWriter.f14003c[slotWriter.g(f3)];
            if (obj instanceof ComposeNodeLifecycleCallback) {
                ((CompositionImpl.RememberEventDispatcher) rememberManager).h((ComposeNodeLifecycleCallback) obj, slotWriter.o() - f3);
            }
            if (obj instanceof RememberObserverHolder) {
                int o2 = slotWriter.o() - f3;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor anchor = rememberObserverHolder.f13971b;
                if (anchor == null || !anchor.a()) {
                    i2 = -1;
                    i3 = -1;
                } else {
                    i2 = slotWriter.c(anchor);
                    i3 = slotWriter.o() - slotWriter.f(slotWriter.p(slotWriter.q(i2) + i2), slotWriter.f14002b);
                }
                ((CompositionImpl.RememberEventDispatcher) rememberManager).g(o2, i2, i3, rememberObserverHolder.f13970a);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).d();
            }
        }
        slotWriter.D();
    }

    public static final void h(boolean z2) {
        if (z2) {
            return;
        }
        c("Check failed");
        throw null;
    }
}
