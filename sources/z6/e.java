package z6;

import android.content.Intent;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import com.tools.arruler.ui.component.tutorial.ArTutorialActivity;
import g4.AbstractC2292b;

/* loaded from: classes3.dex */
public final class e extends AbstractC2292b {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24558c;

    public /* synthetic */ e(ArRulerActivity arRulerActivity, int i9) {
        this.b = i9;
        this.f24558c = arRulerActivity;
    }

    @Override // g4.AbstractC2292b
    public final void h() {
        ArRulerActivity arRulerActivity = this.f24558c;
        switch (this.b) {
            case 0:
                arRulerActivity.s(ImageLibraryActivity.class, null);
                return;
            default:
                int i9 = ArRulerActivity.f19637r;
                arRulerActivity.getClass();
                arRulerActivity.startActivity(new Intent(arRulerActivity, (Class<?>) ArTutorialActivity.class));
                return;
        }
    }
}
