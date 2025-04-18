package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.GA.Sg.vc;
import com.bytedance.sdk.openadsdk.core.Sg.YFl;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.tN;

/* loaded from: classes.dex */
public class PAGVideoMediaView extends PAGMediaView implements YFl.InterfaceC0116YFl {
    private Wwa AlY;
    private vc Sg;
    private final com.bytedance.sdk.openadsdk.YFl.Sg.YFl tN;

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl) {
        super(context);
        YFl(view);
        this.tN = yFl;
    }

    private boolean Sg() {
        vc vcVar = this.Sg;
        if (vcVar != null) {
            return vcVar.YoT();
        }
        return false;
    }

    private void YFl(View view) {
        if (view instanceof vc) {
            vc vcVar = (vc) view;
            this.Sg = vcVar;
            addView(vcVar, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        vc vcVar = this.Sg;
        if (vcVar != null) {
            vcVar.EH();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl.InterfaceC0116YFl
    public long getVideoProgress() {
        vc vcVar = this.Sg;
        if (vcVar != null && vcVar.getNativeVideoController() != null) {
            return this.Sg.getNativeVideoController().wN();
        }
        return 0L;
    }

    public void handleInterruptVideo() {
        if (!Sg()) {
            YFl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tN.YFl(this, this.AlY);
    }

    public void setMaterialMeta(Wwa wwa) {
        this.AlY = wwa;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof YFl) {
            ((YFl) onClickListener).YFl((YFl.InterfaceC0116YFl) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.YFl.Sg.YFl yFl = this.tN;
        if (yFl == null) {
            return;
        }
        yFl.YFl(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void YFl() {
        vc vcVar = this.Sg;
        if (vcVar != null) {
            vcVar.pDU();
        }
    }
}
