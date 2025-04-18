package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.AlY, com.bytedance.sdk.component.adexpress.theme.YFl {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private wN dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.vc.YFl mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.Sg.eT mRenderListener;
    private com.bytedance.sdk.component.adexpress.Sg.GA mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.Sg muteListener;
    protected final com.bytedance.sdk.component.adexpress.Sg.pDU renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.tN> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.wN videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.Sg.GA ga2, com.bytedance.sdk.component.adexpress.dynamic.vc.YFl yFl) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.Sg.pDU pdu = new com.bytedance.sdk.component.adexpress.Sg.pDU();
        this.renderResult = pdu;
        pdu.YFl(2);
        this.mDynamicClickListener = yFl;
        yFl.YFl(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.YFl(this);
        this.mIsMute = z10;
        this.mRenderRequest = ga2;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN;
        com.bytedance.sdk.component.adexpress.dynamic.AlY.wN nc2 = qsh.nc();
        if (nc2 == null || (wN = nc2.wN()) == null) {
            return;
        }
        this.renderResult.Sg(wN.JT());
    }

    private boolean checkSizeValid() {
        wN wNVar = this.dynamicBaseWidget;
        return wNVar.wN > 0.0f && wNVar.f10388vc > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        ViewGroup viewGroup2;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.getParent()) != null && qsh.bZ()) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.YFl(false);
        this.renderResult.Sg(i10);
        this.renderResult.YFl(str);
        this.mRenderListener.YFl(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.vc.YFl getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.Sg.eT getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.Sg.GA getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.tN> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.YFl
    public void onThemeChanged(int i10) {
        wN wNVar = this.dynamicBaseWidget;
        if (wNVar == null) {
            return;
        }
        wNVar.YFl(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void onvideoComplate() {
        try {
            this.videoListener.YFl();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, int i10) {
        this.dynamicBaseWidget = renderDynamicView(qsh, this, i10);
        this.renderResult.YFl(true);
        this.renderResult.YFl(this.dynamicBaseWidget.wN);
        this.renderResult.Sg(this.dynamicBaseWidget.f10388vc);
        this.renderResult.YFl(this.videoView);
        this.mRenderListener.YFl(this.renderResult);
    }

    public wN renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, ViewGroup viewGroup, int i10) {
        int i11;
        if (qsh == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> eT = qsh.eT();
        wN YFl = com.bytedance.sdk.component.adexpress.dynamic.YFl.Sg.YFl(this.mContext, this, qsh);
        if (YFl instanceof pq) {
            if (i10 == 3) {
                i11 = 128;
            } else {
                i11 = 118;
            }
            callBackRenderFail(i11, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(qsh);
        YFl.tN();
        if (viewGroup != null) {
            viewGroup.addView(YFl);
            setClipChildren(viewGroup, qsh);
        }
        if (eT == null || eT.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH> it = eT.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), YFl, i10);
        }
        return YFl;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setDislikeView(View view) {
        this.mDynamicClickListener.Sg(view);
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.Sg sg2) {
        this.muteListener = sg2;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.Sg.eT eTVar) {
        this.mRenderListener = eTVar;
        this.mDynamicClickListener.YFl(eTVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.Sg sg2 = this.muteListener;
        if (sg2 != null) {
            sg2.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                com.bytedance.sdk.component.adexpress.dynamic.tN tNVar = this.timeOutListener.get(i12);
                boolean z11 = true;
                if (i10 != 1) {
                    z11 = false;
                }
                tNVar.YFl(charSequence, z11, i11, z10);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.tN tNVar) {
        this.timeOutListener.add(tNVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.AlY
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.wN wNVar) {
        this.videoListener = wNVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.tN(d10);
        this.renderResult.AlY(d11);
        this.renderResult.wN(d12);
        this.renderResult.vc(d13);
        this.renderResult.YFl(f10);
        this.renderResult.Sg(f10);
        this.renderResult.tN(f10);
        this.renderResult.AlY(f10);
    }

    public void beginShowFromInvisible(wN wNVar, int i10) {
        if (wNVar == null) {
            return;
        }
        if (wNVar.getBeginInvisibleAndShow()) {
            wNVar.setVisibility(i10);
            View view = wNVar.EH;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = wNVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (wNVar.getChildAt(i11) instanceof wN) {
                beginShowFromInvisible((wN) wNVar.getChildAt(i11), i10);
            }
        }
    }
}
