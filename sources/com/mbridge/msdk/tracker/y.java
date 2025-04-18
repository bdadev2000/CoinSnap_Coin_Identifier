package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class y {
    public static long a(int i10, long j3, long j10) {
        if (i10 <= 0 || j3 == 0 || i10 <= 10) {
            return j10;
        }
        if (i10 <= 20) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (i10 <= 30) {
            return 120000L;
        }
        if (i10 <= 40) {
            return 180000L;
        }
        return i10 <= 50 ? 240000L : 300000L;
    }

    public static boolean b(Object obj) {
        return obj != null;
    }

    public static boolean a(Object obj) {
        return obj == null;
    }

    public static boolean b(List<i> list) {
        if (a((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!a(iVar)) {
                e c10 = iVar.c();
                if (!a(c10) && c10.c() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static void a(Cursor cursor) {
        boolean z10 = false;
        try {
            if (b((Object) cursor)) {
                if (!cursor.isClosed()) {
                    z10 = true;
                }
            }
        } catch (Exception unused) {
        }
        if (z10) {
            try {
                cursor.close();
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null) {
            return true;
        }
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused2) {
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static List<i> b(Cursor cursor) {
        int i10;
        int i11;
        e eVar;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("time_stamp");
            int columnIndex4 = cursor.getColumnIndex("properties");
            int columnIndex5 = cursor.getColumnIndex("priority");
            int columnIndex6 = cursor.getColumnIndex("uuid");
            int columnIndex7 = cursor.getColumnIndex("duration");
            int columnIndex8 = cursor.getColumnIndex("state");
            int columnIndex9 = cursor.getColumnIndex("report_count");
            int columnIndex10 = cursor.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor.getColumnIndex("invalid_time");
            while (cursor.moveToNext()) {
                try {
                    eVar = new e(cursor.getString(columnIndex));
                    eVar.a(cursor.getInt(columnIndex2));
                    i10 = columnIndex;
                    i11 = columnIndex2;
                } catch (JSONException e2) {
                    e = e2;
                    i10 = columnIndex;
                    i11 = columnIndex2;
                }
                try {
                    eVar.a(cursor.getLong(columnIndex3));
                    eVar.a(new JSONObject(cursor.getString(columnIndex4)));
                    eVar.b(cursor.getInt(columnIndex5));
                    eVar.a(cursor.getString(columnIndex6));
                    eVar.b(cursor.getLong(columnIndex7));
                    i iVar = new i(eVar);
                    iVar.b(cursor.getInt(columnIndex8));
                    iVar.a(cursor.getInt(columnIndex9));
                    boolean z10 = true;
                    iVar.a(cursor.getInt(columnIndex10) == 0);
                    if (cursor.getInt(columnIndex11) != 0) {
                        z10 = false;
                    }
                    iVar.b(z10);
                    iVar.a(cursor.getLong(columnIndex12));
                    arrayList.add(iVar);
                } catch (JSONException e10) {
                    e = e10;
                    if (a.a) {
                        Log.e("TrackManager", "create: ", e);
                    }
                    columnIndex = i10;
                    columnIndex2 = i11;
                }
                columnIndex = i10;
                columnIndex2 = i11;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
