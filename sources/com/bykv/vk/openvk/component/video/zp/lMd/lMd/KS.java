package com.bykv.vk.openvk.component.video.zp.lMd.lMd;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.ku.YW;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS lMd;
    private volatile SQLiteStatement COT;
    private final jU KS;
    private final Executor jU;
    private final SparseArray<Map<String, zp>> zp;

    private KS(Context context) {
        SparseArray<Map<String, zp>> sparseArray = new SparseArray<>(2);
        this.zp = sparseArray;
        this.jU = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new YW(5, "video_proxy_db"));
        this.KS = new jU(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    private String lMd(int i9) {
        if (i9 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i9 << 1);
        sb.append("?");
        for (int i10 = 1; i10 < i9; i10++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public static KS zp(Context context) {
        if (lMd == null) {
            synchronized (KS.class) {
                try {
                    if (lMd == null) {
                        lMd = new KS(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public zp zp(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, zp> map = this.zp.get(i9);
        zp zpVar = map == null ? null : map.get(str);
        if (zpVar != null) {
            return zpVar;
        }
        try {
            Cursor query = this.KS.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i9)}, null, null, null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    zpVar = new zp(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i9, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (zpVar != null && map != null) {
                map.put(str, zpVar);
            }
            return zpVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void zp(final zp zpVar) {
        if (zpVar != null) {
            Map<String, zp> map = this.zp.get(zpVar.jU);
            if (map != null) {
                map.put(zpVar.zp, zpVar);
            }
            this.jU.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (KS.this.COT == null) {
                            KS ks = KS.this;
                            ks.COT = ks.KS.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            KS.this.COT.clearBindings();
                        }
                        KS.this.COT.bindString(1, zpVar.zp);
                        KS.this.COT.bindString(2, zpVar.lMd);
                        KS.this.COT.bindLong(3, zpVar.KS);
                        KS.this.COT.bindLong(4, zpVar.jU);
                        KS.this.COT.bindString(5, zpVar.COT);
                        KS.this.COT.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void zp(Collection<String> collection, int i9) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        Map<String, zp> map = this.zp.get(i9);
        int i10 = -1;
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i10++;
            strArr[i10] = str;
        }
        strArr[i10 + 1] = String.valueOf(i9);
        try {
            this.KS.getWritableDatabase().delete("video_http_header_t", "key IN(" + lMd(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    public void zp(final int i9) {
        Map<String, zp> map = this.zp.get(i9);
        if (map != null) {
            map.clear();
        }
        this.jU.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.zp.lMd.lMd.KS.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    KS.this.KS.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i9)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
