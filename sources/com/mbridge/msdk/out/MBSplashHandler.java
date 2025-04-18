package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.splash.d.c;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBSplashHandler implements BaseExtraInterfaceForHandler {
    private static final String TAG = "MBSplashHandler";
    private static boolean canSkip = true;
    private static int defCountDownS = 5;
    private static int logoSizeH = 0;
    private static int logoSizeW = 0;
    private static int orientation = 1;
    private c splashProvider;
    private String unitId;

    public MBSplashHandler(String str, String str2) {
        this(str, str2, canSkip, defCountDownS);
    }

    public void allowClickSplash(boolean z10) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d(z10);
        }
    }

    public ViewGroup createZoomOutByType(ZoomOutTypeEnum zoomOutTypeEnum) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.a(zoomOutTypeEnum);
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.f();
        }
        return "";
    }

    public String getRequestId() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.e();
        }
        return "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void loadAndShow(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("", viewGroup);
        }
    }

    public void loadAndShowByToken(String str, ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str, viewGroup);
        }
    }

    public void onDestroy() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.k();
        }
    }

    public void onPause() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.j();
        }
    }

    public void onResume() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.i();
        }
    }

    public void preLoad() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("");
        }
    }

    public void preLoadByToken(String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void setDevCloseView(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(viewGroup);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        com.mbridge.msdk.foundation.controller.c.m().a(this.unitId, jSONObject);
    }

    public void setLoadTimeOut(long j3) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(j3);
        }
    }

    public void setLogoView(View view, int i10, int i11) {
        if (this.splashProvider != null) {
            this.splashProvider.a(view, new RelativeLayout.LayoutParams(i10, i11));
        }
    }

    public void setNotchScreenParameter(int i10, int i11, int i12, int i13) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(i10, i12, i11, i13);
        }
    }

    public void setOrientation(int i10) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(i10);
        }
    }

    public void setSplashLoadListener(MBSplashLoadListener mBSplashLoadListener) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(mBSplashLoadListener);
        }
    }

    public void setSplashShowListener(MBSplashShowListener mBSplashShowListener) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(mBSplashShowListener);
        }
    }

    public void setSupportZoomOut(boolean z10) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(z10);
        }
    }

    public void show(ViewGroup viewGroup) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d("", viewGroup);
        }
    }

    public void zoomOutAttacked() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.g();
        }
    }

    public void zoomOutPlayFinish() {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.h();
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2) {
        this(activity, str, str2, canSkip, defCountDownS);
    }

    public boolean isReady(String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            return cVar.c(str);
        }
        return false;
    }

    public MBSplashHandler(String str, String str2, boolean z10, int i10) {
        this(str, str2, z10, i10, orientation, logoSizeH, logoSizeW);
    }

    public void loadAndShow(Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.b("", activity);
        }
    }

    public void loadAndShowByToken(String str, Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.a(str, activity);
        }
    }

    public void show(ViewGroup viewGroup, String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(str, viewGroup);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z10, int i10) {
        this(activity, str, str2, z10, i10, orientation, logoSizeH, logoSizeW);
    }

    public MBSplashHandler(String str, String str2, boolean z10, int i10, int i11, int i12, int i13) {
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.unitId = str2;
        c cVar = new c(null, str, str2);
        this.splashProvider = cVar;
        cVar.b(z10);
        this.splashProvider.b(i10);
        this.splashProvider.a(i11);
        this.splashProvider.a(i12, i13);
    }

    public void show(Activity activity) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.d("", activity);
        }
    }

    public void show(Activity activity, String str) {
        c cVar = this.splashProvider;
        if (cVar != null) {
            cVar.c(str, activity);
        }
    }

    public MBSplashHandler(Activity activity, String str, String str2, boolean z10, int i10, int i11, int i12, int i13) {
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        c cVar = new c(activity, str, str2);
        this.splashProvider = cVar;
        cVar.b(z10);
        this.splashProvider.b(i10);
        this.splashProvider.a(i11);
        this.splashProvider.a(i12, i13);
    }
}
