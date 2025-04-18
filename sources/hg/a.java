package hg;

import android.widget.FrameLayout;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant.MyPlantDetailActivity;
import hf.f;
import kf.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v8.u0;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyPlantDetailActivity f19115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(MyPlantDetailActivity myPlantDetailActivity, int i10) {
        super(0);
        this.f19114b = i10;
        this.f19115c = myPlantDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f19114b) {
            case 0:
                m138invoke();
                return Unit.INSTANCE;
            default:
                m138invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m138invoke() {
        int i10 = this.f19114b;
        MyPlantDetailActivity myPlantDetailActivity = this.f19115c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((w) myPlantDetailActivity.n()).f20909t;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                e.D(frAds);
                return;
            default:
                int i11 = MyPlantDetailActivity.f16661f;
                FrameLayout frAds2 = ((w) myPlantDetailActivity.n()).f20909t;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                u0.Q(frAds2, myPlantDetailActivity, "ca-app-pub-6691965685689933/2165293673", f.a() && d.q(myPlantDetailActivity));
                return;
        }
    }
}
