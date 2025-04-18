package c7;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd;

/* loaded from: classes3.dex */
public final class g extends NativeAd.Image {
    public final Uri a;

    public g(Uri uri) {
        this.a = uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return null;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return 1.0d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.a;
    }
}
