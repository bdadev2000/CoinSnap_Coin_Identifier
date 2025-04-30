package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.dislike.COT;
import com.bytedance.sdk.openadsdk.dislike.KS;
import java.util.List;

/* loaded from: classes.dex */
public class lMd implements FP {
    private FP.zp COT;
    private KS KS;
    private boolean jU;
    private final Context lMd;
    public COT zp;

    public lMd(Context context, String str, List<FilterWord> list, String str2) {
        if (!(context instanceof Activity)) {
            tG.lMd("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.lMd = context;
        zp(str, list, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        if ((this.lMd instanceof Activity) && (!((Activity) r0).isFinishing()) && !this.zp.isShowing()) {
            this.zp.show();
        }
    }

    private void zp(String str, List<FilterWord> list, String str2) {
        this.KS = new KS(this.lMd, str, list);
        COT cot = new COT(this.lMd);
        this.zp = cot;
        cot.zp(str, str2);
        this.zp.zp(new COT.zp() { // from class: com.bytedance.sdk.openadsdk.dislike.lMd.1
            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void KS() {
                lMd.this.zp();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void lMd() {
                lMd.this.zp();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void zp() {
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.COT.zp
            public void zp(int i9, FilterWord filterWord) {
                if (lMd.this.COT != null) {
                    lMd.this.COT.zp(i9, filterWord.getName());
                }
                if (lMd.this.COT != null) {
                    lMd.this.COT.zp();
                }
            }
        });
        this.KS.zp(new KS.zp() { // from class: com.bytedance.sdk.openadsdk.dislike.lMd.2
            @Override // com.bytedance.sdk.openadsdk.dislike.KS.zp
            public void KS() {
                tG.zp("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.KS.zp
            public void lMd() {
                tG.zp("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (lMd.this.COT != null) {
                        lMd.this.COT.zp();
                    }
                } catch (Throwable th) {
                    tG.zp("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.KS.zp
            public void zp() {
                lMd.this.zp(true);
                if (lMd.this.KS != null && lMd.this.KS.isShowing()) {
                    lMd.this.KS.dismiss();
                }
                lMd.this.KS();
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.KS.zp
            public void zp(int i9, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && lMd.this.COT != null) {
                        lMd.this.COT.zp(i9, filterWord.getName());
                    }
                    tG.zp("TTAdDislikeImpl", "onDislikeSelected: " + i9 + ", " + filterWord.getName());
                } catch (Throwable th) {
                    tG.zp("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }
        });
    }

    public boolean lMd() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.FP
    public void zp() {
        Context context = this.lMd;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.KS.isShowing()) {
            return;
        }
        this.KS.show();
    }

    public void zp(String str, List<FilterWord> list) {
        this.KS.zp(str, list);
    }

    @Override // com.bytedance.sdk.openadsdk.core.FP
    public void zp(FP.zp zpVar) {
        this.COT = zpVar;
    }

    public void zp(String str) {
        KS ks = this.KS;
        if (ks != null) {
            ks.zp(str);
        }
    }

    public void zp(boolean z8) {
        this.jU = z8;
    }
}
