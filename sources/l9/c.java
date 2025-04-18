package l9;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends View implements s {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21174b;

    /* renamed from: c, reason: collision with root package name */
    public List f21175c;

    /* renamed from: d, reason: collision with root package name */
    public int f21176d;

    /* renamed from: f, reason: collision with root package name */
    public float f21177f;

    /* renamed from: g, reason: collision with root package name */
    public d f21178g;

    /* renamed from: h, reason: collision with root package name */
    public float f21179h;

    public c(Context context) {
        super(context, null);
        this.f21174b = new ArrayList();
        this.f21175c = Collections.emptyList();
        this.f21176d = 0;
        this.f21177f = 0.0533f;
        this.f21178g = d.f21180g;
        this.f21179h = 0.08f;
    }

    @Override // l9.s
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f21175c = list;
        this.f21178g = dVar;
        this.f21177f = f10;
        this.f21176d = i10;
        this.f21179h = f11;
        while (true) {
            ArrayList arrayList = this.f21174b;
            if (arrayList.size() < list.size()) {
                arrayList.add(new r(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x040f, code lost:
    
        if (r5 < r3) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
