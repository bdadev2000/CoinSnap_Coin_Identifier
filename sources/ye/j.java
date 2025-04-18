package ye;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class j extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final fe.c f28197l = new fe.c(j.class.getSimpleName());

    /* renamed from: j, reason: collision with root package name */
    public boolean f28198j;

    /* renamed from: k, reason: collision with root package name */
    public View f28199k;

    public j(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    @Override // ye.b
    public final Object d() {
        return ((SurfaceView) this.f28176b).getHolder();
    }

    @Override // ye.b
    public final Class e() {
        return SurfaceHolder.class;
    }

    @Override // ye.b
    public final View f() {
        return this.f28199k;
    }

    @Override // ye.b
    public final View g(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        SurfaceView surfaceView = (SurfaceView) inflate.findViewById(R.id.surface_view);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new i(this));
        this.f28199k = inflate;
        return surfaceView;
    }
}
