package E6;

import K6.i;
import android.content.Context;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.imagedetail.ImageDetailActivity;
import com.tools.arruler.ui.component.language.LanguageActivity;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import com.tools.arruler.ui.component.splash.SplashActivity;
import g.InterfaceC2278b;
import k.AbstractActivityC2417f;
import k.AbstractC2422k;
import z6.h;

/* loaded from: classes3.dex */
public final class b implements InterfaceC2278b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1042a;
    public final /* synthetic */ AbstractActivityC2417f b;

    public /* synthetic */ b(AbstractActivityC2417f abstractActivityC2417f, int i9) {
        this.f1042a = i9;
        this.b = abstractActivityC2417f;
    }

    @Override // g.InterfaceC2278b
    public final void a(Context context) {
        switch (this.f1042a) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.b;
                if (!homeActivity.f19652i) {
                    homeActivity.f19652i = true;
                    ((g) homeActivity.a()).getClass();
                    return;
                }
                return;
            case 1:
                ImageDetailActivity imageDetailActivity = (ImageDetailActivity) this.b;
                if (!imageDetailActivity.f19662i) {
                    imageDetailActivity.f19662i = true;
                    ((I6.f) imageDetailActivity.a()).getClass();
                    return;
                }
                return;
            case 2:
                LanguageActivity languageActivity = (LanguageActivity) this.b;
                if (!languageActivity.f19667i) {
                    languageActivity.f19667i = true;
                    ((i) languageActivity.a()).getClass();
                    return;
                }
                return;
            case 3:
                ImageLibraryActivity imageLibraryActivity = (ImageLibraryActivity) this.b;
                if (!imageLibraryActivity.f19673i) {
                    imageLibraryActivity.f19673i = true;
                    ((N6.g) imageLibraryActivity.a()).getClass();
                    return;
                }
                return;
            case 4:
                SplashActivity splashActivity = (SplashActivity) this.b;
                if (!splashActivity.f19704i) {
                    splashActivity.f19704i = true;
                    ((W6.e) splashActivity.a()).getClass();
                    return;
                }
                return;
            case 5:
                AbstractActivityC2417f abstractActivityC2417f = this.b;
                AbstractC2422k i9 = abstractActivityC2417f.i();
                i9.a();
                abstractActivityC2417f.getSavedStateRegistry().a("androidx:appcompat");
                i9.e();
                return;
            default:
                ArRulerActivity arRulerActivity = (ArRulerActivity) this.b;
                if (!arRulerActivity.f19641i) {
                    arRulerActivity.f19641i = true;
                    ((h) arRulerActivity.a()).getClass();
                    return;
                }
                return;
        }
    }
}
