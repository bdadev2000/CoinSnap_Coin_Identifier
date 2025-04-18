package t6;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes3.dex */
public final class c extends NativeAd.Image {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f25277b;

    public c() {
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f25277b;
    }

    public c(Uri uri) {
        this.f25277b = uri;
    }

    public c(Drawable drawable) {
        this.a = drawable;
    }
}
