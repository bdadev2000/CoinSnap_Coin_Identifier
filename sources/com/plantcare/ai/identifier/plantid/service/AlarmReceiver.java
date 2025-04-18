package com.plantcare.ai.identifier.plantid.service;

import a4.h0;
import a6.k;
import ac.e;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.core.app.NotificationCompat;
import androidx.core.app.m0;
import androidx.core.app.s0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.data.database.AppDatabase;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyFullScreenActivity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import d0.h;
import java.util.Calendar;
import java.util.TimeZone;
import l2.d;
import qa.a;

/* loaded from: classes4.dex */
public final class AlarmReceiver extends BroadcastReceiver {
    public static void a(Context context, AlarmEntity alarmEntity) {
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(PendingIntent.getBroadcast(context, alarmEntity.notificationId(), new Intent(context, (Class<?>) AlarmReceiver.class), 201326592));
    }

    public static void b(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null) {
            return;
        }
        String string = context.getString(R.string.channel_name);
        notificationChannel = notificationManager.getNotificationChannel(string);
        if (notificationChannel == null) {
            h0.m();
            NotificationChannel c10 = d.c(string);
            c10.enableVibration(true);
            c10.setVibrationPattern(new long[]{1000, 500, 1000, 500, 1000, 500});
            c10.setBypassDnd(true);
            notificationManager.createNotificationChannel(c10);
        }
    }

    public static AlarmEntity c(String str) {
        int i10;
        AlarmEntity alarmEntity = new AlarmEntity();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        if (str.equals("LABEL_NOTIFY_FULL_SCREEN")) {
            i10 = 8;
        } else {
            i10 = 7;
        }
        calendar.set(11, i10);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        alarmEntity.setId(System.currentTimeMillis());
        alarmEntity.setTime(calendar.getTimeInMillis());
        alarmEntity.setLabel(str);
        alarmEntity.setDescription("");
        alarmEntity.setIsVibration(false);
        alarmEntity.setSoundRes(R.raw.voice_sound_1);
        alarmEntity.setIsEnabled(true);
        alarmEntity.setDay(1, true);
        alarmEntity.setDay(2, true);
        alarmEntity.setDay(3, true);
        alarmEntity.setDay(4, true);
        alarmEntity.setDay(5, true);
        alarmEntity.setDay(6, true);
        alarmEntity.setDay(7, true);
        alarmEntity.setType(0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(alarmEntity.getTime());
        calendar2.add(5, -1);
        alarmEntity.setTime(calendar2.getTimeInMillis());
        return alarmEntity;
    }

    public static PendingIntent d(Context context, AlarmEntity alarmEntity) {
        Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("KEY_DATA_TO_RING_SCREEN", alarmEntity);
        intent.putExtras(bundle);
        return PendingIntent.getActivity(context, alarmEntity.notificationId(), intent, 201326592);
    }

    public static void e(Context context, AlarmEntity alarmEntity) {
        boolean z10;
        SparseBooleanArray days = alarmEntity.getDays();
        boolean z11 = false;
        for (int i10 = 0; i10 < days.size() && !z11; i10++) {
            z11 = days.valueAt(i10);
        }
        if (z11 && alarmEntity.isEnabled()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(alarmEntity.getTime());
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = calendar.get(7);
            int i12 = 6;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 6) {
                                if (i11 != 7) {
                                    i12 = 0;
                                } else {
                                    i12 = 5;
                                }
                            } else {
                                i12 = 4;
                            }
                        } else {
                            i12 = 3;
                        }
                    } else {
                        i12 = 2;
                    }
                } else {
                    i12 = 1;
                }
            }
            SparseBooleanArray days2 = alarmEntity.getDays();
            int i13 = 0;
            do {
                if (days2.valueAt((i12 + i13) % 7) && calendar.getTimeInMillis() > currentTimeMillis) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    calendar.add(5, 1);
                    i13++;
                }
                if (z10) {
                    break;
                }
            } while (i13 < 7);
            alarmEntity.setTime((calendar.getTimeInMillis() / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("alarm_key", alarmEntity);
            intent.putExtra("bundle_extra", bundle);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, alarmEntity.notificationId(), intent, 201326592);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (alarmManager != null) {
                a aVar = new a(20, alarmManager, context);
                ((AlarmManager) aVar.f23737d).setAlarmClock(new AlarmManager.AlarmClockInfo(alarmEntity.getTime(), d((Context) aVar.f23736c, alarmEntity)), broadcast);
                return;
            }
            throw new IllegalStateException("AlarmManager is null");
        }
        a(context, alarmEntity);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AlarmEntity alarmNotifyTypeDaily;
        int notificationId;
        Bundle bundleExtra = intent.getBundleExtra("bundle_extra");
        if (bundleExtra != null) {
            AlarmEntity alarmEntity = (AlarmEntity) bundleExtra.getSerializable("alarm_key");
            if (!alarmEntity.getLabel().matches("LABEL_NOTIFY_FULL_SCREEN") && !alarmEntity.getLabel().matches("LABEL_NOTIFY_DAILY")) {
                alarmNotifyTypeDaily = AppDatabase.INSTANCE.getInstance(context).alarmDao().searchAlarmById(alarmEntity.getId());
                notificationId = alarmNotifyTypeDaily.notificationId();
            } else if (alarmEntity.getLabel().matches("LABEL_NOTIFY_FULL_SCREEN")) {
                alarmNotifyTypeDaily = AppDatabase.INSTANCE.getInstance(context).alarmDao().getAlarmNotifyTypeFullScreen();
                notificationId = alarmNotifyTypeDaily.notificationId();
            } else {
                alarmNotifyTypeDaily = AppDatabase.INSTANCE.getInstance(context).alarmDao().getAlarmNotifyTypeDaily();
                notificationId = alarmNotifyTypeDaily.notificationId();
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            b(context);
            s0 s0Var = new s0(context, "alarm_channel");
            Notification notification = s0Var.f1242s;
            notification.icon = R.drawable.ic_alarm_white;
            s0Var.f1238o = h.getColor(context, R.color.primary);
            s0Var.d(context.getString(R.string.app_name));
            s0Var.f1229f = s0.b(alarmNotifyTypeDaily.getLabel());
            notification.tickerText = s0.b(alarmNotifyTypeDaily.getLabel());
            s0Var.e(RingtoneManager.getDefaultUri(2));
            s0Var.f1230g = d(context, alarmNotifyTypeDaily);
            s0Var.c(true);
            s0Var.f1233j = 2;
            if (!alarmNotifyTypeDaily.getLabel().matches("LABEL_NOTIFY_FULL_SCREEN") && !alarmNotifyTypeDaily.getLabel().matches("LABEL_NOTIFY_DAILY")) {
                notificationManager.notify(notificationId, s0Var.a());
            }
            e(context, alarmNotifyTypeDaily);
            if (alarmNotifyTypeDaily.getLabel().matches("LABEL_NOTIFY_FULL_SCREEN")) {
                if (Calendar.getInstance(Calendar.getInstance().getTimeZone()).get(11) == 8) {
                    if (k.F(context) && GlobalApp.f16594h) {
                        Intent intent2 = new Intent(context, (Class<?>) NotifyFullScreenActivity.class);
                        intent2.addFlags(268435456);
                        context.startActivity(intent2);
                    } else {
                        Intent intent3 = new Intent(context, (Class<?>) NotifyFullScreenActivity.class);
                        intent3.addFlags(335577088);
                        context.startActivity(intent3);
                    }
                    a(context, alarmNotifyTypeDaily);
                    AlarmEntity c10 = c("LABEL_NOTIFY_FULL_SCREEN");
                    AppDatabase.Companion companion = AppDatabase.INSTANCE;
                    companion.getInstance(context).alarmDao().deleteAlarmTypeNotifyFullScreen();
                    companion.getInstance(context).alarmDao().saveRecordAlarm(c10);
                    LoadAlarmsService.a(context);
                    e(context, c10);
                    return;
                }
                return;
            }
            if (alarmNotifyTypeDaily.getLabel().matches("LABEL_NOTIFY_DAILY")) {
                if (Calendar.getInstance(Calendar.getInstance().getTimeZone()).get(11) == 7) {
                    Intent intent4 = new Intent(context, (Class<?>) SplashActivity.class);
                    intent4.addFlags(268468224);
                    b(context);
                    NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
                    s0 s0Var2 = new s0(context, "alarm_channel");
                    Notification notification2 = s0Var2.f1242s;
                    notification2.icon = R.drawable.ic_alarm_white;
                    s0Var2.f1238o = h.getColor(context, R.color.primary);
                    s0Var2.d(context.getString(R.string.app_name));
                    s0Var2.f1229f = s0.b(context.getString(((Number) e.m(Integer.valueOf(R.string.notification_content_weather), "description_notify")).intValue()));
                    notification2.tickerText = s0.b(context.getString(((Number) e.m(Integer.valueOf(R.string.app_name), "title_notify")).intValue()));
                    s0Var2.e(RingtoneManager.getDefaultUri(2));
                    s0Var2.c(true);
                    s0Var2.f1233j = 2;
                    s0Var2.f1230g = PendingIntent.getActivity(context, 0, intent4, 201326592);
                    m0 m0Var = new m0();
                    m0Var.f1250c = s0.b(context.getString(((Number) e.m(Integer.valueOf(R.string.app_name), "title_notify")).intValue()));
                    m0Var.f1209e = s0.b(context.getString(((Number) e.m(Integer.valueOf(R.string.notification_content_weather), "description_notify")).intValue()));
                    s0Var2.f(m0Var);
                    long currentTimeMillis = System.currentTimeMillis();
                    notificationManager2.notify((int) (currentTimeMillis ^ (currentTimeMillis >>> 32)), s0Var2.a());
                    a(context, alarmNotifyTypeDaily);
                    AlarmEntity c11 = c("LABEL_NOTIFY_DAILY");
                    AppDatabase.Companion companion2 = AppDatabase.INSTANCE;
                    companion2.getInstance(context).alarmDao().deleteAlarmTypeNotifyDaily();
                    companion2.getInstance(context).alarmDao().saveRecordAlarm(c11);
                    LoadAlarmsService.a(context);
                    e(context, c11);
                    return;
                }
                return;
            }
            if (k.F(context) && GlobalApp.f16594h) {
                Intent intent5 = new Intent(context, (Class<?>) RingActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("KEY_DATA_TO_RING_SCREEN", alarmNotifyTypeDaily);
                intent5.putExtras(bundle);
                intent5.addFlags(268435456);
                context.startActivity(intent5);
                return;
            }
            Intent intent6 = new Intent(context, (Class<?>) RingActivity.class);
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("KEY_DATA_TO_RING_SCREEN", alarmNotifyTypeDaily);
            intent6.putExtras(bundle2);
            intent6.addFlags(335577088);
            context.startActivity(intent6);
        }
    }
}
