package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y7.u;

/* loaded from: classes3.dex */
public final class o {
    public final b a;

    /* renamed from: b, reason: collision with root package name */
    public final u f24065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24066c;

    public o(u uVar) {
        e eVar = e.f24047c;
        this.f24065b = uVar;
        this.a = eVar;
        this.f24066c = Integer.MAX_VALUE;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        u uVar = this.f24065b;
        uVar.getClass();
        m mVar = new m(uVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add((String) mVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
