package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f11163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageView f11164d;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.b = 1;
        this.f11163c = uri;
        this.f11164d = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ImageViewUtils.d(this.f11163c, this.f11164d);
                return;
            case 1:
                ImageViewUtils.e(this.f11163c, this.f11164d);
                return;
            default:
                ImageViewUtils.c(this.f11163c, this.f11164d);
                return;
        }
    }

    public /* synthetic */ a(ImageView imageView, Uri uri, int i9) {
        this.b = i9;
        this.f11164d = imageView;
        this.f11163c = uri;
    }
}
