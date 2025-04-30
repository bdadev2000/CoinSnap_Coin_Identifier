package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.lMd.zp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.KS;

/* loaded from: classes.dex */
public class PAGVideoMediaView extends PAGMediaView implements zp.InterfaceC0109zp {
    private final com.bytedance.sdk.openadsdk.apiImpl.feed.zp KS;
    private woN jU;
    private NativeVideoTsView lMd;

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar) {
        super(context);
        zp(view);
        this.KS = zpVar;
    }

    private boolean lMd() {
        NativeVideoTsView nativeVideoTsView = this.lMd;
        if (nativeVideoTsView != null) {
            return nativeVideoTsView.vDp();
        }
        return false;
    }

    private void zp(View view) {
        if (view instanceof NativeVideoTsView) {
            NativeVideoTsView nativeVideoTsView = (NativeVideoTsView) view;
            this.lMd = nativeVideoTsView;
            addView(nativeVideoTsView, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        NativeVideoTsView nativeVideoTsView = this.lMd;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.dQp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp.InterfaceC0109zp
    public long getVideoProgress() {
        NativeVideoTsView nativeVideoTsView = this.lMd;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            return this.lMd.getNativeVideoController().COT();
        }
        return 0L;
    }

    public void handleInterruptVideo() {
        if (!lMd()) {
            zp();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        KS.zp(this, this.jU);
    }

    public void setMaterialMeta(woN won) {
        this.jU = won;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof zp) {
            ((zp) onClickListener).zp((zp.InterfaceC0109zp) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.zp zpVar = this.KS;
        if (zpVar == null) {
            return;
        }
        zpVar.zp(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
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

    private void zp() {
        NativeVideoTsView nativeVideoTsView = this.lMd;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.rV();
        }
    }
}
