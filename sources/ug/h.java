package ug;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.service.AlarmReceiver;
import com.plantcare.ai.identifier.plantid.service.LoadAlarmsService;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RingActivity f25817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmEntity f25818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(RingActivity ringActivity, AlarmEntity alarmEntity, int i10) {
        super(0);
        this.f25816b = i10;
        this.f25817c = ringActivity;
        this.f25818d = alarmEntity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f25816b) {
            case 0:
                m1773invoke();
                return Unit.INSTANCE;
            case 1:
                m1773invoke();
                return Unit.INSTANCE;
            case 2:
                m1773invoke();
                return Unit.INSTANCE;
            default:
                m1773invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1773invoke() {
        int i10 = this.f25816b;
        AlarmEntity alarmEntity = this.f25818d;
        RingActivity ringActivity = this.f25817c;
        switch (i10) {
            case 0:
                LoadAlarmsService.a(ringActivity);
                AlarmReceiver.e(ringActivity, alarmEntity);
                return;
            case 1:
                AlarmReceiver.e(ringActivity, alarmEntity);
                return;
            case 2:
                AlarmReceiver.e(ringActivity, alarmEntity);
                return;
            default:
                LoadAlarmsService.a(ringActivity);
                AlarmReceiver.e(ringActivity, alarmEntity);
                ringActivity.onBackPressed();
                return;
        }
    }
}
