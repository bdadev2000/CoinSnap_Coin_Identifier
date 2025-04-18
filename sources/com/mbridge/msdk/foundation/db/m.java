package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class m extends a<com.mbridge.msdk.foundation.entity.h> {
    private static m a;

    private m(f fVar) {
        super(fVar);
    }

    public static m a(f fVar) {
        if (a == null) {
            synchronized (m.class) {
                if (a == null) {
                    a = new m(fVar);
                }
            }
        }
        return a;
    }

    public final synchronized void a(String str) {
        if (getWritableDatabase() != null) {
            getWritableDatabase().delete(MBridgeConstans.PROPERTIES_UNIT_ID, "unitId = ?", new String[]{str + ""});
        }
    }

    public final synchronized void a(String str, String str2, int i10) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str);
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, str2);
        contentValues.put("ad_type", Integer.valueOf(i10));
        getWritableDatabase().insert(MBridgeConstans.PROPERTIES_UNIT_ID, null, contentValues);
    }

    public final synchronized List<com.mbridge.msdk.foundation.entity.i> a(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("select * from unit_id WHERE ad_type = ?", new String[]{String.valueOf(i10)});
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList(rawQuery.getCount());
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(new com.mbridge.msdk.foundation.entity.i(rawQuery.getString(rawQuery.getColumnIndex(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)), rawQuery.getString(rawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID)), i10));
                                    } catch (Exception e2) {
                                        e = e2;
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
                        } catch (Exception e10) {
                            e = e10;
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = rawQuery;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Exception unused3) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
            arrayList = null;
        }
        return arrayList2;
    }
}
