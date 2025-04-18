package androidx.compose.foundation.text;

import android.support.v4.media.session.i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextLinkScope {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f6213a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6214b;

    /* renamed from: c, reason: collision with root package name */
    public AnnotatedString f6215c;
    public final SnapshotStateList d;

    public TextLinkScope(AnnotatedString annotatedString) {
        ParcelableSnapshotMutableState f2;
        SpanStyle spanStyle;
        this.f6213a = annotatedString;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f6214b = f2;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
        List a2 = annotatedString.a(annotatedString.f16880a.length());
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) a2.get(i2);
            TextLinkStyles b2 = ((LinkAnnotation) range.f16890a).b();
            if (b2 != null && (spanStyle = b2.f17050a) != null) {
                builder.a(spanStyle, range.f16891b, range.f16892c);
            }
        }
        this.f6215c = builder.f();
        this.d = new SnapshotStateList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.foundation.text.TextLinkScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.ComposerImpl] */
    public final void a(Composer composer, int i2) {
        int i3;
        final AndroidPath androidPath;
        UriHandler uriHandler;
        Object[] objArr;
        int i4;
        ?? a2;
        TextLayoutResult textLayoutResult;
        ?? g2 = composer.g(1154651354);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            UriHandler uriHandler2 = (UriHandler) g2.K(CompositionLocalsKt.f16444p);
            AnnotatedString annotatedString = this.f6215c;
            List a3 = annotatedString.a(annotatedString.f16880a.length());
            int size = a3.size();
            int i5 = 0;
            while (i5 < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) a3.get(i5);
                if (((Boolean) new TextLinkScope$shouldMeasureLinks$1(this).invoke()).booleanValue() && (textLayoutResult = (TextLayoutResult) this.f6214b.getValue()) != null) {
                    int i6 = range.f16891b;
                    int i7 = range.f16892c;
                    androidPath = textLayoutResult.k(i6, i7);
                    int i8 = range.f16891b;
                    Rect b2 = textLayoutResult.b(i8);
                    androidPath.k(OffsetKt.a(textLayoutResult.f(i8) == textLayoutResult.f(i7) ? Math.min(textLayoutResult.b(i7 - 1).f14914a, b2.f14914a) : 0.0f, b2.f14915b) ^ (-9223372034707292160L));
                } else {
                    androidPath = null;
                }
                Shape shape = androidPath != null ? new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                    @Override // androidx.compose.ui.graphics.Shape
                    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
                        return new Outline.Generic(androidPath);
                    }
                } : null;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                if (shape != null && (a2 = ClipKt.a(companion, shape)) != 0) {
                    companion = a2;
                }
                Object u2 = g2.u();
                Object obj = Composer.Companion.f13690a;
                if (u2 == obj) {
                    u2 = InteractionSourceKt.a();
                    g2.o(u2);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) u2;
                Modifier a4 = HoverableKt.a(mutableInteractionSource, companion.T0(new TextRangeLayoutModifier(new b(range.f16891b, range.f16892c, this))));
                PointerIcon.f15584a.getClass();
                Modifier a5 = PointerIconKt.a(a4, PointerIcon_androidKt.f15587b);
                boolean w = g2.w(this) | g2.I(range) | g2.w(uriHandler2);
                Object u3 = g2.u();
                if (w || u3 == obj) {
                    u3 = new TextLinkScope$LinksComposables$1$1$1(this, range, uriHandler2);
                    g2.o(u3);
                }
                BoxKt.a(ClickableKt.d(a5, mutableInteractionSource, null, true, null, null, null, null, null, (q0.a) u3), g2, 0);
                MutableState a6 = HoverInteractionKt.a(mutableInteractionSource, g2, 6);
                MutableState a7 = FocusInteractionKt.a(mutableInteractionSource, g2, 6);
                MutableState a8 = PressInteractionKt.a(mutableInteractionSource, g2);
                Object[] objArr2 = new Object[7];
                objArr2[0] = Boolean.valueOf(((Boolean) a6.getValue()).booleanValue());
                objArr2[1] = Boolean.valueOf(((Boolean) a7.getValue()).booleanValue());
                objArr2[2] = Boolean.valueOf(((Boolean) a8.getValue()).booleanValue());
                LinkAnnotation linkAnnotation = (LinkAnnotation) range.f16890a;
                TextLinkStyles b3 = linkAnnotation.b();
                objArr2[3] = b3 != null ? b3.f17050a : null;
                TextLinkStyles b4 = linkAnnotation.b();
                objArr2[4] = b4 != null ? b4.f17051b : null;
                TextLinkStyles b5 = linkAnnotation.b();
                objArr2[5] = b5 != null ? b5.f17052c : null;
                TextLinkStyles b6 = linkAnnotation.b();
                objArr2[6] = b6 != null ? b6.d : null;
                boolean w2 = g2.w(this) | g2.I(range) | g2.I(a7) | g2.I(a6) | g2.I(a8);
                Object u4 = g2.u();
                if (w2 || u4 == obj) {
                    uriHandler = uriHandler2;
                    objArr = objArr2;
                    i4 = i5;
                    u4 = new TextLinkScope$LinksComposables$1$2$1(this, range, a7, a6, a8);
                    g2.o(u4);
                } else {
                    i4 = i5;
                    uriHandler = uriHandler2;
                    objArr = objArr2;
                }
                b(objArr, (l) u4, g2, (i3 << 6) & 896);
                i5 = i4 + 1;
                uriHandler2 = uriHandler;
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextLinkScope$LinksComposables$2(this, i2);
        }
    }

    public final void b(Object[] objArr, l lVar, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-2083052099);
        int i3 = (i2 & 48) == 0 ? (g2.w(lVar) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i3 |= g2.w(this) ? 256 : 128;
        }
        g2.y(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i3 |= g2.w(obj) ? 4 : 0;
        }
        g2.V(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            i iVar = new i(2);
            iVar.a(lVar);
            iVar.b(objArr);
            Object[] array = ((ArrayList) iVar.f131b).toArray(new Object[((ArrayList) iVar.f131b).size()]);
            boolean w = g2.w(this) | ((i3 & 112) == 32);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new TextLinkScope$StyleAnnotation$1$1(this, lVar);
                g2.o(u2);
            }
            EffectsKt.d(array, (l) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextLinkScope$StyleAnnotation$2(this, objArr, lVar, i2);
        }
    }
}
