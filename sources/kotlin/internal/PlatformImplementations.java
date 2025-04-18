package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes4.dex */
public class PlatformImplementations {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class ReflectThrowable {
        public static final ReflectThrowable INSTANCE = new ReflectThrowable();

        @JvmField
        public static final Method addSuppressed;

        @JvmField
        public static final Method getSuppressed;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[LOOP:0: B:2:0x0013->B:10:0x003d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[EDGE_INSN: B:11:0x0041->B:12:0x0041 BREAK  A[LOOP:0: B:2:0x0013->B:10:0x003d], SYNTHETIC] */
        static {
            /*
                kotlin.internal.PlatformImplementations$ReflectThrowable r0 = new kotlin.internal.PlatformImplementations$ReflectThrowable
                r0.<init>()
                kotlin.internal.PlatformImplementations.ReflectThrowable.INSTANCE = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                r5 = 0
                if (r4 >= r2) goto L40
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                if (r7 == 0) goto L39
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                java.lang.Object r7 = kotlin.collections.ArraysKt.singleOrNull(r7)
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
                if (r7 == 0) goto L39
                r7 = 1
                goto L3a
            L39:
                r7 = r3
            L3a:
                if (r7 == 0) goto L3d
                goto L41
            L3d:
                int r4 = r4 + 1
                goto L13
            L40:
                r6 = r5
            L41:
                kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed = r6
                int r0 = r1.length
            L44:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
                if (r4 == 0) goto L56
                r5 = r2
                goto L59
            L56:
                int r3 = r3 + 1
                goto L44
            L59:
                kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementations.ReflectThrowable.<clinit>():void");
        }

        private ReflectThrowable() {
        }
    }

    public void addSuppressed(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    public MatchGroup getMatchResultNamedGroup(MatchResult matchResult, String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public List<Throwable> getSuppressed(Throwable exception) {
        Object invoke;
        List<Throwable> asList;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = ReflectThrowable.getSuppressed;
        if (method == null || (invoke = method.invoke(exception, new Object[0])) == null || (asList = ArraysKt.asList((Throwable[]) invoke)) == null) {
            return CollectionsKt.emptyList();
        }
        return asList;
    }
}
