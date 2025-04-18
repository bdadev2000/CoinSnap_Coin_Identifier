package androidx.compose.ui.viewinterop;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import q0.p;

/* loaded from: classes2.dex */
public final class AndroidView_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.l r14, androidx.compose.ui.Modifier r15, q0.l r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            r4 = r18
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r1 = r17
            androidx.compose.runtime.ComposerImpl r0 = r1.g(r0)
            r1 = r19 & 1
            if (r1 == 0) goto L14
            r1 = r4 | 6
            r2 = r1
            r1 = r14
            goto L26
        L14:
            r1 = r4 & 6
            if (r1 != 0) goto L24
            r1 = r14
            boolean r2 = r0.w(r14)
            if (r2 == 0) goto L21
            r2 = 4
            goto L22
        L21:
            r2 = 2
        L22:
            r2 = r2 | r4
            goto L26
        L24:
            r1 = r14
            r2 = r4
        L26:
            r3 = r19 & 2
            if (r3 == 0) goto L2e
            r2 = r2 | 48
        L2c:
            r5 = r15
            goto L3f
        L2e:
            r5 = r4 & 48
            if (r5 != 0) goto L2c
            r5 = r15
            boolean r6 = r0.I(r15)
            if (r6 == 0) goto L3c
            r6 = 32
            goto L3e
        L3c:
            r6 = 16
        L3e:
            r2 = r2 | r6
        L3f:
            r6 = r19 & 4
            if (r6 == 0) goto L48
            r2 = r2 | 384(0x180, float:5.38E-43)
        L45:
            r7 = r16
            goto L5a
        L48:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L45
            r7 = r16
            boolean r8 = r0.w(r7)
            if (r8 == 0) goto L57
            r8 = 256(0x100, float:3.59E-43)
            goto L59
        L57:
            r8 = 128(0x80, float:1.8E-43)
        L59:
            r2 = r2 | r8
        L5a:
            r8 = r2 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L6d
            boolean r8 = r0.i()
            if (r8 != 0) goto L67
            goto L6d
        L67:
            r0.A()
            r2 = r5
            r3 = r7
            goto L94
        L6d:
            if (r3 == 0) goto L72
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion.f14687a
            goto L73
        L72:
            r3 = r5
        L73:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1 r8 = androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1.f17573a
            if (r6 == 0) goto L79
            r13 = r8
            goto L7a
        L79:
            r13 = r7
        L7a:
            r7 = 0
            r5 = r2 & 14
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r6 = r2 & 112(0x70, float:1.57E-43)
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 6
            r2 = r2 & r6
            r11 = r5 | r2
            r12 = 4
            r5 = r14
            r6 = r3
            r9 = r13
            r10 = r0
            b(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r3
            r3 = r13
        L94:
            androidx.compose.runtime.RecomposeScopeImpl r6 = r0.Z()
            if (r6 == 0) goto La7
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1 r7 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
            r0 = r7
            r1 = r14
            r4 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r7
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.a(q0.l, androidx.compose.ui.Modifier, q0.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(q0.l r18, androidx.compose.ui.Modifier r19, q0.l r20, q0.l r21, q0.l r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.b(q0.l, androidx.compose.ui.Modifier, q0.l, q0.l, q0.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ViewFactoryHolder c(LayoutNode layoutNode) {
        AndroidViewHolder androidViewHolder = layoutNode.f15951m;
        if (androidViewHolder != null) {
            return (ViewFactoryHolder) androidViewHolder;
        }
        InlineClassHelperKt.c("Required value was null.");
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0061: INVOKE (r9v0 ?? I:androidx.compose.runtime.Composer), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final q0.a d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0061: INVOKE (r9v0 ?? I:androidx.compose.runtime.Composer), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final void e(Composer composer, Modifier modifier, int i2, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.h8.getClass();
        Updater.b(composer, compositionLocalMap, ComposeUiNode.Companion.f15897f);
        Updater.b(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.f17579a);
        Updater.b(composer, density, AndroidView_androidKt$updateViewHolderParams$2.f17580a);
        Updater.b(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.f17581a);
        Updater.b(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.f17582a);
        Updater.b(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.f17583a);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(i2))) {
            d.w(i2, composer, i2, pVar);
        }
    }
}
