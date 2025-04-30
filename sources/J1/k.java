package J1;

import M0.C0219j;
import android.graphics.Path;
import b2.C0555b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1526a;

    public k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    arrayList.add(new j(optJSONObject));
                }
            }
        }
        this.f1526a = arrayList;
    }

    public void a(String str, String str2) {
        G7.j.e(str, "name");
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C0219j.h(str);
        C0219j.j(str2, str);
        c(str, str2);
    }

    public void b(String str) {
        int I5 = O7.g.I(str, ':', 1, false, 4);
        if (I5 != -1) {
            String substring = str.substring(0, I5);
            G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(I5 + 1);
            G7.j.d(substring2, "this as java.lang.String).substring(startIndex)");
            c(substring, substring2);
            return;
        }
        if (str.charAt(0) == ':') {
            String substring3 = str.substring(1);
            G7.j.d(substring3, "this as java.lang.String).substring(startIndex)");
            c("", substring3);
            return;
        }
        c("", str);
    }

    public void c(String str, String str2) {
        G7.j.e(str, "name");
        G7.j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ArrayList arrayList = this.f1526a;
        arrayList.add(str);
        arrayList.add(O7.g.a0(str2).toString());
    }

    public void d(Path path) {
        ArrayList arrayList = this.f1526a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x1.t tVar = (x1.t) arrayList.get(size);
            H1.h hVar = H1.i.f1367a;
            if (tVar != null && !tVar.f24212a) {
                H1.i.a(path, tVar.f24214d.k() / 100.0f, tVar.f24215e.k() / 100.0f, tVar.f24216f.k() / 360.0f);
            }
        }
    }

    public i8.s e() {
        Object[] array = this.f1526a.toArray(new String[0]);
        if (array != null) {
            return new i8.s((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public String f(String str) {
        G7.j.e(str, "name");
        ArrayList arrayList = this.f1526a;
        int size = arrayList.size() - 2;
        int p2 = R2.b.p(size, 0, -2);
        if (p2 > size) {
            return null;
        }
        while (true) {
            int i9 = size - 2;
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
            if (size != p2) {
                size = i9;
            } else {
                return null;
            }
        }
    }

    public synchronized ArrayList g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f1526a.iterator();
        while (it.hasNext()) {
            C0555b c0555b = (C0555b) it.next();
            if (c0555b.f5273a.isAssignableFrom(cls) && cls2.isAssignableFrom(c0555b.b) && !arrayList.contains(c0555b.b)) {
                arrayList.add(c0555b.b);
            }
        }
        return arrayList;
    }

    public void h(String str) {
        G7.j.e(str, "name");
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f1526a;
            if (i9 < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i9))) {
                    arrayList.remove(i9);
                    arrayList.remove(i9);
                    i9 -= 2;
                }
                i9 += 2;
            } else {
                return;
            }
        }
    }

    public k(int i9) {
        switch (i9) {
            case 2:
                this.f1526a = new ArrayList();
                return;
            case 3:
                this.f1526a = new ArrayList(20);
                return;
            case 4:
                this.f1526a = new ArrayList();
                return;
            default:
                this.f1526a = new ArrayList();
                return;
        }
    }
}
