package b3;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565j extends NativeAd.Image {
    public final Uri b;

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f5301a = null;

    /* renamed from: c, reason: collision with root package name */
    public final double f5302c = 1.0d;

    public C0565j(Uri uri) {
        this.b = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f5301a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f5302c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.b;
    }
}
