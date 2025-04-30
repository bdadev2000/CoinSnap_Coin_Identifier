package com.applovin.impl.sdk.utils;

import I2.f;
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
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class ImageViewUtils {
    public static /* synthetic */ void a(final k kVar, String str, final ImageView imageView, Uri uri) {
        if (((Boolean) kVar.a(oj.f9629M)).booleanValue()) {
            try {
                InputStream openStream = FirebasePerfUrlConnection.openStream(new URL(str));
                try {
                    final Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                    final int i9 = 0;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    ImageViewUtils.a(kVar, decodeStream, imageView);
                                    return;
                                default:
                                    ImageViewUtils.b(kVar, decodeStream, imageView);
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
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ImageViewUtils", "Failed to fetch image: " + uri, th);
                }
                kVar.L().a("ImageViewUtils", th);
                kVar.B().a("ImageViewUtils", "setImageUri", th);
                return;
            }
        }
        InputStream inputStream = null;
        try {
            inputStream = FirebasePerfUrlConnection.openStream(new URL(str));
            final Bitmap decodeStream2 = BitmapFactory.decodeStream(inputStream);
            final int i10 = 1;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ImageViewUtils.a(kVar, decodeStream2, imageView);
                            return;
                        default:
                            ImageViewUtils.b(kVar, decodeStream2, imageView);
                            return;
                    }
                }
            });
        } catch (Throwable th2) {
            try {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
                }
            } finally {
                zp.a((Closeable) inputStream, kVar);
            }
        }
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri != null && imageView != null) {
            k kVar = k.f10832A0;
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
                imageView.post(new a(imageView, uri, 2));
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
                kVar.l0().b().execute(new f(kVar, uri2, imageView, uri, 5));
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new a(imageView, uri, 0));
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
        int i9 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point b = x3.b(imageView.getContext());
            height = Math.min(b.x, b.y);
            width = height;
        }
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        if (i10 > height || i11 > width) {
            while (true) {
                int i12 = i9 * 2;
                if (i10 / i12 < height && i11 / i12 < width) {
                    break;
                } else {
                    i9 = i12;
                }
            }
        }
        options.inSampleSize = i9;
        options.inJustDecodeBounds = false;
        k.f10832A0.L();
        if (t.a()) {
            k.f10832A0.L().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new c(imageView, BitmapFactory.decodeFile(uri.getPath(), options), 0));
    }
}
