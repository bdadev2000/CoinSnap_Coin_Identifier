package pf;

import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DiagnoseActivity f23640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(DiagnoseActivity diagnoseActivity, int i10) {
        super(0);
        this.f23639b = i10;
        this.f23640c = diagnoseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23639b) {
            case 0:
                m1768invoke();
                return Unit.INSTANCE;
            default:
                m1768invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1768invoke() {
        boolean z10;
        int i10 = this.f23639b;
        DiagnoseActivity diagnoseActivity = this.f23640c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((kf.e) diagnoseActivity.n()).f20734v;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            default:
                int i11 = diagnoseActivity.f16610l + 1;
                diagnoseActivity.f16610l = i11;
                try {
                    if (i11 < 3) {
                        try {
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (hf.f.a) {
                            lc.b bVar = hf.f.f19113d;
                            if (bVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                                bVar = null;
                            }
                            z10 = bVar.a("native_Diagnose");
                            if (!z10) {
                            }
                            FrameLayout frAds2 = ((kf.e) diagnoseActivity.n()).f20734v;
                            Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                            com.bumptech.glide.e.D(frAds2);
                            FrameLayout frAds3 = ((kf.e) diagnoseActivity.n()).f20734v;
                            Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                            com.bumptech.glide.e.D(frAds3);
                            return;
                        }
                        z10 = false;
                        if (!z10 && com.bumptech.glide.d.q(diagnoseActivity)) {
                            if (x5.i.l()) {
                                FrameLayout frAds4 = ((kf.e) diagnoseActivity.n()).f20734v;
                                Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                                com.bumptech.glide.e.D(frAds4);
                                return;
                            }
                            d3.g.r().w(diagnoseActivity, "ca-app-pub-6691965685689933/3191606328", R.layout.layout_native_diagnose, ((kf.e) diagnoseActivity.n()).f20734v, ((kf.e) diagnoseActivity.n()).f20738z.f20932t, new hf.a(diagnoseActivity, 1));
                            return;
                        }
                        FrameLayout frAds22 = ((kf.e) diagnoseActivity.n()).f20734v;
                        Intrinsics.checkNotNullExpressionValue(frAds22, "frAds");
                        com.bumptech.glide.e.D(frAds22);
                        FrameLayout frAds32 = ((kf.e) diagnoseActivity.n()).f20734v;
                        Intrinsics.checkNotNullExpressionValue(frAds32, "frAds");
                        com.bumptech.glide.e.D(frAds32);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    FrameLayout frAds5 = ((kf.e) diagnoseActivity.n()).f20734v;
                    Intrinsics.checkNotNullExpressionValue(frAds5, "frAds");
                    com.bumptech.glide.e.D(frAds5);
                    FrameLayout frAds6 = ((kf.e) diagnoseActivity.n()).f20734v;
                    Intrinsics.checkNotNullExpressionValue(frAds6, "frAds");
                    com.bumptech.glide.e.D(frAds6);
                    return;
                }
        }
    }
}
