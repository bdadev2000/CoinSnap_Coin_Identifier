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
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* loaded from: classes4.dex */
public final class c extends com.mbridge.msdk.splash.c.a {

    /* renamed from: com.mbridge.msdk.splash.c.c$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements DyCountDownListener {
        final /* synthetic */ DyOption a;

        public AnonymousClass1(DyOption dyOption) {
            r2 = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public final void getCountDownValue(int i10) {
            r2.setDyCountDownListener(i10);
        }
    }

    /* renamed from: com.mbridge.msdk.splash.c.c$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements DynamicViewBackListener {
        final /* synthetic */ com.mbridge.msdk.splash.b.a a;

        /* renamed from: b */
        final /* synthetic */ MBSplashView f15144b;

        /* renamed from: c */
        final /* synthetic */ com.mbridge.msdk.splash.a.d f15145c;

        /* renamed from: d */
        final /* synthetic */ DyOption f15146d;

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
            float f10;
            float f11;
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
                int i10 = AnonymousClass3.a[eAction.ordinal()];
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    com.mbridge.msdk.dycreator.f.a.a baseViewData = splashResData.getBaseViewData();
                                    c cVar = c.this;
                                    if (campaignEx != null) {
                                        String campaignUnitId = campaignEx.getCampaignUnitId();
                                        String requestId = campaignEx.getRequestId();
                                        if (baseViewData != null) {
                                            i11 = baseViewData.getEffectData().getCurrentCountDown();
                                        }
                                        aVar.a(1, i11);
                                        com.mbridge.msdk.foundation.d.a.a a = com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId);
                                        if (a != null) {
                                            a.a(campaignEx);
                                            com.mbridge.msdk.foundation.d.b.a().a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(campaignUnitId, "_", requestId), new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.a.1
                                                final /* synthetic */ com.mbridge.msdk.splash.d.a a;

                                                /* renamed from: b */
                                                final /* synthetic */ int f15115b;

                                                public AnonymousClass1(com.mbridge.msdk.splash.d.a aVar2, int i112) {
                                                    r2 = aVar2;
                                                    r3 = i112;
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
                                            a.e();
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
                                    f10 = mBSplashData.getxInScreen();
                                    float f12 = mBSplashData.getyInScreen();
                                    i112 = mBSplashData.getClickType();
                                    f11 = f12;
                                } else {
                                    f10 = 0.0f;
                                    f11 = 0.0f;
                                }
                                try {
                                    aVar2.a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i112, f10, f11), campaignEx));
                                    return;
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
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
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
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
            try {
                a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        private static final c a = new c();

        public static /* synthetic */ c a() {
            return a;
        }
    }

    public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
        this();
    }

    @Override // com.mbridge.msdk.splash.c.a
    public final void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.a.d dVar, com.mbridge.msdk.splash.b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        DyOption.IViewOptionBuilder canSkip = new DyOption.Builder().campaignEx(dVar.c()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(dVar.d());
        boolean z14 = false;
        if (dVar.g() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        DyOption.IViewOptionBuilder isScreenClick = canSkip.isScreenClick(z10);
        if (dVar.f() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        DyOption.IViewOptionBuilder isClickButtonVisible = isScreenClick.isClickButtonVisible(z11);
        if (dVar.i() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        DyOption.IViewOptionBuilder isShakeVisible = isClickButtonVisible.isShakeVisible(z12);
        if (dVar.h() == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        DyOption.IViewOptionBuilder isApkInfoVisible = isShakeVisible.isApkInfoVisible(z13);
        if (dVar.m() == 1) {
            z14 = true;
        }
        DyOption build = isApkInfoVisible.isLogoVisible(z14).shakeStrenght(dVar.j()).shakeTime(dVar.k()).orientation(dVar.l()).countDownTime(dVar.e()).adChoiceLink(ai.a(dVar.c())).build();
        mBSplashView.setDyCountDownListener(new DyCountDownListener() { // from class: com.mbridge.msdk.splash.c.c.1
            final /* synthetic */ DyOption a;

            public AnonymousClass1(DyOption build2) {
                r2 = build2;
            }

            @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
            public final void getCountDownValue(int i10) {
                r2.setDyCountDownListener(i10);
            }
        });
        DynamicViewCreator.getInstance().createDynamicView(build2, new DynamicViewBackListener() { // from class: com.mbridge.msdk.splash.c.c.2
            final /* synthetic */ com.mbridge.msdk.splash.b.a a;

            /* renamed from: b */
            final /* synthetic */ MBSplashView f15144b;

            /* renamed from: c */
            final /* synthetic */ com.mbridge.msdk.splash.a.d f15145c;

            /* renamed from: d */
            final /* synthetic */ DyOption f15146d;

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
                float f10;
                float f11;
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
                    int i10 = AnonymousClass3.a[eAction.ordinal()];
                    int i112 = 0;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                                    SplashResData splashResData = (SplashResData) baseRespData;
                                    if (splashResData.getBaseViewData() != null) {
                                        com.mbridge.msdk.dycreator.f.a.a baseViewData = splashResData.getBaseViewData();
                                        com.mbridge.msdk.splash.c.a cVar = c.this;
                                        if (campaignEx != null) {
                                            String campaignUnitId = campaignEx.getCampaignUnitId();
                                            String requestId = campaignEx.getRequestId();
                                            if (baseViewData != null) {
                                                i112 = baseViewData.getEffectData().getCurrentCountDown();
                                            }
                                            aVar2.a(1, i112);
                                            com.mbridge.msdk.foundation.d.a.a a10 = com.mbridge.msdk.foundation.d.b.a().a(campaignUnitId + "_" + requestId);
                                            if (a10 != null) {
                                                a10.a(campaignEx);
                                                com.mbridge.msdk.foundation.d.b.a().a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(campaignUnitId, "_", requestId), new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.splash.c.a.1
                                                    final /* synthetic */ com.mbridge.msdk.splash.d.a a;

                                                    /* renamed from: b */
                                                    final /* synthetic */ int f15115b;

                                                    public AnonymousClass1(com.mbridge.msdk.splash.d.a aVar22, int i1122) {
                                                        r2 = aVar22;
                                                        r3 = i1122;
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
                                                a10.e();
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
                                        f10 = mBSplashData.getxInScreen();
                                        float f12 = mBSplashData.getyInScreen();
                                        i1122 = mBSplashData.getClickType();
                                        f11 = f12;
                                    } else {
                                        f10 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    try {
                                        aVar22.a(com.mbridge.msdk.splash.a.a.a.a(com.mbridge.msdk.splash.a.a.a.a(i1122, f10, f11), campaignEx));
                                        return;
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
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
