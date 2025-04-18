package com.bytedance.sdk.openadsdk.rkt;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class YFl {
    private static Context AlY;
    private static final long wN = System.currentTimeMillis();
    private com.bytedance.sdk.openadsdk.rkt.tN.YFl Sg;
    private Sg YFl;
    private Boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10805vc = 0;
    private Runnable DSW = new Runnable() { // from class: com.bytedance.sdk.openadsdk.rkt.YFl.3
        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            try {
                SQLiteDatabase Sg = com.bytedance.sdk.openadsdk.rkt.YFl.YFl.Sg();
                if (Sg != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", CampaignEx.JSON_KEY_TIMESTAMP, "mediation", "is_init", "extra"};
                    String str = "extra";
                    String str2 = "is_init";
                    String[] strArr2 = {String.valueOf(YFl.wN)};
                    int max = Math.max(10, YFl.this.YFl.getOnceLogCount());
                    if (max > 100) {
                        i10 = 10;
                    } else {
                        i10 = max;
                    }
                    Cursor query = Sg.query("monitor_table", strArr, "timestamp <= ?", strArr2, null, null, null, String.valueOf(i10));
                    if (query != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        while (query.moveToNext()) {
                            try {
                                com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                if (query.getColumnIndex("_id") >= 0) {
                                    i11 = i10;
                                    long j3 = query.getLong(query.getColumnIndex("_id"));
                                    yFl.YFl(j3);
                                    arrayList2.add(String.valueOf(j3));
                                } else {
                                    i11 = i10;
                                }
                                if (query.getColumnIndex("sdk_version") >= 0) {
                                    yFl.YFl(query.getString(query.getColumnIndex("sdk_version")));
                                }
                                if (query.getColumnIndex("scene") >= 0) {
                                    yFl.Sg(query.getString(query.getColumnIndex("scene")));
                                }
                                if (query.getColumnIndex("start_count") >= 0) {
                                    yFl.YFl(query.getInt(query.getColumnIndex("start_count")));
                                }
                                if (query.getColumnIndex("success_count") >= 0) {
                                    yFl.Sg(query.getInt(query.getColumnIndex("success_count")));
                                }
                                if (query.getColumnIndex("fail_count") >= 0) {
                                    yFl.tN(query.getInt(query.getColumnIndex("fail_count")));
                                }
                                if (query.getColumnIndex("rit") >= 0) {
                                    yFl.tN(query.getString(query.getColumnIndex("rit")));
                                }
                                if (query.getColumnIndex("tag") >= 0) {
                                    yFl.AlY(query.getString(query.getColumnIndex("tag")));
                                }
                                if (query.getColumnIndex("label") >= 0) {
                                    yFl.wN(query.getString(query.getColumnIndex("label")));
                                }
                                if (query.getColumnIndex("mediation") >= 0) {
                                    yFl.vc(query.getString(query.getColumnIndex("mediation")));
                                }
                                String str3 = str2;
                                if (query.getColumnIndex(str3) >= 0) {
                                    yFl.AlY(query.getInt(query.getColumnIndex(str3)));
                                }
                                String str4 = str;
                                str2 = str3;
                                if (query.getColumnIndex(str4) >= 0) {
                                    yFl.DSW(query.getString(query.getColumnIndex(str4)));
                                }
                                arrayList.add(yFl);
                                str = str4;
                                i10 = i11;
                            } catch (Throwable th2) {
                                th = th2;
                                Log.e("BusMonitorCenter", th.getMessage());
                                return;
                            }
                        }
                        int i12 = i10;
                        query.close();
                        if (!arrayList.isEmpty()) {
                            YFl.this.YFl.onMonitorUpload(arrayList);
                            SQLiteDatabase YFl = com.bytedance.sdk.openadsdk.rkt.YFl.YFl.YFl();
                            if (YFl != null && YFl.isOpen()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("_id IN (");
                                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                    sb2.append("?");
                                    if (i13 < arrayList2.size() - 1) {
                                        sb2.append(",");
                                    }
                                }
                                sb2.append(")");
                                YFl.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                if (YFl.this.Sg != null) {
                                    YFl.this.Sg.YFl(YFl.wN);
                                }
                            }
                            if (arrayList.size() >= i12 && YFl.this.f10805vc <= 1000) {
                                YFl.this.YFl(false);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    };

    private YFl(Sg sg2) {
        try {
            this.YFl = new BusMonitorDependWrapper(sg2);
            this.Sg = new com.bytedance.sdk.openadsdk.rkt.tN.YFl(sg2.getContext());
            AlY = sg2.getContext();
        } catch (Throwable th2) {
            Log.e("BusMonitorCenter", th2.getMessage());
        }
    }

    public static /* synthetic */ int tN(YFl yFl) {
        int i10 = yFl.f10805vc;
        yFl.f10805vc = i10 + 1;
        return i10;
    }

    private boolean tN() {
        if (this.tN == null) {
            Sg sg2 = this.YFl;
            if (sg2 != null && sg2.getContext() != null && this.YFl.getExecutorService() != null) {
                return true;
            }
        } else {
            Sg sg3 = this.YFl;
            if (sg3 != null && sg3.getContext() != null && this.YFl.isMonitorOpen() && this.YFl.getExecutorService() != null) {
                return true;
            }
        }
        return false;
    }

    public static YFl YFl(Sg sg2) {
        return new YFl(sg2);
    }

    public static Context YFl() {
        Context context = AlY;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void YFl(final AlY alY) {
        alY.generatorModel().tN();
        if (tN()) {
            alY.generatorModel().tN();
            this.YFl.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rkt.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    YFl yFl = YFl.this;
                    yFl.tN = Boolean.valueOf(yFl.YFl.isMonitorOpen());
                    if (!YFl.this.tN.booleanValue()) {
                        return;
                    }
                    alY.generatorModel().tN();
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        try {
                            com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel = alY.generatorModel();
                            if (generatorModel != null) {
                                SQLiteDatabase YFl = com.bytedance.sdk.openadsdk.rkt.YFl.YFl.YFl();
                                if (YFl != null) {
                                    try {
                                        YFl.beginTransaction();
                                        Cursor query = YFl.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", CampaignEx.JSON_KEY_TIMESTAMP, "mediation", "is_init", "extra"}, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND extra = ?", new String[]{generatorModel.Sg(), generatorModel.tN(), generatorModel.DSW(), generatorModel.qsH(), generatorModel.NjR(), generatorModel.eT(), String.valueOf(generatorModel.YoT()), generatorModel.GA()}, null, null, null);
                                        if (query != null) {
                                            if (query.moveToNext()) {
                                                if (query.getColumnIndex("_id") >= 0) {
                                                    generatorModel.YFl(query.getLong(query.getColumnIndex("_id")));
                                                }
                                                if (query.getColumnIndex("start_count") >= 0) {
                                                    generatorModel.YFl(query.getInt(query.getColumnIndex("start_count")) + generatorModel.AlY());
                                                }
                                                if (query.getColumnIndex("success_count") >= 0) {
                                                    generatorModel.Sg(query.getInt(query.getColumnIndex("success_count")) + generatorModel.wN());
                                                }
                                                if (query.getColumnIndex("fail_count") >= 0) {
                                                    generatorModel.tN(query.getInt(query.getColumnIndex("fail_count")) + generatorModel.vc());
                                                }
                                                if (query.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP) >= 0) {
                                                    generatorModel.Sg(Math.min(query.getLong(query.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP)), generatorModel.nc()));
                                                }
                                            }
                                            query.close();
                                        }
                                        ContentValues contentValues = new ContentValues();
                                        if (generatorModel.YFl() > 0) {
                                            contentValues.put("_id", Long.valueOf(generatorModel.YFl()));
                                        }
                                        contentValues.put("sdk_version", generatorModel.Sg());
                                        contentValues.put("scene", generatorModel.tN());
                                        contentValues.put("start_count", Integer.valueOf(generatorModel.AlY()));
                                        contentValues.put("success_count", Integer.valueOf(generatorModel.wN()));
                                        contentValues.put("fail_count", Integer.valueOf(generatorModel.vc()));
                                        contentValues.put("rit", generatorModel.DSW());
                                        contentValues.put("tag", generatorModel.qsH());
                                        contentValues.put("label", generatorModel.NjR());
                                        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(generatorModel.nc()));
                                        contentValues.put("mediation", generatorModel.eT());
                                        contentValues.put("is_init", Integer.valueOf(generatorModel.YoT()));
                                        contentValues.put("extra", generatorModel.GA());
                                        YFl.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                        YFl.setTransactionSuccessful();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = YFl;
                                        try {
                                            Log.e("BusMonitorCenter", th.getMessage());
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.endTransaction();
                                                return;
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                                sQLiteDatabase = YFl;
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        Log.e("BusMonitorCenter", th4.getMessage());
                    }
                }
            });
        }
    }

    public void YFl(final boolean z10) {
        Sg sg2 = this.YFl;
        if (sg2 == null || sg2.getHandler() == null || this.YFl.getContext() == null || this.Sg == null || !this.YFl.isMonitorOpen()) {
            return;
        }
        this.YFl.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rkt.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    YFl.tN(YFl.this);
                    if (z10) {
                        long YFl = YFl.this.Sg.YFl();
                        if (YFl == 0) {
                            YFl.this.Sg.YFl(System.currentTimeMillis());
                            return;
                        } else if (YFl.wN - YFl < YFl.this.YFl.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (YFl.this.YFl.getExecutorService() != null) {
                        YFl.this.YFl.getExecutorService().execute(YFl.this.DSW);
                    }
                } catch (Throwable th2) {
                    Log.e("BusMonitorCenter", th2.getMessage());
                }
            }
        }, Math.max(this.YFl.getOnceLogInterval(), 10000));
    }
}
