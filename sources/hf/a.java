package hf;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultActivity;
import gg.i;
import jb.g;
import kf.b2;
import kf.d2;
import kf.o0;
import kf.x1;
import kf.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19108h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19109i;

    public /* synthetic */ a(Object obj, int i10) {
        this.f19108h = i10;
        this.f19109i = obj;
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        int i10 = this.f19108h;
        Object obj = this.f19109i;
        switch (i10) {
            case 0:
                ((FrameLayout) obj).removeAllViews();
                return;
            case 1:
                DiagnoseActivity diagnoseActivity = (DiagnoseActivity) obj;
                FrameLayout frAds = ((kf.e) diagnoseActivity.n()).f20734v;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                FrameLayout frAds2 = ((kf.e) diagnoseActivity.n()).f20734v;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                com.bumptech.glide.e.D(frAds2);
                return;
            case 2:
                FrameLayout frAds3 = ((x1) ((yf.b) obj).c()).f20923t;
                Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                com.bumptech.glide.e.D(frAds3);
                return;
            case 3:
                FrameLayout frAds4 = ((d2) ((zf.c) obj).c()).f20727t;
                Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                com.bumptech.glide.e.D(frAds4);
                return;
            case 4:
                gg.e eVar = (gg.e) obj;
                FrameLayout frAds5 = ((z1) eVar.c()).f20946z;
                Intrinsics.checkNotNullExpressionValue(frAds5, "frAds");
                com.bumptech.glide.e.D(frAds5);
                RelativeLayout relayAds = ((z1) eVar.c()).C;
                Intrinsics.checkNotNullExpressionValue(relayAds, "relayAds");
                com.bumptech.glide.e.D(relayAds);
                return;
            case 5:
                i iVar = (i) obj;
                FrameLayout frAds6 = ((b2) iVar.c()).f20704t;
                Intrinsics.checkNotNullExpressionValue(frAds6, "frAds");
                com.bumptech.glide.e.D(frAds6);
                RelativeLayout relayAds2 = ((b2) iVar.c()).f20706w;
                Intrinsics.checkNotNullExpressionValue(relayAds2, "relayAds");
                com.bumptech.glide.e.D(relayAds2);
                return;
            default:
                SearchPlantResultActivity searchPlantResultActivity = (SearchPlantResultActivity) obj;
                FrameLayout frAds7 = ((o0) searchPlantResultActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds7, "frAds");
                com.bumptech.glide.e.D(frAds7);
                RelativeLayout relayAds3 = ((o0) searchPlantResultActivity.n()).A;
                Intrinsics.checkNotNullExpressionValue(relayAds3, "relayAds");
                com.bumptech.glide.e.D(relayAds3);
                return;
        }
    }

    @Override // jb.g
    public final void r(AdError adError) {
        int i10 = this.f19108h;
        Object obj = this.f19109i;
        switch (i10) {
            case 1:
                DiagnoseActivity diagnoseActivity = (DiagnoseActivity) obj;
                FrameLayout frAds = ((kf.e) diagnoseActivity.n()).f20734v;
                Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                com.bumptech.glide.e.D(frAds);
                FrameLayout frAds2 = ((kf.e) diagnoseActivity.n()).f20734v;
                Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                com.bumptech.glide.e.D(frAds2);
                return;
            case 2:
                FrameLayout frAds3 = ((x1) ((yf.b) obj).c()).f20923t;
                Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                com.bumptech.glide.e.D(frAds3);
                return;
            case 3:
                FrameLayout frAds4 = ((d2) ((zf.c) obj).c()).f20727t;
                Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                com.bumptech.glide.e.D(frAds4);
                return;
            case 4:
                gg.e eVar = (gg.e) obj;
                FrameLayout frAds5 = ((z1) eVar.c()).f20946z;
                Intrinsics.checkNotNullExpressionValue(frAds5, "frAds");
                com.bumptech.glide.e.D(frAds5);
                RelativeLayout relayAds = ((z1) eVar.c()).C;
                Intrinsics.checkNotNullExpressionValue(relayAds, "relayAds");
                com.bumptech.glide.e.D(relayAds);
                return;
            case 5:
                i iVar = (i) obj;
                FrameLayout frAds6 = ((b2) iVar.c()).f20704t;
                Intrinsics.checkNotNullExpressionValue(frAds6, "frAds");
                com.bumptech.glide.e.D(frAds6);
                RelativeLayout relayAds2 = ((b2) iVar.c()).f20706w;
                Intrinsics.checkNotNullExpressionValue(relayAds2, "relayAds");
                com.bumptech.glide.e.D(relayAds2);
                return;
            case 6:
                SearchPlantResultActivity searchPlantResultActivity = (SearchPlantResultActivity) obj;
                FrameLayout frAds7 = ((o0) searchPlantResultActivity.n()).u;
                Intrinsics.checkNotNullExpressionValue(frAds7, "frAds");
                com.bumptech.glide.e.D(frAds7);
                RelativeLayout relayAds3 = ((o0) searchPlantResultActivity.n()).A;
                Intrinsics.checkNotNullExpressionValue(relayAds3, "relayAds");
                com.bumptech.glide.e.D(relayAds3);
                return;
            default:
                return;
        }
    }

    @Override // jb.g
    public final void v(e3.b nativeAd) {
        switch (this.f19108h) {
            case 4:
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                return;
            default:
                return;
        }
    }
}
