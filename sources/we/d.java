package we;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import fe.l;

/* loaded from: classes4.dex */
public final class d extends FrameLayout.LayoutParams {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26982c;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.f26981b = false;
        this.f26982c = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f17856b);
        try {
            this.a = obtainStyledAttributes.getBoolean(1, false);
            this.f26981b = obtainStyledAttributes.getBoolean(0, false);
            this.f26982c = obtainStyledAttributes.getBoolean(2, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final String toString() {
        return d.class.getName() + "[drawOnPreview:" + this.a + ",drawOnPictureSnapshot:" + this.f26981b + ",drawOnVideoSnapshot:" + this.f26982c + "]";
    }
}
