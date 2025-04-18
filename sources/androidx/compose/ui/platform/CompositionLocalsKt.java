package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.Owner;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class CompositionLocalsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16431a = new CompositionLocal(CompositionLocalsKt$LocalAccessibilityManager$1.f16449a);

    /* renamed from: b, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16432b = new CompositionLocal(CompositionLocalsKt$LocalAutofill$1.f16450a);

    /* renamed from: c, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16433c = new CompositionLocal(CompositionLocalsKt$LocalAutofillTree$1.f16451a);
    public static final StaticProvidableCompositionLocal d = new CompositionLocal(CompositionLocalsKt$LocalClipboardManager$1.f16452a);
    public static final StaticProvidableCompositionLocal e = new CompositionLocal(CompositionLocalsKt$LocalGraphicsContext$1.f16457a);

    /* renamed from: f, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16434f = new CompositionLocal(CompositionLocalsKt$LocalDensity$1.f16453a);

    /* renamed from: g, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16435g = new CompositionLocal(CompositionLocalsKt$LocalFocusManager$1.f16454a);

    /* renamed from: h, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16436h = new CompositionLocal(CompositionLocalsKt$LocalFontLoader$1.f16456a);

    /* renamed from: i, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16437i = new CompositionLocal(CompositionLocalsKt$LocalFontFamilyResolver$1.f16455a);

    /* renamed from: j, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16438j = new CompositionLocal(CompositionLocalsKt$LocalHapticFeedback$1.f16458a);

    /* renamed from: k, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16439k = new CompositionLocal(CompositionLocalsKt$LocalInputModeManager$1.f16459a);

    /* renamed from: l, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16440l = new CompositionLocal(CompositionLocalsKt$LocalLayoutDirection$1.f16460a);

    /* renamed from: m, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16441m = new CompositionLocal(CompositionLocalsKt$LocalTextInputService$1.f16464a);

    /* renamed from: n, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16442n = new CompositionLocal(CompositionLocalsKt$LocalSoftwareKeyboardController$1.f16463a);

    /* renamed from: o, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16443o = new CompositionLocal(CompositionLocalsKt$LocalTextToolbar$1.f16465a);

    /* renamed from: p, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16444p = new CompositionLocal(CompositionLocalsKt$LocalUriHandler$1.f16466a);

    /* renamed from: q, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16445q = new CompositionLocal(CompositionLocalsKt$LocalViewConfiguration$1.f16467a);

    /* renamed from: r, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16446r = new CompositionLocal(CompositionLocalsKt$LocalWindowInfo$1.f16468a);

    /* renamed from: s, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f16447s = new CompositionLocal(CompositionLocalsKt$LocalPointerIconService$1.f16461a);

    /* renamed from: t, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f16448t = CompositionLocalKt.c(CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.f16462a);

    public static final void a(Owner owner, UriHandler uriHandler, q0.p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(874662829);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(owner) : g2.w(owner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? g2.I(uriHandler) : g2.w(uriHandler) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            ProvidedValue c2 = f16431a.c(owner.getAccessibilityManager());
            ProvidedValue c3 = f16432b.c(owner.getAutofill());
            ProvidedValue c4 = f16433c.c(owner.getAutofillTree());
            ProvidedValue c5 = d.c(owner.getClipboardManager());
            ProvidedValue c6 = f16434f.c(owner.getDensity());
            ProvidedValue c7 = f16435g.c(owner.getFocusOwner());
            ProvidedValue c8 = f16436h.c(owner.getFontLoader());
            c8.f13867h = false;
            ProvidedValue c9 = f16437i.c(owner.getFontFamilyResolver());
            c9.f13867h = false;
            CompositionLocalKt.b(new ProvidedValue[]{c2, c3, c4, c5, c6, c7, c8, c9, f16438j.c(owner.getHapticFeedBack()), f16439k.c(owner.getInputModeManager()), f16440l.c(owner.getLayoutDirection()), f16441m.c(owner.getTextInputService()), f16442n.c(owner.getSoftwareKeyboardController()), f16443o.c(owner.getTextToolbar()), f16444p.c(uriHandler), f16445q.c(owner.getViewConfiguration()), f16446r.c(owner.getWindowInfo()), f16447s.c(owner.getPointerIconService()), e.c(owner.getGraphicsContext())}, pVar, g2, ((i3 >> 3) & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, pVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
