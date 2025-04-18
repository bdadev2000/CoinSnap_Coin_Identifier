package com.plantcare.ai.identifier.plantid.data.database;

import android.content.Context;
import com.facebook.appevents.o;
import com.plantcare.ai.identifier.plantid.data.database.daos.AlarmDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.HistoryPlantDao;
import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v1.c0;
import v1.f0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/AppDatabase;", "Lv1/f0;", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/HistoryPlantDao;", "historyDao", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/PlantDao;", "plantDao", "Lcom/plantcare/ai/identifier/plantid/data/database/daos/AlarmDao;", "alarmDao", "<init>", "()V", "Companion", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class AppDatabase extends f0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AppDatabase INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/plantcare/ai/identifier/plantid/data/database/AppDatabase;", "getInstance", "context", "Landroid/content/Context;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppDatabase getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase = AppDatabase.INSTANCE;
            if (appDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    c0 f10 = o.f(applicationContext, AppDatabase.class, "AppDatabaseVer4.db");
                    f10.f25854j = true;
                    appDatabase = (AppDatabase) f10.b();
                    AppDatabase.INSTANCE = appDatabase;
                }
            }
            return appDatabase;
        }
    }

    public abstract AlarmDao alarmDao();

    public abstract HistoryPlantDao historyDao();

    public abstract PlantDao plantDao();
}
