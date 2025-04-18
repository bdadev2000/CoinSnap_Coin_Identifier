package com.bytedance.sdk.openadsdk.core.eT.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.qO;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.adsdk.ugeno.NjR.vc.Sg {
    public YFl(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.NjR.vc.Sg
    public void wN(String str) {
        super.wN(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            return;
        }
        try {
            String format = String.format(qO.YFl(this.Sg, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((TextView) this.wN).setText("(" + format + ")");
        } catch (Exception unused) {
        }
    }
}
