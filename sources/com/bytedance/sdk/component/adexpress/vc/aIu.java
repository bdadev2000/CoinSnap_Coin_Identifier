package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aIu extends qO {
    private TextView YFl;

    public aIu(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.qO
    public void YFl(Context context, View view) {
        addView(view);
        this.YFl = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.qO
    public void setShakeText(String str) {
        if (this.YFl == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.YFl.setText(com.bytedance.sdk.component.utils.qO.Sg(this.YFl.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("shakeClickView", e2.getMessage());
                return;
            }
        }
        this.YFl.setText(str);
    }
}
