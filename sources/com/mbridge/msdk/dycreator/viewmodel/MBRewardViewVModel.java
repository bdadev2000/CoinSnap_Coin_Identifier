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

/* loaded from: classes3.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f15284a;
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private f f15285c;

    /* renamed from: d, reason: collision with root package name */
    private h f15286d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f15287e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f15288f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f15288f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f15287e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f15284a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f15287e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f15285c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f15288f);
        d dVar = this.f15284a;
        if (dVar != null) {
            dVar.a(aVar);
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(aVar);
        }
        f fVar = this.f15285c;
        if (fVar != null) {
            fVar.a(aVar);
        }
        h hVar = this.f15286d;
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f15286d = hVar;
        }
    }
}
