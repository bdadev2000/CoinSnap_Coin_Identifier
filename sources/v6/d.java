package v6;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes3.dex */
public final class d extends NativeAd.Image {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f26054b;
    public final Drawable a = null;

    /* renamed from: c, reason: collision with root package name */
    public final double f26055c = 1.0d;

    public d(Uri uri) {
        this.f26054b = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f26055c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f26054b;
    }
}
