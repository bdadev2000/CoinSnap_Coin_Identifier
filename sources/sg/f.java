package sg;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.domains.AlarmDomain;
import com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class f extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReminderActivity f25076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ReminderActivity reminderActivity, int i10) {
        super(2);
        this.f25075b = i10;
        this.f25076c = reminderActivity;
    }

    public final void a(AlarmDomain reminder) {
        int i10 = this.f25075b;
        ReminderActivity reminderActivity = this.f25076c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(reminder, "reminder");
                int i11 = ReminderActivity.f16710l;
                reminderActivity.getClass();
                new sf.n(reminderActivity, xg.d.a(reminder), reminder.getSoundRes(), b6.c.f2310o, new j(reminder, reminderActivity)).show();
                return;
            default:
                Intrinsics.checkNotNullParameter(reminder, "reminder");
                int i12 = ReminderActivity.f16710l;
                reminderActivity.getClass();
                reminder.setEnabled(!reminder.getIsEnabled());
                RemindViewModel I = reminderActivity.I();
                AlarmEntity record = xg.d.a(reminder);
                b1.a onUpdateOnMainThread = new b1.a(5, reminderActivity, reminder);
                I.getClass();
                Intrinsics.checkNotNullParameter(record, "record");
                Intrinsics.checkNotNullParameter(onUpdateOnMainThread, "onUpdateOnMainThread");
                BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new e(I, record, onUpdateOnMainThread, null), 3, null);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25075b) {
            case 0:
                ((Number) obj2).intValue();
                a((AlarmDomain) obj);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                a((AlarmDomain) obj);
                return Unit.INSTANCE;
        }
    }
}
