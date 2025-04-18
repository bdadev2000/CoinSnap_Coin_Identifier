package b1;

import android.content.Context;
import android.opengl.GLES20;
import androidx.work.p;
import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import com.plantcare.ai.identifier.plantid.domains.PlantDomain;
import com.plantcare.ai.identifier.plantid.service.AlarmReceiver;
import com.plantcare.ai.identifier.plantid.service.LoadAlarmsService;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.disease.HistoryDeleteDiseaseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.history.delete.plant.HistoryDeletePlantActivity;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderDeleteActivity;
import java.io.File;
import java.util.List;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        super(0);
        this.f2269b = i10;
        this.f2270c = obj;
        this.f2271d = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2269b) {
            case 0:
                Context applicationContext = (Context) this.f2270c;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((b) this.f2271d).a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                String fileName = name + ".preferences_pb";
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), vd.e.e("datastore/", fileName));
            case 1:
                m1invoke();
                return Unit.INSTANCE;
            case 2:
                m1invoke();
                return Unit.INSTANCE;
            case 3:
                m1invoke();
                return Unit.INSTANCE;
            case 4:
                m1invoke();
                return Unit.INSTANCE;
            case 5:
                m1invoke();
                return Unit.INSTANCE;
            default:
                m1invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1invoke() {
        int i10 = this.f2269b;
        Object obj = this.f2271d;
        Object obj2 = this.f2270c;
        switch (i10) {
            case 1:
                ((p) obj2).getClass();
                GLES20.glTexParameterf(UInt.m240constructorimpl(36197), df.f.f17023d, df.f.f17028i);
                GLES20.glTexParameterf(UInt.m240constructorimpl(36197), df.f.f17024e, df.f.f17029j);
                int m240constructorimpl = UInt.m240constructorimpl(36197);
                int i11 = df.f.f17025f;
                int i12 = df.f.f17027h;
                GLES20.glTexParameteri(m240constructorimpl, i11, i12);
                GLES20.glTexParameteri(UInt.m240constructorimpl(36197), df.f.f17026g, i12);
                bf.c.b("glTexParameter");
                return;
            case 2:
                int i13 = HistoryDeleteDiseaseActivity.f16618l;
                HistoryViewModel historyViewModel = (HistoryViewModel) ((HistoryDeleteDiseaseActivity) obj2).f16619j.getValue();
                List entities = (List) obj;
                historyViewModel.getClass();
                Intrinsics.checkNotNullParameter(entities, "entities");
                BuildersKt__Builders_commonKt.launch$default(historyViewModel.f22242c, null, null, new tf.a(historyViewModel, entities, null), 3, null);
                return;
            case 3:
                int i14 = HistoryDeletePlantActivity.f16621l;
                HistoryViewModel historyViewModel2 = (HistoryViewModel) ((HistoryDeletePlantActivity) obj2).f16622j.getValue();
                List entities2 = (List) obj;
                historyViewModel2.getClass();
                Intrinsics.checkNotNullParameter(entities2, "entities");
                BuildersKt__Builders_commonKt.launch$default(historyViewModel2.f22242c, null, null, new tf.a(historyViewModel2, entities2, null), 3, null);
                return;
            case 4:
                MyPlantViewModel myPlantViewModel = (MyPlantViewModel) ((gg.i) obj2).f18483j.getValue();
                PlantEntity plantEntity = xg.d.g((PlantDomain) obj);
                myPlantViewModel.getClass();
                Intrinsics.checkNotNullParameter(plantEntity, "plantEntity");
                BuildersKt__Builders_commonKt.launch$default(myPlantViewModel.f22242c, null, null, new jg.a(myPlantViewModel, plantEntity, null), 3, null);
                return;
            case 5:
                ReminderActivity reminderActivity = (ReminderActivity) obj2;
                LoadAlarmsService.a(reminderActivity);
                AlarmReceiver.e(reminderActivity, xg.d.a((AlarmDomain) obj));
                return;
            default:
                ReminderDeleteActivity reminderDeleteActivity = (ReminderDeleteActivity) obj2;
                int i15 = ReminderDeleteActivity.f16713l;
                RemindViewModel remindViewModel = (RemindViewModel) reminderDeleteActivity.f16714j.getValue();
                List entities3 = (List) obj;
                remindViewModel.getClass();
                Intrinsics.checkNotNullParameter(entities3, "entities");
                BuildersKt__Builders_commonKt.launch$default(remindViewModel.f22242c, null, null, new sg.a(remindViewModel, entities3, null), 3, null);
                LoadAlarmsService.a(reminderDeleteActivity);
                return;
        }
    }
}
