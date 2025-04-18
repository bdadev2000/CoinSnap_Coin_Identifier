package a5;

import android.util.Log;
import com.bytedance.sdk.component.qsH.qsH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends qsH {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f173b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.activity.i iVar) {
        super("cleanupCmd", 1);
        this.f174c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                synchronized (((e) this.f174c).f182b) {
                    int size = ((e) this.f174c).f182b.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = this.f174c;
                        Map map = (Map) ((e) obj).f182b.get(((e) obj).f182b.keyAt(i10));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    ((e) this.f174c).f183c.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    mVar.d();
                    if (v.a) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + mVar + ", canceled!!!");
                    }
                }
                return;
            default:
                c5.a aVar = (c5.a) ((androidx.activity.i) this.f174c).f574c;
                aVar.getClass();
                c5.a.u(aVar, 0L);
                return;
        }
    }
}
