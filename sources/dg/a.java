package dg;

import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import kf.q;
import kotlin.jvm.internal.Intrinsics;
import v8.u0;

/* loaded from: classes4.dex */
public final class a implements hf.c {
    public final /* synthetic */ LanguageActivity a;

    public a(LanguageActivity languageActivity) {
        this.a = languageActivity;
    }

    @Override // hf.c
    public final void a() {
        if (u0.f26300f == null) {
            FrameLayout frAds = ((q) this.a.n()).f20858t;
            Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
            com.bumptech.glide.e.D(frAds);
        }
    }

    @Override // hf.c
    public final void b() {
        int i10 = LanguageActivity.f16634p;
        this.a.L();
    }
}
