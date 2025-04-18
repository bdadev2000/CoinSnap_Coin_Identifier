package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes3.dex */
public abstract class zzfsf extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsf(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, zzfsh zzfshVar) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i10);
        zzfsb.zza();
    }
}
