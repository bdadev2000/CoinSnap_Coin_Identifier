package p000if;

import a6.k;
import android.content.Context;
import com.facebook.appevents.o;
import com.plantcare.ai.identifier.plantid.data.database.AppDatabase;
import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao;
import com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository;
import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.LocationRepository;
import com.plantcare.ai.identifier.plantid.data.network.repository.WeatherRepository;
import com.plantcare.ai.identifier.plantid.data.network.service.LocationService;
import com.plantcare.ai.identifier.plantid.data.network.service.PlantService;
import com.plantcare.ai.identifier.plantid.data.network.service.WeatherService;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapperCallAdapterFactory;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import ni.t0;
import ni.u0;
import rh.a;
import v1.c0;
import wh.k0;
import wh.l0;
import xh.b;

/* loaded from: classes4.dex */
public final class e implements a {
    public final f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19618b;

    public e(f fVar, int i10) {
        this.a = fVar;
        this.f19618b = i10;
    }

    @Override // rh.a
    public final Object get() {
        f fVar = this.a;
        int i10 = this.f19618b;
        switch (i10) {
            case 0:
                AppDatabase appDb = (AppDatabase) fVar.f19620c.get();
                Intrinsics.checkNotNullParameter(appDb, "appDb");
                HistoryPlantDao historyDao = appDb.historyDao();
                k.k(historyDao);
                return new HistoryRepository(historyDao);
            case 1:
                Context appContext = fVar.a.f19654b;
                k.k(appContext);
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                c0 f10 = o.f(appContext, AppDatabase.class, "AppDatabaseVer4.db");
                f10.f25856l = false;
                f10.f25857m = true;
                return (AppDatabase) f10.b();
            case 2:
                return new WeatherRepository((WeatherService) fVar.f19624g.get());
            case 3:
                u0 retrofit = (u0) fVar.f19623f.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                WeatherService weatherService = (WeatherService) retrofit.b(WeatherService.class);
                k.k(weatherService);
                return weatherService;
            case 4:
                l0 okHttpClient = (l0) fVar.f19622e.get();
                Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                t0 t0Var = new t0();
                t0Var.f22881d.add(oi.a.c());
                t0Var.a("https://plantnet.backendvn.com/weather/");
                t0Var.f22882e.add(new ResultWrapperCallAdapterFactory());
                Objects.requireNonNull(okHttpClient, "client == null");
                t0Var.f22879b = okHttpClient;
                return t0Var.b();
            case 5:
                k0 k0Var = new k0();
                TimeUnit unit = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                k0Var.u = b.b(unit);
                Intrinsics.checkNotNullParameter(unit, "unit");
                k0Var.f27106t = b.b(unit);
                Intrinsics.checkNotNullParameter(unit, "unit");
                k0Var.f27107v = b.b(unit);
                k0Var.f27092f = true;
                return new l0(k0Var);
            case 6:
                return new LocationRepository((LocationService) fVar.f19627j.get());
            case 7:
                u0 retrofit2 = (u0) fVar.f19626i.get();
                Intrinsics.checkNotNullParameter(retrofit2, "retrofit");
                LocationService locationService = (LocationService) retrofit2.b(LocationService.class);
                k.k(locationService);
                return locationService;
            case 8:
                l0 okHttpClient2 = (l0) fVar.f19622e.get();
                Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
                t0 t0Var2 = new t0();
                t0Var2.f22881d.add(oi.a.c());
                t0Var2.a("https://api.bigdatacloud.net");
                t0Var2.f22882e.add(new ResultWrapperCallAdapterFactory());
                Objects.requireNonNull(okHttpClient2, "client == null");
                t0Var2.f22879b = okHttpClient2;
                return t0Var2.b();
            case 9:
                AppDatabase appDb2 = (AppDatabase) fVar.f19620c.get();
                Intrinsics.checkNotNullParameter(appDb2, "appDb");
                PlantDao plantDao = appDb2.plantDao();
                k.k(plantDao);
                return new PlantRepository(plantDao);
            case 10:
                return new com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository((PlantService) fVar.f19631n.get());
            case 11:
                u0 retrofit3 = (u0) fVar.f19630m.get();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                PlantService plantService = (PlantService) retrofit3.b(PlantService.class);
                k.k(plantService);
                return plantService;
            case 12:
                l0 okHttpClient3 = (l0) fVar.f19622e.get();
                Intrinsics.checkNotNullParameter(okHttpClient3, "okHttpClient");
                t0 t0Var3 = new t0();
                t0Var3.f22881d.add(oi.a.c());
                t0Var3.a("https://plantid1.infinitydashboard.info/");
                t0Var3.f22882e.add(new ResultWrapperCallAdapterFactory());
                Objects.requireNonNull(okHttpClient3, "client == null");
                t0Var3.f22879b = okHttpClient3;
                u0 b3 = t0Var3.b();
                Intrinsics.checkNotNullExpressionValue(b3, "build(...)");
                return b3;
            case 13:
                AppDatabase appDb3 = (AppDatabase) fVar.f19620c.get();
                Intrinsics.checkNotNullParameter(appDb3, "appDb");
                AlarmDao alarmDao = appDb3.alarmDao();
                k.k(alarmDao);
                return new AlarmRepository(alarmDao);
            default:
                throw new AssertionError(i10);
        }
    }
}
