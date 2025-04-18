package androidx.databinding;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class c implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1314b;

    public /* synthetic */ c(int i10) {
        this.f1314b = i10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        e eVar;
        switch (this.f1314b) {
            case 0:
                if (view != null) {
                    eVar = (e) view.getTag(R.id.dataBinding);
                } else {
                    eVar = null;
                }
                eVar.f1319f.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ViewCompat.requestApplyInsets(view);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
