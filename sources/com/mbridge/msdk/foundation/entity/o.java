package com.mbridge.msdk.foundation.entity;

import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ char a(int i9) {
        if (i9 == 1) {
            return '{';
        }
        if (i9 == 2) {
            return '[';
        }
        if (i9 == 3) {
            return '{';
        }
        if (i9 == 4) {
            return '[';
        }
        throw null;
    }

    public static /* synthetic */ char b(int i9) {
        if (i9 == 1) {
            return '}';
        }
        if (i9 == 2) {
            return ']';
        }
        if (i9 == 3) {
            return '}';
        }
        if (i9 == 4) {
            return ']';
        }
        throw null;
    }

    public static /* synthetic */ int c(int i9) {
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    if (i9 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ boolean d(int i9) {
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return false;
        }
        if (i9 == 4 || i9 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long e(int i9) {
        if (i9 == 1) {
            return 1099511627776L;
        }
        if (i9 == 2) {
            return 1073741824L;
        }
        if (i9 == 3) {
            return 1048576L;
        }
        if (i9 == 4) {
            return 1024L;
        }
        if (i9 == 5) {
            return 1L;
        }
        throw null;
    }

    public static int f(int i9, float f9) {
        return R2.b.y(TypedValue.applyDimension(i9, f9, Resources.getSystem().getDisplayMetrics()));
    }

    public static Object g(ArrayList arrayList, int i9) {
        return arrayList.get(arrayList.size() - i9);
    }

    public static String h(int i9, String str) {
        return str + i9;
    }

    public static String i(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, int i9, char c9) {
        sb.append(i9);
        sb.append(c9);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder p(StringBuilder sb, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb.append(str);
        sb.append(str2);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str3);
    }

    public static HashMap q(Class cls, J4.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map r(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void s(int i9, String str, String str2) {
        ad.a(str2, str + i9);
    }

    public static void t(int i9, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i9));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void u(h5.i iVar, b5.e eVar, b5.e eVar2) {
        eVar.k(iVar.c());
        d5.h.c(eVar2);
    }

    public static /* synthetic */ void v(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void w(String str, String str2, Throwable th) {
        ad.b(str2, str + th);
    }

    public static void x(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getMessage());
        ad.a(str, sb.toString());
    }

    public static void y(HashMap hashMap, String str, Integer num, int i9, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i9));
    }

    public static void z(int i9, String str, String str2) {
        Log.w(str2, str + i9);
    }
}
