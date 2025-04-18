package gg;

import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import kf.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f18462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i10) {
        super(0);
        this.f18461b = i10;
        this.f18462c = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f18461b) {
            case 0:
                m133invoke();
                return Unit.INSTANCE;
            case 1:
                m133invoke();
                return Unit.INSTANCE;
            case 2:
                m133invoke();
                return Unit.INSTANCE;
            case 3:
                m133invoke();
                return Unit.INSTANCE;
            case 4:
                m133invoke();
                return Unit.INSTANCE;
            case 5:
                m133invoke();
                return Unit.INSTANCE;
            default:
                m133invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m133invoke() {
        boolean z10;
        int i10 = this.f18461b;
        e eVar = this.f18462c;
        switch (i10) {
            case 0:
                e.h(eVar);
                return;
            case 1:
                e.h(eVar);
                return;
            case 2:
                int i11 = e.f18467j;
                eVar.getClass();
                eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) DiagnoseActivity.class));
                return;
            case 3:
                eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) LightMeterActivity.class));
                return;
            case 4:
                int i12 = e.f18467j;
                eVar.getClass();
                eVar.f18473i.a(new Intent(eVar.requireContext(), (Class<?>) ReminderActivity.class));
                return;
            case 5:
                FrameLayout frAds = ((z1) eVar.c()).f20946z;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            default:
                if (eVar.f18469d) {
                    return;
                }
                eVar.f18469d = true;
                FragmentActivity activity = eVar.getActivity();
                Unit unit = null;
                lc.b bVar = null;
                if (activity != null) {
                    try {
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (!hf.f.a) {
                        z10 = false;
                        if (!z10 && com.facebook.internal.i.A(activity)) {
                            d3.g.r().w(activity, "ca-app-pub-6691965685689933/4772281309", R.layout.layout_native_small_result, ((z1) eVar.c()).f20946z, ((z1) eVar.c()).B.f20932t, new hf.a(eVar, 4));
                        } else {
                            RelativeLayout relayAds = ((z1) eVar.c()).C;
                            Intrinsics.checkNotNullExpressionValue(relayAds, "relayAds");
                            com.bumptech.glide.e.D(relayAds);
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        lc.b bVar2 = hf.f.f19113d;
                        if (bVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("remoteConfig");
                        } else {
                            bVar = bVar2;
                        }
                        z10 = bVar.a("native_home");
                        if (!z10) {
                        }
                        RelativeLayout relayAds2 = ((z1) eVar.c()).C;
                        Intrinsics.checkNotNullExpressionValue(relayAds2, "relayAds");
                        com.bumptech.glide.e.D(relayAds2);
                        unit = Unit.INSTANCE;
                    }
                }
                if (unit == null) {
                    FrameLayout frAds2 = ((z1) eVar.c()).f20946z;
                    Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                    com.bumptech.glide.e.D(frAds2);
                    return;
                }
                return;
        }
    }
}
