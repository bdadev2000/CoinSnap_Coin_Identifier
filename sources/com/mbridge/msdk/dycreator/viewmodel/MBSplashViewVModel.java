package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public class MBSplashViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f15289a;
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private f f15290c;

    /* renamed from: d, reason: collision with root package name */
    private h f15291d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f15292e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f15293f;

    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15294a;

        static {
            int[] iArr = new int[EAction.values().length];
            f15294a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15294a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        String str;
        this.f15293f = dyOption;
        if (dyOption != null && dyOption.getCampaignEx() != null) {
            str = dyOption.getCampaignEx().getCampaignUnitId();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            EventBus.getDefault().register(str, this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        if (this.f15292e != null && splashResData != null) {
            int i9 = AnonymousClass1.f15294a[splashResData.geteAction().ordinal()];
            if (i9 == 1 || i9 == 2) {
                try {
                    String str = "";
                    if (splashResData.getBaseViewData() != null && splashResData.getBaseViewData().getBindData() != null) {
                        str = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        EventBus.getDefault().unregister(str);
                        b.a().b();
                    } else {
                        EventBus.getDefault().unregister(this);
                        b.a().b();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    EventBus.getDefault().unregister(this);
                    EventBus.getDefault().release();
                    b.a().b();
                }
            }
            this.f15292e.viewClicked(splashResData);
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
            this.f15289a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f15292e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f15290c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        String str;
        String str2;
        MBSplashData mBSplashData = new MBSplashData(this.f15293f);
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c9 != null) {
            DyOption dyOption = this.f15293f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                if (this.f15293f.isCanSkip()) {
                    str2 = "mbridge_splash_count_time_can_skip";
                } else {
                    str2 = "mbridge_splash_count_time_can_skip_not";
                }
                mBSplashData.setCountDownText(c9.getResources().getString(v.a(c9, str2, "string")));
            }
            mBSplashData.setNoticeImage(v.a(c9, "mbridge_splash_notice", "drawable"));
            String s5 = z.s(c9);
            if (!TextUtils.isEmpty(s5) && s5.contains("zh")) {
                str = "广告";
            } else {
                str = "AD";
            }
            mBSplashData.setLogoText(str);
        }
        d dVar = this.f15289a;
        if (dVar != null) {
            dVar.a(mBSplashData);
        }
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(mBSplashData);
        }
        f fVar = this.f15290c;
        if (fVar != null) {
            fVar.a(mBSplashData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f15291d = hVar;
        }
    }
}
