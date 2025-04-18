package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public class SplashResData extends BaseRespData {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f12874b;

    public a getBaseViewData() {
        return this.a;
    }

    public EAction geteAction() {
        return this.f12874b;
    }

    public void setBaseViewData(a aVar) {
        this.a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f12874b = eAction;
    }
}
