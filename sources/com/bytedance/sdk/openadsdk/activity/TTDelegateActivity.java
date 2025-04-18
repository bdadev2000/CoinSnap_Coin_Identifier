package com.bytedance.sdk.openadsdk.activity;

import a4.j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.UZM;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.tN.AlY;
import java.util.Map;

/* loaded from: classes.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, AlY.YFl> tN = j.r();
    private UZM Sg;
    private Intent YFl;

    private void Sg() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void tN() {
        int intExtra = this.YFl.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            YFl(this.YFl.getStringExtra("ext_info"), this.YFl.getStringExtra("filter_words"), this.YFl.getStringExtra("closed_listener_key"), this.YFl.getStringExtra("creative_info"));
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!pDU.wN()) {
            finish();
            return;
        }
        Sg();
        this.YFl = getIntent();
        if (lG.YFl() == null) {
            lG.Sg(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        UZM uzm = this.Sg;
        if (uzm != null) {
            uzm.Sg();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (lG.YFl() == null) {
            lG.Sg(this);
        }
        setIntent(intent);
        this.YFl = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UZM uzm = this.Sg;
        if ((uzm == null || ((com.bytedance.sdk.openadsdk.tN.tN) uzm).YFl == null || !((com.bytedance.sdk.openadsdk.tN.tN) uzm).YFl.isShowing()) && this.YFl != null) {
            tN();
        }
    }

    public static void YFl(Wwa wwa, String str, AlY.YFl yFl) {
        if (wwa == null) {
            return;
        }
        Intent intent = new Intent(lG.YFl(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("ext_info", wwa.uGS());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.YFl.YFl(wwa.UT()));
        intent.putExtra("creative_info", wwa.ni().toString());
        intent.putExtra("closed_listener_key", str);
        if (yFl != null) {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                NjR.Sg().YFl(str, yFl);
            } else {
                tN.put(str, yFl);
            }
        }
        if (lG.YFl() != null) {
            lG.YFl().startActivity(intent);
        }
    }

    public static void YFl(Wwa wwa, String str) {
        YFl(wwa, str, null);
    }

    private void YFl(String str, String str2, final String str3, String str4) {
        if (str2 != null && str != null && this.Sg == null) {
            com.bytedance.sdk.openadsdk.tN.tN tNVar = new com.bytedance.sdk.openadsdk.tN.tN(this, str, com.bytedance.sdk.openadsdk.tool.YFl.YFl(str2), str4, "other");
            this.Sg = tNVar;
            tNVar.YFl(str3);
            this.Sg.YFl(new UZM.YFl() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.UZM.YFl
                public void YFl(int i10, String str5) {
                    AlY.YFl wN;
                    if (TTDelegateActivity.tN != null && TTDelegateActivity.tN.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        AlY.YFl yFl = (AlY.YFl) TTDelegateActivity.tN.get(str3);
                        if (yFl != null) {
                            yFl.YFl();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (wN = NjR.Sg().wN(str3)) != null) {
                        wN.YFl();
                        NjR.Sg().vc(str3);
                    }
                    TTDelegateActivity.this.YFl(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.UZM.YFl
                public void YFl() {
                    if (!((com.bytedance.sdk.openadsdk.tN.tN) TTDelegateActivity.this.Sg).tN()) {
                        TTDelegateActivity.this.YFl(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.tN.tN) TTDelegateActivity.this.Sg).YFl(false);
                }
            });
        }
        UZM uzm = this.Sg;
        if (uzm != null) {
            uzm.YFl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str) {
        Map<String, AlY.YFl> map = tN;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (YoT.AlY()) {
            map.size();
        }
    }
}
