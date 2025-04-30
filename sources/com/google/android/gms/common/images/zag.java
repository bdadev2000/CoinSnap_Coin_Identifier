package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* loaded from: classes2.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i9) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i9;
    }

    public abstract void zaa(@Nullable Drawable drawable, boolean z8, boolean z9, boolean z10);

    public final void zab(Context context, zam zamVar, boolean z8) {
        Drawable drawable;
        int i9 = this.zab;
        if (i9 != 0) {
            drawable = context.getResources().getDrawable(i9);
        } else {
            drawable = null;
        }
        zaa(drawable, z8, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z8) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
