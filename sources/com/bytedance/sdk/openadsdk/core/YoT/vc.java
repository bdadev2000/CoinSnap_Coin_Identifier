package com.bytedance.sdk.openadsdk.core.YoT;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import i5.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class vc {
    private DSW Sg;
    final Set<Pair<View, FriendlyObstructionPurpose>> YFl = new HashSet();

    private vc() {
        wN.YFl(lG.YFl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DSW() {
        DSW dsw = this.Sg;
        if (dsw != null) {
            try {
                dsw.AlY();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qsH() {
        DSW dsw = this.Sg;
        if (dsw != null) {
            try {
                dsw.tN();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vc() {
        if (this.Sg != null) {
            try {
                YFl((View) null, (FriendlyObstructionPurpose) null);
                this.Sg.Sg();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler wN() {
        return com.bytedance.sdk.component.utils.DSW.Sg();
    }

    public void AlY() {
        if (a.a()) {
            qsH();
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.8
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.qsH();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(WebView webView) {
        try {
            if (this.Sg == null) {
                this.Sg = qsH.YFl(webView);
            }
        } catch (Throwable th2) {
            YoT.Sg("createWebViewSession failed : ".concat(String.valueOf(th2)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createWebViewSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            wN.YFl(hashMap);
        }
    }

    public void tN() {
        if (a.a()) {
            DSW();
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.7
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.DSW();
                }
            });
        }
    }

    public static vc YFl() {
        return new vc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(View view, Set<nc> set) {
        try {
            if (this.Sg == null) {
                this.Sg = qsH.YFl(view, set);
            }
        } catch (Throwable th2) {
            YoT.Sg("createVideoSession failed : ".concat(String.valueOf(th2)));
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "createVideoSession");
            hashMap.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            wN.YFl(hashMap);
        }
    }

    public void YFl(final WebView webView) {
        if (webView == null || this.Sg != null) {
            return;
        }
        if (a.a()) {
            Sg(webView);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.1
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(webView);
                }
            });
        }
    }

    public void YFl(final View view, final Set<nc> set) {
        if (this.Sg != null || view == null || set == null) {
            return;
        }
        if (a.a()) {
            Sg(view, set);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.4
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(view, (Set<nc>) set);
                }
            });
        }
    }

    public void Sg() {
        if (a.a()) {
            vc();
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.5
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.vc();
                }
            });
        }
    }

    public void YFl(final boolean z10, final float f10) {
        if (a.a()) {
            Sg(z10, f10);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.6
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(z10, f10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10, float f10) {
        if (this.Sg != null) {
            try {
                YFl((View) null, (FriendlyObstructionPurpose) null);
                this.Sg.YFl(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void YFl(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (a.a()) {
            Sg(view, friendlyObstructionPurpose);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.9
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        DSW dsw = this.Sg;
        try {
            if (dsw == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.YFl.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                dsw.YFl(view, friendlyObstructionPurpose);
            }
            if (this.YFl.size() > 0) {
                dsw.YFl(this.YFl);
                this.YFl.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void YFl(final long j3, final boolean z10) {
        if (a.a()) {
            Sg(j3, z10);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.10
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(j3, z10);
                }
            });
        }
    }

    public void YFl(final boolean z10) {
        if (a.a()) {
            Sg(z10);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.2
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(z10);
                }
            });
        }
    }

    public void Sg(long j3, boolean z10) {
        DSW dsw = this.Sg;
        if (dsw != null) {
            try {
                dsw.YFl(((float) j3) / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    public void YFl(final int i10) {
        if (a.a()) {
            Sg(i10);
        } else {
            wN().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YoT.vc.3
                @Override // java.lang.Runnable
                public void run() {
                    vc.this.Sg(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(boolean z10) {
        DSW dsw = this.Sg;
        if (dsw != null) {
            try {
                dsw.YFl(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(int i10) {
        DSW dsw = this.Sg;
        if (dsw != null) {
            try {
                dsw.Sg(i10);
            } catch (Throwable unused) {
            }
        }
    }
}
