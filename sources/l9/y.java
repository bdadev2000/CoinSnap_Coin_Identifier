package l9;

import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.internal.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n9.h0;

/* loaded from: classes3.dex */
public final class y extends FrameLayout implements s {

    /* renamed from: b, reason: collision with root package name */
    public final c f21279b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f21280c;

    /* renamed from: d, reason: collision with root package name */
    public List f21281d;

    /* renamed from: f, reason: collision with root package name */
    public d f21282f;

    /* renamed from: g, reason: collision with root package name */
    public float f21283g;

    /* renamed from: h, reason: collision with root package name */
    public int f21284h;

    /* renamed from: i, reason: collision with root package name */
    public float f21285i;

    public y(Context context) {
        super(context, null);
        this.f21281d = Collections.emptyList();
        this.f21282f = d.f21180g;
        this.f21283g = 0.0533f;
        this.f21284h = 0;
        this.f21285i = 0.08f;
        c cVar = new c(context);
        this.f21279b = cVar;
        u0 u0Var = new u0(context, 0);
        this.f21280c = u0Var;
        u0Var.setBackgroundColor(0);
        addView(cVar);
        addView(u0Var);
    }

    @Override // l9.s
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f21282f = dVar;
        this.f21283g = f10;
        this.f21284h = i10;
        this.f21285i = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            a9.b bVar = (a9.b) list.get(i11);
            if (bVar.f368f != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f21281d.isEmpty() || !arrayList2.isEmpty()) {
            this.f21281d = arrayList2;
            c();
        }
        this.f21279b.a(arrayList, dVar, f10, i10, f11);
        invalidate();
    }

    public final String b(float f10, int i10) {
        float f02 = v8.u0.f0(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (f02 == -3.4028235E38f) {
            return "unset";
        }
        return h0.k("%.2fpx", Float.valueOf(f02 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x048f, code lost:
    
        if (((android.text.style.TypefaceSpan) r14).getFamily() != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d8, code lost:
    
        if (r3 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01e0, code lost:
    
        r0 = 2;
        r24 = r23;
        r23 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01de, code lost:
    
        r23 = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01db, code lost:
    
        if (r3 != 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x051b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.y.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f21281d.isEmpty()) {
            c();
        }
    }
}
