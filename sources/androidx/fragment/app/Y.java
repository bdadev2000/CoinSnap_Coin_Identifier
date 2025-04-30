package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2816g;
import u7.AbstractC2822m;

/* loaded from: classes.dex */
public final class Y extends f.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(FragmentManager fragmentManager) {
        super(false);
        this.f4691d = fragmentManager;
    }

    @Override // f.o
    public final void a() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        FragmentManager fragmentManager = this.f4691d;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + fragmentManager);
        }
        if (FragmentManager.USE_PREDICTIVE_BACK) {
            fragmentManager.cancelBackStackTransition();
            fragmentManager.mTransitioningOp = null;
        }
    }

    @Override // f.o
    public final void b() {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        FragmentManager fragmentManager = this.f4691d;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + fragmentManager);
        }
        fragmentManager.handleOnBackPressed();
    }

    @Override // f.o
    public final void c(f.b bVar) {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(2);
        FragmentManager fragmentManager = this.f4691d;
        if (isLoggingEnabled) {
            Log.v(FragmentManager.TAG, "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + fragmentManager);
        }
        if (fragmentManager.mTransitioningOp != null) {
            for (r rVar : fragmentManager.collectChangedControllers(new ArrayList<>(Collections.singletonList(fragmentManager.mTransitioningOp)), 0, 1)) {
                rVar.getClass();
                G7.j.e(bVar, "backEvent");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Processing Progress " + bVar.f20211c);
                }
                ArrayList arrayList = rVar.f4772c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC2822m.G(((L0) it.next()).f4675k, arrayList2);
                }
                List T2 = AbstractC2816g.T(AbstractC2816g.V(arrayList2));
                int size = T2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((K0) T2.get(i9)).d(bVar, rVar.f4771a);
                }
            }
            Iterator<InterfaceC0470j0> it2 = fragmentManager.mBackStackChangeListeners.iterator();
            if (it2.hasNext()) {
                com.mbridge.msdk.foundation.entity.o.v(it2.next());
                throw null;
            }
        }
    }

    @Override // f.o
    public final void d(f.b bVar) {
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        FragmentManager fragmentManager = this.f4691d;
        if (isLoggingEnabled) {
            Log.d(FragmentManager.TAG, "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + fragmentManager);
        }
        if (FragmentManager.USE_PREDICTIVE_BACK) {
            fragmentManager.endAnimatingAwayFragments();
            fragmentManager.prepareBackStackTransition();
        }
    }
}
