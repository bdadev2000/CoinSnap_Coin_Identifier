package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class gq {

    /* renamed from: a, reason: collision with root package name */
    public final Set f24163a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f24164b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f24165c;
    private Uri d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f24166f;

    public Set a() {
        return this.f24163a;
    }

    public Uri b() {
        return this.d;
    }

    public int c() {
        return this.f24166f;
    }

    public Uri d() {
        return this.f24165c;
    }

    public Set e() {
        return this.f24164b;
    }

    public int f() {
        return this.e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + d() + "', clickUri='" + b() + "', width=" + f() + ", height=" + c() + "}";
    }

    public static gq a(es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            es c2 = esVar.c("StaticResource");
            if (c2 != null && URLUtil.isValidUrl(c2.d())) {
                gq gqVar = new gq();
                gqVar.f24165c = Uri.parse(c2.d());
                es b2 = esVar.b("IconClickThrough");
                if (b2 != null && URLUtil.isValidUrl(b2.d())) {
                    gqVar.d = Uri.parse(b2.d());
                }
                String str = (String) esVar.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                int i2 = 0;
                int parseInt = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                String str2 = (String) esVar.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                if (str2 != null && Integer.parseInt(str2) > 0) {
                    i2 = Integer.parseInt(str2);
                }
                int intValue = ((Integer) jVar.a(sj.a5)).intValue();
                if (parseInt <= 0 || i2 <= 0) {
                    gqVar.f24166f = intValue;
                    gqVar.e = intValue;
                } else {
                    double d = parseInt / i2;
                    int min = Math.min(Math.max(parseInt, i2), intValue);
                    if (parseInt >= i2) {
                        gqVar.e = min;
                        gqVar.f24166f = (int) (min / d);
                    } else {
                        gqVar.f24166f = min;
                        gqVar.e = (int) (min * d);
                    }
                }
                return gqVar;
            }
            jVar.J();
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            jVar.J().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.j jVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, jVar);
        return imageView;
    }
}
