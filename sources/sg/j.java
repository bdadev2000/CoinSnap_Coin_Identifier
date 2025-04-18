package sg;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class j extends Lambda implements Function13 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlarmDomain f25083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderActivity f25084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AlarmDomain alarmDomain, ReminderActivity reminderActivity) {
        super(13);
        this.f25083b = alarmDomain;
        this.f25084c = reminderActivity;
    }

    @Override // kotlin.jvm.functions.Function13
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        String title = (String) obj5;
        String des = (String) obj6;
        boolean booleanValue2 = ((Boolean) obj7).booleanValue();
        boolean booleanValue3 = ((Boolean) obj8).booleanValue();
        boolean booleanValue4 = ((Boolean) obj9).booleanValue();
        boolean booleanValue5 = ((Boolean) obj10).booleanValue();
        boolean booleanValue6 = ((Boolean) obj11).booleanValue();
        boolean booleanValue7 = ((Boolean) obj12).booleanValue();
        boolean booleanValue8 = ((Boolean) obj13).booleanValue();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(des, "des");
        AlarmEntity record = xg.d.a(this.f25083b);
        Calendar calendar = Calendar.getInstance();
        calendar.set(12, intValue2);
        calendar.set(11, intValue);
        record.setTime(calendar.getTimeInMillis());
        record.setLabel(title);
        record.setDescription(des);
        record.setIsVibration(booleanValue);
        record.setSoundRes(intValue3);
        record.setIsEnabled(true);
        record.setDay(1, booleanValue2);
        record.setDay(2, booleanValue3);
        record.setDay(3, booleanValue4);
        record.setDay(4, booleanValue5);
        record.setDay(5, booleanValue6);
        record.setDay(6, booleanValue7);
        record.setDay(7, booleanValue8);
        record.setType(0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(record.getTime());
        calendar2.add(5, -1);
        record.setTime(calendar2.getTimeInMillis());
        int i10 = ReminderActivity.f16710l;
        ReminderActivity reminderActivity = this.f25084c;
        RemindViewModel I = reminderActivity.I();
        h onUpdateOnMainThread = new h(reminderActivity, record, 1);
        I.getClass();
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(onUpdateOnMainThread, "onUpdateOnMainThread");
        BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new e(I, record, onUpdateOnMainThread, null), 3, null);
        return Unit.INSTANCE;
    }
}
