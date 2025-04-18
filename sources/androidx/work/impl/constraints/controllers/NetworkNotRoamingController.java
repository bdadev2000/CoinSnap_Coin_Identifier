package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.model.WorkSpec;

/* loaded from: classes4.dex */
public class NetworkNotRoamingController extends ConstraintController<NetworkState> {
    static {
        Logger.e("NetworkNotRoamingCtrlr");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean b(WorkSpec workSpec) {
        return workSpec.f22153j.f21854a == NetworkType.d;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public final boolean c(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        return (networkState.f22070a && networkState.d) ? false : true;
    }
}
