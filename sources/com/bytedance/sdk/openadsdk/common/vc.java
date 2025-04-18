package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class vc extends Button {
    public vc(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        setId(com.bytedance.sdk.openadsdk.utils.GA.AfY);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, GS.tN(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_browser_download_selector"));
        setText(qO.YFl(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
