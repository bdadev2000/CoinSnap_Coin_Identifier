package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc extends Ne {
    private aIu YFl;

    public vc(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        YFl(context, i10, i11, i12, jSONObject);
    }

    private void YFl(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        aIu aiu = new aIu(context, com.bytedance.sdk.component.adexpress.tN.YFl.tN(context), i10, i11, i12, jSONObject);
        this.YFl = aiu;
        addView(aiu);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.YFl.setLayoutParams(layoutParams);
    }

    public aIu getShakeView() {
        return this.YFl;
    }

    public void setShakeText(String str) {
        if (this.YFl == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.YFl.setShakeText("");
        } else {
            this.YFl.setShakeText(str);
        }
    }
}
