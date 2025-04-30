package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f13187a;

    private b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static b a(Context context) {
        String c9;
        if (f13187a == null) {
            synchronized (b.class) {
                try {
                    if (f13187a == null) {
                        Context applicationContext = context.getApplicationContext();
                        StringBuilder sb = new StringBuilder("geckox_clean_statistic");
                        if (!TextUtils.isEmpty(com.bykv.vk.openvk.preload.geckox.utils.a.f13329a)) {
                            c9 = com.bykv.vk.openvk.preload.geckox.utils.a.f13329a;
                        } else {
                            String a6 = com.bykv.vk.openvk.preload.geckox.utils.a.a();
                            com.bykv.vk.openvk.preload.geckox.utils.a.f13329a = a6;
                            if (!TextUtils.isEmpty(a6)) {
                                c9 = com.bykv.vk.openvk.preload.geckox.utils.a.f13329a;
                            } else {
                                String b = com.bykv.vk.openvk.preload.geckox.utils.a.b();
                                com.bykv.vk.openvk.preload.geckox.utils.a.f13329a = b;
                                if (!TextUtils.isEmpty(b)) {
                                    c9 = com.bykv.vk.openvk.preload.geckox.utils.a.f13329a;
                                } else {
                                    c9 = com.bykv.vk.openvk.preload.geckox.utils.a.c(context);
                                    com.bykv.vk.openvk.preload.geckox.utils.a.f13329a = c9;
                                }
                            }
                        }
                        sb.append(c9);
                        sb.append(".db");
                        f13187a = new b(applicationContext, sb.toString());
                    }
                } finally {
                }
            }
        }
        return f13187a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }

    public final void a(String str, String str2, int i9, int i10, long j7, int i11, String str3, long j9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i9));
        contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(i10));
        contentValues.put("pkg_id", Long.valueOf(j7));
        contentValues.put("err_code", Integer.valueOf(i11));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j9));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e4) {
            GeckoLogger.w("clean-channel", "insert failed", e4);
        }
    }

    public final List<StatisticModel.PackageStatisticModel> a() {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e4) {
            e = e4;
        }
        if (cursor == null) {
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndex("access_key"));
                String string2 = cursor.getString(cursor.getColumnIndex("channel"));
                int i9 = cursor.getInt(cursor.getColumnIndex("clean_type"));
                int i10 = cursor.getInt(cursor.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
                long j7 = cursor.getInt(cursor.getColumnIndex("pkg_id"));
                int i11 = cursor.getInt(cursor.getColumnIndex("err_code"));
                String string3 = cursor.getString(cursor.getColumnIndex("err_msg"));
                int i12 = cursor.getInt(cursor.getColumnIndex("clean_strategy"));
                long j9 = cursor.getLong(cursor.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i10);
                packageStatisticModel.id = Long.valueOf(j7);
                packageStatisticModel.errCode = i11 == 0 ? null : String.valueOf(i11);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i9);
                packageStatisticModel.cleanDuration = Long.valueOf(j9);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i12);
                arrayList.add(packageStatisticModel);
            } catch (Exception e9) {
                e = e9;
                cursor2 = cursor;
                GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                cursor = cursor2;
                CloseableUtils.close(cursor);
                return arrayList;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursor);
        return arrayList;
    }
}
