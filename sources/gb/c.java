package gb;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jb.j;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import lb.n;
import lb.o;
import pc.e;
import pc.f;
import y7.u;

/* loaded from: classes3.dex */
public final class c {
    public final ob.c a;

    public c(ob.c userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.a = userMetadata;
    }

    public final void a(e rolloutsState) {
        int collectionSizeOrDefault;
        String str;
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        ob.c cVar = this.a;
        Set set = rolloutsState.a;
        Intrinsics.checkNotNullExpressionValue(set, "rolloutsState.rolloutAssignments");
        Set set2 = set;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            pc.d dVar = (pc.d) ((f) it.next());
            String str2 = dVar.f23589b;
            String str3 = dVar.f23591d;
            String str4 = dVar.f23592e;
            String str5 = dVar.f23590c;
            long j3 = dVar.f23593f;
            u uVar = n.a;
            if (str4.length() > 256) {
                str = str4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                str = str4;
            }
            arrayList.add(new lb.b(str2, str3, str, str5, j3));
        }
        synchronized (((o) cVar.f23296f)) {
            if (((o) cVar.f23296f).c(arrayList)) {
                ((kb.d) cVar.f23293c).f20634b.a(new j(1, cVar, ((o) cVar.f23296f).a()));
            }
        }
        b6.a.f2288f.d("Updated Crashlytics Rollout State", null);
    }
}
