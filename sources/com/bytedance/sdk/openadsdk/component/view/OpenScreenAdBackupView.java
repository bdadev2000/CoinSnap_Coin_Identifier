package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.tG;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes.dex */
public class OpenScreenAdBackupView extends BackupView {
    private NativeExpressView zp;

    public OpenScreenAdBackupView(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void zp(View view, int i9, tG tGVar) {
        NativeExpressView nativeExpressView = this.zp;
        if (nativeExpressView != null) {
            nativeExpressView.zp(view, i9, tGVar);
        }
    }

    public void zp(NativeExpressView nativeExpressView) {
        this.zp = nativeExpressView;
        nativeExpressView.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
