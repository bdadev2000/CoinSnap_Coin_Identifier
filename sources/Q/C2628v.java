package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.internal.C1838g;
import j.AbstractC2379a;

/* renamed from: q.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2628v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f22737a;
    public final C1838g b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.internal.g, java.lang.Object] */
    public C2628v(TextView textView) {
        this.f22737a = textView;
        ?? obj = new Object();
        C2.m.h(textView, "textView cannot be null");
        obj.b = new l0.g(textView);
        this.b = obj;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((e1.f) this.b.b).l(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i9) {
        TypedArray obtainStyledAttributes = this.f22737a.getContext().obtainStyledAttributes(attributeSet, AbstractC2379a.f20949i, i9, 0);
        try {
            boolean z8 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z8 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z8) {
        ((e1.f) this.b.b).q(z8);
    }

    public final void d(boolean z8) {
        ((e1.f) this.b.b).r(z8);
    }
}
