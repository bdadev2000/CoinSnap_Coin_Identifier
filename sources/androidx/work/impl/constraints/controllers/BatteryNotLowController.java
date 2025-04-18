package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.WorkSpec;

/* loaded from: classes.dex */
public class BatteryNotLowController extends ConstraintController<Boolean> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.f22153j.d;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        return !((Boolean) obj).booleanValue();
    }
}
