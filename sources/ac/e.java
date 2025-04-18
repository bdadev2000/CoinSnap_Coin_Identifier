package ac;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.b2;
import androidx.lifecycle.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m9.c0;
import m9.m;
import m9.m0;
import n9.w;
import s7.x1;

/* loaded from: classes3.dex */
public class e implements u1.c {

    /* renamed from: b, reason: collision with root package name */
    public static e f433b;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f434c;

    public /* synthetic */ e() {
    }

    public static b2 a(View view) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getAlpha() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && view.getVisibility() == 0) {
            return b2.INVISIBLE;
        }
        return c(view.getVisibility());
    }

    public static q0 b(Bundle bundle, Bundle bundle2) {
        boolean z10;
        if (bundle == null) {
            if (bundle2 == null) {
                return new q0();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new q0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new q0(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    public static b2 c(int i10) {
        if (i10 != 0) {
            if (i10 != 4) {
                if (i10 == 8) {
                    return b2.GONE;
                }
                throw new IllegalArgumentException(j.i("Unknown visibility ", i10));
            }
            return b2.INVISIBLE;
        }
        return b2.VISIBLE;
    }

    public static int d() {
        return ((Number) m(0, "count_denied_camera_permission_time")).intValue();
    }

    public static int g() {
        return ((Number) m(0, "count_denied_notify_permission_time")).intValue();
    }

    public static long k(w wVar) {
        boolean z10;
        Throwable th2 = (IOException) wVar.f22595d;
        if (!(th2 instanceof x1) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof c0) && !(th2 instanceof m0)) {
            int i10 = m.f21684c;
            while (true) {
                if (th2 != null) {
                    if ((th2 instanceof m) && ((m) th2).f21685b == 2008) {
                        z10 = true;
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return Math.min((wVar.a - 1) * 1000, 5000);
            }
        }
        return C.TIME_UNSET;
    }

    public static Object m(Object obj, String keyName) {
        String string;
        long longValue;
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        if (obj instanceof Integer) {
            SharedPreferences sharedPreferences = f434c;
            int intValue = ((Number) obj).intValue();
            if (sharedPreferences != null) {
                intValue = sharedPreferences.getInt(keyName, intValue);
            }
            return Integer.valueOf(intValue);
        }
        if (obj instanceof Long) {
            SharedPreferences sharedPreferences2 = f434c;
            Number number = (Number) obj;
            if (sharedPreferences2 != null) {
                longValue = sharedPreferences2.getLong(keyName, number.longValue());
            } else {
                longValue = number.longValue();
            }
            return Long.valueOf(longValue);
        }
        if (obj instanceof Float) {
            SharedPreferences sharedPreferences3 = f434c;
            float floatValue = ((Number) obj).floatValue();
            if (sharedPreferences3 != null) {
                floatValue = sharedPreferences3.getFloat(keyName, floatValue);
            }
            return Float.valueOf(floatValue);
        }
        if (obj instanceof Boolean) {
            SharedPreferences sharedPreferences4 = f434c;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (sharedPreferences4 != null) {
                booleanValue = sharedPreferences4.getBoolean(keyName, booleanValue);
            }
            return Boolean.valueOf(booleanValue);
        }
        if (obj instanceof String) {
            SharedPreferences sharedPreferences5 = f434c;
            if (sharedPreferences5 != null && (string = sharedPreferences5.getString(keyName, (String) obj)) != null) {
                return string;
            }
            return (String) obj;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:
    
        if (r11 != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.e.n(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static void t(Object obj, String keyName) {
        SharedPreferences.Editor editor;
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        SharedPreferences sharedPreferences = f434c;
        if (sharedPreferences != null) {
            editor = sharedPreferences.edit();
        } else {
            editor = null;
        }
        if (obj instanceof Integer) {
            if (editor != null) {
                editor.putInt(keyName, ((Number) obj).intValue());
            }
        } else if (obj instanceof Float) {
            if (editor != null) {
                editor.putFloat(keyName, ((Number) obj).floatValue());
            }
        } else if (obj instanceof Long) {
            if (editor != null) {
                editor.putLong(keyName, ((Number) obj).longValue());
            }
        } else if (obj instanceof Boolean) {
            if (editor != null) {
                editor.putBoolean(keyName, ((Boolean) obj).booleanValue());
            }
        } else if ((obj instanceof String) && editor != null) {
            editor.putString(keyName, (String) obj);
        }
        if (editor != null) {
            editor.apply();
        }
    }

    @Override // u1.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // u1.c
    public void f(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public InputFilter[] h(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public int i(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public ProviderInfo j(ResolveInfo resolveInfo) {
        throw new IllegalStateException("Unable to get provider info prior to API 19");
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void o() {
    }

    public boolean p() {
        return false;
    }

    public List q(PackageManager packageManager, Intent intent) {
        return Collections.emptyList();
    }

    public void r(boolean z10) {
    }

    public void s(boolean z10) {
    }

    public void u() {
    }

    public /* synthetic */ e(Object obj) {
    }
}
