package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vungle.ads.C2135q0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f11168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f11169d;

    public /* synthetic */ c(ImageView imageView, Bitmap bitmap, int i9) {
        this.b = i9;
        this.f11168c = imageView;
        this.f11169d = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ImageViewUtils.b(this.f11168c, this.f11169d);
                return;
            default:
                C2135q0.a(this.f11168c, this.f11169d);
                return;
        }
    }
}
