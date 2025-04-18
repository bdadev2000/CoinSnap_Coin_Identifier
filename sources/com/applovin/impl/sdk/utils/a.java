package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f7999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f8000d;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f7998b = 0;
        this.f8000d = uri;
        this.f7999c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7998b;
        ImageView imageView = this.f7999c;
        Uri uri = this.f8000d;
        switch (i10) {
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

    public /* synthetic */ a(ImageView imageView, Uri uri, int i10) {
        this.f7998b = i10;
        this.f7999c = imageView;
        this.f8000d = uri;
    }
}
