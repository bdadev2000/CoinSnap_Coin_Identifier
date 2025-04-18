package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.core.qsH.qO;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.qsH.YFl {
    private qO YFl;

    public YFl(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl(View view, int i10, pDU pdu) {
        qO qOVar = this.YFl;
        if (qOVar != null) {
            qOVar.YFl(view, i10, pdu);
        }
    }

    public void YFl(qO qOVar) {
        this.YFl = qOVar;
        qOVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
