package z2;

import C2.m;
import W1.y;
import android.app.AppOpsManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.ViewParent;
import androidx.core.app.AbstractC0409j;
import androidx.core.app.AbstractC0410k;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.facebook.internal.C1838g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import f8.q;
import f8.t;
import j2.AbstractC2384b;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import x2.C2918c;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public static UiModeManager f24529a;
    public static final /* synthetic */ int b = 0;

    public static int a(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return d(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public static void c(int i9, String str) {
        if (i9 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int d(Context context, String str, int i9, int i10, String str2) {
        int c9;
        if (context.checkPermission(str, i9, i10) == -1) {
            return -1;
        }
        String d2 = AbstractC0409j.d(str);
        if (d2 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i10 && Objects.equals(packageName, str2)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c10 = AbstractC0410k.c(context);
                c9 = AbstractC0410k.a(c10, d2, Binder.getCallingUid(), str2);
                if (c9 == 0) {
                    c9 = AbstractC0410k.a(c10, d2, i10, AbstractC0410k.b(context));
                }
            } else {
                c9 = AbstractC0409j.c((AppOpsManager) AbstractC0409j.a(context, AppOpsManager.class), d2, str2);
            }
        } else {
            c9 = AbstractC0409j.c((AppOpsManager) AbstractC0409j.a(context, AppOpsManager.class), d2, str2);
        }
        if (c9 == 0) {
            return 0;
        }
        return -2;
    }

    public static int e(Context context, String str) {
        return d(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static void f(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(CampaignEx.JSON_KEY_AD_K);
                String optString2 = optJSONObject.optString("v");
                G7.j.d(optString, CampaignEx.JSON_KEY_AD_K);
                if (optString.length() != 0) {
                    CopyOnWriteArraySet a6 = C2918c.a();
                    G7.j.d(next, "key");
                    List V8 = O7.g.V(optString, new String[]{","}, 0, 6);
                    G7.j.d(optString2, "v");
                    a6.add(new C2918c(next, V8, optString2));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [y8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [y8.a, java.lang.Object] */
    public static y8.a g(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int i(ArrayList arrayList, InputStream inputStream, Q1.f fVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            try {
                int c9 = ((N1.e) arrayList.get(i9)).c(inputStream, fVar);
                if (c9 != -1) {
                    return c9;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType j(List list, InputStream inputStream, Q1.f fVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            try {
                ImageHeaderParser$ImageType b8 = ((N1.e) list.get(i9)).b(inputStream);
                inputStream.reset();
                if (b8 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return b8;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType k(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            try {
                ImageHeaderParser$ImageType a6 = ((N1.e) list.get(i9)).a(byteBuffer);
                AbstractC2384b.c(byteBuffer);
                if (a6 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a6;
                }
            } catch (Throwable th) {
                AbstractC2384b.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final void n(C1838g c1838g, String str, Boolean bool) {
        f8.j qVar;
        if (bool == null) {
            qVar = t.b;
        } else {
            qVar = new q(bool, false);
        }
        c1838g.g(qVar, str);
    }

    public static final void o(C1838g c1838g, String str, String str2) {
        G7.j.e(str, "key");
        c1838g.g(m.b(str2), str);
    }

    public static void p(String str, Object obj, SharedPreferences sharedPreferences) {
        boolean z8;
        G7.j.e(sharedPreferences, "<this>");
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof String;
        }
        if (z8) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            G7.j.b(edit);
            G7.j.d(edit.putString(str, (String) obj), "putString(...)");
            edit.apply();
            return;
        }
        if (obj instanceof Integer) {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            G7.j.b(edit2);
            G7.j.d(edit2.putInt(str, ((Number) obj).intValue()), "putInt(...)");
            edit2.apply();
            return;
        }
        if (obj instanceof Boolean) {
            SharedPreferences.Editor edit3 = sharedPreferences.edit();
            G7.j.b(edit3);
            G7.j.d(edit3.putBoolean(str, ((Boolean) obj).booleanValue()), "putBoolean(...)");
            edit3.apply();
            return;
        }
        if (obj instanceof Float) {
            SharedPreferences.Editor edit4 = sharedPreferences.edit();
            G7.j.b(edit4);
            G7.j.d(edit4.putFloat(str, ((Number) obj).floatValue()), "putFloat(...)");
            edit4.apply();
            return;
        }
        if (obj instanceof Long) {
            SharedPreferences.Editor edit5 = sharedPreferences.edit();
            G7.j.b(edit5);
            G7.j.d(edit5.putLong(str, ((Number) obj).longValue()), "putLong(...)");
            edit5.apply();
            return;
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void q(View view, R3.g gVar) {
        J3.a aVar = gVar.b.b;
        if (aVar != null && aVar.f1571a) {
            float f9 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f9 += ViewCompat.getElevation((View) parent);
            }
            R3.f fVar = gVar.b;
            if (fVar.m != f9) {
                fVar.m = f9;
                gVar.n();
            }
        }
    }

    public static final /* synthetic */ a7.b r(View view, Object obj) {
        G7.j.e(view, "<this>");
        return new a7.b(28, obj, new E6.d(view, 3), false);
    }

    public abstract void l(Throwable th);

    public abstract void m(U4.y yVar);
}
