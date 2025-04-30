package a8;

import G7.w;
import androidx.lifecycle.V;
import androidx.lifecycle.g0;
import e0.G;
import e0.InterfaceC2208i;
import e8.W;
import i8.r;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import r5.n;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public final class e extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i9) {
        super(0);
        this.b = i9;
        this.f4082c = obj;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                f fVar = (f) this.f4082c;
                c8.h e4 = android.support.v4.media.session.a.e("kotlinx.serialization.Polymorphic", c8.c.f5429d, new c8.g[0], new w(fVar, 5));
                M7.b bVar = fVar.f4083a;
                G7.j.e(bVar, "context");
                return new c8.b(e4, bVar);
            case 1:
                return V.g((g0) this.f4082c);
            case 2:
                c8.h hVar = (c8.h) this.f4082c;
                return Integer.valueOf(W.e(hVar, hVar.f5448k));
            case 3:
                File file = (File) ((G) this.f4082c).f19953a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (G.f19952k) {
                    LinkedHashSet linkedHashSet = G.f19951j;
                    if (!linkedHashSet.contains(absolutePath)) {
                        G7.j.d(absolutePath, "it");
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return file;
            case 4:
                r rVar = ((m8.k) this.f4082c).f21801e;
                G7.j.b(rVar);
                List a6 = rVar.a();
                ArrayList arrayList = new ArrayList(AbstractC2818i.E(a6, 10));
                Iterator it = a6.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 5:
                return new n((InterfaceC2208i) this.f4082c);
            default:
                return G7.j.h((Object[]) this.f4082c);
        }
    }
}
