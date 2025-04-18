package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.yl;
import java.io.File;
import java.util.Collections;

/* loaded from: classes2.dex */
public class a extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final u2 f26731h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdImpl f26732i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC0098a f26733j;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0098a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, j jVar, InterfaceC0098a interfaceC0098a) {
        super("TaskCacheNativeAd", jVar);
        this.f26731h = new u2();
        this.f26732i = appLovinNativeAdImpl;
        this.f26733j = interfaceC0098a;
    }

    private Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Attempting to cache resource: " + uri);
        }
        String a2 = this.f28216a.B().a(a(), uri.toString(), this.f26732i.getCachePrefix(), Collections.emptyList(), false, false, this.f26731h, 1);
        if (StringUtils.isValidString(a2)) {
            File a3 = this.f28216a.B().a(a2, a());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    return fromFile;
                }
                if (n.a()) {
                    this.f28218c.b(this.f28217b, "Unable to extract Uri from image file");
                }
            } else if (n.a()) {
                this.f28218c.b(this.f28217b, "Unable to retrieve File from cached image filename = " + a2);
            }
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Begin caching ad #" + this.f26732i.getAdIdNumber() + "...");
        }
        Uri a2 = a(this.f26732i.getIconUri());
        if (a2 != null) {
            this.f26732i.setIconUri(a2);
        }
        Uri a3 = a(this.f26732i.getMainImageUri());
        if (a3 != null) {
            this.f26732i.setMainImageUri(a3);
        }
        Uri a4 = a(this.f26732i.getPrivacyIconUri());
        if (a4 != null) {
            this.f26732i.setPrivacyIconUri(a4);
        }
        if (n.a()) {
            this.f28218c.a(this.f28217b, "Finished caching ad #" + this.f26732i.getAdIdNumber());
        }
        this.f26733j.a(this.f26732i);
    }
}
