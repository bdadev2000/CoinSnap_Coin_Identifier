package k9;

import android.media.Spatializer;
import com.google.common.collect.y1;

/* loaded from: classes3.dex */
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ o a;

    public j(o oVar) {
        this.a = oVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        o oVar = this.a;
        y1 y1Var = o.f20461j;
        oVar.d();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        o oVar = this.a;
        y1 y1Var = o.f20461j;
        oVar.d();
    }
}
