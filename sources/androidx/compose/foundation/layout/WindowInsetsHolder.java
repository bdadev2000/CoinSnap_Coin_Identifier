package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class WindowInsetsHolder {
    public static final WeakHashMap x = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AndroidWindowInsets f4137a = Companion.a(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final AndroidWindowInsets f4138b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidWindowInsets f4139c;
    public final AndroidWindowInsets d;
    public final AndroidWindowInsets e;

    /* renamed from: f, reason: collision with root package name */
    public final AndroidWindowInsets f4140f;

    /* renamed from: g, reason: collision with root package name */
    public final AndroidWindowInsets f4141g;

    /* renamed from: h, reason: collision with root package name */
    public final AndroidWindowInsets f4142h;

    /* renamed from: i, reason: collision with root package name */
    public final AndroidWindowInsets f4143i;

    /* renamed from: j, reason: collision with root package name */
    public final ValueInsets f4144j;

    /* renamed from: k, reason: collision with root package name */
    public final WindowInsets f4145k;

    /* renamed from: l, reason: collision with root package name */
    public final WindowInsets f4146l;

    /* renamed from: m, reason: collision with root package name */
    public final WindowInsets f4147m;

    /* renamed from: n, reason: collision with root package name */
    public final ValueInsets f4148n;

    /* renamed from: o, reason: collision with root package name */
    public final ValueInsets f4149o;

    /* renamed from: p, reason: collision with root package name */
    public final ValueInsets f4150p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueInsets f4151q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueInsets f4152r;

    /* renamed from: s, reason: collision with root package name */
    public final ValueInsets f4153s;

    /* renamed from: t, reason: collision with root package name */
    public final ValueInsets f4154t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4155u;

    /* renamed from: v, reason: collision with root package name */
    public int f4156v;
    public final InsetsListener w;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public static final AndroidWindowInsets a(int i2, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            return new AndroidWindowInsets(i2, str);
        }

        public static final ValueInsets b(int i2, String str) {
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            return new ValueInsets(WindowInsets_androidKt.a(Insets.e), str);
        }

        public static WindowInsetsHolder c(Composer composer) {
            WindowInsetsHolder windowInsetsHolder;
            View view = (View) composer.K(AndroidCompositionLocals_androidKt.f16327f);
            WeakHashMap weakHashMap = WindowInsetsHolder.x;
            synchronized (weakHashMap) {
                try {
                    Object obj = weakHashMap.get(view);
                    if (obj == null) {
                        obj = new WindowInsetsHolder(view);
                        weakHashMap.put(view, obj);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean w = composer.w(windowInsetsHolder) | composer.w(view);
            Object u2 = composer.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new WindowInsetsHolder$Companion$current$1$1(windowInsetsHolder, view);
                composer.o(u2);
            }
            EffectsKt.c(windowInsetsHolder, (l) u2, composer);
            return windowInsetsHolder;
        }
    }

    public WindowInsetsHolder(View view) {
        AndroidWindowInsets a2 = Companion.a(128, "displayCutout");
        this.f4138b = a2;
        AndroidWindowInsets a3 = Companion.a(8, "ime");
        this.f4139c = a3;
        AndroidWindowInsets a4 = Companion.a(32, "mandatorySystemGestures");
        this.d = a4;
        this.e = Companion.a(2, "navigationBars");
        this.f4140f = Companion.a(1, "statusBars");
        AndroidWindowInsets a5 = Companion.a(7, "systemBars");
        this.f4141g = a5;
        AndroidWindowInsets a6 = Companion.a(16, "systemGestures");
        this.f4142h = a6;
        AndroidWindowInsets a7 = Companion.a(64, "tappableElement");
        this.f4143i = a7;
        ValueInsets valueInsets = new ValueInsets(WindowInsets_androidKt.a(Insets.e), "waterfall");
        this.f4144j = valueInsets;
        UnionInsets unionInsets = new UnionInsets(new UnionInsets(a5, a3), a2);
        this.f4145k = unionInsets;
        UnionInsets unionInsets2 = new UnionInsets(new UnionInsets(new UnionInsets(a7, a4), a6), valueInsets);
        this.f4146l = unionInsets2;
        this.f4147m = new UnionInsets(unionInsets, unionInsets2);
        this.f4148n = Companion.b(4, "captionBarIgnoringVisibility");
        this.f4149o = Companion.b(2, "navigationBarsIgnoringVisibility");
        this.f4150p = Companion.b(1, "statusBarsIgnoringVisibility");
        this.f4151q = Companion.b(7, "systemBarsIgnoringVisibility");
        this.f4152r = Companion.b(64, "tappableElementIgnoringVisibility");
        this.f4153s = Companion.b(8, "imeAnimationTarget");
        this.f4154t = Companion.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(com.cooldev.gba.emulator.gameboy.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f4155u = bool != null ? bool.booleanValue() : true;
        this.w = new InsetsListener(this);
    }

    public static void a(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat) {
        windowInsetsHolder.f4137a.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4139c.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4138b.f(windowInsetsCompat, 0);
        windowInsetsHolder.e.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4140f.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4141g.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4142h.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4143i.f(windowInsetsCompat, 0);
        windowInsetsHolder.d.f(windowInsetsCompat, 0);
        windowInsetsHolder.f4148n.f(WindowInsets_androidKt.a(windowInsetsCompat.f(4)));
        windowInsetsHolder.f4149o.f(WindowInsets_androidKt.a(windowInsetsCompat.f(2)));
        windowInsetsHolder.f4150p.f(WindowInsets_androidKt.a(windowInsetsCompat.f(1)));
        windowInsetsHolder.f4151q.f(WindowInsets_androidKt.a(windowInsetsCompat.f(7)));
        windowInsetsHolder.f4152r.f(WindowInsets_androidKt.a(windowInsetsCompat.f(64)));
        DisplayCutoutCompat d = windowInsetsCompat.d();
        if (d != null) {
            windowInsetsHolder.f4144j.f(WindowInsets_androidKt.a(d.a()));
        }
        Snapshot.Companion.g();
    }
}
