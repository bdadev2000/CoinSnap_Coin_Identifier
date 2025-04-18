package gg;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.plantcare.ai.identifier.plantid.R;
import kf.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f18477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i10) {
        super(0);
        this.f18476b = i10;
        this.f18477c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f18476b) {
            case 0:
                m134invoke();
                return Unit.INSTANCE;
            default:
                m134invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m134invoke() {
        boolean z10;
        int i10 = this.f18476b;
        i iVar = this.f18477c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((b2) iVar.c()).f20704t;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            default:
                if (iVar.f18482i) {
                    return;
                }
                iVar.f18482i = true;
                FragmentActivity activity = iVar.getActivity();
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
                            if (x5.i.l()) {
                                FrameLayout frAds2 = ((b2) iVar.c()).f20704t;
                                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                                com.bumptech.glide.e.D(frAds2);
                                return;
                            }
                            d3.g.r().w(activity, "ca-app-pub-6691965685689933/3478375342", R.layout.layout_native_small_result, ((b2) iVar.c()).f20704t, ((b2) iVar.c()).f20705v.f20932t, new hf.a(iVar, 5));
                        } else {
                            FrameLayout frAds3 = ((b2) iVar.c()).f20704t;
                            Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                            com.bumptech.glide.e.D(frAds3);
                            RelativeLayout relayAds = ((b2) iVar.c()).f20706w;
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
                        z10 = bVar.a("native_my_plant");
                        if (!z10) {
                        }
                        FrameLayout frAds32 = ((b2) iVar.c()).f20704t;
                        Intrinsics.checkNotNullExpressionValue(frAds32, "frAds");
                        com.bumptech.glide.e.D(frAds32);
                        RelativeLayout relayAds2 = ((b2) iVar.c()).f20706w;
                        Intrinsics.checkNotNullExpressionValue(relayAds2, "relayAds");
                        com.bumptech.glide.e.D(relayAds2);
                        unit = Unit.INSTANCE;
                    }
                }
                if (unit == null) {
                    FrameLayout frAds4 = ((b2) iVar.c()).f20704t;
                    Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                    com.bumptech.glide.e.D(frAds4);
                    return;
                }
                return;
        }
    }
}
