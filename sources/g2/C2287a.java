package g2;

import G.f;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import f2.C2269g;
import f2.InterfaceC2265c;
import j2.g;
import java.util.ArrayList;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2287a implements InterfaceC2289c {
    public final View b;

    /* renamed from: c, reason: collision with root package name */
    public final C2290d f20419c;

    /* renamed from: d, reason: collision with root package name */
    public Animatable f20420d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20421f;

    public C2287a(ImageView imageView, int i9) {
        this.f20421f = i9;
        g.c(imageView, "Argument must not be null");
        this.b = imageView;
        this.f20419c = new C2290d(imageView);
    }

    @Override // g2.InterfaceC2289c
    public final void a(InterfaceC2265c interfaceC2265c) {
        this.b.setTag(R.id.glide_custom_view_target_tag, interfaceC2265c);
    }

    @Override // g2.InterfaceC2289c
    public final void b(InterfaceC2288b interfaceC2288b) {
        int i9;
        C2290d c2290d = this.f20419c;
        View view = c2290d.f20423a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = 0;
        if (layoutParams != null) {
            i9 = layoutParams.width;
        } else {
            i9 = 0;
        }
        int a6 = c2290d.a(view.getWidth(), i9, paddingRight);
        View view2 = c2290d.f20423a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            i10 = layoutParams2.height;
        }
        int a9 = c2290d.a(view2.getHeight(), i10, paddingBottom);
        if ((a6 <= 0 && a6 != Integer.MIN_VALUE) || (a9 <= 0 && a9 != Integer.MIN_VALUE)) {
            ArrayList arrayList = c2290d.b;
            if (!arrayList.contains(interfaceC2288b)) {
                arrayList.add(interfaceC2288b);
            }
            if (c2290d.f20424c == null) {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                f fVar = new f(c2290d);
                c2290d.f20424c = fVar;
                viewTreeObserver.addOnPreDrawListener(fVar);
                return;
            }
            return;
        }
        ((C2269g) interfaceC2288b).l(a6, a9);
    }

    @Override // g2.InterfaceC2289c
    public final void c(Object obj) {
        i(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f20420d = animatable;
            animatable.start();
            return;
        }
        this.f20420d = null;
    }

    @Override // g2.InterfaceC2289c
    public final void d(Drawable drawable) {
        i(null);
        this.f20420d = null;
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    @Override // g2.InterfaceC2289c
    public final void e(Drawable drawable) {
        i(null);
        this.f20420d = null;
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    @Override // g2.InterfaceC2289c
    public final void f(InterfaceC2288b interfaceC2288b) {
        this.f20419c.b.remove(interfaceC2288b);
    }

    @Override // g2.InterfaceC2289c
    public final InterfaceC2265c g() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC2265c) {
                return (InterfaceC2265c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // g2.InterfaceC2289c
    public final void h(Drawable drawable) {
        C2290d c2290d = this.f20419c;
        ViewTreeObserver viewTreeObserver = c2290d.f20423a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2290d.f20424c);
        }
        c2290d.f20424c = null;
        c2290d.b.clear();
        Animatable animatable = this.f20420d;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f20420d = null;
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        switch (this.f20421f) {
            case 0:
                ((ImageView) this.b).setImageBitmap((Bitmap) obj);
                return;
            default:
                ((ImageView) this.b).setImageDrawable((Drawable) obj);
                return;
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onStart() {
        Animatable animatable = this.f20420d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // c2.InterfaceC0598i
    public final void onStop() {
        Animatable animatable = this.f20420d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.b;
    }

    @Override // c2.InterfaceC0598i
    public final void onDestroy() {
    }
}
