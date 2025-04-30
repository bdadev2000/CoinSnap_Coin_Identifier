package com.mbridge.msdk.newreward.function.e;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f17301a;
    private a b = new a();

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.e.a f17302c;

    /* loaded from: classes3.dex */
    public static final class a extends SQLiteOpenHelper {
        public a() {
            super(com.mbridge.msdk.foundation.controller.c.m().c(), MBridgeCommon.Database.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,data text)");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            if (DatabaseUtils.isDatabaseAvailable(sQLiteDatabase)) {
                sQLiteDatabase.execSQL("drop table if exists campaign");
                sQLiteDatabase.execSQL("create table if not exists campaign(_id integer primary key autoincrement,ad_type integer,app_id text,unit_id text,placement_id text,request_id text,local_id text,bid_token text,header_bidding integer,load_start_time integer,state integer,session_id text,system_id text,backup_id text,parent_session_id text,template integer,invalid_time integer,invalid_time_2 integer,invalid_time_backup integer,ecppv integer,show_count integer,token_rule integer,data text)");
            }
        }
    }

    private c() {
    }

    public static c a() {
        if (f17301a == null) {
            synchronized (c.class) {
                try {
                    if (f17301a == null) {
                        f17301a = new c();
                    }
                } finally {
                }
            }
        }
        return f17301a;
    }

    private SQLiteDatabase c() {
        try {
            return this.b.getWritableDatabase();
        } catch (Exception unused) {
            return null;
        }
    }

    public final com.mbridge.msdk.newreward.function.e.a b() {
        if (this.f17302c == null) {
            this.f17302c = new com.mbridge.msdk.newreward.function.e.a(c());
        }
        return this.f17302c;
    }
}
