package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.d.a;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.e;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.g;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.g.i;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ac;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class b {
    private static volatile b a;

    /* renamed from: b, reason: collision with root package name */
    private d f12855b = (d) com.mbridge.msdk.dycreator.d.a.a().a(a.EnumC0166a.VIEW_OBSERVER);

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.g.c f12856c = (com.mbridge.msdk.dycreator.g.c) com.mbridge.msdk.dycreator.d.a.a().a(a.EnumC0166a.CLICK_OBSERVER);

    /* renamed from: d, reason: collision with root package name */
    private f f12857d = (f) com.mbridge.msdk.dycreator.d.a.a().a(a.EnumC0166a.EFFECT_OBSERVER);

    /* renamed from: e, reason: collision with root package name */
    private h f12858e = (h) com.mbridge.msdk.dycreator.d.a.a().a(a.EnumC0166a.REPORT_OBSERVER);

    /* renamed from: f, reason: collision with root package name */
    private BaseViewModel f12859f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f12860g;

    private b() {
    }

    public final void b(final View view) {
        e eVar = new e() { // from class: com.mbridge.msdk.dycreator.binding.b.2
            @Override // com.mbridge.msdk.dycreator.g.e
            public final void a(Object obj) {
                try {
                    KeyEvent.Callback callback = view;
                    if (callback instanceof InterBase) {
                        b.b(b.this, (InterBase) callback, obj);
                    }
                } catch (Exception e2) {
                    ad.b("MBDataBinding", e2.getMessage());
                }
            }
        };
        int id2 = view.getId();
        f fVar = this.f12857d;
        if (fVar != null) {
            fVar.a(eVar, id2);
        }
    }

    public final void c(final View view) {
        i iVar = new i() { // from class: com.mbridge.msdk.dycreator.binding.b.3
            @Override // com.mbridge.msdk.dycreator.g.i
            public final void a(Object obj) {
                try {
                    KeyEvent.Callback callback = view;
                    if (callback instanceof InterBase) {
                        b.c(b.this, (InterBase) callback, obj);
                    }
                } catch (Exception e2) {
                    ad.b("MBDataBinding", e2.getMessage());
                }
            }
        };
        int id2 = view.getId();
        d dVar = this.f12855b;
        if (dVar != null) {
            dVar.a(iVar, id2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final View view) {
        if (view != 0) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (!TextUtils.isEmpty(actionDes)) {
                        if (actionDes.startsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                            com.mbridge.msdk.dycreator.g.b bVar = new com.mbridge.msdk.dycreator.g.b() { // from class: com.mbridge.msdk.dycreator.binding.b.4
                                @Override // com.mbridge.msdk.dycreator.g.b
                                public final void a(Object obj) {
                                    if (obj == null) {
                                        return;
                                    }
                                    try {
                                        if (com.mbridge.msdk.dycreator.e.d.a(view, (com.mbridge.msdk.dycreator.f.a.a) obj)) {
                                            b.a(b.this, view, obj);
                                        }
                                    } catch (Exception e2) {
                                        ad.b("MBDataBinding", e2.getMessage());
                                    }
                                }
                            };
                            int id2 = view.getId();
                            com.mbridge.msdk.dycreator.g.c cVar = this.f12856c;
                            if (cVar != null) {
                                cVar.a(bVar, id2);
                            }
                        } else if (!actionDes.equals("move") && !actionDes.equals("long_click")) {
                            actionDes.equals("wobble");
                        }
                    }
                }
            } catch (Exception e2) {
                ad.b("MBDataBinding", e2.getMessage());
            }
        }
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(b bVar, InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String bindDataDes = interBase.getBindDataDes();
        if (TextUtils.isEmpty(bindDataDes)) {
            return;
        }
        try {
            Object a10 = com.mbridge.msdk.dycreator.e.d.a(obj, bindDataDes);
            if (a10 == null) {
                return;
            }
            if (interBase instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) interBase;
                com.mbridge.msdk.dycreator.f.a.a aVar = (com.mbridge.msdk.dycreator.f.a.a) obj;
                if (viewGroup instanceof MBSplashClickView) {
                    if (aVar.getEffectData() != null && aVar.getEffectData().isClickButtonVisible() && !aVar.getEffectData().isShakeVisible()) {
                        if (!TextUtils.isEmpty(a10.toString())) {
                            viewGroup.setVisibility(0);
                            ((MBSplashClickView) viewGroup).initView(a10.toString());
                        }
                    }
                    viewGroup.setVisibility(8);
                }
                if (viewGroup instanceof MBSplashShakeView) {
                    if (aVar.getEffectData() != null && aVar.getEffectData().isShakeVisible()) {
                        if (TextUtils.isEmpty(a10.toString())) {
                            return;
                        }
                        viewGroup.setVisibility(0);
                        ((MBSplashShakeView) viewGroup).initView(a10.toString());
                        return;
                    }
                    viewGroup.setVisibility(8);
                    return;
                }
                return;
            }
            if (interBase instanceof View) {
                final View view = (View) interBase;
                final com.mbridge.msdk.dycreator.f.a.a aVar2 = (com.mbridge.msdk.dycreator.f.a.a) obj;
                try {
                    if (view instanceof TextView) {
                        try {
                            ((TextView) view).setText(String.valueOf(a10).replace("\\n", "\n"));
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    if (view instanceof ImageView) {
                        if (a10 instanceof Integer) {
                            ((ImageView) view).setImageResource(((Integer) a10).intValue());
                        }
                        if (a10 instanceof String) {
                            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(a10.toString(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.binding.b.6
                                @Override // com.mbridge.msdk.foundation.same.c.c
                                public final void onFailedLoad(String str, String str2) {
                                    View view2 = view;
                                    if (view2 != null) {
                                        ((ImageView) view2).setBackgroundColor(-7829368);
                                    }
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // com.mbridge.msdk.foundation.same.c.c
                                public final void onSuccessLoad(Bitmap bitmap, String str) {
                                    boolean z10;
                                    int orientation;
                                    if (bitmap != null) {
                                        try {
                                            if (!bitmap.isRecycled()) {
                                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (aVar2.getEffectData().getOrientation() == 1) {
                                                    orientation = view.getResources().getConfiguration().orientation;
                                                } else {
                                                    orientation = aVar2.getEffectData().getOrientation();
                                                }
                                                if (orientation == 1) {
                                                    if (z10) {
                                                        View view2 = view;
                                                        if (view2 instanceof MBSplashPortView) {
                                                            if (view2.getParent() != null) {
                                                                ((ViewGroup) view.getParent()).setVisibility(8);
                                                                return;
                                                            }
                                                            return;
                                                        } else if (view2 instanceof MBSplashImageBgView) {
                                                            view2.setVisibility(0);
                                                            Bitmap a11 = ac.a(bitmap);
                                                            ((MBSplashImageBgView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                            ((MBSplashImageBgView) view).setImageBitmap(a11);
                                                            return;
                                                        }
                                                    } else {
                                                        View view3 = view;
                                                        if (view3 instanceof MBSplashPortView) {
                                                            view3.setVisibility(0);
                                                            ((MBSplashPortView) view).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                            ((MBSplashPortView) view).setImageBitmap(bitmap);
                                                            return;
                                                        } else if (view3 instanceof MBSplashImageBgView) {
                                                            view3.setVisibility(8);
                                                            return;
                                                        } else if (view3 instanceof InterBase) {
                                                            String effectDes = ((InterBase) view3).getEffectDes();
                                                            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                                                            if (viewGroup2 != null) {
                                                                com.mbridge.msdk.dycreator.e.d.a(effectDes, viewGroup2, true);
                                                            }
                                                        }
                                                    }
                                                } else if (z10) {
                                                    View view4 = view;
                                                    if (view4 instanceof MBSplashPortView) {
                                                        view4.setVisibility(0);
                                                        ((MBSplashPortView) view).setScaleType(ImageView.ScaleType.FIT_XY);
                                                        ((ImageView) view).setImageBitmap(bitmap);
                                                        return;
                                                    } else if (view4 instanceof MBSplashImageBgView) {
                                                        view4.setVisibility(8);
                                                        ((MBSplashImageBgView) view).setImageBitmap(ac.a(bitmap));
                                                        return;
                                                    } else if (view4 instanceof InterBase) {
                                                        String effectDes2 = ((InterBase) view4).getEffectDes();
                                                        ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                                                        if (viewGroup3 != null) {
                                                            com.mbridge.msdk.dycreator.e.d.a(effectDes2, viewGroup3, true);
                                                        }
                                                    }
                                                } else {
                                                    View view5 = view;
                                                    if (view5 instanceof MBSplashPortView) {
                                                        view5.setVisibility(0);
                                                        ((MBSplashPortView) view).setImageBitmap(bitmap);
                                                        return;
                                                    } else {
                                                        if (view5 instanceof MBSplashImageBgView) {
                                                            view5.setVisibility(0);
                                                            Bitmap a12 = ac.a(bitmap);
                                                            ((MBSplashImageBgView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                            ((MBSplashImageBgView) view).setImageBitmap(a12);
                                                            return;
                                                        }
                                                        if (view5 instanceof InterBase) {
                                                            String effectDes3 = ((InterBase) view5).getEffectDes();
                                                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                                                            if (viewGroup4 != null) {
                                                                com.mbridge.msdk.dycreator.e.d.a(effectDes3, viewGroup4, true);
                                                            }
                                                        }
                                                    }
                                                }
                                                ((ImageView) view).setImageBitmap(bitmap);
                                                return;
                                            }
                                        } catch (Exception e10) {
                                            ad.b("MBDataBinding", e10.getMessage());
                                            return;
                                        }
                                    }
                                    ((ImageView) view).setBackgroundColor(-7829368);
                                }
                            });
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final synchronized void b() {
        com.mbridge.msdk.dycreator.g.c cVar = this.f12856c;
        if (cVar != null) {
            cVar.a();
        }
        d dVar = this.f12855b;
        if (dVar != null) {
            dVar.a();
        }
        f fVar = this.f12857d;
        if (fVar != null) {
            fVar.a();
        }
        if (this.f12859f != null) {
            this.f12859f = null;
        }
        if (this.f12860g != null) {
            this.f12860g = null;
        }
        if (a != null) {
            a = null;
        }
    }

    public final void a(final View view) {
        g gVar = new g() { // from class: com.mbridge.msdk.dycreator.binding.b.1
            @Override // com.mbridge.msdk.dycreator.g.g
            public final void a(Object obj) {
                try {
                    KeyEvent.Callback callback = view;
                    if (callback instanceof InterBase) {
                        b.a(b.this, (InterBase) callback, obj);
                    }
                } catch (Exception e2) {
                    ad.b("MBDataBinding", e2.getMessage());
                }
            }
        };
        int id2 = view.getId();
        h hVar = this.f12858e;
        if (hVar != null) {
            hVar.a(gVar, id2);
        }
    }

    public final void a(BaseViewModel baseViewModel) {
        this.f12859f = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f12856c);
            this.f12859f.setConcreteSubject(this.f12855b);
            this.f12859f.setEffectSubject(this.f12857d);
            this.f12859f.setReportSubject(this.f12858e);
        }
    }

    private com.mbridge.msdk.shake.b a(final View view, final MBSplashData mBSplashData) {
        if (mBSplashData != null) {
            try {
                DyOption dyOption = mBSplashData.getDyOption();
                if (dyOption != null && dyOption.isShakeVisible() && this.f12860g == null) {
                    this.f12860g = new com.mbridge.msdk.shake.b(dyOption.getShakeStrenght(), dyOption.getShakeTime() * 1000) { // from class: com.mbridge.msdk.dycreator.binding.b.7
                        @Override // com.mbridge.msdk.shake.b
                        public final void a() {
                            View view2 = view;
                            if (view2 != null) {
                                try {
                                    if (view2.getGlobalVisibleRect(new Rect())) {
                                        SplashResData splashResData = new SplashResData();
                                        mBSplashData.setClickType(4);
                                        splashResData.setBaseViewData(mBSplashData);
                                        splashResData.seteAction(EAction.DOWNLOAD);
                                        EventBus.getDefault().post(splashResData);
                                        com.mbridge.msdk.shake.a.a().b(b.this.f12860g);
                                    }
                                } catch (Exception e2) {
                                    ad.b("MBDataBinding", e2.getMessage());
                                }
                            }
                        }
                    };
                }
            } catch (Exception e2) {
                ad.b("MBDataBinding", e2.getMessage());
            }
        }
        return this.f12860g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(b bVar, InterBase interBase, Object obj) {
        int i10;
        final boolean z10;
        if (interBase == 0 || obj == null) {
            return;
        }
        String effectDes = interBase.getEffectDes();
        if (TextUtils.isEmpty(effectDes)) {
            return;
        }
        try {
            if (interBase instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) interBase;
                com.mbridge.msdk.dycreator.f.a.a aVar = (com.mbridge.msdk.dycreator.f.a.a) obj;
                if (effectDes != null) {
                    if (effectDes.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
                        if (aVar.getEffectData().isShakeVisible()) {
                            if (bVar.f12860g != null) {
                                com.mbridge.msdk.shake.a.a().b(bVar.f12860g);
                            }
                            com.mbridge.msdk.shake.a.a().a(bVar.a(viewGroup, (MBSplashData) aVar));
                        } else if (bVar.f12860g != null) {
                            com.mbridge.msdk.shake.a.a().b(bVar.f12860g);
                        }
                    }
                    if (effectDes.equals("visible") && (viewGroup instanceof MBApkInfoView)) {
                        if (aVar.getEffectData().isApkInfoVisible()) {
                            if ((aVar instanceof MBSplashData) && !TextUtils.isEmpty(((MBSplashData) aVar).getAppInfo())) {
                                viewGroup.setVisibility(0);
                            } else {
                                viewGroup.setVisibility(4);
                            }
                        } else {
                            viewGroup.setVisibility(8);
                        }
                    }
                    effectDes.equals("anim");
                    return;
                }
                return;
            }
            if (interBase instanceof View) {
                final View view = (View) interBase;
                if (effectDes != null) {
                    com.mbridge.msdk.dycreator.f.a.a aVar2 = (com.mbridge.msdk.dycreator.f.a.a) obj;
                    if (effectDes.equals("countdown") && (view instanceof TextView)) {
                        final String str = (String) ((TextView) view).getText();
                        final String s5 = z.s(view.getContext());
                        DyOption effectData = aVar2.getEffectData();
                        if (effectData != null) {
                            boolean isCanSkip = effectData.isCanSkip();
                            i10 = effectData.getCountDownTime();
                            z10 = isCanSkip;
                        } else {
                            i10 = 5;
                            z10 = false;
                        }
                        ((TextView) view).setText(com.mbridge.msdk.dycreator.e.d.a(z10, i10, str, s5));
                        ((com.mbridge.msdk.dycreator.f.a.a) obj).getEffectData().setDyCountDownListenerWrapper(new DyCountDownListenerWrapper() { // from class: com.mbridge.msdk.dycreator.binding.b.5
                            @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper
                            public final void getCountDownValue(int i11) {
                                if (i11 == 0) {
                                    SplashResData splashResData = new SplashResData();
                                    splashResData.seteAction(EAction.CLOSE);
                                    EventBus.getDefault().post(splashResData);
                                } else {
                                    ((TextView) view).setText(com.mbridge.msdk.dycreator.e.d.a(z10, i11, str, s5));
                                }
                            }
                        });
                    }
                    effectDes.equals("anim");
                    if (effectDes.equals("visible")) {
                        if (view instanceof MBFeedBack) {
                            if (com.mbridge.msdk.foundation.d.b.a().b()) {
                                view.setVisibility(0);
                            } else {
                                view.setVisibility(8);
                            }
                        }
                        if (!(view instanceof MBLogoTextView) || aVar2.getEffectData() == null || aVar2.getEffectData().isLogoVisible()) {
                            return;
                        }
                        ((MBLogoTextView) view).setCompoundDrawables(null, null, null, null);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void a(b bVar, InterBase interBase, Object obj) {
        if (interBase == null || obj == null) {
            return;
        }
        String reportDes = interBase.getReportDes();
        if (TextUtils.isEmpty(reportDes)) {
            return;
        }
        try {
            if (!(obj instanceof com.mbridge.msdk.dycreator.f.a.a) || ((com.mbridge.msdk.dycreator.f.a.a) obj).getBindData() == null) {
                return;
            }
            interBase.setDynamicReport(reportDes, ((com.mbridge.msdk.dycreator.f.a.a) obj).getBindData());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void a(b bVar, View view, Object obj) {
        if (view == null || obj == null || !(obj instanceof com.mbridge.msdk.dycreator.f.a.a)) {
            return;
        }
        view.setOnClickListener(new a((com.mbridge.msdk.dycreator.f.a.a) obj));
    }
}
