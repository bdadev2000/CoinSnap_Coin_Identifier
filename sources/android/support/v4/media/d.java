package android.support.v4.media;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import q0.p;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static void A(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1, long j2) {
        canvasDrawScope$drawContext$1.a().i();
        canvasDrawScope$drawContext$1.c(j2);
    }

    public static /* synthetic */ void B(h0.j jVar) {
        if (jVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void C(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static float D(float f2, float f3, float f4, float f5) {
        return (f2 * f3 * f4) + f5;
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    public static int b(float f2, int i2, int i3) {
        return (Float.hashCode(f2) + i2) * i3;
    }

    public static int c(int i2, int i3, int i4) {
        return (Integer.hashCode(i2) + i3) * i4;
    }

    public static int d(long j2, int i2, int i3) {
        return (Long.hashCode(j2) + i2) * i3;
    }

    public static int e(Measurable measurable, long j2, ArrayList arrayList, int i2, int i3) {
        arrayList.add(measurable.V(j2));
        return i2 + i3;
    }

    public static int f(List list, int i2, int i3) {
        return (list.hashCode() + i2) * i3;
    }

    public static int g(boolean z2, int i2, int i3) {
        return (Boolean.hashCode(z2) + i2) * i3;
    }

    public static CompositionScopedCoroutineScopeCanceller h(g1.f fVar, ComposerImpl composerImpl) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(fVar);
        composerImpl.o(compositionScopedCoroutineScopeCanceller);
        return compositionScopedCoroutineScopeCanceller;
    }

    public static String i(String str, int i2) {
        return str + i2;
    }

    public static String j(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String k(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    public static String l(String str, int i2, String str2, int i3, String str3) {
        return str + i2 + str2 + i3 + str3;
    }

    public static String m(String str, long j2) {
        return str + j2;
    }

    public static String n(StringBuilder sb, float f2, char c2) {
        sb.append(f2);
        sb.append(c2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, int i2, char c2) {
        sb.append(i2);
        sb.append(c2);
        return sb.toString();
    }

    public static String p(StringBuilder sb, long j2, String str) {
        sb.append(j2);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String s(StringBuilder sb, boolean z2, char c2) {
        sb.append(z2);
        sb.append(c2);
        return sb.toString();
    }

    public static StringBuilder t(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void w(int i2, Composer composer, int i3, p pVar) {
        composer.o(Integer.valueOf(i2));
        composer.h(Integer.valueOf(i3), pVar);
    }

    public static void x(int i2, ComposerImpl composerImpl, int i3, p pVar) {
        composerImpl.o(Integer.valueOf(i2));
        composerImpl.h(Integer.valueOf(i3), pVar);
    }

    public static void y(int i2, p pVar, ComposerImpl composerImpl, boolean z2) {
        pVar.invoke(composerImpl, Integer.valueOf(i2));
        composerImpl.V(z2);
    }

    public static void z(long j2, StringBuilder sb, String str) {
        sb.append((Object) Color.i(j2));
        sb.append(str);
    }
}
