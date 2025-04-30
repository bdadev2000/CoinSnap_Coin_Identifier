package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.tG;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    protected boolean QR = false;

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e4) {
                tG.zp("TTBaseActivity", "super.onResume() run fail", e4);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e9) {
                    tG.zp("TTBaseActivity", "onResume set mCalled fail", e9);
                    return;
                }
            }
        }
        super.onResume();
    }

    public void zp(boolean z8) {
        this.QR = z8;
    }
}
