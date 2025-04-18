package fe;

import android.graphics.PointF;
import android.media.MediaActionSound;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity;
import java.util.Iterator;
import v8.u0;

/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17849d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17851g;

    public j(FrameLayout frameLayout, LightMeterActivity lightMeterActivity, boolean z10) {
        this.f17847b = 1;
        this.f17849d = lightMeterActivity;
        this.f17850f = frameLayout;
        this.f17851g = "ca-app-pub-6691965685689933/1207567043";
        this.f17848c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CameraView cameraView;
        boolean z10;
        int i10 = this.f17847b;
        Object obj = this.f17851g;
        boolean z11 = this.f17848c;
        switch (i10) {
            case 0:
                if (z11 && (z10 = (cameraView = (CameraView) ((c1) obj).f11925d).f16475b) && z10) {
                    if (cameraView.f16491s == null) {
                        cameraView.f16491s = new MediaActionSound();
                    }
                    cameraView.f16491s.play(1);
                }
                c1 c1Var = (c1) obj;
                CameraView cameraView2 = (CameraView) c1Var.f11925d;
                c cVar = CameraView.E;
                cameraView2.getClass();
                Iterator it = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it.hasNext()) {
                    ((ng.c) it.next()).getClass();
                }
                return;
            default:
                h.m mVar = (h.m) this.f17849d;
                View inflate = LayoutInflater.from(mVar).inflate(R.layout.layout_banner_control, (ViewGroup) null);
                FrameLayout frameLayout = (FrameLayout) this.f17850f;
                com.bumptech.glide.e.D(frameLayout);
                frameLayout.addView(inflate);
                u0.R(frameLayout, mVar, (String) obj, z11);
                Handler handler = u0.f26306l;
                if (handler != null) {
                    handler.postDelayed(this, 35000L);
                    return;
                }
                return;
        }
    }

    public j(c1 c1Var, boolean z10, se.a aVar, PointF pointF) {
        this.f17847b = 0;
        this.f17851g = c1Var;
        this.f17848c = z10;
        this.f17849d = aVar;
        this.f17850f = pointF;
    }
}
