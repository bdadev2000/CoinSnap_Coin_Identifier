package fg;

import a4.u;
import android.content.Intent;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f17864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MainActivity mainActivity, int i10) {
        super(0);
        this.f17863b = i10;
        this.f17864c = mainActivity;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m132invoke() {
        int i10 = this.f17863b;
        MainActivity mainActivity = this.f17864c;
        switch (i10) {
            case 0:
                MainActivity.I(mainActivity);
                return;
            case 1:
                MainActivity.I(mainActivity);
                return;
            case 2:
                int i11 = MainActivity.f16644q;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) PlantIdentifierActivity.class));
                return;
            case 3:
                if (com.bumptech.glide.d.q(mainActivity)) {
                    ArrayList arrayList = mainActivity.f16647l;
                    if (true ^ arrayList.isEmpty()) {
                        d3.g gVar = new d3.g();
                        gVar.G((u) arrayList.get(0));
                        z1 o10 = r0.o(gVar.k());
                        Intrinsics.checkNotNullExpressionValue(o10, "of(...)");
                        a4.f fVar = new a4.f();
                        fVar.f112d = new ArrayList(o10);
                        a4.i b3 = fVar.b();
                        Intrinsics.checkNotNullExpressionValue(b3, "build(...)");
                        a4.d dVar = mainActivity.f16650o;
                        if (dVar != null) {
                            dVar.H(mainActivity, b3);
                        }
                    } else {
                        com.bumptech.glide.d.E(mainActivity, R.string.some_thing_went_wrong);
                    }
                    xg.b bVar = xg.b.a;
                    Intrinsics.checkNotNullExpressionValue("MainActivity", "getSimpleName(...)");
                    bVar.b("MainActivity", "IAP_popup_buynow");
                    return;
                }
                com.bumptech.glide.d.E(mainActivity, R.string.no_internet_connection);
                return;
            case 4:
                mainActivity.f16646k = true;
                MainActivity.I(mainActivity);
                return;
            default:
                MainActivity.I(mainActivity);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f17863b) {
            case 0:
                m132invoke();
                return Unit.INSTANCE;
            case 1:
                m132invoke();
                return Unit.INSTANCE;
            case 2:
                m132invoke();
                return Unit.INSTANCE;
            case 3:
                m132invoke();
                return Unit.INSTANCE;
            case 4:
                m132invoke();
                return Unit.INSTANCE;
            default:
                m132invoke();
                return Unit.INSTANCE;
        }
    }
}
