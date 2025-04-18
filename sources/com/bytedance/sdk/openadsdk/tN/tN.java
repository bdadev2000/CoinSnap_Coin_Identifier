package com.bytedance.sdk.openadsdk.tN;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.UZM;
import com.bytedance.sdk.openadsdk.tN.AlY;
import com.bytedance.sdk.openadsdk.tN.YoT;
import java.util.List;

/* loaded from: classes.dex */
public class tN implements UZM {
    private boolean AlY;
    private final Context Sg;
    public YoT YFl;
    private AlY tN;
    private UZM.YFl wN;

    public tN(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            com.bytedance.sdk.component.utils.YoT.Sg("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.Sg = context;
        YFl(str, list, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AlY() {
        if ((this.Sg instanceof Activity) && (!((Activity) r0).isFinishing()) && !this.YFl.isShowing()) {
            this.YFl.show();
        }
    }

    private void YFl(String str, List<FilterWord> list, String str2, String str3) {
        this.tN = new AlY(this.Sg, str, list, str3);
        YoT yoT = new YoT(this.Sg, this.tN.getDislikeManager());
        this.YFl = yoT;
        yoT.YFl(str, str2);
        this.YFl.YFl(str3);
        this.YFl.YFl(new YoT.YFl() { // from class: com.bytedance.sdk.openadsdk.tN.tN.1
            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void Sg() {
                tN.this.YFl();
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void YFl() {
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void tN() {
                tN.this.YFl();
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void YFl(int i10, FilterWord filterWord, String str4) {
                tN.this.tN.onSuggestionSubmit(str4);
                tN.this.YFl();
            }
        });
        this.tN.YFl(new AlY.YFl() { // from class: com.bytedance.sdk.openadsdk.tN.tN.2
            @Override // com.bytedance.sdk.openadsdk.tN.AlY.YFl
            public void Sg() {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (tN.this.wN != null) {
                        tN.this.wN.YFl();
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAdDislikeImpl", "dislike callback cancel error: ", th2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tN.AlY.YFl
            public void YFl() {
                tN.this.YFl(true);
                if (tN.this.tN != null && tN.this.tN.isShowing()) {
                    tN.this.tN.hide();
                }
                tN.this.AlY();
            }

            @Override // com.bytedance.sdk.openadsdk.tN.AlY.YFl
            public void YFl(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && tN.this.wN != null) {
                        tN.this.wN.YFl(i10, filterWord.getName());
                    }
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAdDislikeImpl", "onDislikeSelected: " + i10 + ", " + filterWord.getName());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAdDislikeImpl", "dislike callback selected error: ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.UZM
    public void Sg() {
        AlY alY = this.tN;
        if (alY != null) {
            alY.destroy();
        }
    }

    public boolean tN() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.UZM
    public void YFl() {
        Context context = this.Sg;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.tN.isShowing()) {
            return;
        }
        this.tN.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.UZM
    public void YFl(UZM.YFl yFl) {
        this.wN = yFl;
    }

    public void YFl(String str) {
        AlY alY = this.tN;
        if (alY != null) {
            alY.YFl(str);
        }
    }

    public void YFl(boolean z10) {
        this.AlY = z10;
    }
}
