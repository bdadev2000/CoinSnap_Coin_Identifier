package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i9) {
        super(Uri.EMPTY, i9);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        if (imageView2 != null && imageView != null && Objects.equal(imageView2, imageView)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(@Nullable Drawable drawable, boolean z8, boolean z9, boolean z10) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (!z9 && !z10 && (imageView instanceof zal)) {
                throw null;
            }
            boolean z11 = false;
            if (!z9 && !z8) {
                z11 = true;
            }
            if (z11) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 != null) {
                    if (drawable2 instanceof zak) {
                        drawable2 = ((zak) drawable2).zaa();
                    }
                } else {
                    drawable2 = null;
                }
                drawable = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (!(imageView instanceof zal)) {
                if (drawable != null && z11) {
                    ((zak) drawable).zab(250);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
