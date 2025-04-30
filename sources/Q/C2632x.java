package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import j.AbstractC2379a;

/* renamed from: q.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2632x {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f22740a;
    public com.facebook.A b;

    /* renamed from: c, reason: collision with root package name */
    public int f22741c = 0;

    public C2632x(ImageView imageView) {
        this.f22740a = imageView;
    }

    public final void a() {
        com.facebook.A a6;
        ImageView imageView = this.f22740a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2610l0.a(drawable);
        }
        if (drawable != null && (a6 = this.b) != null) {
            C2624t.d(drawable, a6, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i9) {
        int resourceId;
        ImageView imageView = this.f22740a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC2379a.f20946f;
        l5.k i10 = l5.k.i(context, attributeSet, iArr, i9, 0);
        ImageView imageView2 = this.f22740a;
        ViewCompat.saveAttributeDataForStyleable(imageView2, imageView2.getContext(), iArr, attributeSet, (TypedArray) i10.b, i9, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) i10.b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.facebook.appevents.n.g(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2610l0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Z.f.c(imageView, i10.d(2));
            }
            if (typedArray.hasValue(3)) {
                Z.f.d(imageView, AbstractC2610l0.c(typedArray.getInt(3, -1), null));
            }
            i10.j();
        } catch (Throwable th) {
            i10.j();
            throw th;
        }
    }
}
