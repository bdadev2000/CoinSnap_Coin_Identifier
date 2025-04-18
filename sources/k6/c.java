package k6;

import com.facebook.appevents.g;
import com.facebook.internal.k0;
import com.facebook.internal.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public abstract class c {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        File[] listFiles;
        if (m6.a.b(c.class)) {
            return;
        }
        try {
            if (m0.x()) {
                return;
            }
            File l10 = g.l();
            if (l10 == null) {
                listFiles = new File[0];
            } else {
                listFiles = l10.listFiles(new k0(3));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                Intrinsics.checkNotNullParameter(file, "file");
                arrayList.add(new j6.c(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((j6.c) next).b()) {
                    arrayList2.add(next);
                }
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList2, new k0.b(1));
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it2 = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it2.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it2).nextInt()));
            }
            g.J("anr_reports", jSONArray, new b(sortedWith, 0));
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
        }
    }
}
