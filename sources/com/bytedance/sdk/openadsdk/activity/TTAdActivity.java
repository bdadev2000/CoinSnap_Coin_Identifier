package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.YoT;

/* loaded from: classes.dex */
public class TTAdActivity extends TTBaseActivity {
    private Sg YFl;

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.YFl((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Sg sg2 = this.YFl;
        if (sg2 == null) {
            super.onBackPressed();
        } else {
            sg2.AlY();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.YFl.wN.YFl tN = bZ.YFl().tN();
        com.bytedance.sdk.openadsdk.YFl.tN.Sg AlY = bZ.YFl().AlY();
        Wwa YFl = com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.GA.AlY.Sg) null);
        if (YFl != null) {
            Sg sg2 = new Sg(this, YFl);
            this.YFl = sg2;
            sg2.YFl(this, bundle, tN, AlY);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.wN(this);
        }
        bZ.YFl().YFl((com.bytedance.sdk.openadsdk.YFl.wN.YFl) null);
        bZ.YFl().YFl((com.bytedance.sdk.openadsdk.YFl.tN.Sg) null);
        YoT.YFl();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.tN(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.Sg(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.YFl(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.YFl(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Sg sg2 = this.YFl;
        if (sg2 != null) {
            sg2.AlY(this);
        }
    }
}
