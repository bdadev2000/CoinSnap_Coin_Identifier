package U4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class s implements r5.o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3328a;

    public s(Context context) {
        G7.j.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f3328a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static boolean j(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String l(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override // r5.o
    public Boolean a() {
        Bundle bundle = this.f3328a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // r5.o
    public P7.a b() {
        Bundle bundle = this.f3328a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new P7.a(r8.k.C(bundle.getInt("firebase_sessions_sessions_restart_timeout"), P7.c.SECONDS));
        }
        return null;
    }

    @Override // r5.o
    public Double c() {
        Bundle bundle = this.f3328a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // r5.o
    public Object d(w7.f fVar) {
        return t7.y.f23029a;
    }

    public boolean e(String str) {
        String i9 = i(str);
        if (!"1".equals(i9) && !Boolean.parseBoolean(i9)) {
            return false;
        }
        return true;
    }

    public Integer f(String str) {
        String i9 = i(str);
        if (!TextUtils.isEmpty(i9)) {
            try {
                return Integer.valueOf(Integer.parseInt(i9));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + l(str) + "(" + i9 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray g(String str) {
        String i9 = i(str);
        if (!TextUtils.isEmpty(i9)) {
            try {
                return new JSONArray(i9);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + l(str) + ": " + i9 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String h(Resources resources, String str, String str2) {
        String[] strArr;
        String i9 = i(str2);
        if (!TextUtils.isEmpty(i9)) {
            return i9;
        }
        String i10 = i(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(i10)) {
            return null;
        }
        int identifier = resources.getIdentifier(i10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", l(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray g9 = g(str2.concat("_loc_args"));
        if (g9 == null) {
            strArr = null;
        } else {
            int length = g9.length();
            strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                strArr[i11] = g9.optString(i11);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e4) {
            Log.w("NotificationParams", "Missing format argument for " + l(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e4);
            return null;
        }
    }

    public String i(String str) {
        String replace;
        Bundle bundle = this.f3328a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle k() {
        Bundle bundle = this.f3328a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public s(Bundle bundle) {
        this.f3328a = new Bundle(bundle);
    }
}
