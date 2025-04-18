package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f19898c;

    public /* synthetic */ i(Object obj, SpecialEffectsController.Operation operation, int i2) {
        this.f19896a = i2;
        this.f19897b = obj;
        this.f19898c = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f19896a;
        SpecialEffectsController.Operation operation = this.f19898c;
        Object obj = this.f19897b;
        switch (i2) {
            case 0:
                SpecialEffectsController specialEffectsController = (SpecialEffectsController) obj;
                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation = (SpecialEffectsController.FragmentStateManagerOperation) operation;
                p0.a.s(specialEffectsController, "this$0");
                p0.a.s(fragmentStateManagerOperation, "$operation");
                if (specialEffectsController.f19862b.contains(fragmentStateManagerOperation)) {
                    SpecialEffectsController.Operation.State state = fragmentStateManagerOperation.f19865a;
                    View view = fragmentStateManagerOperation.f19867c.mView;
                    p0.a.r(view, "operation.fragment.mView");
                    state.a(view);
                    return;
                }
                return;
            case 1:
                SpecialEffectsController specialEffectsController2 = (SpecialEffectsController) obj;
                SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation2 = (SpecialEffectsController.FragmentStateManagerOperation) operation;
                p0.a.s(specialEffectsController2, "this$0");
                p0.a.s(fragmentStateManagerOperation2, "$operation");
                specialEffectsController2.f19862b.remove(fragmentStateManagerOperation2);
                specialEffectsController2.f19863c.remove(fragmentStateManagerOperation2);
                return;
            default:
                DefaultSpecialEffectsController.TransitionInfo transitionInfo = (DefaultSpecialEffectsController.TransitionInfo) obj;
                p0.a.s(transitionInfo, "$transitionInfo");
                p0.a.s(operation, "$operation");
                transitionInfo.a();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                    return;
                }
                return;
        }
    }
}
