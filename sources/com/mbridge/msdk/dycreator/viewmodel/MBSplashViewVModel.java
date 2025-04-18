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

/* loaded from: classes4.dex */
public class MBSplashViewVModel implements BaseViewModel {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private c f12931b;

    /* renamed from: c, reason: collision with root package name */
    private f f12932c;

    /* renamed from: d, reason: collision with root package name */
    private h f12933d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f12934e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f12935f;

    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EAction.values().length];
            a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBSplashViewVModel(DyOption dyOption) {
        String str;
        this.f12935f = dyOption;
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
        if (this.f12934e != null && splashResData != null) {
            int i10 = AnonymousClass1.a[splashResData.geteAction().ordinal()];
            if (i10 == 1 || i10 == 2) {
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
                } catch (Exception e2) {
                    e2.printStackTrace();
                    EventBus.getDefault().unregister(this);
                    EventBus.getDefault().release();
                    b.a().b();
                }
            }
            this.f12934e.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f12931b = cVar;
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
            this.f12934e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f12932c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        String str;
        String str2;
        MBSplashData mBSplashData = new MBSplashData(this.f12935f);
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c10 != null) {
            DyOption dyOption = this.f12935f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                if (this.f12935f.isCanSkip()) {
                    str2 = "mbridge_splash_count_time_can_skip";
                } else {
                    str2 = "mbridge_splash_count_time_can_skip_not";
                }
                mBSplashData.setCountDownText(c10.getResources().getString(v.a(c10, str2, "string")));
            }
            mBSplashData.setNoticeImage(v.a(c10, "mbridge_splash_notice", "drawable"));
            String s5 = z.s(c10);
            if (!TextUtils.isEmpty(s5) && s5.contains("zh")) {
                str = "广告";
            } else {
                str = "AD";
            }
            mBSplashData.setLogoText(str);
        }
        d dVar = this.a;
        if (dVar != null) {
            dVar.a(mBSplashData);
        }
        c cVar = this.f12931b;
        if (cVar != null) {
            cVar.a(mBSplashData);
        }
        f fVar = this.f12932c;
        if (fVar != null) {
            fVar.a(mBSplashData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f12933d = hVar;
        }
    }
}
