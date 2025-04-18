package qg;

import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import kf.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchPlantResultActivity f23907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SearchPlantResultActivity searchPlantResultActivity, int i10) {
        super(0);
        this.f23906b = i10;
        this.f23907c = searchPlantResultActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23906b) {
            case 0:
                m1770invoke();
                return Unit.INSTANCE;
            default:
                m1770invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1770invoke() {
        int i10 = this.f23906b;
        SearchPlantResultActivity searchPlantResultActivity = this.f23907c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((o0) searchPlantResultActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            default:
                int i11 = searchPlantResultActivity.f16703j + 1;
                searchPlantResultActivity.f16703j = i11;
                if (i11 < 3) {
                    try {
                        searchPlantResultActivity.I();
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                return;
        }
    }
}
