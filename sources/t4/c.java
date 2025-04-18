package t4;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import s4.h;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final View f25260b;

    /* renamed from: c, reason: collision with root package name */
    public final f f25261c;

    /* renamed from: d, reason: collision with root package name */
    public Animatable f25262d;

    public c(ImageView imageView) {
        com.bumptech.glide.c.l(imageView);
        this.f25260b = imageView;
        this.f25261c = new f(imageView);
    }

    @Override // t4.e
    public final void a(s4.c cVar) {
        this.f25260b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // t4.e
    public final void b(d dVar) {
        boolean z10;
        boolean z11;
        f fVar = this.f25261c;
        int c10 = fVar.c();
        int b3 = fVar.b();
        boolean z12 = false;
        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (b3 <= 0 && b3 != Integer.MIN_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            ((h) dVar).n(c10, b3);
            return;
        }
        ArrayList arrayList = fVar.f25264b;
        if (!arrayList.contains(dVar)) {
            arrayList.add(dVar);
        }
        if (fVar.f25265c == null) {
            ViewTreeObserver viewTreeObserver = fVar.a.getViewTreeObserver();
            b0.e eVar = new b0.e(fVar);
            fVar.f25265c = eVar;
            viewTreeObserver.addOnPreDrawListener(eVar);
        }
    }

    @Override // t4.e
    public final void c(Object obj) {
        i(obj);
    }

    @Override // t4.e
    public final void d(Drawable drawable) {
        i(null);
        ((ImageView) this.f25260b).setImageDrawable(drawable);
    }

    @Override // t4.e
    public final s4.c e() {
        Object tag = this.f25260b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof s4.c) {
                return (s4.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // t4.e
    public final void f(Drawable drawable) {
        f fVar = this.f25261c;
        ViewTreeObserver viewTreeObserver = fVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f25265c);
        }
        fVar.f25265c = null;
        fVar.f25264b.clear();
        Animatable animatable = this.f25262d;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        ((ImageView) this.f25260b).setImageDrawable(drawable);
    }

    @Override // t4.e
    public final void g(Drawable drawable) {
        i(null);
        ((ImageView) this.f25260b).setImageDrawable(drawable);
    }

    @Override // t4.e
    public final void h(d dVar) {
        this.f25261c.f25264b.remove(dVar);
    }

    public final void i(Object obj) {
        b bVar = (b) this;
        int i10 = bVar.f25259f;
        View view = bVar.f25260b;
        switch (i10) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f25262d = animatable;
            animatable.start();
            return;
        }
        this.f25262d = null;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f25260b;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        Animatable animatable = this.f25262d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        Animatable animatable = this.f25262d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
