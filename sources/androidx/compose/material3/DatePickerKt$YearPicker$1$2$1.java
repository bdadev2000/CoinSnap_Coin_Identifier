package androidx.compose.material3;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope$items$1;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import b1.d0;
import d0.b0;
import java.util.Collection;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import w0.f;
import w0.g;

/* loaded from: classes2.dex */
final class DatePickerKt$YearPicker$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f8983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f8984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f8985c;
    public final /* synthetic */ String d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8988h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f8989i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SelectableDates f8990j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DatePickerColors f8991k;

    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements q0.r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f8992a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyGridState f8993b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f8994c;
        public final /* synthetic */ String d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f8995f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f8996g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f8997h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l f8998i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SelectableDates f8999j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f9000k;

        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        final class AnonymousClass3 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f9007a;

            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            final class C00361 extends r implements l {

                /* renamed from: a, reason: collision with root package name */
                public static final C00361 f9008a = new r(1);

                @Override // q0.l
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(String str) {
                super(2);
                this.f9007a = str;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    TextKt.b(this.f9007a, SemanticsModifierKt.a(Modifier.Companion.f14687a, C00361.f9008a), 0L, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, composer, 0, 0, 130556);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, LazyGridState lazyGridState, d0 d0Var, String str, String str2, int i2, int i3, l lVar, SelectableDates selectableDates, DatePickerColors datePickerColors) {
            super(4);
            this.f8992a = gVar;
            this.f8993b = lazyGridState;
            this.f8994c = d0Var;
            this.d = str;
            this.f8995f = str2;
            this.f8996g = i2;
            this.f8997h = i3;
            this.f8998i = lVar;
            this.f8999j = selectableDates;
            this.f9000k = datePickerColors;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
              (r1v15 ?? I:java.lang.Object) from 0x008e: INVOKE (r13v1 ?? I:androidx.compose.runtime.Composer), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
            */
        @Override // q0.r
        public final java.lang.Object invoke(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
              (r1v15 ?? I:java.lang.Object) from 0x008e: INVOKE (r13v1 ?? I:androidx.compose.runtime.Composer), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.o(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$YearPicker$1$2$1(g gVar, LazyGridState lazyGridState, d0 d0Var, String str, String str2, int i2, int i3, l lVar, SelectableDates selectableDates, DatePickerColors datePickerColors) {
        super(1);
        this.f8983a = gVar;
        this.f8984b = lazyGridState;
        this.f8985c = d0Var;
        this.d = str;
        this.f8986f = str2;
        this.f8987g = i2;
        this.f8988h = i3;
        this.f8989i = lVar;
        this.f8990j = selectableDates;
        this.f8991k = datePickerColors;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        LazyGridScope lazyGridScope = (LazyGridScope) obj;
        Iterable iterable = this.f8983a;
        p0.a.s(iterable, "<this>");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        } else {
            f it = iterable.iterator();
            int i3 = 0;
            while (it.f31411c) {
                it.next();
                i3++;
                if (i3 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            i2 = i3;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f8983a, this.f8984b, this.f8985c, this.d, this.f8986f, this.f8987g, this.f8988h, this.f8989i, this.f8990j, this.f8991k);
        Object obj2 = ComposableLambdaKt.f14482a;
        lazyGridScope.b(i2, (r12 & 2) != 0 ? null : null, null, (r12 & 8) != 0 ? LazyGridScope$items$1.f4584a : null, new ComposableLambdaImpl(1040623618, anonymousClass1, true));
        return b0.f30125a;
    }
}
