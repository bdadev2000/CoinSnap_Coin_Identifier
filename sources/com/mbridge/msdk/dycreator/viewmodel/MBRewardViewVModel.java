package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.f.a;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes4.dex */
public class MBRewardViewVModel implements BaseViewModel {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private c f12926b;

    /* renamed from: c, reason: collision with root package name */
    private f f12927c;

    /* renamed from: d, reason: collision with root package name */
    private h f12928d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f12929e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f12930f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f12930f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f12929e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f12926b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f12929e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f12927c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f12930f);
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(aVar);
        }
        c cVar = this.f12926b;
        if (cVar != null) {
            cVar.a(aVar);
        }
        f fVar = this.f12927c;
        if (fVar != null) {
            fVar.a(aVar);
        }
        h hVar = this.f12928d;
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f12928d = hVar;
        }
    }
}
