package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.WorkSpec;

/* loaded from: classes4.dex */
public class BatteryChargingController extends ConstraintController<Boolean> {
    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.f22153j.f21855b;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        return !((Boolean) obj).booleanValue();
    }
}
