package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class hq {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8173a = new HashSet();
    public final Set b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f8174c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f8175d;

    /* renamed from: e, reason: collision with root package name */
    private int f8176e;

    /* renamed from: f, reason: collision with root package name */
    private int f8177f;

    public static hq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            fs c9 = fsVar.c("StaticResource");
            if (c9 != null && URLUtil.isValidUrl(c9.d())) {
                hq hqVar = new hq();
                hqVar.f8174c = Uri.parse(c9.d());
                fs b = fsVar.b("IconClickThrough");
                if (b != null && URLUtil.isValidUrl(b.d())) {
                    hqVar.f8175d = Uri.parse(b.d());
                }
                String str = (String) fsVar.a().get("width");
                int i9 = 0;
                int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                String str2 = (String) fsVar.a().get("height");
                if (str2 != null && Integer.parseInt(str2) > 0) {
                    i9 = Integer.parseInt(str2);
                }
                int intValue = ((Integer) kVar.a(oj.f9699W4)).intValue();
                if (parseInt > 0 && i9 > 0) {
                    double d2 = parseInt / i9;
                    int min = Math.min(Math.max(parseInt, i9), intValue);
                    if (parseInt >= i9) {
                        hqVar.f8176e = min;
                        hqVar.f8177f = (int) (min / d2);
                    } else {
                        hqVar.f8177f = min;
                        hqVar.f8176e = (int) (min * d2);
                    }
                } else {
                    hqVar.f8177f = intValue;
                    hqVar.f8176e = intValue;
                }
                return hqVar;
            }
            kVar.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            kVar.L().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f8175d;
    }

    public int c() {
        return this.f8177f;
    }

    public Uri d() {
        return this.f8174c;
    }

    public Set e() {
        return this.b;
    }

    public int f() {
        return this.f8176e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + d() + "', clickUri='" + b() + "', width=" + f() + ", height=" + c() + "}";
    }

    public Set a() {
        return this.f8173a;
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }
}
