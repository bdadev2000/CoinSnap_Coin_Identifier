package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* loaded from: classes3.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14600d = 0;
    private boolean b = false;

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView remove = b.f16164a.remove(this.f14593a);
        if (remove != null) {
            remove.setListener(null);
            remove.destroy();
        }
        this.b = true;
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.b) {
            BrowserView browserView = this.browserView;
            if (browserView != null) {
                browserView.setListener(null);
                this.browserView.destroy();
            }
            BrowserView remove = b.f16164a.remove(this.f14593a);
            if (remove != null) {
                remove.setListener(null);
                remove.destroy();
            }
        }
    }

    public void testfun() {
        ad.b("ASDFA", "DSFASDFADSFADSFADS");
    }
}
