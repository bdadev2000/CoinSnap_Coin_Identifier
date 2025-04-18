package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.b.a;
import com.mbridge.msdk.dycreator.e.f;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DynamicViewCreator {
    private static volatile DynamicViewCreator a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f12968b = -201;

    /* renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DyAdType.values().length];
            a = iArr;
            try {
                iArr[DyAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DyAdType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private DynamicViewCreator() {
        b.a().a(c.m().c());
    }

    private View a(Context context, DyOption dyOption) {
        List<String> fileDirs;
        ViewGroup viewGroup;
        if (dyOption == null || (fileDirs = dyOption.getFileDirs()) == null) {
            return null;
        }
        int i10 = 0;
        ViewGroup viewGroup2 = null;
        int i11 = 0;
        while (i11 < fileDirs.size()) {
            try {
                if (!TextUtils.isEmpty(fileDirs.get(i11))) {
                    if (i11 == 0) {
                        viewGroup2 = (ViewGroup) f.a(context).a(fileDirs.get(i11));
                    } else {
                        String str = fileDirs.get(i11);
                        if (context != null && viewGroup2 != null && !TextUtils.isEmpty(str)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                String string = jSONObject.getString("folder_dir");
                                if (!TextUtils.isEmpty(string)) {
                                    JSONArray jSONArray = new JSONArray(jSONObject.optString("ext_template"));
                                    if (jSONArray.length() != 0) {
                                        int i12 = i10;
                                        while (i12 < jSONArray.length()) {
                                            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                                            if (jSONObject2 != null) {
                                                View a10 = f.a(context).a(string + File.separator + jSONObject2.optString("name"));
                                                if (a10 != null) {
                                                    JSONObject jSONObject3 = jSONObject2.getJSONObject(TtmlNode.TAG_LAYOUT);
                                                    if (jSONObject3 != null) {
                                                        try {
                                                            String optString = jSONObject3.optString("parent_id");
                                                            if (!TextUtils.isEmpty(optString)) {
                                                                viewGroup = (ViewGroup) f.a(context).a(viewGroup2, optString);
                                                            } else {
                                                                viewGroup = viewGroup2;
                                                            }
                                                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                                                            if (layoutParams != null) {
                                                                String optString2 = jSONObject3.optString("below", "");
                                                                if (!TextUtils.isEmpty(optString2)) {
                                                                    layoutParams.addRule(3, optString2.hashCode());
                                                                }
                                                                String optString3 = jSONObject3.optString("left_of", "");
                                                                if (!TextUtils.isEmpty(optString3)) {
                                                                    layoutParams.addRule(i10, optString3.hashCode());
                                                                }
                                                                String optString4 = jSONObject3.optString("right_of", "");
                                                                if (!TextUtils.isEmpty(optString4)) {
                                                                    layoutParams.addRule(1, optString4.hashCode());
                                                                }
                                                                int optInt = jSONObject3.optInt("index", -2);
                                                                int optInt2 = jSONObject3.optInt("visibility", -1);
                                                                if (optInt2 != -1) {
                                                                    a10.setVisibility(optInt2);
                                                                }
                                                                if (optInt != -2) {
                                                                    viewGroup.addView(a10, optInt, layoutParams);
                                                                } else {
                                                                    viewGroup.addView(a10, layoutParams);
                                                                }
                                                            }
                                                        } catch (Exception e2) {
                                                            ad.b("DynamicViewCreator", e2.getMessage());
                                                        }
                                                    } else {
                                                        viewGroup2.addView(a10, 3);
                                                    }
                                                }
                                            }
                                            i12++;
                                            i10 = 0;
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                ad.b("DynamicViewCreator", e10.getMessage());
                            }
                        }
                    }
                }
                i11++;
                i10 = 0;
            } catch (Exception e11) {
                ad.b("DynamicViewCreator", e11.getMessage());
            }
        }
        return viewGroup2;
    }

    public static DynamicViewCreator getInstance() {
        if (a == null) {
            synchronized (DynamicViewCreator.class) {
                if (a == null) {
                    a = new DynamicViewCreator();
                }
            }
        }
        return a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        boolean z10;
        BaseViewModel mBSplashViewVModel;
        BaseViewModel baseViewModel;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_DYNAMIC_OPTION));
            return;
        }
        if (dynamicViewBackListener == null) {
            return;
        }
        Context c10 = c.m().c();
        if (c10 == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CONTEXT));
            return;
        }
        boolean z11 = false;
        if (dyOption.getCampaignEx() == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CAMPAIGN));
            z10 = false;
        } else {
            z10 = true;
        }
        if (dyOption.getFile() != null || dyOption.getFileDirs() == null) {
            z11 = z10;
        } else {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.BIND_DATA_FILE_OR_DIR));
        }
        if (z11) {
            try {
                View a10 = a(c10, dyOption);
                if (a10 == null) {
                    dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.FILE_CREATE_VIEW_FILE));
                    return;
                }
                int i10 = AnonymousClass1.a[dyOption.getDyAdType().ordinal()];
                if (i10 == 1) {
                    mBSplashViewVModel = new MBSplashViewVModel(dyOption);
                } else {
                    if (i10 != 2) {
                        baseViewModel = new MBCommonViewVModel();
                        baseViewModel.setDynamicViewBackListener(dynamicViewBackListener);
                        com.mbridge.msdk.dycreator.binding.b.a().a(baseViewModel);
                        baseViewModel.setModelDataAndBind();
                        dynamicViewBackListener.viewCreatedSuccess(a10);
                    }
                    mBSplashViewVModel = new MBRewardViewVModel(dyOption);
                }
                baseViewModel = mBSplashViewVModel;
                baseViewModel.setDynamicViewBackListener(dynamicViewBackListener);
                com.mbridge.msdk.dycreator.binding.b.a().a(baseViewModel);
                baseViewModel.setModelDataAndBind();
                dynamicViewBackListener.viewCreatedSuccess(a10);
            } catch (Exception e2) {
                ad.b("DynamicViewCreator", e2.getMessage());
                dynamicViewBackListener.viewCreateFail(new a(f12968b, e2.getMessage()));
            }
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context c10;
        if (dyOption == null || (c10 = c.m().c()) == null) {
            return null;
        }
        return a(c10, dyOption);
    }
}
