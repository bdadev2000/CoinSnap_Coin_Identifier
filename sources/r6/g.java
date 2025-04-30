package r6;

import androidx.lifecycle.InterfaceC0495e;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.LinkedHashMap;
import k.AbstractActivityC2417f;
import t7.C2720i;
import t7.C2725n;

/* loaded from: classes3.dex */
public final class g implements InterfaceC0495e {
    public final /* synthetic */ h b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22918d = R.layout.layout_native_language;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2417f f22920g;

    public g(h hVar, String str, boolean z8, AbstractActivityC2417f abstractActivityC2417f) {
        this.b = hVar;
        this.f22917c = str;
        this.f22919f = z8;
        this.f22920g = abstractActivityC2417f;
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void a(InterfaceC0511v interfaceC0511v) {
        int i9;
        h hVar = this.b;
        LinkedHashMap linkedHashMap = hVar.f22924c;
        Integer valueOf = Integer.valueOf(this.f22918d);
        String str = this.f22917c;
        Integer num = (Integer) linkedHashMap.get(new C2720i(str, valueOf));
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        if (this.f22919f && i9 < 3) {
            hVar.b(this.f22920g, str, true);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void onDestroy(InterfaceC0511v interfaceC0511v) {
        this.b.f22925d.put(new C2725n(this.f22920g.getClass(), this.f22917c, Integer.valueOf(this.f22918d)), Boolean.FALSE);
    }
}
