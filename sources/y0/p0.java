package y0;

import android.app.KeyguardManager;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.PlantDiseaseDetailActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.details.DetailsDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant.MyPlantDetailActivity;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.di.DiResultActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.healthy.HealthyActivity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyFullScreenActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf.d2;
import kf.x1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class p0 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, int i10) {
        super(1);
        this.f27823b = i10;
        this.f27824c = obj;
    }

    public final void a(View view) {
        int i10 = this.f27823b;
        Object obj = this.f27824c;
        switch (i10) {
            case 3:
                ((PlantDiseaseDetailActivity) obj).onBackPressed();
                return;
            case 4:
                ((sf.e) obj).cancel();
                return;
            case 5:
                sf.l lVar = (sf.l) obj;
                lVar.f25046d.invoke();
                lVar.dismiss();
                return;
            case 6:
                ((DetailsDiseaseActivity) obj).finish();
                return;
            case 7:
            case 8:
            default:
                NotifyFullScreenActivity notifyFullScreenActivity = (NotifyFullScreenActivity) obj;
                Object systemService = notifyFullScreenActivity.getSystemService("keyguard");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                KeyguardManager keyguardManager = (KeyguardManager) systemService;
                if (keyguardManager.isKeyguardLocked()) {
                    keyguardManager.requestDismissKeyguard(notifyFullScreenActivity, new ug.e(notifyFullScreenActivity));
                    return;
                }
                Intent intent = new Intent(notifyFullScreenActivity, (Class<?>) SplashActivity.class);
                intent.setFlags(268468224);
                notifyFullScreenActivity.startActivity(intent);
                notifyFullScreenActivity.finish();
                return;
            case 9:
                ((LightMeterActivity) obj).finish();
                return;
            case 10:
                ((MyPlantDetailActivity) obj).onBackPressed();
                return;
            case 11:
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) obj;
                int i11 = onBoardingActivity.f16666g;
                if (i11 != 0 && i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        Intent intent2 = new Intent(onBoardingActivity, (Class<?>) IapActivity.class);
                        intent2.putExtra("from_onb_or_permission", true);
                        onBoardingActivity.startActivity(intent2);
                        onBoardingActivity.finish();
                        return;
                    }
                    return;
                }
                ((kf.a0) onBoardingActivity.n()).H.setCurrentItem(onBoardingActivity.f16666g + 1);
                return;
            case 12:
                ((DiResultActivity) obj).finish();
                return;
            case 13:
                ((HealthyActivity) obj).finish();
                return;
        }
    }

    public final void b(List list) {
        boolean z10;
        boolean z11;
        int i10 = this.f27823b;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.f27824c;
        switch (i10) {
            case 7:
                if (list.isEmpty()) {
                    yf.b bVar = (yf.b) obj;
                    RecyclerView rcvHistory = ((x1) bVar.c()).f20924v;
                    Intrinsics.checkNotNullExpressionValue(rcvHistory, "rcvHistory");
                    com.bumptech.glide.e.D(rcvHistory);
                    LinearLayout layoutNoData = ((x1) bVar.c()).u;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData, "layoutNoData");
                    com.bumptech.glide.e.V(layoutNoData);
                    FrameLayout frAds = ((x1) bVar.c()).f20923t;
                    Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                    com.bumptech.glide.e.D(frAds);
                    return;
                }
                Intrinsics.checkNotNull(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((HistoryEntity) obj2).getType() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((HistoryEntity) next).getScientificName())) {
                        arrayList2.add(next);
                    }
                }
                ArrayList e2 = xg.d.e(arrayList2);
                if (!e2.isEmpty()) {
                    yf.b bVar2 = (yf.b) obj;
                    RecyclerView rcvHistory2 = ((x1) bVar2.c()).f20924v;
                    Intrinsics.checkNotNullExpressionValue(rcvHistory2, "rcvHistory");
                    com.bumptech.glide.e.V(rcvHistory2);
                    LinearLayout layoutNoData2 = ((x1) bVar2.c()).u;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData2, "layoutNoData");
                    com.bumptech.glide.e.D(layoutNoData2);
                    uf.b bVar3 = bVar2.f28206j;
                    if (bVar3 != null) {
                        bVar3.k(e2);
                    }
                    FrameLayout frAds2 = ((x1) bVar2.c()).f20923t;
                    Intrinsics.checkNotNullExpressionValue(frAds2, "frAds");
                    com.bumptech.glide.e.V(frAds2);
                    if (!bVar2.f28207k) {
                        x5.i.c(new yf.a(bVar2, i12), new yf.a(bVar2, i11));
                        return;
                    }
                    return;
                }
                yf.b bVar4 = (yf.b) obj;
                RecyclerView rcvHistory3 = ((x1) bVar4.c()).f20924v;
                Intrinsics.checkNotNullExpressionValue(rcvHistory3, "rcvHistory");
                com.bumptech.glide.e.D(rcvHistory3);
                LinearLayout layoutNoData3 = ((x1) bVar4.c()).u;
                Intrinsics.checkNotNullExpressionValue(layoutNoData3, "layoutNoData");
                com.bumptech.glide.e.V(layoutNoData3);
                FrameLayout frAds3 = ((x1) bVar4.c()).f20923t;
                Intrinsics.checkNotNullExpressionValue(frAds3, "frAds");
                com.bumptech.glide.e.D(frAds3);
                return;
            default:
                if (list.isEmpty()) {
                    zf.c cVar = (zf.c) obj;
                    RecyclerView rcvHistory4 = ((d2) cVar.c()).f20728v;
                    Intrinsics.checkNotNullExpressionValue(rcvHistory4, "rcvHistory");
                    com.bumptech.glide.e.D(rcvHistory4);
                    LinearLayout layoutNoData4 = ((d2) cVar.c()).u;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData4, "layoutNoData");
                    com.bumptech.glide.e.V(layoutNoData4);
                    FrameLayout frAds4 = ((d2) cVar.c()).f20727t;
                    Intrinsics.checkNotNullExpressionValue(frAds4, "frAds");
                    com.bumptech.glide.e.D(frAds4);
                    return;
                }
                Intrinsics.checkNotNull(list);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (((HistoryEntity) obj3).getType() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList3.add(obj3);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (hashSet2.add(((HistoryEntity) next2).getScientificName())) {
                        arrayList4.add(next2);
                    }
                }
                ArrayList e10 = xg.d.e(arrayList4);
                if (!e10.isEmpty()) {
                    zf.c cVar2 = (zf.c) obj;
                    RecyclerView rcvHistory5 = ((d2) cVar2.c()).f20728v;
                    Intrinsics.checkNotNullExpressionValue(rcvHistory5, "rcvHistory");
                    com.bumptech.glide.e.V(rcvHistory5);
                    LinearLayout layoutNoData5 = ((d2) cVar2.c()).u;
                    Intrinsics.checkNotNullExpressionValue(layoutNoData5, "layoutNoData");
                    com.bumptech.glide.e.D(layoutNoData5);
                    uf.b bVar5 = cVar2.f28761j;
                    if (bVar5 != null) {
                        bVar5.k(e10);
                    }
                    FrameLayout frAds5 = ((d2) cVar2.c()).f20727t;
                    Intrinsics.checkNotNullExpressionValue(frAds5, "frAds");
                    com.bumptech.glide.e.V(frAds5);
                    if (!cVar2.f28762k) {
                        x5.i.c(new zf.b(cVar2, i12), new zf.b(cVar2, i11));
                        return;
                    }
                    return;
                }
                zf.c cVar3 = (zf.c) obj;
                RecyclerView rcvHistory6 = ((d2) cVar3.c()).f20728v;
                Intrinsics.checkNotNullExpressionValue(rcvHistory6, "rcvHistory");
                com.bumptech.glide.e.D(rcvHistory6);
                LinearLayout layoutNoData6 = ((d2) cVar3.c()).u;
                Intrinsics.checkNotNullExpressionValue(layoutNoData6, "layoutNoData");
                com.bumptech.glide.e.V(layoutNoData6);
                FrameLayout frAds6 = ((d2) cVar3.c()).f20727t;
                Intrinsics.checkNotNullExpressionValue(frAds6, "frAds");
                com.bumptech.glide.e.D(frAds6);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f27823b;
        Object obj2 = this.f27824c;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((u0) obj2).f27856g.v(new v0(th2));
                }
                u0 u0Var = (u0) obj2;
                if (u0Var.f27858i.isInitialized()) {
                    ((a1.h) ((l1) u0Var.f27858i.getValue())).close();
                }
                return Unit.INSTANCE;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains((Collection) obj2, ViewCompat.getTransitionName((View) entry.getValue())));
            case 2:
                z1.a db2 = (z1.a) obj;
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.C((String) obj2);
                return null;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            case 4:
                a((View) obj);
                return Unit.INSTANCE;
            case 5:
                a((View) obj);
                return Unit.INSTANCE;
            case 6:
                a((View) obj);
                return Unit.INSTANCE;
            case 7:
                b((List) obj);
                return Unit.INSTANCE;
            case 8:
                b((List) obj);
                return Unit.INSTANCE;
            case 9:
                a((View) obj);
                return Unit.INSTANCE;
            case 10:
                a((View) obj);
                return Unit.INSTANCE;
            case 11:
                a((View) obj);
                return Unit.INSTANCE;
            case 12:
                a((View) obj);
                return Unit.INSTANCE;
            case 13:
                a((View) obj);
                return Unit.INSTANCE;
            case 14:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                IOException it = (IOException) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                byte[] bArr = xh.b.a;
                ((zh.j) obj2).f28817o = true;
                return Unit.INSTANCE;
        }
    }
}
