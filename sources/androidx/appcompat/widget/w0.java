package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w0 extends s.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f1070d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1 f1071f;

    public w0(d1 d1Var, int i10, int i11, WeakReference weakReference) {
        this.f1071f = d1Var;
        this.f1068b = i10;
        this.f1069c = i11;
        this.f1070d = weakReference;
    }

    @Override // s.a
    public final void n(int i10) {
    }

    @Override // s.a
    public final void o(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1068b) != -1) {
            if ((this.f1069c & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = c1.a(typeface, i10, z10);
        }
        d1 d1Var = this.f1071f;
        if (d1Var.f852m) {
            d1Var.f851l = typeface;
            TextView textView = (TextView) this.f1070d.get();
            if (textView != null) {
                if (ViewCompat.isAttachedToWindow(textView)) {
                    textView.post(new x0(textView, typeface, d1Var.f849j));
                } else {
                    textView.setTypeface(typeface, d1Var.f849j);
                }
            }
        }
    }
}
