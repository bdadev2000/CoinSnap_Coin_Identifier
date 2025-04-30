package com.mbridge.msdk.b.a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f14602a;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14603c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f14602a = new WeakReference<>(preloadListener);
        }
    }

    public final boolean a() {
        return this.f14603c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f14602a;
        if (weakReference != null && weakReference.get() != null) {
            this.f14602a.get().onPreloadFaild(str);
        }
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f14602a;
        if (weakReference != null && weakReference.get() != null) {
            this.f14602a.get().onPreloadSucceed();
        }
    }

    public final void a(boolean z8) {
        this.f14603c = z8;
    }
}
