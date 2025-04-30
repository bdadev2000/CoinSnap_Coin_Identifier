package X2;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes.dex */
public final class b extends NativeAd.Image {
    public final Uri b;

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3660a = null;

    /* renamed from: c, reason: collision with root package name */
    public final double f3661c = 1.0d;

    public b(Uri uri) {
        this.b = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f3660a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f3661c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.b;
    }
}
