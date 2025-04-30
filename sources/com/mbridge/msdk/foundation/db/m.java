package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static m f15505a;

    private m(f fVar) {
        super(fVar);
    }

    public static m a(f fVar) {
        if (f15505a == null) {
            synchronized (m.class) {
                try {
                    if (f15505a == null) {
                        f15505a = new m(fVar);
                    }
                } finally {
                }
            }
        }
        return f15505a;
    }

    public final synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public final synchronized void a(String str, String str2, int i9) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str2);
        contentValues.put("ad_type", Integer.valueOf(i9));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public final synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i9)});
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList(rawQuery.getCount());
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(rawQuery.getString(rawQuery.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)), rawQuery.getString(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID)), i9));
                                    } catch (Exception e4) {
                                        e = e4;
                                        cursor = rawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                            } catch (Exception unused) {
                                            }
                                        }
                                        arrayList2 = arrayList;
                                        return arrayList2;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        arrayList = null;
                    }
                }
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
            arrayList = null;
        }
        return arrayList2;
    }
}
