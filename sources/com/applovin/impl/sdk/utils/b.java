package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f26861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f26862c;

    public /* synthetic */ b(Uri uri, ImageView imageView) {
        this.f26860a = 0;
        this.f26862c = uri;
        this.f26861b = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26860a;
        Uri uri = this.f26862c;
        ImageView imageView = this.f26861b;
        switch (i2) {
            case 0:
                ImageViewUtils.b(uri, imageView);
                return;
            case 1:
                ImageViewUtils.e(uri, imageView);
                return;
            default:
                ImageViewUtils.f(uri, imageView);
                return;
        }
    }

    public /* synthetic */ b(ImageView imageView, Uri uri, int i2) {
        this.f26860a = i2;
        this.f26861b = imageView;
        this.f26862c = uri;
    }
}
