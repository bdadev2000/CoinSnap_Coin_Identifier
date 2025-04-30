package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {
    private boolean KVG;

    public ExpressVideoView(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.woN won, String str, com.bytedance.sdk.openadsdk.lMd.QR qr) {
        super(context, won, false, str, false, false, qr);
        this.KVG = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    private void vwr() {
        QR();
        RelativeLayout relativeLayout = this.QR;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.zp.eWG().dT(), this.zp.eWG().KS(), this.zp.eWG().lMd(), this.ku, this.zp);
            }
        }
        woN();
    }

    private void woN() {
        WNy.zp((View) this.QR, 0);
        WNy.zp((View) this.ku, 0);
        WNy.zp((View) this.dT, 8);
    }

    public void COT() {
        QR();
        WNy.zp((View) this.QR, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void KS() {
        if (this.KVG) {
            super.KS();
        }
    }

    public void jU() {
        ImageView imageView = this.dT;
        if (imageView != null) {
            WNy.zp((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void lMd() {
        if (!this.COT || !woN.lMd(this.vDp)) {
            this.jU = false;
        }
        super.lMd();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.YW;
        if (imageView != null && imageView.getVisibility() == 0) {
            WNy.COT(this.QR);
        }
        KS();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowFocusChanged(boolean z8) {
        ImageView imageView = this.YW;
        if (imageView != null && imageView.getVisibility() == 0) {
            vwr();
        } else {
            super.onWindowFocusChanged(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowVisibilityChanged(int i9) {
        ImageView imageView = this.YW;
        if (imageView != null && imageView.getVisibility() == 0) {
            vwr();
        } else {
            super.onWindowVisibilityChanged(i9);
        }
    }

    public void setCanInterruptVideoPlay(boolean z8) {
        this.KVG = z8;
    }

    public void setShouldCheckNetChange(boolean z8) {
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null) {
            ks.COT(z8);
        }
    }

    public void setShowAdInteractionView(boolean z8) {
        com.bykv.vk.openvk.component.video.api.jU.lMd tG;
        com.bykv.vk.openvk.component.video.api.jU.KS ks = this.lMd;
        if (ks != null && (tG = ks.tG()) != null) {
            tG.zp(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void zp(boolean z8) {
    }
}
