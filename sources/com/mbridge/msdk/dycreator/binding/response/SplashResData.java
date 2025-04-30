package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes3.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f15223a;
    private EAction b;

    public a getBaseViewData() {
        return this.f15223a;
    }

    public EAction geteAction() {
        return this.b;
    }

    public void setBaseViewData(a aVar) {
        this.f15223a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.b = eAction;
    }
}
