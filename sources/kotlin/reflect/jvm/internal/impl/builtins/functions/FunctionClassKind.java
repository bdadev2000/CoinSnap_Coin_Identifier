package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a4.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ FunctionClassKind[] $VALUES;
    public static final Companion Companion;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final FqName packageFqName;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0, StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, false);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1, StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", true, false);

    @SourceDebugExtension({"SMAP\nFunctionClassKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassKind.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassKind$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,59:1\n1282#2,2:60\n*S KotlinDebug\n*F\n+ 1 FunctionClassKind.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassKind$Companion\n*L\n27#1:60,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* loaded from: classes4.dex */
        public static final class KindWithArity {
            private final int arity;
            private final FunctionClassKind kind;

            public KindWithArity(FunctionClassKind kind, int i10) {
                Intrinsics.checkNotNullParameter(kind, "kind");
                this.kind = kind;
                this.arity = i10;
            }

            public final FunctionClassKind component1() {
                return this.kind;
            }

            public final int component2() {
                return this.arity;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KindWithArity)) {
                    return false;
                }
                KindWithArity kindWithArity = (KindWithArity) obj;
                return this.kind == kindWithArity.kind && this.arity == kindWithArity.arity;
            }

            public final FunctionClassKind getKind() {
                return this.kind;
            }

            public int hashCode() {
                return Integer.hashCode(this.arity) + (this.kind.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
                sb2.append(this.kind);
                sb2.append(", arity=");
                return j.i(sb2, this.arity, ')');
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer toInt(String str) {
            boolean z10;
            boolean z11;
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                int charAt = str.charAt(i11) - '0';
                if (charAt >= 0 && charAt < 10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return null;
                }
                i10 = (i10 * 10) + charAt;
            }
            return Integer.valueOf(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[LOOP:0: B:2:0x0011->B:9:0x002f, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind byClassNamePrefix(kotlin.reflect.jvm.internal.impl.name.FqName r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L11:
                if (r3 >= r1) goto L32
                r4 = r0[r3]
                kotlin.reflect.jvm.internal.impl.name.FqName r5 = r4.getPackageFqName()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r7)
                if (r5 == 0) goto L2b
                java.lang.String r5 = r4.getClassNamePrefix()
                boolean r5 = kotlin.text.StringsKt.z(r8, r5)
                if (r5 == 0) goto L2b
                r5 = 1
                goto L2c
            L2b:
                r5 = r2
            L2c:
                if (r5 == 0) goto L2f
                goto L33
            L2f:
                int r3 = r3 + 1
                goto L11
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion.byClassNamePrefix(kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.String):kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind");
        }

        @JvmStatic
        public final FunctionClassKind getFunctionalClassKind(String className, FqName packageFqName) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            KindWithArity parseClassName = parseClassName(className, packageFqName);
            if (parseClassName != null) {
                return parseClassName.getKind();
            }
            return null;
        }

        public final KindWithArity parseClassName(String className, FqName packageFqName) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            FunctionClassKind byClassNamePrefix = byClassNamePrefix(packageFqName, className);
            if (byClassNamePrefix == null) {
                return null;
            }
            String substring = className.substring(byClassNamePrefix.getClassNamePrefix().length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Integer num = toInt(substring);
            if (num == null) {
                return null;
            }
            return new KindWithArity(byClassNamePrefix, num.intValue());
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        KFunction = new FunctionClassKind("KFunction", 2, fqName, "KFunction", false, true);
        KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3, fqName, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private FunctionClassKind(String str, int i10, FqName fqName, String str2, boolean z10, boolean z11) {
        this.packageFqName = fqName;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    public final Name numberedClassName(int i10) {
        Name identifier = Name.identifier(this.classNamePrefix + i10);
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"$classNamePrefix$arity\")");
        return identifier;
    }
}
