package androidx.compose.foundation.text;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString f5742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f5744c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f5748i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f5749j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5750k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5751l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$6(AnnotatedString annotatedString, l lVar, Modifier modifier, TextStyle textStyle, boolean z2, int i2, int i3, l lVar2, l lVar3, int i4, int i5) {
        super(2);
        this.f5742a = annotatedString;
        this.f5743b = lVar;
        this.f5744c = modifier;
        this.d = textStyle;
        this.f5745f = z2;
        this.f5746g = i2;
        this.f5747h = i3;
        this.f5748i = lVar2;
        this.f5749j = lVar3;
        this.f5750k = i4;
        this.f5751l = i5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 1, list:
          (r0v5 ?? I:java.lang.Object) from 0x01bd: INVOKE (r1v2 ?? I:androidx.compose.runtime.ComposerImpl), (r0v5 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.ComposerImpl.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // q0.p
    public final java.lang.Object invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 ??, still in use, count: 1, list:
          (r0v5 ?? I:java.lang.Object) from 0x01bd: INVOKE (r1v2 ?? I:androidx.compose.runtime.ComposerImpl), (r0v5 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.ComposerImpl.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
}
