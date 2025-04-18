package com.plantcare.ai.identifier.plantid.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.plantcare.ai.identifier.plantid.data.database.AppDatabase;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import eb.j;
import java.util.ArrayList;
import java.util.List;
import m1.b;

/* loaded from: classes4.dex */
public final class LoadAlarmsService extends IntentService {

    /* renamed from: b, reason: collision with root package name */
    public static final String f16606b = j.k("LoadAlarmsService", ".ACTION_COMPLETE");

    public LoadAlarmsService() {
        super("LoadAlarmsService");
    }

    public static void a(Context context) {
        context.startService(new Intent(context, (Class<?>) LoadAlarmsService.class));
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        List<AlarmEntity> allRecordAlarmTypeList = AppDatabase.INSTANCE.getInstance(this).alarmDao().getAllRecordAlarmTypeList();
        Intent intent2 = new Intent(f16606b);
        intent2.putParcelableArrayListExtra("alarms_extra", new ArrayList<>(allRecordAlarmTypeList));
        b.a(this).c(intent2);
    }
}
