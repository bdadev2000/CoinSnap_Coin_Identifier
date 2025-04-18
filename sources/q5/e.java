package q5;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e extends g implements SurfaceHolder.Callback, c {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f23686d = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f23687b;

    /* renamed from: c, reason: collision with root package name */
    public f f23688c;

    public e(Context context) {
        super(context);
        f fVar = new f(this);
        this.f23688c = fVar;
        f23686d.add(fVar);
    }

    @Override // q5.c
    public final void YFl(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // q5.c
    public final void a(d dVar) {
        this.f23687b = new WeakReference(dVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f23686d.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null && ((SurfaceHolder.Callback) fVar.f23689b.get()) == null) {
                holder.removeCallback(fVar);
                it.remove();
            }
        }
        holder.addCallback(this.f23688c);
    }

    @Override // q5.c
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(b bVar) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference weakReference = this.f23687b;
        if (weakReference != null && weakReference.get() != null) {
            ((d) this.f23687b.get()).YFl(surfaceHolder, i10, i11, i12);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f23687b;
        if (weakReference != null && weakReference.get() != null) {
            ((d) this.f23687b.get()).YFl(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f23687b;
        if (weakReference != null && weakReference.get() != null) {
            ((d) this.f23687b.get()).Sg(surfaceHolder);
        }
    }
}
