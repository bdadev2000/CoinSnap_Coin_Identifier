package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.xl;
import java.io.File;
import java.util.Collections;

/* loaded from: classes.dex */
public class a extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final s2 f7848h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdImpl f7849i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC0035a f7850j;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0035a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0035a interfaceC0035a) {
        super("TaskCacheNativeAd", kVar);
        this.f7848h = new s2();
        this.f7849i = appLovinNativeAdImpl;
        this.f7850j = interfaceC0035a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Attempting to cache resource: " + uri);
        }
        String a = this.a.D().a(a(), uri.toString(), this.f7849i.getCachePrefix(), Collections.emptyList(), false, false, this.f7848h);
        if (StringUtils.isValidString(a)) {
            File a10 = this.a.D().a(a, a());
            if (a10 != null) {
                Uri fromFile = Uri.fromFile(a10);
                if (fromFile != null) {
                    return fromFile;
                }
                if (t.a()) {
                    this.f9061c.b(this.f9060b, "Unable to extract Uri from image file");
                }
            } else if (t.a()) {
                this.f9061c.b(this.f9060b, "Unable to retrieve File from cached image filename = " + a);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Begin caching ad #" + this.f7849i.getAdIdNumber() + "...");
        }
        Uri a = a(this.f7849i.getIconUri());
        if (a != null) {
            this.f7849i.setIconUri(a);
        }
        Uri a10 = a(this.f7849i.getMainImageUri());
        if (a10 != null) {
            this.f7849i.setMainImageUri(a10);
        }
        Uri a11 = a(this.f7849i.getPrivacyIconUri());
        if (a11 != null) {
            this.f7849i.setPrivacyIconUri(a11);
        }
        if (t.a()) {
            this.f9061c.a(this.f9060b, "Finished caching ad #" + this.f7849i.getAdIdNumber());
        }
        this.f7850j.a(this.f7849i);
    }
}
