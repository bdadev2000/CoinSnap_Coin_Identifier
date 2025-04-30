package com.mbridge.msdk.splash.c;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends com.mbridge.msdk.splash.c.a {

    /* renamed from: com.mbridge.msdk.splash.c.c$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements DyCountDownListener {

        /* renamed from: a */
        final /* synthetic */ DyOption f17830a;

        public AnonymousClass1(DyOption dyOption) {
            r2 = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public final void getCountDownValue(int i9) {
            r2.setDyCountDownListener(i9);
        }
    }

    /* renamed from: com.mbridge.msdk.splash.c.c$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements DynamicViewBackListener {

        /* renamed from: a */
        final /* synthetic */ com.mbridge.msdk.splash.b.a f17831a;
        final /* synthetic */ MBSplashView b;

        /* renamed from: c */
        final /* synthetic */ com.mbridge.msdk.splash.a.d f17832c;

        /* renamed from: d */
        final /* synthetic */ DyOption f17833d;

        public AnonymousClass2(com.mbridge.msdk.splash.b.a aVar, MBSplashView mBSplashView, com.mbridge.msdk.splash.a.d dVar, DyOption dyOption) {
            r2 = aVar;
            r3 = mBSplashView;
            r4 = dVar;
            r5 = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public final void viewClicked(BaseRespData baseRespData) {
            com.mbridge.msdk.splash.d.a aVar;
            CampaignEx campaignEx;
            float f9;
            float f10;
            com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl;
            MBSplashView mBSplashView = r3;
            EAction eAction = null;
            if (mBSplashView != null && (splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl()) != null) {
                aVar = splashSignalCommunicationImpl.a();
            } else {
                aVar = null;
            }
            DyOption dyOption = r5;
            if (dyOption != null) {
                campaignEx = dyOption.getCampaignEx();
            } else {
                campaignEx = null;
            }
            if (baseRespData instanceof SplashResData) {
                eAction = ((SplashResData) baseRespData).geteAction();
            }
            if (eAction != null) {
                int i9 = AnonymousClass3.f17835a[eAction.ordinal()];
                int i10 = 0;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    com.mbridge.msdk.dycreator.f.a.a baseViewData = splashResData.getBaseViewData();
                                    c cVar = c.this;
                                    if (campaignEx != null) {
                                        String campaignUnitId = campaignEx.getCampaignUnitId();
                                        String requestId = campaignEx.getRequestId();
                                        if (baseViewData != null) {
                                            i10 = baseViewData.getEffectData().getCurrentCountDown();
                                        }
                                        aVar.a(1, i10);
                                        com.mbridge.msdk.foundation.d.a.a a6 = com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId);
                                        if (a6 != null) {
                                            a6.a(campaignEx);
                                            com.mbridge.msdk.foundation.d.b.a().a(o.k(campaignUnitId, "_", requestId), new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.a.1

                                                /* renamed from: a */
                                                final /* synthetic */ com.mbridge.msdk.splash.d.a f17797a;
                                                final /* synthetic */ int b;

                                                public AnonymousClass1(com.mbridge.msdk.splash.d.a aVar2, int i102) {
                                                    r2 = aVar2;
                                                    r3 = i102;
                                                }

                                                @Override // com.mbridge.msdk.foundation.d.a
                                                public final void a() {
                                                }

                                                @Override // com.mbridge.msdk.foundation.d.a
                                                public final void b() {
                                                    r2.a(2, r3);
                                                }

                                                @Override // com.mbridge.msdk.foundation.d.a
                                                public final void a(String str) {
                                                    r2.a(2, r3);
                                                }
                                            });
                                            a6.e();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (r5 != null) {
                            com.mbridge.msdk.click.c.e(com.mbridge.msdk.foundation.controller.c.m().c(), r5.getAdChoiceLink());
                            return;
                        }
                        return;
                    }
                    if (aVar2 != null) {
                        aVar2.a();
                        return;
                    }
                    return;
                }
                if (aVar2 != null) {
                    if (baseRespData != null) {
                        if (baseRespData instanceof SplashResData) {
                            SplashResData splashResData2 = (SplashResData) baseRespData;
                            if (splashResData2.getBaseViewData() != null) {
                                com.mbridge.msdk.dycreator.f.a.a baseViewData2 = splashResData2.getBaseViewData();
                                if (baseViewData2 != null && (baseViewData2 instanceof MBSplashData)) {
                                    MBSplashData mBSplashData = (MBSplashData) baseViewData2;
                                    f9 = mBSplashData.getxInScreen();
                                    float f11 = mBSplashData.getyInScreen();
                                    i102 = mBSplashData.getClickType();
                                    f10 = f11;
                                } else {
                                    f9 = 0.0f;
                                    f10 = 0.0f;
                                }
                                try {
                                    aVar2.a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i102, f9, f10), campaignEx));
                                    return;
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    aVar2.a(campaignEx);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    aVar2.a(campaignEx);
                }
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public final void viewCreateFail(com.mbridge.msdk.dycreator.b.a aVar) {
            MBSplashView mBSplashView = r3;
            if (mBSplashView != null) {
                Context context = mBSplashView.getContext();
                if (context == null) {
                    context = com.mbridge.msdk.foundation.controller.c.m().c();
                }
                c.this.a(context, r3, r4, r2);
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public final void viewCreatedSuccess(View view) {
            com.mbridge.msdk.splash.b.a aVar = r2;
            if (aVar != null) {
                if (view != null) {
                    aVar.a(view);
                } else {
                    aVar.a("View render error.");
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.splash.c.c$3 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17835a;

        static {
            int[] iArr = new int[EAction.values().length];
            f17835a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17835a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17835a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17835a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final c f17836a = new c();

        public static /* synthetic */ c a() {
            return f17836a;
        }
    }

    public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
        this();
    }

    @Override // com.mbridge.msdk.splash.c.a
    public final void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.a.d dVar, com.mbridge.msdk.splash.b.a aVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        DyOption.IViewOptionBuilder canSkip = new DyOption.Builder().campaignEx(dVar.c()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(dVar.d());
        boolean z12 = false;
        if (dVar.g() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        DyOption.IViewOptionBuilder isScreenClick = canSkip.isScreenClick(z8);
        if (dVar.f() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        DyOption.IViewOptionBuilder isClickButtonVisible = isScreenClick.isClickButtonVisible(z9);
        if (dVar.i() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        DyOption.IViewOptionBuilder isShakeVisible = isClickButtonVisible.isShakeVisible(z10);
        if (dVar.h() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        DyOption.IViewOptionBuilder isApkInfoVisible = isShakeVisible.isApkInfoVisible(z11);
        if (dVar.m() == 1) {
            z12 = true;
        }
        DyOption build = isApkInfoVisible.isLogoVisible(z12).shakeStrenght(dVar.j()).shakeTime(dVar.k()).orientation(dVar.l()).countDownTime(dVar.e()).adChoiceLink(ai.a(dVar.c())).build();
        mBSplashView.setDyCountDownListener(new DyCountDownListener() { // from class: com.mbridge.msdk.splash.c.c.1

            /* renamed from: a */
            final /* synthetic */ DyOption f17830a;

            public AnonymousClass1(DyOption build2) {
                r2 = build2;
            }

            @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
            public final void getCountDownValue(int i9) {
                r2.setDyCountDownListener(i9);
            }
        });
        DynamicViewCreator.getInstance().createDynamicView(build2, new DynamicViewBackListener() { // from class: com.mbridge.msdk.splash.c.c.2

            /* renamed from: a */
            final /* synthetic */ com.mbridge.msdk.splash.b.a f17831a;
            final /* synthetic */ MBSplashView b;

            /* renamed from: c */
            final /* synthetic */ com.mbridge.msdk.splash.a.d f17832c;

            /* renamed from: d */
            final /* synthetic */ DyOption f17833d;

            public AnonymousClass2(com.mbridge.msdk.splash.b.a aVar2, MBSplashView mBSplashView2, com.mbridge.msdk.splash.a.d dVar2, DyOption build2) {
                r2 = aVar2;
                r3 = mBSplashView2;
                r4 = dVar2;
                r5 = build2;
            }

            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewClicked(BaseRespData baseRespData) {
                com.mbridge.msdk.splash.d.a aVar2;
                CampaignEx campaignEx;
                float f9;
                float f10;
                com.mbridge.msdk.splash.signal.c splashSignalCommunicationImpl;
                MBSplashView mBSplashView2 = r3;
                EAction eAction = null;
                if (mBSplashView2 != null && (splashSignalCommunicationImpl = mBSplashView2.getSplashSignalCommunicationImpl()) != null) {
                    aVar2 = splashSignalCommunicationImpl.a();
                } else {
                    aVar2 = null;
                }
                DyOption dyOption = r5;
                if (dyOption != null) {
                    campaignEx = dyOption.getCampaignEx();
                } else {
                    campaignEx = null;
                }
                if (baseRespData instanceof SplashResData) {
                    eAction = ((SplashResData) baseRespData).geteAction();
                }
                if (eAction != null) {
                    int i9 = AnonymousClass3.f17835a[eAction.ordinal()];
                    int i102 = 0;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                                    SplashResData splashResData = (SplashResData) baseRespData;
                                    if (splashResData.getBaseViewData() != null) {
                                        com.mbridge.msdk.dycreator.f.a.a baseViewData = splashResData.getBaseViewData();
                                        com.mbridge.msdk.splash.c.a cVar = c.this;
                                        if (campaignEx != null) {
                                            String campaignUnitId = campaignEx.getCampaignUnitId();
                                            String requestId = campaignEx.getRequestId();
                                            if (baseViewData != null) {
                                                i102 = baseViewData.getEffectData().getCurrentCountDown();
                                            }
                                            aVar2.a(1, i102);
                                            com.mbridge.msdk.foundation.d.a.a a6 = com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId);
                                            if (a6 != null) {
                                                a6.a(campaignEx);
                                                com.mbridge.msdk.foundation.d.b.a().a(o.k(campaignUnitId, "_", requestId), new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.a.1

                                                    /* renamed from: a */
                                                    final /* synthetic */ com.mbridge.msdk.splash.d.a f17797a;
                                                    final /* synthetic */ int b;

                                                    public AnonymousClass1(com.mbridge.msdk.splash.d.a aVar22, int i1022) {
                                                        r2 = aVar22;
                                                        r3 = i1022;
                                                    }

                                                    @Override // com.mbridge.msdk.foundation.d.a
                                                    public final void a() {
                                                    }

                                                    @Override // com.mbridge.msdk.foundation.d.a
                                                    public final void b() {
                                                        r2.a(2, r3);
                                                    }

                                                    @Override // com.mbridge.msdk.foundation.d.a
                                                    public final void a(String str) {
                                                        r2.a(2, r3);
                                                    }
                                                });
                                                a6.e();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (r5 != null) {
                                com.mbridge.msdk.click.c.e(com.mbridge.msdk.foundation.controller.c.m().c(), r5.getAdChoiceLink());
                                return;
                            }
                            return;
                        }
                        if (aVar22 != null) {
                            aVar22.a();
                            return;
                        }
                        return;
                    }
                    if (aVar22 != null) {
                        if (baseRespData != null) {
                            if (baseRespData instanceof SplashResData) {
                                SplashResData splashResData2 = (SplashResData) baseRespData;
                                if (splashResData2.getBaseViewData() != null) {
                                    com.mbridge.msdk.dycreator.f.a.a baseViewData2 = splashResData2.getBaseViewData();
                                    if (baseViewData2 != null && (baseViewData2 instanceof MBSplashData)) {
                                        MBSplashData mBSplashData = (MBSplashData) baseViewData2;
                                        f9 = mBSplashData.getxInScreen();
                                        float f11 = mBSplashData.getyInScreen();
                                        i1022 = mBSplashData.getClickType();
                                        f10 = f11;
                                    } else {
                                        f9 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    try {
                                        aVar22.a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i1022, f9, f10), campaignEx));
                                        return;
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                        aVar22.a(campaignEx);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        aVar22.a(campaignEx);
                    }
                }
            }

            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewCreateFail(com.mbridge.msdk.dycreator.b.a aVar2) {
                MBSplashView mBSplashView2 = r3;
                if (mBSplashView2 != null) {
                    Context context = mBSplashView2.getContext();
                    if (context == null) {
                        context = com.mbridge.msdk.foundation.controller.c.m().c();
                    }
                    c.this.a(context, r3, r4, r2);
                }
            }

            @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
            public final void viewCreatedSuccess(View view) {
                com.mbridge.msdk.splash.b.a aVar2 = r2;
                if (aVar2 != null) {
                    if (view != null) {
                        aVar2.a(view);
                    } else {
                        aVar2.a("View render error.");
                    }
                }
            }
        });
    }

    private c() {
    }
}
