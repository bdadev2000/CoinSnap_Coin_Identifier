package ye;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.plantcare.ai.identifier.plantid.R;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
public final class l extends b {

    /* renamed from: j, reason: collision with root package name */
    public View f28201j;

    public l(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    @Override // ye.b
    public final void a() {
        ((TextureView) this.f28176b).post(new he.c(12, this, (Object) null));
    }

    @Override // ye.b
    public final Object d() {
        return ((TextureView) this.f28176b).getSurfaceTexture();
    }

    @Override // ye.b
    public final Class e() {
        return SurfaceTexture.class;
    }

    @Override // ye.b
    public final View f() {
        return this.f28201j;
    }

    @Override // ye.b
    public final View g(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_texture_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        TextureView textureView = (TextureView) inflate.findViewById(R.id.texture_view);
        textureView.setSurfaceTextureListener(new k(this));
        this.f28201j = inflate;
        return textureView;
    }

    @Override // ye.b
    public final void k(int i10) {
        this.f28182h = i10;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((TextureView) this.f28176b).post(new d.d(this, i10, taskCompletionSource, 10));
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // ye.b
    public final boolean n() {
        return true;
    }
}
