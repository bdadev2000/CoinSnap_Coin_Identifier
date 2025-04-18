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
    public final Set a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f5195b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f5196c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f5197d;

    /* renamed from: e, reason: collision with root package name */
    private int f5198e;

    /* renamed from: f, reason: collision with root package name */
    private int f5199f;

    public static hq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            fs c10 = fsVar.c("StaticResource");
            if (c10 != null && URLUtil.isValidUrl(c10.d())) {
                hq hqVar = new hq();
                hqVar.f5196c = Uri.parse(c10.d());
                fs b3 = fsVar.b("IconClickThrough");
                if (b3 != null && URLUtil.isValidUrl(b3.d())) {
                    hqVar.f5197d = Uri.parse(b3.d());
                }
                String str = (String) fsVar.a().get("width");
                int i10 = 0;
                int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                String str2 = (String) fsVar.a().get("height");
                if (str2 != null && Integer.parseInt(str2) > 0) {
                    i10 = Integer.parseInt(str2);
                }
                int intValue = ((Integer) kVar.a(oj.W4)).intValue();
                if (parseInt > 0 && i10 > 0) {
                    double d10 = parseInt / i10;
                    int min = Math.min(Math.max(parseInt, i10), intValue);
                    if (parseInt >= i10) {
                        hqVar.f5198e = min;
                        hqVar.f5199f = (int) (min / d10);
                    } else {
                        hqVar.f5199f = min;
                        hqVar.f5198e = (int) (min * d10);
                    }
                } else {
                    hqVar.f5199f = intValue;
                    hqVar.f5198e = intValue;
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
        return this.f5197d;
    }

    public int c() {
        return this.f5199f;
    }

    public Uri d() {
        return this.f5196c;
    }

    public Set e() {
        return this.f5195b;
    }

    public int f() {
        return this.f5198e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + d() + "', clickUri='" + b() + "', width=" + f() + ", height=" + c() + "}";
    }

    public Set a() {
        return this.a;
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
