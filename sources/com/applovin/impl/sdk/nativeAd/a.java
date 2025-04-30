package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.C0748s2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.xl;
import java.io.File;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final C0748s2 f11020h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdImpl f11021i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC0035a f11022j;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0035a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0035a interfaceC0035a) {
        super("TaskCacheNativeAd", kVar);
        this.f11020h = new C0748s2();
        this.f11021i = appLovinNativeAdImpl;
        this.f11022j = interfaceC0035a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (t.a()) {
            this.f12279c.a(this.b, "Attempting to cache resource: " + uri);
        }
        String a6 = this.f12278a.D().a(a(), uri.toString(), this.f11021i.getCachePrefix(), Collections.emptyList(), false, false, this.f11020h);
        if (StringUtils.isValidString(a6)) {
            File a9 = this.f12278a.D().a(a6, a());
            if (a9 != null) {
                Uri fromFile = Uri.fromFile(a9);
                if (fromFile != null) {
                    return fromFile;
                }
                if (t.a()) {
                    this.f12279c.b(this.b, "Unable to extract Uri from image file");
                }
            } else if (t.a()) {
                this.f12279c.b(this.b, "Unable to retrieve File from cached image filename = " + a6);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (t.a()) {
            this.f12279c.a(this.b, "Begin caching ad #" + this.f11021i.getAdIdNumber() + "...");
        }
        Uri a6 = a(this.f11021i.getIconUri());
        if (a6 != null) {
            this.f11021i.setIconUri(a6);
        }
        Uri a9 = a(this.f11021i.getMainImageUri());
        if (a9 != null) {
            this.f11021i.setMainImageUri(a9);
        }
        Uri a10 = a(this.f11021i.getPrivacyIconUri());
        if (a10 != null) {
            this.f11021i.setPrivacyIconUri(a10);
        }
        if (t.a()) {
            this.f12279c.a(this.b, "Finished caching ad #" + this.f11021i.getAdIdNumber());
        }
        this.f11022j.a(this.f11021i);
    }
}
