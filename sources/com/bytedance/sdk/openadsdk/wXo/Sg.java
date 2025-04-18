package com.bytedance.sdk.openadsdk.wXo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private final Context Sg;
    private SharedPreferences YFl;
    private final String tN;

    public Sg(Context context, String str) {
        this.Sg = context;
        this.tN = str;
    }

    private SharedPreferences Sg() {
        Context context;
        SharedPreferences sharedPreferences = this.YFl;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.tN) || (context = this.Sg) == null) {
            return null;
        }
        try {
            this.YFl = context.getSharedPreferences(this.tN, 0);
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
        return this.YFl;
    }

    public void YFl(JSONObject jSONObject) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null) {
                SharedPreferences.Editor edit = Sg.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                edit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                edit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                edit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                edit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                            }
                        }
                    } catch (Throwable th2) {
                        Log.e("SPUnit", th2.getMessage());
                    }
                }
                edit.apply();
            }
        } catch (Throwable th3) {
            Log.e("SPUnit", th3.getMessage());
        }
    }

    public long Sg(String str, long j3) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null && Sg.contains(str)) {
                return Sg.getLong(str, j3);
            }
            return j3;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.tN + th2.getMessage());
            return j3;
        }
    }

    public void YFl(String str, long j3) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null) {
                SharedPreferences.Editor edit = Sg.edit();
                edit.putLong(str, j3);
                edit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public int YFl(String str, int i10) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null && Sg.contains(str)) {
                return Sg.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.tN + th2.getMessage());
            return i10;
        }
    }

    public String YFl(String str, String str2) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null && Sg.contains(str)) {
                return Sg.getString(str, str2);
            }
            return str2;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.tN + th2.getMessage());
            return str2;
        }
    }

    public boolean YFl(String str, boolean z10) {
        try {
            SharedPreferences Sg = Sg();
            if (Sg != null && Sg.contains(str)) {
                return Sg.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th2) {
            Log.i("SPUnit", this.tN + th2.getMessage());
            return z10;
        }
    }

    public void YFl() {
        SharedPreferences Sg = Sg();
        if (Sg != null) {
            SharedPreferences.Editor edit = Sg.edit();
            edit.clear();
            edit.commit();
        }
    }
}
