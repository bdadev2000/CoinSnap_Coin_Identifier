package p000if;

import a6.k;
import android.content.Context;
import com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository;
import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.LocationRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.WeatherRepository;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashViewModel;
import rh.a;

/* loaded from: classes4.dex */
public final class g implements a {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19634b;

    public g(f fVar, int i10) {
        this.a = fVar;
        this.f19634b = i10;
    }

    @Override // rh.a
    public final Object get() {
        f fVar = this.a;
        int i10 = this.f19634b;
        switch (i10) {
            case 0:
                return new HistoryViewModel((HistoryRepository) fVar.f19621d.get());
            case 1:
                return new MainViewModel((WeatherRepository) fVar.f19625h.get(), (LocationRepository) fVar.f19628k.get());
            case 2:
                return new MyPlantViewModel((PlantRepository) fVar.f19629l.get());
            case 3:
                return new NotifyViewModel();
            case 4:
                return new PlantIdViewModel();
            case 5:
                com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository plantRepository = (com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository) fVar.f19632o.get();
                HistoryRepository historyRepository = (HistoryRepository) fVar.f19621d.get();
                Context context = fVar.a.f19654b;
                k.k(context);
                return new PreviewModel(plantRepository, historyRepository, context);
            case 6:
                return new RemindViewModel((AlarmRepository) fVar.f19633p.get());
            case 7:
                return new RingViewModel((AlarmRepository) fVar.f19633p.get());
            case 8:
                return new SearchPlantResultViewModel((PlantRepository) fVar.f19629l.get());
            case 9:
                return new SplashViewModel((AlarmRepository) fVar.f19633p.get());
            default:
                throw new AssertionError(i10);
        }
    }
}
