package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class ImageViewUtils {
    public static /* synthetic */ void a(final k kVar, String str, final ImageView imageView, Uri uri) {
        if (((Boolean) kVar.a(oj.M)).booleanValue()) {
            try {
                InputStream openStream = new URL(str).openStream();
                try {
                    final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                    final int i10 = 0;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = i10;
                            k kVar2 = kVar;
                            ImageView imageView2 = imageView;
                            Bitmap bitmap = decodeStream;
                            switch (i11) {
                                case 0:
                                    ImageViewUtils.a(kVar2, bitmap, imageView2);
                                    return;
                                default:
                                    ImageViewUtils.b(kVar2, bitmap, imageView2);
                                    return;
                            }
                        }
                    });
                    if (openStream != null) {
                        openStream.close();
                        return;
                    }
                    return;
                } finally {
                }
            } catch (Throwable th2) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
                }
                kVar.L().a("ImageViewUtils", th2);
                kVar.B().a("ImageViewUtils", "setImageUri", th2);
                return;
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = new URL(str).openStream();
            final Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream);
            final int i11 = 1;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    k kVar2 = kVar;
                    ImageView imageView2 = imageView;
                    Bitmap bitmap = decodeStream2;
                    switch (i112) {
                        case 0:
                            ImageViewUtils.a(kVar2, bitmap, imageView2);
                            return;
                        default:
                            ImageViewUtils.b(kVar2, bitmap, imageView2);
                            return;
                    }
                }
            });
        } catch (Throwable th3) {
            try {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ImageViewUtils", "Failed to fetch image: " + uri, th3);
                }
            } finally {
                zp.a((Closeable) inputStream, kVar);
            }
        }
    }

    public static /* synthetic */ void g(k kVar, String str, ImageView imageView, Uri uri) {
        a(kVar, str, imageView, uri);
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri != null && imageView != null) {
            k kVar = k.A0;
            if (kVar == null) {
                t.h("ImageViewUtils", "SDK has not been initialized");
            } else {
                kVar.l0().b().execute(new a(uri, imageView));
            }
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri != null && imageView != null) {
            if (imageView.getHeight() > 0 && imageView.getWidth() > 0) {
                setAndDownscaleBitmap(imageView, uri);
            } else {
                imageView.post(new a(imageView, uri, 1));
            }
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, k kVar) {
        if (imageView != null && uri != null) {
            String uri2 = uri.toString();
            if (!URLUtil.isFileUrl(uri2) && !URLUtil.isContentUrl(uri2)) {
                if (kVar == null) {
                    return;
                }
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ImageViewUtils", "Fetching image: " + uri);
                }
                kVar.l0().b().execute(new c3.b(5, kVar, uri2, imageView, uri));
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new a(imageView, uri, 2));
        }
    }

    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public static /* synthetic */ void b(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.k().getResources(), bitmap));
    }

    public static /* synthetic */ void a(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.L();
        if (t.a()) {
            kVar.L().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.k().getResources(), bitmap));
    }

    public static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b3 = x3.b(imageView.getContext());
            height = Math.min(b3.x, b3.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                } else {
                    i10 = i13;
                }
            }
        }
        options.inSampleSize = i10;
        int i14 = 0;
        options.inJustDecodeBounds = false;
        k.A0.L();
        if (t.a()) {
            k.A0.L().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new b(imageView, BitmapFactory.decodeFile(uri.getPath(), options), i14));
    }
}
