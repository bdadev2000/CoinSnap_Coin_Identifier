package ng;

import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import c3.j;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kf.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import sf.k;
import v8.u0;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlantIdentifierActivity f22766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PlantIdentifierActivity plantIdentifierActivity, int i10) {
        super(0);
        this.f22765b = i10;
        this.f22766c = plantIdentifierActivity;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1766invoke() {
        int i10 = this.f22765b;
        PlantIdentifierActivity plantIdentifierActivity = this.f22766c;
        switch (i10) {
            case 0:
                FrameLayout frAds = ((e0) plantIdentifierActivity.n()).f20744z;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                return;
            case 1:
                AppOpenManager.f().f2914k = true;
                if (plantIdentifierActivity.f16679o) {
                    return;
                }
                FrameLayout frAds2 = ((e0) plantIdentifierActivity.n()).f20744z;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                com.bumptech.glide.e.V(frAds2);
                FrameLayout frAds3 = ((e0) plantIdentifierActivity.n()).f20744z;
                Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                u0.Q(frAds3, plantIdentifierActivity, "ca-app-pub-6691965685689933/2165293673", hf.f.a());
                plantIdentifierActivity.f16679o = true;
                return;
            case 2:
                PlantIdentifierActivity.I(plantIdentifierActivity);
                return;
            case 3:
                PlantIdentifierActivity.J(plantIdentifierActivity);
                return;
            case 4:
                FrameLayout frAds4 = ((e0) plantIdentifierActivity.n()).f20744z;
                Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                com.bumptech.glide.e.D(frAds4);
                return;
            case 5:
                FrameLayout frAds5 = ((e0) plantIdentifierActivity.n()).f20744z;
                Intrinsics.checkNotNullExpressionValue(frAds5, "frAds");
                com.bumptech.glide.e.V(frAds5);
                return;
            case 6:
                PlantIdentifierActivity.J(plantIdentifierActivity);
                return;
            case 7:
                Bitmap bitmap = PlantIdentifierActivity.f16673q;
                plantIdentifierActivity.getClass();
                if (com.bumptech.glide.d.q(plantIdentifierActivity)) {
                    if (plantIdentifierActivity.f16677m == null) {
                        k kVar = plantIdentifierActivity.f16676l;
                        if (kVar != null) {
                            kVar.show();
                        }
                        j.b().getClass();
                        RewardedAd.load(plantIdentifierActivity, "ca-app-pub-6691965685689933/2588035316", new AdRequest.Builder().build(), new g(plantIdentifierActivity));
                        return;
                    }
                    k kVar2 = plantIdentifierActivity.f16676l;
                    if (kVar2 != null) {
                        kVar2.cancel();
                        return;
                    }
                    return;
                }
                com.bumptech.glide.d.E(plantIdentifierActivity, R.string.no_internet_connection);
                return;
            default:
                Bitmap bitmap2 = PlantIdentifierActivity.f16673q;
                plantIdentifierActivity.getClass();
                plantIdentifierActivity.startActivity(new Intent(plantIdentifierActivity, (Class<?>) IapActivity.class));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f22765b) {
            case 0:
                m1766invoke();
                return Unit.INSTANCE;
            case 1:
                m1766invoke();
                return Unit.INSTANCE;
            case 2:
                m1766invoke();
                return Unit.INSTANCE;
            case 3:
                m1766invoke();
                return Unit.INSTANCE;
            case 4:
                m1766invoke();
                return Unit.INSTANCE;
            case 5:
                m1766invoke();
                return Unit.INSTANCE;
            case 6:
                m1766invoke();
                return Unit.INSTANCE;
            case 7:
                m1766invoke();
                return Unit.INSTANCE;
            default:
                m1766invoke();
                return Unit.INSTANCE;
        }
    }
}
