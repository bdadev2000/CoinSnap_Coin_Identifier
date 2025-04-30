package com.bytedance.sdk.openadsdk.core.QR;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class HWF {
    private QR lMd;
    final Set<Pair<View, FriendlyObstructionPurpose>> zp = new HashSet();

    private HWF() {
        COT.zp(KVG.zp());
    }

    private Handler COT() {
        return com.bytedance.sdk.component.utils.ku.lMd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HWF() {
        if (this.lMd != null) {
            try {
                zp((View) null, (FriendlyObstructionPurpose) null);
                this.lMd.lMd();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QR() {
        QR qr = this.lMd;
        if (qr != null) {
            try {
                qr.jU();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ku() {
        QR qr = this.lMd;
        if (qr != null) {
            try {
                qr.KS();
            } catch (Throwable unused) {
            }
        }
    }

    public void jU() {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            ku();
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.8
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.ku();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(WebView webView) {
        try {
            if (this.lMd == null) {
                this.lMd = ku.zp(webView);
            }
        } catch (Throwable th) {
            tG.lMd("createWebViewSession failed : ".concat(String.valueOf(th)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put("message", th.getMessage());
            COT.zp(hashMap);
        }
    }

    public void KS() {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            QR();
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.7
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.QR();
                }
            });
        }
    }

    public static HWF zp() {
        return new HWF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(View view, Set<dT> set) {
        try {
            if (this.lMd == null) {
                this.lMd = ku.zp(view, set);
            }
        } catch (Throwable th) {
            tG.lMd("createVideoSession failed : ".concat(String.valueOf(th)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put("message", th.getMessage());
            COT.zp(hashMap);
        }
    }

    public void zp(final WebView webView) {
        if (webView == null || this.lMd != null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(webView);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.1
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(webView);
                }
            });
        }
    }

    public void zp(final View view, final Set<dT> set) {
        if (this.lMd != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(view, set);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.4
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(view, (Set<dT>) set);
                }
            });
        }
    }

    public void lMd() {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            HWF();
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.5
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.HWF();
                }
            });
        }
    }

    public void zp(final boolean z8, final float f9) {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(z8, f9);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.6
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(z8, f9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8, float f9) {
        if (this.lMd != null) {
            try {
                zp((View) null, (FriendlyObstructionPurpose) null);
                this.lMd.zp(z8, f9);
            } catch (Throwable unused) {
            }
        }
    }

    public void zp(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(view, friendlyObstructionPurpose);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.9
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        QR qr = this.lMd;
        try {
            if (qr == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.zp.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                qr.zp(view, friendlyObstructionPurpose);
            }
            if (this.zp.size() > 0) {
                qr.zp(this.zp);
                this.zp.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void zp(final long j7, final boolean z8) {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(j7, z8);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.10
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(j7, z8);
                }
            });
        }
    }

    public void zp(final boolean z8) {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(z8);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.2
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(z8);
                }
            });
        }
    }

    public void lMd(long j7, boolean z8) {
        QR qr = this.lMd;
        if (qr != null) {
            try {
                qr.zp(((float) j7) / 1000.0f, z8);
            } catch (Throwable unused) {
            }
        }
    }

    public void zp(final int i9) {
        if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
            lMd(i9);
        } else {
            COT().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.QR.HWF.3
                @Override // java.lang.Runnable
                public void run() {
                    HWF.this.lMd(i9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(boolean z8) {
        QR qr = this.lMd;
        if (qr != null) {
            try {
                qr.zp(z8);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        QR qr = this.lMd;
        if (qr != null) {
            try {
                qr.lMd(i9);
            } catch (Throwable unused) {
            }
        }
    }
}
