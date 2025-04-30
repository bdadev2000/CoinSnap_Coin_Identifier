package M2;

import L2.e;
import com.facebook.appevents.i;
import com.facebook.appevents.n;
import com.facebook.internal.H;
import e1.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import u7.AbstractC2816g;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f1986a = new AtomicBoolean(false);

    public static final void a() {
        File[] listFiles;
        if (O2.a.b(d.class)) {
            return;
        }
        try {
            if (H.z()) {
                return;
            }
            File h6 = n.h();
            if (h6 == null) {
                listFiles = new File[0];
            } else {
                listFiles = h6.listFiles(new e(1));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(i.k(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((L2.d) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List R4 = AbstractC2816g.R(new b(0), arrayList2);
            JSONArray jSONArray = new JSONArray();
            Iterator it = f.t(0, Math.min(R4.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(R4.get(((L7.b) it).a()));
            }
            n.t("anr_reports", jSONArray, new c(R4, 0));
        } catch (Throwable th) {
            O2.a.a(d.class, th);
        }
    }
}
