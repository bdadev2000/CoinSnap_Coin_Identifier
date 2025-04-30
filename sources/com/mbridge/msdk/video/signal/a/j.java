package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;

/* loaded from: classes3.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    private Activity f19076a;
    private MBridgeBTContainer b;

    public j(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f19076a = activity;
        this.b = mBridgeBTContainer;
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.e
    public final void click(int i9, String str) {
        super.click(i9, str);
        MBridgeBTContainer mBridgeBTContainer = this.b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.click(i9, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.e
    public final void handlerH5Exception(int i9, String str) {
        super.handlerH5Exception(i9, str);
        MBridgeBTContainer mBridgeBTContainer = this.b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.handlerH5Exception(i9, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.c
    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.c
    public final void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reportUrls(obj, str);
        } else {
            com.mbridge.msdk.video.bt.a.d.c().b(obj, str);
        }
    }
}
