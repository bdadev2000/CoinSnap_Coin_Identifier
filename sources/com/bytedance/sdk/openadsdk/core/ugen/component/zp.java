package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class zp extends com.bytedance.adsdk.ugeno.component.text.lMd {
    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.text.lMd
    public void COT(String str) {
        super.COT(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String format = String.format(cz.zp(this.lMd, "tt_comment_num_backup"), Integer.valueOf(Integer.parseInt(str)));
            ((TextView) this.COT).setText("(" + format + ")");
        } catch (Exception unused) {
        }
    }
}
