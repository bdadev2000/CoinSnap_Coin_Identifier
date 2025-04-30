package com.bytedance.sdk.openadsdk.activity;

import Q7.n0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.FP;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.dislike.lMd;
import java.util.Map;

/* loaded from: classes.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, zp.InterfaceC0106zp> KS = n0.q();
    private FP lMd;
    private Intent zp;

    private void KS() {
        int intExtra = this.zp.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            zp(this.zp.getStringExtra("ext_info"), this.zp.getStringExtra("filter_words"), this.zp.getStringExtra("closed_listener_key"), this.zp.getStringExtra("creative_info"));
        }
    }

    private void lMd() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!tG.COT()) {
            finish();
            return;
        }
        lMd();
        this.zp = getIntent();
        if (KVG.zp() == null) {
            KVG.zp(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (KVG.zp() == null) {
            KVG.zp(this);
        }
        setIntent(intent);
        this.zp = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        FP fp = this.lMd;
        if ((fp == null || ((lMd) fp).zp == null || !((lMd) fp).zp.isShowing()) && this.zp != null) {
            KS();
        }
    }

    public static void zp(woN won, String str, zp.InterfaceC0106zp interfaceC0106zp) {
        if (won == null) {
            return;
        }
        Intent intent = new Intent(KVG.zp(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("ext_info", won.GP());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.zp.zp(won.sqt()));
        intent.putExtra("creative_info", won.Eg().toString());
        intent.putExtra("closed_listener_key", str);
        if (interfaceC0106zp != null) {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                ku.lMd().zp(str, interfaceC0106zp);
            } else {
                KS.put(str, interfaceC0106zp);
            }
        }
        if (KVG.zp() != null) {
            KVG.zp().startActivity(intent);
        }
    }

    public static void zp(woN won, String str) {
        zp(won, str, null);
    }

    private void zp(String str, String str2, final String str3, String str4) {
        if (str2 != null && str != null && this.lMd == null) {
            lMd lmd = new lMd(this, str, com.bytedance.sdk.openadsdk.tool.zp.zp(str2), str4);
            this.lMd = lmd;
            lmd.zp(str3);
            this.lMd.zp(new FP.zp() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.FP.zp
                public void zp(int i9, String str5) {
                    zp.InterfaceC0106zp KS2;
                    if (TTDelegateActivity.KS != null && TTDelegateActivity.KS.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        zp.InterfaceC0106zp interfaceC0106zp = (zp.InterfaceC0106zp) TTDelegateActivity.KS.get(str3);
                        if (interfaceC0106zp != null) {
                            interfaceC0106zp.zp();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (KS2 = ku.lMd().KS(str3)) != null) {
                        KS2.zp();
                        ku.lMd().jU(str3);
                    }
                    TTDelegateActivity.this.zp(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.FP.zp
                public void zp() {
                    if (!((lMd) TTDelegateActivity.this.lMd).lMd()) {
                        TTDelegateActivity.this.zp(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((lMd) TTDelegateActivity.this.lMd).zp(false);
                }
            });
        }
        FP fp = this.lMd;
        if (fp != null) {
            fp.zp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str) {
        Map<String, zp.InterfaceC0106zp> map = KS;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.tG.jU()) {
            map.size();
        }
    }
}
