package q;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class S extends K.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22590h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22591i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f22592j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W f22593k;

    public S(W w2, int i9, int i10, WeakReference weakReference) {
        this.f22593k = w2;
        this.f22590h = i9;
        this.f22591i = i10;
        this.f22592j = weakReference;
    }

    @Override // K.b
    public final void h(Typeface typeface) {
        int i9;
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28 && (i9 = this.f22590h) != -1) {
            if ((this.f22591i & 2) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            typeface = V.a(typeface, i9, z8);
        }
        W w2 = this.f22593k;
        if (w2.m) {
            w2.l = typeface;
            TextView textView = (TextView) this.f22592j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new B3.b(w2.f22605j, textView, typeface, 5));
                } else {
                    textView.setTypeface(typeface, w2.f22605j);
                }
            }
        }
    }

    @Override // K.b
    public final void g(int i9) {
    }
}
