package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.vungle.ads.o1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f8002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bitmap f8003d;

    public /* synthetic */ b(ImageView imageView, Bitmap bitmap, int i10) {
        this.f8001b = i10;
        this.f8002c = imageView;
        this.f8003d = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8001b;
        Bitmap bitmap = this.f8003d;
        ImageView imageView = this.f8002c;
        switch (i10) {
            case 0:
                ImageViewUtils.c(imageView, bitmap);
                return;
            default:
                o1.a(imageView, bitmap);
                return;
        }
    }
}
