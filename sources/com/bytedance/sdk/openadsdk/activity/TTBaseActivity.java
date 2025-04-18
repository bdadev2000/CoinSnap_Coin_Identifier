package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.YoT;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    protected boolean DSW = false;

    public void Sg(boolean z10) {
        this.DSW = z10;
    }

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
            } catch (IllegalArgumentException e2) {
                YoT.YFl("TTBaseActivity", "super.onResume() run fail", e2);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e10) {
                    YoT.YFl("TTBaseActivity", "onResume set mCalled fail", e10);
                    return;
                }
            }
        }
        super.onResume();
    }
}
