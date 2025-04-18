package sg;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.service.AlarmReceiver;
import com.plantcare.ai.identifier.plantid.service.LoadAlarmsService;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderActivity f25080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmEntity f25081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ReminderActivity reminderActivity, AlarmEntity alarmEntity, int i10) {
        super(0);
        this.f25079b = i10;
        this.f25080c = reminderActivity;
        this.f25081d = alarmEntity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f25079b) {
            case 0:
                m1771invoke();
                return Unit.INSTANCE;
            default:
                m1771invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1771invoke() {
        int i10 = this.f25079b;
        AlarmEntity alarmEntity = this.f25081d;
        ReminderActivity reminderActivity = this.f25080c;
        switch (i10) {
            case 0:
                LoadAlarmsService.a(reminderActivity);
                AlarmReceiver.e(reminderActivity, alarmEntity);
                return;
            default:
                LoadAlarmsService.a(reminderActivity);
                AlarmReceiver.e(reminderActivity, alarmEntity);
                return;
        }
    }
}
