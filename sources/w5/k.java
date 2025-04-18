package w5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.r0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebook.x;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomainDelete;
import com.plantcare.ai.identifier.plantid.domains.HistoryDomain;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.domains.ImageDomain;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant.HistoryDeletePlantActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.details.DetailsDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.myplant.MyPlantDetailActivity;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity;
import java.util.List;
import kf.e1;
import kf.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v8.u0;

/* loaded from: classes3.dex */
public final class k extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i10) {
        super(2);
        this.f26779b = i10;
        this.f26780c = obj;
    }

    public final void a(HistoryDomain history, int i10) {
        int i11 = this.f26779b;
        int i12 = 4;
        int i13 = 3;
        int i14 = 2;
        Object obj = this.f26780c;
        switch (i11) {
            case 5:
                Intrinsics.checkNotNullParameter(history, "<anonymous parameter 0>");
                HistoryDeleteDiseaseActivity historyDeleteDiseaseActivity = (HistoryDeleteDiseaseActivity) obj;
                uf.b bVar = historyDeleteDiseaseActivity.f16620k;
                if (bVar != null) {
                    bVar.d(i10, new vf.a(historyDeleteDiseaseActivity, i14), new vf.a(historyDeleteDiseaseActivity, i13), new vf.a(historyDeleteDiseaseActivity, i12));
                }
                historyDeleteDiseaseActivity.J();
                return;
            case 6:
                Intrinsics.checkNotNullParameter(history, "<anonymous parameter 0>");
                HistoryDeletePlantActivity historyDeletePlantActivity = (HistoryDeletePlantActivity) obj;
                uf.b bVar2 = historyDeletePlantActivity.f16623k;
                if (bVar2 != null) {
                    bVar2.d(i10, new wf.a(historyDeletePlantActivity, i14), new wf.a(historyDeletePlantActivity, i13), new wf.a(historyDeletePlantActivity, i12));
                }
                historyDeletePlantActivity.J();
                return;
            case 7:
                Intrinsics.checkNotNullParameter(history, "history");
                yf.b bVar3 = (yf.b) obj;
                int i15 = yf.b.f28204l;
                bVar3.getClass();
                Intent intent = new Intent(bVar3.getActivity(), (Class<?>) DetailsDiseaseActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("KEY_HISTORY", history);
                intent.putExtras(bundle);
                bVar3.startActivity(intent);
                return;
            default:
                Intrinsics.checkNotNullParameter(history, "history");
                zf.c cVar = (zf.c) obj;
                int i16 = zf.c.f28759l;
                cVar.getClass();
                Intent intent2 = new Intent(cVar.getActivity(), (Class<?>) MyPlantDetailActivity.class);
                intent2.putExtra("KEY_HISTORY", history);
                cVar.startActivity(intent2);
                return;
        }
    }

    public final void b(SoundDomain sound) {
        int i10 = this.f26779b;
        Object obj = this.f26780c;
        switch (i10) {
            case 2:
                Intrinsics.checkNotNullParameter(sound, "sound");
                sf.d dVar = (sf.d) obj;
                dVar.f25026g = sound;
                ((e1) dVar.b()).Q.setText(dVar.f25026g.getName());
                return;
            default:
                Intrinsics.checkNotNullParameter(sound, "sound");
                sf.n nVar = (sf.n) obj;
                nVar.f25057i = sound;
                ((t1) nVar.b()).Q.setText(nVar.f25057i.getName());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int i11 = this.f26779b;
        int i12 = 0;
        int i13 = 1;
        Object obj3 = this.f26780c;
        switch (i11) {
            case 0:
                try {
                    x.c().execute(new r0(5, (Integer) obj2, (List) obj3));
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 1:
                ImageDomain imageDomain = (ImageDomain) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(imageDomain, "imageDomain");
                of.f fVar = (of.f) obj3;
                fVar.f23309k.invoke(imageDomain, Integer.valueOf(intValue));
                fVar.dismiss();
                return Unit.INSTANCE;
            case 2:
                ((Number) obj2).intValue();
                b((SoundDomain) obj);
                return Unit.INSTANCE;
            case 3:
                int intValue2 = ((Number) obj).intValue();
                SoundDomain sound = (SoundDomain) obj2;
                Intrinsics.checkNotNullParameter(sound, "sound");
                sf.e eVar = (sf.e) obj3;
                eVar.f25030g.invoke(sound, Integer.valueOf(intValue2));
                eVar.dismiss();
                return Unit.INSTANCE;
            case 4:
                ((Number) obj2).intValue();
                b((SoundDomain) obj);
                return Unit.INSTANCE;
            case 5:
                a((HistoryDomain) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 6:
                a((HistoryDomain) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 7:
                a((HistoryDomain) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 8:
                a((HistoryDomain) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 9:
                IapDomain iap = (IapDomain) obj;
                int intValue3 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(iap, "iap");
                IapActivity iapActivity = (IapActivity) obj3;
                bg.a aVar = iapActivity.f16633j;
                bg.a aVar2 = null;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iapAdapter");
                    aVar = null;
                }
                int i14 = aVar.f2433m;
                bg.a aVar3 = iapActivity.f16633j;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iapAdapter");
                } else {
                    aVar2 = aVar3;
                }
                aVar2.f2433m = intValue3;
                aVar2.notifyItemChanged(intValue3);
                aVar2.notifyItemChanged(i14);
                if (iap.isTypeSubYear()) {
                    ((kf.o) iapActivity.n()).f20845y.setText(iapActivity.getString(R.string.unlimited));
                    ((kf.o) iapActivity.n()).A.setText(iapActivity.getString(R.string.plant_identification_and_disease));
                    LinearLayout layoutIntro1 = ((kf.o) iapActivity.n()).f20842v;
                    Intrinsics.checkNotNullExpressionValue(layoutIntro1, "layoutIntro1");
                    com.bumptech.glide.e.V(layoutIntro1);
                    LinearLayout layoutIntro4 = ((kf.o) iapActivity.n()).f20843w;
                    Intrinsics.checkNotNullExpressionValue(layoutIntro4, "layoutIntro4");
                    com.bumptech.glide.e.V(layoutIntro4);
                } else {
                    ((kf.o) iapActivity.n()).f20845y.setText(iapActivity.getString(R.string.number_scans, String.valueOf(iap.getNumberOfScans())));
                    ((kf.o) iapActivity.n()).A.setText(iapActivity.getString(R.string.plant_identification_and_disease));
                    LinearLayout layoutIntro42 = ((kf.o) iapActivity.n()).f20843w;
                    Intrinsics.checkNotNullExpressionValue(layoutIntro42, "layoutIntro4");
                    com.bumptech.glide.e.E(layoutIntro42);
                    LinearLayout layoutIntro12 = ((kf.o) iapActivity.n()).f20842v;
                    Intrinsics.checkNotNullExpressionValue(layoutIntro12, "layoutIntro1");
                    com.bumptech.glide.e.E(layoutIntro12);
                }
                iapActivity.f16631h = iap;
                return Unit.INSTANCE;
            case 10:
                dg.e language = (dg.e) obj;
                int intValue4 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(language, "language");
                LanguageActivity languageActivity = (LanguageActivity) obj3;
                languageActivity.f16639n = true;
                languageActivity.f16637l = true;
                languageActivity.f16636k = language;
                dg.d dVar = languageActivity.f16635j;
                if (dVar != null) {
                    i10 = dVar.f17037l;
                } else {
                    i10 = -1;
                }
                if (dVar != null) {
                    dVar.f17037l = intValue4;
                    dVar.notifyItemChanged(intValue4);
                    dVar.notifyItemChanged(i10);
                }
                if (!com.bumptech.glide.d.q(languageActivity)) {
                    languageActivity.I();
                } else if (u0.f26301g != null && !languageActivity.f16638m && languageActivity.f16639n) {
                    FrameLayout frAds = ((kf.q) languageActivity.n()).f20858t;
                    Intrinsics.checkNotNullExpressionValue(frAds, "frAds");
                    com.bumptech.glide.e.V(frAds);
                    if (!languageActivity.f16640o) {
                        languageActivity.f16640o = true;
                        e3.b bVar = u0.f26301g;
                        d3.g r6 = d3.g.r();
                        FrameLayout frameLayout = ((kf.q) languageActivity.n()).f20858t;
                        ShimmerFrameLayout shimmerFrameLayout = ((kf.q) languageActivity.n()).f20861x.f20900t;
                        r6.getClass();
                        d3.g.C(languageActivity, bVar, frameLayout, shimmerFrameLayout);
                    }
                } else {
                    languageActivity.I();
                }
                if (!languageActivity.f16638m) {
                    ImageView icDone = ((kf.q) languageActivity.n()).f20859v;
                    Intrinsics.checkNotNullExpressionValue(icDone, "icDone");
                    com.bumptech.glide.e.V(icDone);
                }
                return Unit.INSTANCE;
            default:
                int intValue5 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter((AlarmDomainDelete) obj, "<anonymous parameter 0>");
                ReminderDeleteActivity reminderDeleteActivity = (ReminderDeleteActivity) obj3;
                uf.b bVar2 = reminderDeleteActivity.f16715k;
                if (bVar2 != null) {
                    bVar2.d(intValue5, new sg.l(reminderDeleteActivity, i12), new sg.l(reminderDeleteActivity, i13), new sg.l(reminderDeleteActivity, 2));
                }
                reminderDeleteActivity.I();
                return Unit.INSTANCE;
        }
    }
}
