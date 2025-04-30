package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class LandingPageBrowserDownloadButton extends Button {
    public LandingPageBrowserDownloadButton(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        setId(vDp.TS);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, WNy.lMd(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_browser_download_selector"));
        setText(cz.lMd(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
