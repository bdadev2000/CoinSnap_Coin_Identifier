package ug;

import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kf.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RingActivity f25820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(RingActivity ringActivity, int i10) {
        super(1);
        this.f25819b = i10;
        this.f25820c = ringActivity;
    }

    public final void a(View view) {
        int i10 = this.f25819b;
        int i11 = 1;
        RingActivity ringActivity = this.f25820c;
        switch (i10) {
            case 2:
                AlarmEntity alarmEntity = ringActivity.f16729n;
                if (alarmEntity != null && alarmEntity.getType() == 1) {
                    alarmEntity.setIsEnabled(false);
                    ringActivity.I().a(alarmEntity, new h(ringActivity, alarmEntity, i11));
                }
                ringActivity.onBackPressed();
                return;
            default:
                int i12 = RingActivity.f16724p;
                ringActivity.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.add(12, 5);
                Intrinsics.checkNotNull(calendar);
                long time = calendar.getTime().getTime();
                AlarmEntity record = ringActivity.f16729n;
                if (record != null) {
                    record.setIsEnabled(false);
                    ringActivity.I().a(record, new h(ringActivity, record, 2));
                    record.setId(System.currentTimeMillis());
                    record.setTime(time);
                    record.setType(1);
                    record.setIsEnabled(true);
                    RingViewModel I = ringActivity.I();
                    h onEventOnMainThread = new h(ringActivity, record, 3);
                    I.getClass();
                    Intrinsics.checkNotNullParameter(record, "record");
                    Intrinsics.checkNotNullParameter(onEventOnMainThread, "onEventOnMainThread");
                    BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new m(I, record, onEventOnMainThread, null), 3, null);
                    return;
                }
                com.bumptech.glide.d.E(ringActivity, R.string.some_thing_went_wrong);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f25819b;
        RingActivity ringActivity = this.f25820c;
        switch (i10) {
            case 0:
                AlarmEntity alarmEntity = (AlarmEntity) obj;
                Intrinsics.checkNotNull(alarmEntity);
                int i11 = RingActivity.f16724p;
                TextView textView = ((m0) ringActivity.n()).f20828x;
                textView.setText(ringActivity.getString(R.string.it_s_time) + " “" + alarmEntity.getLabel() + "”!");
                textView.setSelected(true);
                ((m0) ringActivity.n()).f20826v.setText(alarmEntity.getDescription());
                TextView textView2 = ((m0) ringActivity.n()).f20827w;
                String format = new SimpleDateFormat("HH:mm", new Locale("en")).format(new Date(System.currentTimeMillis()));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView2.setText(format);
                int i12 = 0;
                if (alarmEntity.isVibration()) {
                    long[] jArr = {1000, 500, 1000, 500, 1000, 500};
                    Vibrator vibrator = ringActivity.f16726k;
                    if (vibrator != null) {
                        vibrator.vibrate(jArr, 0);
                    }
                }
                if (alarmEntity.getSoundRes() != -1) {
                    if (alarmEntity.getSoundRes() == 0) {
                        ringActivity.J(ringActivity.f16727l, null);
                    } else {
                        ringActivity.J(null, Integer.valueOf(alarmEntity.getSoundRes()));
                    }
                } else {
                    Log.d("duylt", "Alarm Not Play Sound");
                }
                ringActivity.f16729n = alarmEntity;
                if (alarmEntity.getType() == 1) {
                    alarmEntity.setIsEnabled(false);
                    ringActivity.I().a(alarmEntity, new h(ringActivity, alarmEntity, i12));
                }
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    ringActivity.onBackPressed();
                }
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
